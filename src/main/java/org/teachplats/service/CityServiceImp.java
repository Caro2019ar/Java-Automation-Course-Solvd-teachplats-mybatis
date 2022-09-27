package org.teachplats.service;

import org.teachplats.dao.CityDAO;
import org.teachplats.dao.CountryDAO;
import org.teachplats.model.City;

import java.util.List;

public class CityServiceImp implements ICityService {

    private CityDAO cityDAO = new CityDAO();

    @Override
    public void create(City city) {
        cityDAO.create(city);
    }

    @Override
    public City searchById(Long id) {
        return cityDAO.getById(id);
    }

    @Override
    public List<City> listAll() {
        return cityDAO.getAll();
    }

    @Override
    public void update(City city) {
        cityDAO.update(city);
    }

    @Override
    public void deleteById(Long id) {
        cityDAO.removeById(id);
    }
}
