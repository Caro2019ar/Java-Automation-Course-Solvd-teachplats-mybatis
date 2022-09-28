package org.teachplats.util.jaxb;

import org.teachplats.model.City;
import org.teachplats.model.State;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;
import java.util.HashSet;

public class JaxbStateTest {
    private State state;
    private State state2;
    private String pathXML;
    private HashSet<City> hashSet;
    private City city;

    @BeforeTest
    public void init() {
        state = new State(3L, "Tucuman", 3L);
        pathXML = "src/test/java/org/teachplats/util/jaxb/state-jaxb.xml";
        hashSet = new HashSet<>();
        city = new City(1L, "Gualeguay",4L);
        hashSet.add(city);
        city = new City(2L, "Concordia",4L);
        hashSet.add(city);
        state2 = new State(4L, "Entre Rios", 3L, hashSet);
    }

    @Test
    public void stateJaxbTest() throws JAXBException {
        //JaxbMarshall.serialization(state, pathXML);
    }

    @Test
    public void stateWithHashSetJaxbTest() throws JAXBException {
        JaxbMarshall.serialization(state2, pathXML);
    }

}
