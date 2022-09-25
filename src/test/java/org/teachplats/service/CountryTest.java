package org.teachplats.service;


import org.teachplats.model.Country;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import java.util.ArrayList;
import java.util.List;


public class CountryTest {
    private static CountryServiceImp countryServiceImp = new CountryServiceImp();
    private static Long idToBeRemoved = null;
    private static Long idToBeSearched = null;
    private static Long idToBeUpdated= null;
    private static Country country = null;

    @AfterTest
    public void cleanUp() {
        country = null;
    }

    @BeforeClass
    public void setUpBefore() {
        country = new Country("England");
        idToBeSearched = 3l;
        idToBeRemoved = 29l;
        idToBeUpdated= 7l;
    }

    @Test
    public void createTest() {
        countryServiceImp.create(country);
        Assert.assertEquals(country.getName(), "England");
    }

    @Test
    public void getByIdTest() {
        SoftAssert softAssert = new SoftAssert();
        countryServiceImp.searchById(idToBeSearched);
        softAssert.assertEquals(countryServiceImp.searchById(idToBeSearched).getName(), "Germany");
        softAssert.assertFalse(countryServiceImp.searchById(idToBeSearched).getName().equals("German"));
        softAssert.assertAll();
    }

    @Test (dependsOnMethods = "getByIdTest")
    public void removeByIdTest() {
        countryServiceImp.deleteById(idToBeRemoved);
        Assert.assertNull(countryServiceImp.searchById(idToBeRemoved));
    }

    @Test (dependsOnMethods = "createTest")
    public void getAllTest() {
        List<Country> listTest = new ArrayList<>();
        Country country1 = new Country("Co1");
        Country country2 = new Country("Co2");
        countryServiceImp.create(country1);
        countryServiceImp.create(country2);
        listTest.add(country1);
        listTest.add(country2);
        countryServiceImp.listAll();
        Assert.assertFalse(listTest.isEmpty());
    }

    @Test(dependsOnMethods = "getByIdTest")
    public void updateTest() {
        countryServiceImp.update(new Country(idToBeUpdated, "Colombia"));
        Assert.assertEquals(countryServiceImp.searchById(idToBeUpdated).getName(), "Colombia");
    }

    @Test (dependsOnMethods = "removeByIdTest")
    public void updateNonExistIDTest() {
        countryServiceImp.update(new Country(idToBeRemoved, "UpCountry"));
        Assert.assertNull(countryServiceImp.searchById(idToBeRemoved));
    }

}
