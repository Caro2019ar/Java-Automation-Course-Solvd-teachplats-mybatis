package org.teachplats.service;

import org.apache.ibatis.session.SqlSession;
import org.teachplats.connection.SessionFactory;
import org.teachplats.dao.CountryDAO;
import org.teachplats.model.Country;


import java.util.List;
import java.util.Optional;

public class CountryServiceImp implements ICountryService {
    private CountryDAO countryDAO = new CountryDAO();

    @Override
    public void create(Country country) {
        countryDAO.create(country);
    }

    @Override
    public Country searchById(Long id) {
        return countryDAO.getById(id);
    }

    @Override
    public List<Country> listAll() {
        return countryDAO.getAll();
    }

    @Override
    public void update(Country country) {
        countryDAO.update(country);
    }


    @Override
    public void deleteById(Long id) {
        countryDAO.removeById(id);
    }

    public Country searchByName(String name) {
        return countryDAO.getByName(name);
    }
}
