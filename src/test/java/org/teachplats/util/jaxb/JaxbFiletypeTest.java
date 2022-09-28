package org.teachplats.util.jaxb;


import org.teachplats.model.Filetype;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;



public class JaxbFiletypeTest {

    private Filetype filetype;
    private String pathXML;

    @BeforeTest
    public void init()  {
        filetype = new Filetype(1L, "PDF");
        pathXML = "src/test/java/org/teachplats/util/jaxb/filetype-jaxb.xml";
    }


    @Test
    public void countryJaxbTest() throws JAXBException {
        JaxbMarshall.serialization(filetype, pathXML);
    }

}
