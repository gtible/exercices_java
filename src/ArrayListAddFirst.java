import java.util.ArrayList;
import java.util.List;

public class ArrayListAddFirst {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        list.add(0, "zero");


        for (String el: list) {
            System.out.println(el);
        }
    }
}
