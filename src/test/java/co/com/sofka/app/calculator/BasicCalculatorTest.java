package co.com.sofka.app.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();
    @Test
    @DisplayName("Testing sum: 5+3=8")
    public void sum() {
        // Arrange
        Long number1 = 5L;
        Long number2 = 3L;
        Long expectedValue = 8L;

        // Act
        Long result = basicCalculator.sum(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing restar: 5-3=2")
    public void restar() {
        Long number1 = 5L;
        Long number2 = 3L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.restar(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing multiplicar: 5*3=15")
    public void multiplicar() {
        Long number1 = 5L;
        Long number2 = 3L;
        Long expectedValue = 15L;

        // Act
        Long result = basicCalculator.multiplicar(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing dividir: 30/2=15")
    public void dividir() {
        Long number1 = 30L;
        Long number2 = 2L;
        Long expectedValue = 15L;

        // Act
        Long result = basicCalculator.dividir(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }
}