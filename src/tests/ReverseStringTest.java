package tests;

import algos.ReverseString;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseStringTest {

    @Test
    public void evaluatesExpression() {
        ReverseString reverseString = new ReverseString();
        String s = reverseString.evaluate("hello");
        assertEquals("olleh", s);
    }
}
