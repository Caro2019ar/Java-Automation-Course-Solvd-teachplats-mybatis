package org.teachplats.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.teachplats.model.City;
import org.teachplats.service.CityServiceImp;
import org.teachplats.service.StateServiceImp;

import java.util.List;

public class CityController {
    private static CityServiceImp cityServiceImp = new CityServiceImp();
    private final static Logger logger = LogManager.getLogger(StateController.class);

    public static void main(String[] args) {
//        List<City> list = cityServiceImp.listAll();//ok
//        cityServiceImp.create(new City("Pilar",3l)); //ok
//        cityServiceImp.searchById(6l); //ok
//        cityServiceImp.deleteById(5l);//ok
        cityServiceImp.update(new City(6l,"Zarate", 2l));//ok

    }
}
