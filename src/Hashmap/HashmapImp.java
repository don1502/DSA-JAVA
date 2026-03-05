package Hashmap;

import java.util.HashMap;

// https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
// Use the above link for exploring the various methods of hashmap in java

public class HashmapImp {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Don", 1);// Adding or putting the value and key to the hashmap
        map.put("Christ", 2);
        map.put("Gomez", 3);

        System.out.println(map.get("Don")); // get is used to get the value of the given key
    }
}
