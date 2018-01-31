import java.util.*;

public class ArrayListSwapTwoElements {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        Collections.swap(list, 1, 3);
      /*
       String el1 = list.get(1);
       String el2 = list.get(3);
       list.set(1, el2);
       list.set(3, el1);
       */


        for (String el: list) {
            System.out.println(el);
        }

        char[] list2 = {'a', 'b', 'a', 'b', 'c'};
        List<Character> list3 = new ArrayList<>();

        for (char el: list2) {
            list3.add(el);
        }

        Collections.sort(list3, Comparator.naturalOrder());
        for (Character el: list3) {
            System.out.println(el);
        }
    }
}
