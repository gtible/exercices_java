import java.util.ArrayList;
import java.util.List;

public class ArrayListSearchElement {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        if (list.contains("one"))
            System.out.println("contains one");
        else
            System.out.println("no searching element");
    }
}
