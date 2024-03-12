package tests;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import example.*;

public class even_odd_bddtest {

    @Test
    public void testEvenOddFunction() {
        // Arrange
        even_or_odd evenOrOdd = new even_or_odd();
        int evenNumber = 6;
        int oddNumber = 7;

        // Act
        boolean isEvenForEvenNumber = evenOrOdd.even_odd_function(evenNumber);
        boolean isEvenForOddNumber = evenOrOdd.even_odd_function(oddNumber);

        // Assert
        assertTrue("Even number should return true", isEvenForEvenNumber);
        assertFalse("Odd number should return false", isEvenForOddNumber);
    }
}
