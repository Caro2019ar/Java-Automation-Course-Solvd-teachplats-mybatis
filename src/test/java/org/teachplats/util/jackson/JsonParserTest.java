package org.teachplats.util.jackson;

import org.teachplats.model.Payment;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.text.ParseException;

public class JsonParserTest {
    private String dateToParse;
    private String pathPayment;
    private Payment payment;

    @BeforeTest
    public void init() throws ParseException {
        dateToParse = "20-09-2022 11:30:00";
        pathPayment = "src/test/java/org/teachplats/util/jackson/payment.json";
        payment = new Payment(1L, JsonParser.parseDateSimpleFormat(dateToParse), 5555.55, 2l);
    }

    @Test
    public void paymentJacksonTest() throws ParseException, IOException {
        JsonParser.parseJavaInJSON(payment, pathPayment);
    }
}
