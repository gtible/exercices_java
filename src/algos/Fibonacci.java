package algos;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public int evaluate(int number) {

       int result = fibonacci(number);

       return result;
    }


    public static int fibonacci(int number) {
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(0);
        myList.add(1);

        for (int i = 1; i < number; i++) {
            myList.add(myList.get(i) + myList.get(i-1));
        }

        return myList.get(myList.size() - 1);
    }
}
