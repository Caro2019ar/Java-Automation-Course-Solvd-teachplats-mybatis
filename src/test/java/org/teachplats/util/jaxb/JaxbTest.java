package org.teachplats.util.jaxb;

import org.teachplats.model.Country;
import org.teachplats.model.State;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;
import java.util.HashSet;

public class JaxbTest {

    @Test
    public void countryJaxbTest() throws JAXBException {
        HashSet<State> stateHashSet = new HashSet<>();
        State state1 = new State(1l, "Bahia", 3l);
        State state2 = new State(2l, "Blanca", 3l);
        stateHashSet.add(state1);
        stateHashSet.add(state2);
        Country country = new Country(3l, "Paraguay", stateHashSet);
        String pathXML = "src/test/java/org/teachplats/util/jaxb/country-jaxb.xml";
        JaxbMarshall.serialization(country, pathXML);
    }

}
