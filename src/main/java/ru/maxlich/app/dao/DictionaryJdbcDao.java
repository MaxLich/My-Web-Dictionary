package ru.maxlich.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.maxlich.app.entity.DictionaryRecord;

import java.util.List;

@Repository("dictionaryDao")
public class DictionaryJdbcDao implements DictionaryDao {

    private JdbcTemplate jdbcTemplate;
    private DictRecordMapper rowMapper;

    @Autowired
    public DictionaryJdbcDao(JdbcTemplate jdbcTemplate, DictRecordMapper dictRecordMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.rowMapper = dictRecordMapper;
    }

    @Override
    public Long add(DictionaryRecord addingEntity) {
        String sql = "INSERT INTO dictionary(word, definition) VALUES (?, ?)";
        int addedRowCount = jdbcTemplate.update(sql, addingEntity.getWord(), addingEntity.getDefinition());
        DictionaryRecord dictRecord = getByName(addingEntity.getWord());
        if (addedRowCount <= 0 || dictRecord == null)
            return null;

        return dictRecord.getId();
    }

    @Override
    public DictionaryRecord update(DictionaryRecord updatedEntity) {
        return null;
    }

    @Override
    public void remove(DictionaryRecord removingEntity) {

    }

    @Override
    public void removeAll() {

    }

    @Override
    public DictionaryRecord getById(Long id) {
        String sql = "SELECT * FROM dictionary WHERE id = ?";
        DictionaryRecord dictRecord = jdbcTemplate.queryForObject(sql, new Object[]{id}, rowMapper);
        return dictRecord;
    }

    @Override
    public DictionaryRecord getByName(String word) {
        String sql = "SELECT * FROM dictionary WHERE word = ?";
        DictionaryRecord dictRecord = jdbcTemplate.queryForObject(sql, new Object[]{word}, rowMapper);
        return dictRecord;
    }

    @Override
    public List<DictionaryRecord> getAll() {
        String sql = "SELECT * FROM dictionary";
        return jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public Long getCount() {
        return null;
    }
}
