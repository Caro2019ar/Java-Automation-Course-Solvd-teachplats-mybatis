package org.teachplats.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.teachplats.connection.SessionFactory;
import org.teachplats.model.City;
import org.teachplats.model.Country;
import org.teachplats.model.User;


import java.util.List;
import java.util.Optional;

public class UserDAO extends BaseDAO<User> implements IUserDAO {
    private final static Logger logger = LogManager.getLogger(UserDAO.class);
    private static UserDAO userDAO = new UserDAO();

    @Override
    public void create(User object) {
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
        List<User> userList = null;
        try (SqlSession sqlSession = new SessionFactory().sqlSessionFactoryBuild()) {
            try {
                userList = sqlSession.selectList("User.getAll");
                sqlSession.commit();
            } catch (Exception ex) {
                logger.warn(ex.getMessage());
                sqlSession.rollback();
            }
        }
        return userList;
    }


}
