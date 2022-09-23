package org.teachplats.dao;

import org.teachplats.connection.ConnectionDBCP2Test;
import org.teachplats.model.Country;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;


public class CountryDAOTest {
/*    Connection connection = null;
    preparedCountryDAO preparedCountryDAO = null;
    Country country = null;

    //@AfterTest
    public void cleanUp(){
        Connection connection = null;
        preparedCountryDAO preparedCountryDAO = null;
        Country country = null;
    }

   // @BeforeClass
    public void setUpBefore() {
        connection = new ConnectionDBCP2Test().getConnection();
        preparedCountryDAO = new preparedCountryDAO(connection);
    }

   // @Test
    public void createTest() {
        country = new Country("Uruguai t2");
        preparedCountryDAO.create(country);
        Assert.assertEquals(country.getName(),"Uruguai t2");
    }

    //@Test
    public void getByIdTest() {
        SoftAssert softAssert = new SoftAssert();
        preparedCountryDAO.getById(3l);
        softAssert.assertEquals(preparedCountryDAO.getById(3l).getName(),"Germany");
        softAssert.assertFalse(preparedCountryDAO.getById(3l).getName().equals("German"));
        softAssert.assertAll();
    }

   // @Test (dependsOnMethods = "getByIdTest")
    public void removeByIdTest() {
        preparedCountryDAO.removeById(8l);
        Assert.assertNull(preparedCountryDAO.getById(8l).getName());
    }

   // @Test
    public void getAllTest() {
        List<Country> listTest = new ArrayList<>();
        Country country1 = new Country("Co1");
        Country country2 = new Country("Co2");
        preparedCountryDAO.create(country1);
        preparedCountryDAO.create(country2);
        listTest.add(country1);
        listTest.add(country2);
        preparedCountryDAO.getAll();
        Assert.assertFalse(listTest.isEmpty());
    }

    //@Test (dependsOnMethods = "getByIdTest")
    public void updateTest() {
        preparedCountryDAO.updateCountry("Colombia", 10l);
        Assert.assertEquals(preparedCountryDAO.getById(10l).getName(),"Colombia");
    }
   // @Test (dependsOnMethods = "getByIdTest")
    public void updateNonExistIDTest() {
        preparedCountryDAO.updateCountry("Empty", 8l);
        Assert.assertNull(preparedCountryDAO.getById(8l).getName());
    }*/

}
