package co.com.sofka.pruebasMaven.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorTest {

    // Objects instances
    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing sum: 1 + 1 = 2")
    void sum() {

        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.sum(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing subt: 4 - 1 = 3")
    void subt() {

        // Arrange
        Long number1 = 4L;
        Long number2 = 1L;
        Long expectedValue = 3L;

        // Act
        Long result = basicCalculator.subt(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing subt: 2 * 8 = 16")
    void mult() {

        // Arrange
        Long number1 = 2L;
        Long number2 = 8L;
        Long expectedValue = 16L;

        // Act
        Long result = basicCalculator.mult(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    void div() {
    }

    @Test
    void mod() {
    }
}