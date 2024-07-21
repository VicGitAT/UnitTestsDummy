import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void addTest() {
        Calculator calculator = new Calculator();
        assertEquals("the result of the addition is incorrect", 33, calculator.add(11, 22));
    }

    @Test
    public void subtractTest() {
        Calculator calculator = new Calculator();
        assertEquals("the result of the subtraction is incorrect", 15, calculator.subtract(17, 2));
    }

    @Test
    public void multiplyTest() {
        Calculator calculator = new Calculator();
        assertEquals("the result of the multiplication is incorrect", 242, calculator.multiply(11, 22));
    }

    @Test
    public void divideTest() {
        Calculator calculator = new Calculator();
        assertEquals("the result of the division is incorrect", 0, calculator.divide(11, 22));
    }


}
