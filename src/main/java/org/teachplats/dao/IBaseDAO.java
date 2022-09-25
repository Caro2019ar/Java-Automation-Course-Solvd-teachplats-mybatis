package org.teachplats.dao;


import org.teachplats.model.Country;

import java.sql.SQLException;
import java.util.List;

public interface IBaseDAO<T>{
    void create(T object) throws SQLException;
    T getById (Long id) throws Exception;
    void removeById(Long id);
    void update(T t);
    List<T> getAll();
}
