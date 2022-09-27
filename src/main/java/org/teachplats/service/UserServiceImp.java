package org.teachplats.service;

import org.teachplats.dao.StateDAO;
import org.teachplats.dao.UserDAO;
import org.teachplats.model.User;

import java.util.List;

public class UserServiceImp implements IUserService{
    private UserDAO userDAO = new UserDAO();

    @Override
    public void create(User user) {
        userDAO.create(user);
    }

    @Override
    public User searchById(Long id) {
        return userDAO.getById(id);
    }

    @Override
    public List<User> listAll() {
        return userDAO.getAll();
    }

    @Override
    public void update(User user) {
        userDAO.update(user);
    }

    @Override
    public void deleteById(Long aLong) {

    }
}
