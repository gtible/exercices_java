import java.util.*;

public class HashMapInit {
    public static void main(String[] args) {
        Map<String, String> hm = new HashMap<String, String>() ;

        hm.put("one", "element1");
        hm.put("two", "element2");
        hm.put("two", "element2");
        hm.put("nine", "element2");

        System.out.println("--------Map size---------");
        System.out.println(hm.size());

        System.out.println("--------Print Keys---------");
        for (String key : hm.keySet()) {
            System.out.println(key);
        }

        System.out.println("--------Print Values---------");
        for (String value : hm.values()) {
            System.out.println(value);
        }

        System.out.println("--------Print Key & Values---------");
        for (Map.Entry<String, String> entry: hm.entrySet()) {
            System.out.println(entry.getKey() + " --- " + entry.getValue());
        }

        Map<String, String> hm2 = new HashMap<String, String>() ;

        hm2.put("three", "element3");
        hm2.put("four", "element4");

        hm.putAll(hm2);
        System.out.println("--------Add  collection into hm---------");
        for (Map.Entry<String, String> entry: hm.entrySet()) {
            System.out.println(entry.getKey() + " --- " + entry.getValue());
        }

        System.out.println("--------Check if contains key---------");
        if (hm.containsKey("one")) {
            System.out.println("contains key : " + hm.get("one"));
        }

        System.out.println("--------Check if contains value---------");
        if (hm.containsValue("element1")) {
            System.out.println("contains value element1");
        }

        System.out.println("--------Check if contains value return key---------");
        for (Map.Entry<String, String> entry: hm.entrySet()) {
            if (entry.getValue() == "element1")
                System.out.println("for element1 value, the key is : " + entry.getKey());
        }

        System.out.println("--------Create set view of hm---------");
        Set set = hm.entrySet();
        System.out.println("Set " + set);

        System.out.println("--------Create set view of key in hm---------");
        Set set2 = hm.keySet();
        System.out.println("Set of keys" + set2);

        System.out.println("--------Create set view of values in hm---------");
        Collection values = hm.values();
        Set set3 = new HashSet<String>(values);
        System.out.println("Set of values" + set3);

    }
}
