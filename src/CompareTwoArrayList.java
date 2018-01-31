import java.util.ArrayList;
import java.util.List;

public class CompareTwoArrayList {
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
        list2.add("four");
        list2.add("five");
        list2.add("six");
        list2.add("seven");
        list2.add("eight");
        list2.add("nine");
        list2.add("one");
        list2.add("two");
        list2.add("three");

        List<String> list3 = new ArrayList<String>();
        list3.add("3");
        list3.add("4");


        if (list.containsAll(list2))
            System.out.println("list == list2");
        else
            System.out.println("list != list2");

        if (list.containsAll(list3))
            System.out.println("list == list3");
        else
            System.out.println("list != list3");
    }
}
