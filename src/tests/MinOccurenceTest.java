package tests;

import algos.MinOccurence;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinOccurenceTest {
        char[] arrayTest = {'a', 'b', 'a', 'b', 'c'};

        @Test
        public void evaluatesExpression() {
            MinOccurence minOccurence = new MinOccurence();
            char sum = minOccurence.evaluate(arrayTest);
            assertEquals('c', sum);
    }
}
