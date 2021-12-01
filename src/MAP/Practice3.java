package MAP;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice3 {

    public static void main(String[] args) {

        HashMap <String, Integer> dataMap = new HashMap<>();

        dataMap.put("IT", 111);
        dataMap.put("HR", 222);
        dataMap.put("Help", 333);
        dataMap.put("Admin", 444);

        // get individual values
        // get all values
        // get single element

        // create a method which takes a parameter of map, and this method will print out each extension one by one

        companyMap(dataMap);
    }

    public static void companyMap(HashMap<String, Integer> data){

         Set <String> keysOfMap = data.keySet();

        for (String key : keysOfMap){
            System.out.println(data.get(key));
        }

        // second way --> bunda 27.satirdaki Set i olusturman gerekmiyor

//        for (Integer key : data.values()){
//            System.out.println(key);
//
//        }
    }
}
