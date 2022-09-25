package org.teachplats.service;

import java.util.List;

public interface IService <T, ID> {

    public void create(T t);
    public T searchById(ID id);
    public List<T> listAll();
    public void update(T t);
    public void deleteById(ID id);

}
