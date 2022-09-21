package org.teachplats.service;

import java.util.List;

public interface IService <T, ID> {

    public T add(T t);
    public T search(ID id);
    public List<T> list();
    public T update(T t);
    public void delete(ID id);

}
