package org.teachplats.dao;

import org.teachplats.model.User;

import java.util.List;

public interface IUserDAO extends IBaseDAO<User> {
    List<User> getAllUsers();
}
