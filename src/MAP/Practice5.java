package MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Practice5 {

    public static void main(String[] args) {

        HashMap<String, Double> map1 = new HashMap();
        LinkedHashMap<String, Double> map2 = new LinkedHashMap();
        TreeMap<String,Double> map3 = new TreeMap();


        // HashMap                          LinkedHashMap                       TreeMap

        map1.put("Coke", 3.99);             map2.put("Coke", 3.99);             map3.put("Coke", 3.99);
        map1.put("Lemonade", 1.99);         map2.put("Lemonade", 1.99);         map3.put("Lemonade", 1.99);
        map1.put("Coffee", 4.99);           map2.put("Coffee", 4.99);           map3.put("Coffee", 4.99);
        map1.put(null, 9.99);               map2.put(null, 9.99);               //map3.put(null, 9.99); --> cannot put null value
        System.out.println(map1);           System.out.println(map2);           System.out.println(map3);

        // map1 = {null=9.99, Lemonade=1.99, Coke=3.99, Coffee=4.99}
        // map2 = {Coke=3.99, Lemonade=1.99, Coffee=4.99, null=9.99}
        // map3 = {Coffee=4.99, Coke=3.99, Lemonade=1.99}


    }
}
