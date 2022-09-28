package org.teachplats.util.jaxb;

import org.teachplats.model.Country;
import org.teachplats.model.State;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;
import java.util.HashSet;

public class JaxbCountryTest {
    private State state1;
    private State state2;
    private HashSet<State> stateHashSet;
    private Country country;
    private String pathXML;

    @BeforeTest
    public void init() {
        stateHashSet = new HashSet<>();
        state1 = new State(1L, "Bahia", 3L);
        state2 = new State(2L, "Morada", 3L);
        stateHashSet.add(state1);
        stateHashSet.add(state2);
        country = new Country(3L, "Paraguay", stateHashSet);
        pathXML = "src/test/java/org/teachplats/util/jaxb/country-jaxb.xml";
    }

    @Test
    public void countryJaxbTest() throws JAXBException {
        JaxbMarshall.serialization(country, pathXML);
    }

}
