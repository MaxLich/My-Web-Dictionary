package ru.maxlich.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.maxlich.app.entity.DictionaryRecord;
import ru.maxlich.app.service.DictionaryService;

import java.util.List;

@Controller
@RequestMapping("/")
public class DictionaryController {

    private final DictionaryService dictionaryService;

    @Autowired
    public DictionaryController(DictionaryService dictionaryService) {
        this.dictionaryService = dictionaryService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/dictionary-all-records")
    public String allRecords(Model model) {
        model.addAttribute("recordList", dictionaryService.getAll());
        return "allRecords";
    }

    @GetMapping("/dictionary-add-word")
    public String addWordPage() {
        return "addWord";
    }

    @PostMapping("/dictionary-add-word")
    public String addWord(@ModelAttribute("record") DictionaryRecord record) {
        dictionaryService.add(record);
        return "redirect:/";
    }

    @GetMapping("/dictionary-find-word")
    public String findWordPage() {
        return "findWord";
    }

    @PostMapping("/dictionary-find-word")
    public String findWord(@ModelAttribute("word") String word, Model model) {
        DictionaryRecord dictionaryRecord = dictionaryService.getByName(word);
        if (dictionaryRecord != null)
            model.addAttribute("record", dictionaryRecord);
        else
            model.addAttribute("error", "Слово \"" + word + "\" не обнаружено в словаре.");
        return "findWord";
    }

    @GetMapping("/dictionary-find-word-by-definition")
    public String findWordByDefinitionPage() {
        return "findWordByDefinition";
    }

    @PostMapping("/dictionary-find-word-by-definition")
    public String findWordByDefinition(@ModelAttribute("definition") String definition, Model model) {
        DictionaryRecord dictionaryRecord = dictionaryService.getByDefinition(definition);
        model.addAttribute("inputDef", definition);
        if (dictionaryRecord != null)
            model.addAttribute("record", dictionaryRecord);
        else
            model.addAttribute("error", "Слово, в значении которого встречается фраза \"" + definition + "\", не обнаружено в словаре.");
        return "findWordByDefinition";
    }

    @GetMapping("/dictionary-change-definition-of-word")
    public String wordsToChangePage(Model model) {
        List<DictionaryRecord> recordList = dictionaryService.getAll();
        recordList.forEach(record -> {
            String word = record.getWord();
            record.setWord(word.substring(0,1).toUpperCase() + word.substring(1));
        });
        model.addAttribute("recordList", recordList);
        return "wordsToChange";
    }

    @GetMapping("/dictionary-change-definition-of-word/{recordId}")
    public String changeDefinitionOfWordPage(@PathVariable("recordId") Long recordId, Model model) {
        model.addAttribute("record", dictionaryService.getById(recordId));
        return "changeWordDefinition";
    }

    @PostMapping("/dictionary-change-definition-of-word")
    public String changeDefinitionOfWord(@ModelAttribute("record") DictionaryRecord record) {
        dictionaryService.update(record);
        return "redirect:/";
    }

    @GetMapping("/dictionary-delete-word")
    public String wordsToDeletePage(Model model) {
        List<DictionaryRecord> recordList = dictionaryService.getAll();
        recordList.forEach(record -> {
            String word = record.getWord();
            record.setWord(word.substring(0,1).toUpperCase() + word.substring(1));
        });
        model.addAttribute("recordList", recordList);
        return "wordsToDelete";
    }

    @GetMapping("/dictionary-delete-word/{recordId}")
    public String deleteWordPage(@PathVariable("recordId") Long recordId, Model model) {
        model.addAttribute("record", dictionaryService.getById(recordId));
        return "deleteWord";
    }

    @PostMapping("/dictionary-delete-word")
    public String deleteWord(@ModelAttribute("record") DictionaryRecord record) {
        dictionaryService.remove(record);
        return "redirect:/";
    }

}
