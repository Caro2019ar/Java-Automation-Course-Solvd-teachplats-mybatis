package org.teachplats.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.teachplats.connection.SessionFactory;
import org.teachplats.model.Country;
import org.teachplats.model.State;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StateDAO extends BaseDAO<State> implements IStateDAO<State> {

    private final static Logger logger = LogManager.getLogger(StateDAO.class);

    private static State state;


    @Override
    public void create(State state) {
        try (SqlSession sqlSession = new SessionFactory().sqlSessionFactoryBuild()) {
            IStateDAO iStateDAO = sqlSession.getMapper(IStateDAO.class);
            state = new State(state.getName(), state.getCountry().getId());
            try {
                iStateDAO.create(state);
                sqlSession.commit();
            } catch (Exception ex) {
                logger.warn(ex.getMessage());
                sqlSession.rollback();
            }
        }
    }

    @Override
    public State getById(Long id) {
        try (SqlSession sqlSession = new SessionFactory().sqlSessionFactoryBuild()) {
            State state = new State();
            IStateDAO iStateDAO = sqlSession.getMapper(IStateDAO.class);
            try {
                //--------esse iStateDAO.getById(id) traz um Integer??
                iStateDAO.getById(id);
                System.out.println("State getByID---"+iStateDAO.getById(id));
                sqlSession.commit();
            } catch (Exception ex) {
                logger.warn(ex.getMessage());
                sqlSession.rollback();
            }
        }
        return state;
    }

    @Override
    public void removeById(Long id) {
        try (SqlSession sqlSession = new SessionFactory().sqlSessionFactoryBuild()) {
            IStateDAO iStateDAO = sqlSession.getMapper(IStateDAO.class);
            try {
                iStateDAO.removeById(id);
                sqlSession.commit();
            } catch (Exception ex) {
                logger.warn(ex.getMessage());
                sqlSession.rollback();
            }
        }
    }

    @Override
    public void update(State state) {

    }

    @Override
    public List<State> getAll() {
        List<State> list = new ArrayList<>();
        try (SqlSession sqlSession = new SessionFactory().sqlSessionFactoryBuild()) {
            IStateDAO iStateDAO = sqlSession.getMapper(IStateDAO.class);
            try {
                logger.warn("list -----" + iStateDAO.getAll());
                list = iStateDAO.getAll();
                sqlSession.commit();
            } catch (Exception ex) {
                logger.warn(ex.getMessage());
                sqlSession.rollback();
            }
        }
        return list;
    }


    @Override
    public State getByName(String name) {
        return null;
    }
}
