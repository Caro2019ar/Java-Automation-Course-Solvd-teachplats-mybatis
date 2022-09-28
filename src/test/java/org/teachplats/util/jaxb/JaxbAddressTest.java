package org.teachplats.util.jaxb;

import org.teachplats.model.Address;
import org.teachplats.model.City;
import org.teachplats.model.State;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;
import java.util.HashSet;

public class JaxbAddressTest {
    private Address address;
    private String pathXML;


    @BeforeTest
    public void init() {
        address = new Address(1L, "Calle St.Tucuman", "34A",2L);
        pathXML = "src/test/java/org/teachplats/util/jaxb/address-jaxb.xml";


    }

    @Test
    public void addressJaxbTest() throws JAXBException {
        JaxbMarshall.serialization(address, pathXML);
    }

}
