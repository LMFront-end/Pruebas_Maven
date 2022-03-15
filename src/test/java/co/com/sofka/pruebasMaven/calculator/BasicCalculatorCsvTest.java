package co.com.sofka.pruebasMaven.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorCsvTest {

    BasicCalculator basicCalculator = new BasicCalculator();

    // sum
    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    // sub

    @DisplayName("Testing several subts")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "2,    1,   1",
            "5,    2,   3",
            "49,  51, -2",
            "1,  100, -99"
    })
    public void severalSubts(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.subt(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }





}