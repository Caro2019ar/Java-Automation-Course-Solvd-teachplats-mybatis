package org.teachplats.dao;

import org.teachplats.model.Country;

public interface ICountryDAO extends IBaseDAO<Country> {

    Country getByName (String name);
}
