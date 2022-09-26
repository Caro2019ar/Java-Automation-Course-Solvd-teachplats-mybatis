package org.teachplats.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.teachplats.connection.SessionFactory;
import org.teachplats.exception.ResourceNotFoundException;
import org.teachplats.model.Country;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CountryDAO implements ICountryDAO {

    private final static Logger logger = LogManager.getLogger(StateDAO.class);
    private static Country country;

    @Override
    public void create(Country country) {
        try (SqlSession sqlSession = new SessionFactory().sqlSessionFactoryBuild()) {
            //=========Para usar getMapper explicado por DIMA ja tem Interface CountryMapper com Annotations (nao XML), falta descomentar namespace do Mapper em Country.xml
            //---DIMA: CountryMapper countryMapper = sqlSession.getMapper(CountryMapper.class);
            try {
                //---DIMA: countryMapper.insert(country.getName());
                sqlSession.insert("Country.insert", country.getName());
                sqlSession.commit();
            } catch (Exception ex) {
                logger.warn(ex.getMessage());
                sqlSession.rollback();
            }
        }
    }

    @Override
    public Country getById(Long id) {
        try (SqlSession sqlSession = new SessionFactory().sqlSessionFactoryBuild()) {
            try {
                country = sqlSession.selectOne("Country.selectById", id);
                sqlSession.commit();
            } catch (Exception ex) {
                logger.warn(ex.getMessage());
                sqlSession.rollback();
            }
        }
        return country;
    }

    @Override
    public void removeById(Long id) {
        try (SqlSession sqlSession = new SessionFactory().sqlSessionFactoryBuild()) {
            try {
                country = sqlSession.selectOne("Country.deleteById", id);
                sqlSession.commit();
            } catch (Exception ex) {
                logger.warn(ex.getMessage());
                sqlSession.rollback();
            }
        }
    }


    @Override
    public List<Country> getAll() {
        List<Country> countryList = new ArrayList<>();
        try (SqlSession sqlSession = new SessionFactory().sqlSessionFactoryBuild()) {
            try {
                countryList = sqlSession.selectList("Country.getAll");
                sqlSession.commit();
            } catch (Exception ex) {
                logger.warn(ex.getMessage());
                sqlSession.rollback();
            }
        }
        return countryList;
    }

    @Override
    public void update(Country country) {
        try (SqlSession sqlSession = new SessionFactory().sqlSessionFactoryBuild()) {
            try {
                Country countryUpdate = (Country) sqlSession.selectOne("Country.selectById", country.getId());
                if (countryUpdate == null) {
                    logger.warn("---------- countryUpdate: " + countryUpdate);
                    throw new ResourceNotFoundException("Couldn't find this ID");
                }
                sqlSession.update("Country.update", countryUpdate);
                sqlSession.commit();
            } catch (Exception ex) {
                logger.warn(ex.getMessage() + " Could not update this resource");
                sqlSession.rollback();
            }
        }
    }

    @Override
    public Country getByName(String name) {
        try (SqlSession sqlSession = new SessionFactory().sqlSessionFactoryBuild()) {
            try {
                Country countrySelected = (Country) sqlSession.selectOne("Country.selectByName", name);
                country = countrySelected;
                if (countrySelected == null) {
                    logger.warn("---------- countrySelected: " + countrySelected);
                    throw new ResourceNotFoundException("Couldn't find this name");
                }
                sqlSession.commit();
            } catch (Exception ex) {
                logger.warn(ex.getMessage() + " Could not find this resource");
                sqlSession.rollback();
            }
        }
        return country;
    }
}
