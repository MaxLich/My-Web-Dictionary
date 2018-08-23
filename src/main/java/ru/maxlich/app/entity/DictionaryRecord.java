package ru.maxlich.app.entity;

import java.util.Objects;

public class DictionaryRecord {
    private Long id;
    private String word;
    private String definition;

    public DictionaryRecord() {
    }

    public DictionaryRecord(Long id, String word, String definition) {
        this.id = id;
        this.word = word;
        this.definition = definition;
    }

    public DictionaryRecord(String word, String definition) {
        this.word = word;
        this.definition = definition;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DictionaryRecord that = (DictionaryRecord) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(word, that.word) &&
                Objects.equals(definition, that.definition);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, word, definition);
    }

    @Override
    public String toString() {
        return "DictionaryRecord{" +
                "id=" + id +
                ", word='" + word + '\'' +
                ", definition='" + definition + '\'' +
                '}';
    }
}
