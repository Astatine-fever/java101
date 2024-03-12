package tests;

// ProductCalculatorTest.java
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import example.sample_case;

public class unittest {
    private sample_case calculator = new sample_case();

    @Test
    public void testCalculateProduct() {
        assertEquals(6, calculator.calculateProduct(2, 3));
    }

    @Test
    public void testCalculateProductWithZero() {
        assertEquals(0, calculator.calculateProduct(0, 10));
        assertEquals(0, calculator.calculateProduct(5, 0));
    }

    @Test
    public void testCalculateProductNegative() {
        assertEquals(-15, calculator.calculateProduct(-3, 5));
        assertEquals(-15, calculator.calculateProduct(3, -5));
    }
}
