import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //declare map
        HashMap<Integer, String> myMap = new HashMap<>();

        //adding to a map
        myMap.put(12345, "Eric");
        myMap.put(17383, "Noah");
        myMap.put(83713, "Sam");
        myMap.put(29383, "Isaac");
        myMap.put(92383, "Antong");
        myMap.put(98233, "Luke");
        myMap.put(12345, "Devin");

        //for each looping through a map
        for(int key: myMap.keySet()) {
            String value = myMap.get(key);
            System.out.print(value + " ");
        }

        //checking for a key
        if (myMap.containsKey(12345)) {
            System.out.println("12345 is in the map");
        }
        if (myMap.containsKey(98233)) {
            System.out.println("98233 is in the map");
        }
        
        //using an iterator
        Iterator<Integer> iterator = myMap.keySet().iterator();
        while(iterator.hasNext()) {
            int key = iterator.next();
            String value = myMap.get(key);
            System.out.println(value);
        }
    }
}