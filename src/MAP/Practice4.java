package MAP;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice4 {

    public static void main(String[] args) {

        HashMap<String, Integer> dataMap = new HashMap<>();

        dataMap.put("IT", 111);
        dataMap.put("HR", 222);
        dataMap.put("Help", 333);
        dataMap.put("Admin", 444);

        // get individual values
        // get all values
        // get single element

        // entrySet(); method is bringing keys and values together

        System.out.println(dataMap); // {Help=333, HR=222, IT=111, Admin=444} --> map

        System.out.println(dataMap.entrySet()); // [Help=333, HR=222, IT=111, Admin=444] --> array

        Set<Map.Entry<String, Integer>> data = dataMap.entrySet();
        System.out.println(data); // [Help=333, HR=222, IT=111, Admin=444]

        // task: print out elements from this set one at a time

        for (Map.Entry<String, Integer> key : data){
            System.out.println(key);

        }


    }
}
