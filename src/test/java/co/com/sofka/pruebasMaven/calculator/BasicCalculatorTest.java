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
    @DisplayName("Testing mult: 2 * 8 = 16")
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

    // div sucess
    @Test
    @DisplayName("Testing divSucess: 10 / 2 = 5")
    void divSucess() {

        // Arrange
        Double number1 = Double.valueOf(10L);
        Double number2 = Double.valueOf(2L);
        Double expectedValue = Double.valueOf(5L);

        // Act
        Double result = basicCalculator.div(number1, number2);

        // Assert
        assertEquals(expectedValue, result);

    }

    // div fail
    @Test
    @DisplayName("Testing divFail: 3 / 0 = 0")
    void divFail() {

        // Arrange
        Double number1 = Double.valueOf(3L);
        Double number2 = Double.valueOf(0L);

        assertThrows(IllegalArgumentException.class, () -> {
            basicCalculator.div(number1, number2);
        });

    }

    // mod sucess
    @Test
    @DisplayName("Testing mod: 4 % 2 = 0")
    void modSucess() {

        // Arrange
        Long number1 = 4L;
        Long number2 = 2L;
        Long expectedValue = 0L;

        // Act
        Long result = basicCalculator.mod(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    // mod fail
    @Test
    @DisplayName("Testing mod: 2 % 0 = 0")
    void modFiled() {

        // Arrange
        Long number1 = 2L;
        Long number2 = 0L;

        assertThrows(IllegalArgumentException.class, () -> {
            basicCalculator.mod(number1, number2);
        });
    }
}