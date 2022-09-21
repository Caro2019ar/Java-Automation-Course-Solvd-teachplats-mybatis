package org.teachplats.dao;

import org.teachplats.connection.ConnectionDBCP2Test;
import org.teachplats.model.Country;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;


public class CountryDAOTest {
    Connection connection = null;
    CountryDAO countryDAO = null;
    Country country = null;

    @AfterTest
    public void cleanUp(){
        Connection connection = null;
        CountryDAO countryDAO = null;
        Country country = null;
    }

    @BeforeClass
    public void setUpBefore() {
        connection = new ConnectionDBCP2Test().getConnection();
        countryDAO = new CountryDAO(connection);
    }

    @Test
    public void createTest() {
        country = new Country("Uruguai t2");
        countryDAO.create(country);
        Assert.assertEquals(country.getName(),"Uruguai t2");
    }

    @Test
    public void getByIdTest() {
        SoftAssert softAssert = new SoftAssert();
        countryDAO.getById(3l);
        softAssert.assertEquals(countryDAO.getById(3l).getName(),"Germany");
        softAssert.assertFalse(countryDAO.getById(3l).getName().equals("German"));
        softAssert.assertAll();
    }

    @Test (dependsOnMethods = "getByIdTest")
    public void removeByIdTest() {
        countryDAO.removeById(8l);
        Assert.assertNull(countryDAO.getById(8l).getName());
    }

    @Test
    public void getAllTest() {
        List<Country> listTest = new ArrayList<>();
        Country country1 = new Country("Co1");
        Country country2 = new Country("Co2");
        countryDAO.create(country1);
        countryDAO.create(country2);
        listTest.add(country1);
        listTest.add(country2);
        countryDAO.getAll();
        Assert.assertFalse(listTest.isEmpty());
    }

    @Test (dependsOnMethods = "getByIdTest")
    public void updateTest() {
        countryDAO.updateCountry("Colombia", 10l);
        Assert.assertEquals(countryDAO.getById(10l).getName(),"Colombia");
    }
    @Test (dependsOnMethods = "getByIdTest")
    public void updateNonExistIDTest() {
        countryDAO.updateCountry("Empty", 8l);
        Assert.assertNull(countryDAO.getById(8l).getName());
    }

}
