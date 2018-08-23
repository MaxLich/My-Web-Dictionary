package ru.maxlich.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.maxlich.app.dao.DictionaryDao;
import ru.maxlich.app.entity.DictionaryRecord;

import java.util.List;

@Service("dictionaryService")
@Transactional
public class DictionaryServiceImpl implements DictionaryService {

    private DictionaryDao dictionaryDao;

    @Autowired
    public DictionaryServiceImpl(DictionaryDao dictionaryDao) {
        this.dictionaryDao = dictionaryDao;
    }

    @Override
    public Long add(DictionaryRecord newEntity) {
        return dictionaryDao.add(newEntity);
    }

    @Override
    public DictionaryRecord update(DictionaryRecord updatedEntity) {
        return dictionaryDao.update(updatedEntity);
    }

    @Override
    public void remove(DictionaryRecord removingEntity) {
        dictionaryDao.remove(removingEntity);
    }

    @Override
    public void removeAll() {
        dictionaryDao.removeAll();
    }

    @Transactional(readOnly = true)
    @Override
    public DictionaryRecord getById(Long id) {
        return dictionaryDao.getById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public DictionaryRecord getByName(String name) {
        return dictionaryDao.getByName(name);
    }

    @Transactional(readOnly = true)
    @Override
    public List<DictionaryRecord> getAll() {
        return dictionaryDao.getAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Long getCount() {
        return dictionaryDao.getCount();
    }
}
