package org.teachplats.util.jackson;

import org.teachplats.model.Payment;
import org.testng.annotations.Test;

import java.io.IOException;
import java.text.ParseException;

public class JsonParserTest {

    @Test
    public void paymentJacksonTest() throws ParseException, IOException {

        String dateToParse = "20-12-2022 11:30:00";
        String pathPayment = "src/test/java/org/teachplats/util/jackson/payment.json";
        Payment payment = new Payment( 1l, JsonParser.parseDateSimpleFormat(dateToParse), 5555.55, 2l);

        JsonParser.parseDateSimpleFormat(dateToParse);
        JsonParser.parseJavaInJSON(payment,pathPayment);

    }
}
