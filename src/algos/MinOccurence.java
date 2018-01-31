package algos;

import java.util.HashMap;
import java.util.Map;

public class MinOccurence {

    //public static void main(String[] args) {
    public char evaluate(char[] arrayChar) {

        //char[] arrayChar = {'a', 'b', 'a', 'b', 'c', 'c'};
        char solution = '?';
        int sum = arrayChar.length;

        System.out.println("test");

        Map<Character, Integer> mapChar = new HashMap<>();

        for (int i = 0; i < arrayChar.length; i++) {
            if (!mapChar.containsKey(arrayChar[i]))
                mapChar.put(arrayChar[i], 1);
            else
                mapChar.put(arrayChar[i], mapChar.get(arrayChar[i]) + 1);
        }

        for (Map.Entry<Character, Integer> entry : mapChar.entrySet())
        {
            System.out.println(entry.getKey() + "/" + entry.getValue());
            if (entry.getValue() < sum) {
                sum = entry.getValue();
                solution = entry.getKey();
            }
        }

        return solution;
    }
}
