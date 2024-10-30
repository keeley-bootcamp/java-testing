import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calc = new Calculator();
    @Test
    public void testAdd() {
        int actual = calc.add(5, 10);
        int expected = 15;

        assertEquals(expected, actual);
    }

    @Test
    public void testSubtract() {
        int actual = calc.subtract(10, 5);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply() {
        int actual = calc.multiply(6, 6);
        int expected = 36;
        assertEquals(expected, actual);
    }

    @Test
    public void testDivide() {
        double actual = calc.divide(10, 5);
        double expected = 2;

        assertEquals(expected, actual);
    }
}
