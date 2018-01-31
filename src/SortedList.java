import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortedList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("allemand");
        list.add("boule");
        list.add("col");
        list.add("faim");
        list.add("boxe");
        list.add("film");

        list.sort(Comparator.naturalOrder());

        for (String el: list) {
            System.out.println(el);
        }
    }
}
