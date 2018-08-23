package ru.maxlich.app.service;

import java.util.List;

public interface IStorageService<I, E> {
    I add(E newEntity);
    E update(E updatedEntity);

    void remove(E removingEntity);
    void removeAll();

    E getById(I id);
    E getByName(String name);
    List<E> getAll();

    Long getCount();
}
