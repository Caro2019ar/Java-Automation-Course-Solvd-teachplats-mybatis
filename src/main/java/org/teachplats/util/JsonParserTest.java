package org.teachplats.util;

import org.teachplats.model.Payment;

import java.io.IOException;
import java.text.ParseException;

public class JsonParserTest {
    public static void main(String[] args) throws ParseException, IOException {

        String dateToParse = "20-12-2022 11:30:00";
        String pathPayment = "src/main/java/org/teachplats/util/payment.json";
        Payment payment = new Payment( 1l,JsonParser.parseDateSimpleFormat(dateToParse), 5555.55, 2l);

        JsonParser.parseDateSimpleFormat(dateToParse);
        JsonParser.parseJavaInJSON(payment,pathPayment);

    }
}
