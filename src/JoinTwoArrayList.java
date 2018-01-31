import java.util.ArrayList;
import java.util.List;

public class JoinTwoArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");

        List<String> list2 = new ArrayList<String>();
        list2.add("3");
        list2.add("4");

        list.addAll(list2);

        for (String el: list) {
            System.out.println(el);
        }

    }
}
