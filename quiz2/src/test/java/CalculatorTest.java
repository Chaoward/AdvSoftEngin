import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
