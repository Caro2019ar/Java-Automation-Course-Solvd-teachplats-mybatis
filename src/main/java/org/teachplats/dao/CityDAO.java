package org.teachplats.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.teachplats.connection.SessionFactory;
import org.teachplats.exception.ResourceNotFoundException;
import org.teachplats.model.City;


import java.util.List;

public class CityDAO implements ICityDAO {
    private final static Logger logger = LogManager.getLogger(StateDAO.class);
    private static City city;
    @Override
    public void create(City city) {
        try (SqlSession sqlSession = new SessionFactory().sqlSessionFactoryBuild()) {
            try {
                City city1 = new City(city.getName(), city.getState().getId());
                sqlSession.insert("City.insertWithState",city1);
                sqlSession.commit();
            } catch (Exception ex) {
                logger.warn(ex.getMessage());
                sqlSession.rollback();
            }
        }

    }

    @Override
    public City getById(Long id) {
        try (SqlSession sqlSession = new SessionFactory().sqlSessionFactoryBuild()) {
            try {
                city = sqlSession.selectOne("City.selectById", id);
                sqlSession.commit();
            } catch (Exception ex) {
                logger.warn(ex.getMessage());
                sqlSession.rollback();
            }
        }
        return city;
    }

    @Override
    public void removeById(Long id) {
        try (SqlSession sqlSession = new SessionFactory().sqlSessionFactoryBuild()) {
            try {
                sqlSession.delete("City.deleteById", id);
                sqlSession.commit();
            } catch (Exception ex) {
                logger.warn(ex.getMessage());
                sqlSession.rollback();
            }
        }
    }

    @Override
    public void update(City city) {
        try (SqlSession sqlSession = new SessionFactory().sqlSessionFactoryBuild()) {
            try {
                City cityUpdate = (City) sqlSession.selectOne("City.selectById", city.getId());
                if (cityUpdate == null) {
                    logger.warn("---------- cityUpdate: " + cityUpdate);
                    throw new ResourceNotFoundException("Couldn't find this ID");
                }
                cityUpdate.setName(city.getName());
                cityUpdate.setStateId(city.getStateId());
                sqlSession.update("City.update", cityUpdate);
                sqlSession.commit();
            } catch (Exception ex) {
                logger.warn(ex.getMessage() + " Could not update this resource");
                sqlSession.rollback();
            }
        }
    }

    @Override
    public List<City> getAll() {
        List<City> cityList = null;
        try (SqlSession sqlSession = new SessionFactory().sqlSessionFactoryBuild()) {
            try {
                cityList = sqlSession.selectList("City.getAll");
                sqlSession.commit();
            } catch (Exception ex) {
                logger.warn(ex.getMessage());
                sqlSession.rollback();
            }
        }
        return cityList;
    }
}
