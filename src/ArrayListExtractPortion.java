import java.util.ArrayList;
import java.util.List;

public class ArrayListExtractPortion {
        public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add("one");
            list.add("two");
            list.add("three");
            list.add("four");
            list.add("five");
            list.add("six");
            list.add("seven");
            list.add("eight");
            list.add("nine");

            List<String> list2 = list.subList(2, 6);

            for (String el: list2) {
                System.out.println(el);
            }
    }
}
