package org.teachplats.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.teachplats.dao.StateDAO;
import org.teachplats.model.Country;
import org.teachplats.service.CountryServiceImp;

public class Runner {
    private static CountryServiceImp countryServiceImp = new CountryServiceImp();
    private final static Logger logger = LogManager.getLogger(Runner.class);

    public static void main(String[] args) {

/*        countryServiceImp.create(new Country("Bolivia"));

        countryServiceImp.searchById(11l);

        countryServiceImp.deleteById(9l);

        countryServiceImp.update(new Country(9l, "Germany"));
        countryServiceImp.listAll();*/
        Country country1 = countryServiceImp.searchByName("Ucraine");
        logger.warn(country1);

    }
}
