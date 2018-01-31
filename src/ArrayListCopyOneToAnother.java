import java.util.ArrayList;
import java.util.List;

public class ArrayListCopyOneToAnother {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        List<String> copy = new ArrayList<>(list);

        for (String el: copy) {
            System.out.println(el);
        }
    }
}
