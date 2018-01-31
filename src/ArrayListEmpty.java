import java.util.ArrayList;
import java.util.List;

public class ArrayListEmpty {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("test");

        if (list.isEmpty())
            System.out.println("list is empty");
        else
            System.out.println("list is not empty");
    }
}