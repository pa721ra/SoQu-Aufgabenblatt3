import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class ICalculatorTest extends TestCase {


    @Test
    public void add() {
        assertEquals(2 , icalc.add(1,1));
        assertEquals(0, icalc.add(0,0));
    }

    @Test
    public void subtract() {
        assertEquals(2 , icalc.subtract(12,10));
        assertEquals(0, icalc.subtract(0,0));
        assertEquals(-8 , icalc.subtract(10,18));
        assertEquals(0, icalc.subtract(0,0));
    }

    @Test
    public void multiply() {
        assertEquals(20, icalc.multiply(10, 2));
        assertEquals(-180, icalc.multiply(10, -18));
    }

    @Test
    public void divide() {
        assertEquals(10, icalc.divide(20,2));
        assertEquals(-20, icalc.divide(-200,10));
        assertEquals(0, icalc.divide(10,20));

    }

    ICalculator icalc = new ICalculator() {
        @Override
        public int add(int value, int value2) {
            int ergebnis = value + value2;
            return ergebnis;
        }

        @Override
        public int subtract(int value, int value2) {
            return 0;
        }

        @Override
        public int multiply(int value, int value2) {
            return 0;
        }

        @Override
        public int divide(int value, int value2) {
            return 0;
        }
    };
}