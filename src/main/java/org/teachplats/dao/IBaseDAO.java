package org.teachplats.dao;


import org.teachplats.model.Country;

import java.util.List;
import java.util.Optional;

public interface IBaseDAO<T> {
    void create(T object);

    T getById(Long id);

    void removeById(Long id);

    void update(T t);

    List<T> getAll();
}
