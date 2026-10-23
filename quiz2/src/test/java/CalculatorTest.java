import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import advsoft.Calculator;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test 
    public void testSum() {
        assertEquals(calculator.sum(1, 1), 2);
        assertEquals(calculator.sum(1, 0), 1);
        assertEquals(calculator.sum(5, 4), 9);
        assertEquals(calculator.sum(100, 9999), 10099);
        assertEquals(calculator.sum(-38, 52), 14);
        assertEquals(calculator.sum(-38, -52), -90);
    }

    @Test
    public void testSubtract() {
        assertEquals(calculator.subtract(1, 1), 0);
        assertEquals(calculator.subtract(1, 0), 1);
        assertEquals(calculator.subtract(5, 4), 1);
        assertEquals(calculator.subtract(9999, 123), 9876);
        assertEquals(calculator.subtract(52, -38), 90);
        assertEquals(calculator.subtract(-52, -38), -14);
    }

    @Test
    public void testMultiply() {
        assertEquals(calculator.multiply(2, 1), 2);
        assertEquals(calculator.multiply(1, 0), 0);
        assertEquals(calculator.multiply(5, 4), 20);
        assertEquals(calculator.multiply(100, 9999), 999900);
        assertEquals(calculator.multiply(-8, 2), -16);
        assertEquals(calculator.multiply(-8, -2), 16);
    }

    @Test
    public void testDivide() {
        assertEquals(calculator.divide(2, 1), 2);
        assertThrows(
            ArithmeticException.class,
            () -> calculator.divide(1, 0)
        );
        assertEquals(calculator.divide(10, 4), 2);
        assertEquals(calculator.divide(100, 9999), 0);
        assertEquals(calculator.divide(-8, 2), -4);
        assertEquals(calculator.divide(-8, -2), 4);
    }

    @Test
    public void testIsEven() {
        assertEquals(calculator.isEven(0), true);
        assertEquals(calculator.isEven(1), false);
        assertEquals(calculator.isEven(2), true);
        assertEquals(calculator.isEven(-2), true);
        assertEquals(calculator.isEven(1 + 3), true);
        assertEquals(calculator.isEven(2 + 3), false);
        assertEquals(calculator.isEven(2 * 13), true);
        assertEquals(calculator.isEven(3 * 13), false);
    }
}
