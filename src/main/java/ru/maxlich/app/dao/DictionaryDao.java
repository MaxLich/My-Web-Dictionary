package ru.maxlich.app.dao;

import ru.maxlich.app.entity.DictionaryRecord;

public interface DictionaryDao extends CommonDao<Long, DictionaryRecord> {
    DictionaryRecord getByDefinition(String definition);
}
