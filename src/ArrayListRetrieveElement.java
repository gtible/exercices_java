import java.util.ArrayList;
import java.util.List;

public class ArrayListRetrieveElement {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        list.remove(1);

        for (String el: list) {
            System.out.println(el);
        }
    }
}


