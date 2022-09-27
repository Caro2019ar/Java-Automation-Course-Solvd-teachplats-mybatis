package org.teachplats.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.teachplats.model.Payment;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class JsonParser {

    public static void main(String[] args) throws ParseException, IOException {

        String dateToParse = "20-12-2022 11:30:00";
        String pathPayment = "src/main/java/org/teachplats/util/payment.json";
        Payment payment = new Payment( 1l,parseDateSimpleFormat(dateToParse), 5555.55, 2l);

        parseDateSimpleFormat(dateToParse);
        parseJavaInJSON(payment,pathPayment);

    }

    private static Date parseDateSimpleFormat(String dateString) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date dateParsed = df.parse(dateString);
        return dateParsed;
    }

    private static void parseJavaInJSON(Object object, String path) throws IOException {
        File file = new File(path);
        file.createNewFile();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(file, object);
    }
}
