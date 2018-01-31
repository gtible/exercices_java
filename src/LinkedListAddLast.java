import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class LinkedListAddLast {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("one");
        list.add("two");
        list.add("three");


        Collections.sort(list, Comparator.reverseOrder());

        list.add(2, "test");
        list.add(0, "first");
        list.add("last");

        LinkedList<String> list2 = new LinkedList<String>();

        list2.add("1");
        list2.add("2");
        list2.add("3");

        list.addAll(2, list2);

        for (String el: list){
            System.out.println(el);
        }

        list.remove(2);
        list.removeFirst();
        list.removeLast();
        System.out.println("---------Remove first & last----------");
        for (String el: list){
            System.out.println(el);
        }

        Collections.swap(list, 0, list.size()-1);
        System.out.println("---------Swap first & last----------");
        for (String el: list){
            System.out.println(el);
        }

        String s = list.peekFirst();
        System.out.println("---------PeekFirst----------");
        System.out.println(s);

        String s2 = list.getFirst();
        System.out.println("---------getFirst----------");
        System.out.println(s2);

        String s3 = list.pollFirst();
        System.out.println("---------pollFirst----------");
        System.out.println(s3);

        list.removeAll(list);
        System.out.println("---------Remove all----------");
        for (String el: list){
            System.out.println(el);
        }
        System.out.println("-------------------");
    }
}
