import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListToArrayList {

    public static void main(String[] args) {

        List<Object> list = new LinkedList<>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("allemand");
        list.add("boule");
        list.add("col");
        list.add("faim");
        list.add("boxe");
        list.add("film");

        List<Object> listArray = new ArrayList<>(list);

        for (Object el: listArray) {
            System.out.println(el);
        }


    }
}
