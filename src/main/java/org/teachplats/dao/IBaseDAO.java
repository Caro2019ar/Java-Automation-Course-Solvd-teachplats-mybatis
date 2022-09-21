package org.teachplats.dao;

import org.teachplats.model.Country;

import java.sql.SQLException;

public interface IBaseDAO<T>{
    void create(T object) throws SQLException;
    T getById (Long id) throws Exception;
    void removeById(Long id) throws SQLException;

}
