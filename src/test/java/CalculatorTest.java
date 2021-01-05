import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void testAdd(){
        assertEquals(4, calculator.add(3, 1));
    }

    @Test
    public void testSubtract(){
        assertEquals(2, calculator.subtract(3, 1));

    }
    @Test
    public void testMultiply(){
        assertEquals(6, calculator.multiply(3, 2));
    }
    @Test
    public void testDivide(){
        assertEquals(2, calculator.divide(4.4, 2.2), 0.01);
    }

}
