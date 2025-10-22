package in.javahome.myweb.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testAddition() {
        // Example:
        int a = 2;
        int b = 3;
        int expected = 5;
        int result = a + b;
        assertEquals(expected, result);
    }

    // Add more @Test methods as needed, replacing old TestCase methods!
}

