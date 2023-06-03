package hashmap_practice;

import java.util.HashMap;
import java.util.Map;

public class GFG {
    public static void main(String[] args) {

        //create a Map and add some values
        Map<String, String> map = new HashMap<>();
        map.put("Name", "Aman");
        map.put("Address", "Kolkata");

        //print the map
        System.out.println("Map: " + map);

        //remap the value using compute() method
        map.compute("Name", (key, val)
                                -> val.concat(" Singh"));
        map.compute("Address", (key, val)
                                -> val.concat(" West-Bengal"));

        //print new mapping
        System.out.println("New Map: " + map);

        //Create a map and add some Values
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Key1", 12);
        map2.put("Key2", 15);

        //print map2 details
        System.out.println("Map2: " + map2);

        //remap the values using compute method
        map2.compute("Key1", (key, val) -> (val == null) ? 1 : val + 1);
        map2.compute("Key2", (key, val) -> (val == null) ? 1 : val + 5);

        //print new mapping
        System.out.println("New Map: " + map2);

    }
}
