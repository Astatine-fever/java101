package tests;


// ProductCalculatorTest.java
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import example.even_or_odd;

public class even_odd_test  {
    private even_or_odd eod = new even_or_odd();

    @Test
    public void testiftrue() {
        assertEquals(true, eod.even_odd_function(46));
        assertEquals(true, eod.even_odd_function(-46));
    }

    @Test
    public void testiffalse() {
        assertEquals(false, eod.even_odd_function(27));
        assertEquals(false, eod.even_odd_function(-55));
    }

    @Test
    public void testifzero() {
        assertEquals(true, eod.even_odd_function(0));
    }
}
