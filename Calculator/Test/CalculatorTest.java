import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void addition() {
        double result = calculator.addition(10, 5);
        assertEquals(15, result);
    }

    @Test
    void subtraction() {
        double result = calculator.subtraction(10, 5);
        assertEquals(5, result);
    }

    @Test
    void multiplication() {
        double result = calculator.multiplication(10, 5);
        assertEquals(50, result);
    }

    @Test
    void division() {
        double result = calculator.division(10, 5);
        assertEquals(2, result);
    }
}