package org.teachplats.controller;

import org.teachplats.model.Country;
import org.teachplats.service.CountryServiceImp;

public class Runner {
    private static CountryServiceImp countryServiceImp = new CountryServiceImp();

    public static void main(String[] args) {
//        countryServiceImp.add(new Country("Bolivia"));
//        System.out.println(countryServiceImp.add(new Country("Bolivia")));


        System.out.println(countryServiceImp.search(9l));
    }
}
