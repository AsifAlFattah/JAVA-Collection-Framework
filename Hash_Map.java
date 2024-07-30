//Used to store key-value pair, unordered

import java.util.*;

public class Hash_Map {

    public static void main(String[] args) {
        //Declaration
        HashMap<String,Integer> hm = new HashMap<>();
        //Insertion
        hm.put("one",1);
        hm.put("two",2);
        hm.put("three",3);
        hm.put("four",4);
        //update value
        hm.put("four",5);

        //Print all pairs of map
        System.out.println(hm);

        //Search / Lookup
        if(hm.containsKey("one")){
            System.out.println("Key is present in the map");
        }
        else{
            System.out.println("Key is not present in the map");
        }

        //Obtaining value
        System.out.println(hm.get("one")); //when key is present
        System.out.println(hm.get("five")); //when key is not present

        //Iterate through EntrySet
        for(Map.Entry<String,Integer> e : hm.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }

        //Iterate through KeySet
        Set<String> keys = hm.keySet();
        for(String key : keys){
            System.out.println(key + " " + hm.get(key));
        }

        //Remove pair .remove(key)
        hm.remove("four");
        System.out.println(hm);

        // Check if the map is empty
        if(hm.isEmpty()) {
            System.out.println("Map is empty");
        } else {
            System.out.println("Map is not empty");
        }

        // Get the size of the map
        System.out.println("Size of the map: " + hm.size());

        // Clear the map
        hm.clear();
        System.out.println("Map after clearing all elements: " + hm);

        // Default value if key is not present
        System.out.println("Value for key 'five' or default: " + hm.getOrDefault("five", -1));

    }

}
