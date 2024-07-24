package Hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        System.out.println(map.get("B"));
        System.out.println(map.containsKey("C"));
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(56);
        set.add(23);
        set.add(12);
        set.add(69);
        System.out.println(set); // [10, 12, 23, 56, 69] because HashSet is unordered

    }
}