package org.teachplats.dao;

import org.teachplats.model.Country;
import org.teachplats.model.User;

import java.sql.Connection;
import java.util.List;

public class UserDAO implements IUserDAO {
    private Connection connection;

    public UserDAO(Connection connection) {
        this.connection = connection;
    }


    @Override
    public void create(User object) {
        String sql = "INSERT INTO USER (first_name, last_name, phone, email, address_id, date_of_birth) VALUES (?, ?, ?, ?, ?, ?)";
    }

    @Override
    public User getById(Long id) {
        return null;
    }


    @Override
    public void removeById(Long id) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }
}
