package ru.netology.Homework5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/countSQR.csv")
    public void testForCountSQRService(int expected, long a, long b) {
        SQRService service = new SQRService();

        int actual = service.countSQR(a, b);

        Assertions.assertEquals(expected, actual);
    }
}
