package org.teachplats.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.teachplats.connection.SessionFactory;
import org.teachplats.exception.ResourceNotFoundException;
import org.teachplats.model.City;
import org.teachplats.model.Country;
import org.teachplats.model.User;


import java.util.List;
import java.util.Optional;

public class UserDAO extends BaseDAO<User> implements IUserDAO {
    private final static Logger logger = LogManager.getLogger(UserDAO.class);
    private static User user = new User();

    @Override
    public void create(User object) {
    }

    @Override
    public User getById(Long id) {
        try (SqlSession sqlSession = new SessionFactory().sqlSessionFactoryBuild()) {
            try {
                user = sqlSession.selectOne("User.selectById", id);
                sqlSession.commit();
            } catch (Exception ex) {
                logger.warn(ex.getMessage());
                sqlSession.rollback();
            }
        }
        return user;
    }


    @Override
    public void removeById(Long id) {
        try (SqlSession sqlSession = new SessionFactory().sqlSessionFactoryBuild()) {
            try {
                sqlSession.delete("User.deleteById", id);
                sqlSession.commit();
            } catch (Exception ex) {
                logger.warn(ex.getMessage());
                sqlSession.rollback();
            }
        }
    }

    @Override
    public void update(User user) {
        try (SqlSession sqlSession = new SessionFactory().sqlSessionFactoryBuild()) {
            try {
                User user1 = (User) sqlSession.selectOne("User.selectById", user.getId());
                if (user1 == null) {
                    logger.warn("---------- cityUpdate: " + user1);
                    throw new ResourceNotFoundException("Couldn't find this ID");
                }
                user1.setFirstName(user.getFirstName());
                user1.setLastName(user.getLastName());
                user1.setEmail(user.getEmail());
                user1.setPhone(user.getPhone());
                user1.setDateOfBirth(user.getDateOfBirth());
                user1.setAddressId(user.getAddressId());
                sqlSession.update("User.update", user1);
                sqlSession.commit();
            } catch (Exception ex) {
                logger.warn(ex.getMessage() + " Could not update this resource");
                sqlSession.rollback();
            }
        }
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
