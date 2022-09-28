package org.teachplats.util.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;


public class JaxbMarshall {

    public static void serialization(Object objectSame, String path) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(objectSame.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal((objectSame), new File(path));
    }
}