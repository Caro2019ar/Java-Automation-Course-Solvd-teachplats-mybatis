package org.teachplats.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.teachplats.dao.StateDAO;
import org.teachplats.model.Country;
import org.teachplats.model.State;
import org.teachplats.service.CountryServiceImp;
import org.teachplats.service.StateServiceImp;

import java.util.HashSet;


public class Runner {
    private static CountryServiceImp countryServiceImp = new CountryServiceImp();
    private final static Logger logger = LogManager.getLogger(Runner.class);
    private static StateServiceImp stateServiceImp = new StateServiceImp();

    public static void main(String[] args) {

      /*  countryServiceImp.create(new Country("Bolivia"));



        countryServiceImp.deleteById(9l);

        //countryServiceImp.update(new Country(9l, "Germany"));
        countryServiceImp.listAll();
        Country country1 = countryServiceImp.searchByName("Ucraine");
        logger.warn(country1);
        State state1= new State("Chacomus2" );
        State state2= new State("Chaco");
        stateServiceImp.create(state1);
        stateServiceImp.create(state2);
        HashSet<State> stateSet = new HashSet<State>();
        stateSet.add(state1);
        stateSet.add(state2);
        countryServiceImp.create(new Country("Bolst",stateSet));*/
        Country country = countryServiceImp.searchById(40l);

    }
}
