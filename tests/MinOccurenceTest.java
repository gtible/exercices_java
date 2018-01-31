import static org.junit.Assert.assertEquals;
import org.junit.Test;

import algos.MinOccurence;

public class MinOccurenceTest {

    char[] arrayTest = {'a', 'b', 'a', 'b', 'c'};

    @Test
    public void evaluatesExpression() {
        MinOccurence minOccurence = new MinOccurence();
        char solution = minOccurence.evaluate(arrayTest);
        assertEquals('c', solution);
    }
}
