package org.teachplats.util.jaxb;

import org.teachplats.model.Country;
import org.teachplats.model.File;
import org.teachplats.model.State;
import org.teachplats.util.jackson.JsonParser;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;
import java.text.ParseException;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;

public class JaxbFileTest {

    private File file;
    private String dateToParse;
    private String pathXML;

    @BeforeTest
    public void init() throws ParseException {
        dateToParse = "25-12-2022 01:30";
        file = new File(1L, "Best opera ever", 5.66, JsonParser.parseDateSimpleFormat(dateToParse), 2L);
        pathXML = "src/test/java/org/teachplats/util/jaxb/file-jaxb.xml";
    }


    @Test
    public void fileJaxbTest() throws JAXBException {
        JaxbMarshall.serialization(file, pathXML);
    }

}
