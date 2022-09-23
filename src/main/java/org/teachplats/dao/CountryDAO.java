package org.teachplats.dao;

import org.teachplats.model.Country;

import java.sql.SQLException;

public abstract class CountryDAO extends BaseDAO<Country> implements ICountryDAO{


    @Override
    public abstract void create(Country country);

    @Override
    public abstract Country getById(Long id);

    @Override
    public abstract void removeById(Long id);

    @Override
    public abstract void updateCountry(String name, Long id);
}
