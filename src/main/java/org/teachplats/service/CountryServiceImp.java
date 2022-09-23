package org.teachplats.service;

import org.apache.ibatis.session.SqlSession;
import org.teachplats.connection.SessionFactory;
import org.teachplats.dao.BaseDAO;
import org.teachplats.dao.CountryDAO;
import org.teachplats.dao.ICountryDAO;
import org.teachplats.model.Country;
import org.teachplats.mybatis.CountryMapper;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class CountryServiceImp implements ICountryService {

    //=========Dessa forma que Dima passou com getMapper tem que criar Interface CountryMapper e usar Annotations (nao XML)
    @Override
    public Country add(Country country) {
        try (SqlSession sqlSession = new SessionFactory().sqlSessionFactoryBuild()) {
            CountryMapper countryMapper = sqlSession.getMapper(CountryMapper.class);
            try{ countryMapper.insert(country.getName());
                sqlSession.commit();
            }catch (Exception ex) {
                sqlSession.rollback();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return country;
    }

    @Override
    public Country search(Long id) {
        Country country=new Country();
        try (SqlSession sqlSession = new SessionFactory().sqlSessionFactoryBuild()) {
            try{country = sqlSession.selectOne("Country.selectById", id);
                sqlSession.commit();
            }catch (Exception ex) {
                sqlSession.rollback();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return country;
    }

    @Override
    public List<Country> list() {
        return null;
    }

    @Override
    public Country update(Country country) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }
}
