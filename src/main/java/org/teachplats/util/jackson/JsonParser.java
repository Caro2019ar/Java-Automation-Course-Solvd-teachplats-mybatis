package org.teachplats.util.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.teachplats.model.Payment;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public abstract class JsonParser {

    protected static Date parseDateSimpleFormat(String dateString) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date dateParsed = df.parse(dateString);
        return dateParsed;
    }

    protected static void parseJavaInJSON(Object object, String path) throws IOException {
        File file = new File(path);
        file.createNewFile();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(file, object);
    }
}
