package org.teachplats.util.jaxb;

import org.teachplats.model.Filetype;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;


public class JaxbMarshall {

    public static void serialization(Object objectSame, String path) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(objectSame.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal((objectSame), new File(path));
    }
}