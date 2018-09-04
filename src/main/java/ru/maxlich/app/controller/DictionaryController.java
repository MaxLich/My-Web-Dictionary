package ru.maxlich.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.maxlich.app.entity.DictionaryRecord;
import ru.maxlich.app.service.DictionaryService;

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
    public String findWordByDefinition(Model model) {
        model.addAttribute("");
        return "allRecords";
    }

    @GetMapping("/dictionary-change-definition-of-word/")
    public String changeDefinitionOfWord(Model model) {
        model.addAttribute("");
        return "allRecords";
    }

    @GetMapping("/dictionary-delete-word/")
    public String deleteWord(Model model) {
        model.addAttribute("");
        return "allRecords";
    }
}
