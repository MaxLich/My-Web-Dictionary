package ru.maxlich.app.dao;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import ru.maxlich.app.entity.DictionaryRecord;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DictRecordMapper implements RowMapper<DictionaryRecord> {
    @Override
    public DictionaryRecord mapRow(ResultSet rs, int rowNum) throws SQLException {
        DictionaryRecord dictRecord = new DictionaryRecord();

        dictRecord.setId(rs.getLong("id"));
        dictRecord.setWord(rs.getString("word"));
        dictRecord.setDefinition(rs.getString("definition"));

        return dictRecord;
    }
}
