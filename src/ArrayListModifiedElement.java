import java.util.ArrayList;
import java.util.List;

public class ArrayListModifiedElement {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        list.set(1, "four");

        for (String el: list) {
            System.out.println(el);
        }
    }
}
