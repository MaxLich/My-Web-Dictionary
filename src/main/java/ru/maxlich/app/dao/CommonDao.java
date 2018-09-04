package ru.maxlich.app.dao;

import java.util.List;

public interface CommonDao<I, E> {
    I add(E addingEntity);
    E update(E updatedEntity);

    void remove(E removingEntity);
    void removeAll();

    E getById(I id);
    E getByName(String name);
    List<E> getAll();

    Long getCount();


}
