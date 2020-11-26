import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ICalculatorTest {

    ICalculator calc;

    @Before
    public void setUp() throws Exception {
        calc = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
        calc = null;
    }

    @Test
    public void add() {

        assertEquals(5, calc.add(2 , 3));
    }

    @Test
    public void subtract() {

        assertEquals(20, calc.subtract(30, 10));
    }

    @Test
    public void multiply() {
        assertEquals(200,calc.multiply(20, 10));
    }

    @Test
    public void divide() {
        assertEquals(10,calc.divide(40,4));
    }
}