package tests;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import algos.Fibonacci;

public class FibonacciTest {

    @Test
    public void evaluatesExpression() {
        Fibonacci fibonacci = new Fibonacci();
        int sum = fibonacci.evaluate(8);
        assertEquals(21, sum);
    }
}
