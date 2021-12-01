package MAP;

import java.net.CookieHandler;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Practice2 {

    public static void main(String[] args) {

        HashMap <Integer, String> map = new HashMap();

        map.put(1234, "Chicago");
        map.put(2345, "New York");
        map.put(3456, "Denver");
        map.put(4567, "Austin");

        System.out.println(map.size()); // 4

        map.put(null,null);

        
        System.out.println(map); // {3456=Denver, null=null, 1234=Chicago, 4567=Austin, 2345=New York}

        map.put(2345, "California");

        System.out.println(map); // {3456=Denver, null=null, 1234=Chicago, 4567=Austin, 2345=California}

        map.replace(1234, "XXXX");
        System.out.println(map); // {3456=Denver, null=null, 1234=XXXX, 4567=Austin, 2345=California}

        map.replace(1234, "XXXX", "YYYY");
        System.out.println(map); // {3456=Denver, null=null, 1234=YYYY, 4567=Austin, 2345=California}

        Boolean bl = map.containsKey(2345);
        System.out.println(bl); // true

        boolean bl1 = map.containsKey(3456);
        System.out.println(bl1); // true

        boolean bl2 = map.containsValue("Washington");
        System.out.println(bl2); // false

        map.remove(null);
        System.out.println(map); // {3456=Denver, 1234=YYYY, 4567=Austin, 2345=California}

        System.out.println(map.getOrDefault(6789, "123")); // 123 --> eger key tanimlanmamissa burada
                                                                        // girdigin value yu key siz olarak yazdiriyor

        System.out.println("**");
        System.out.println(map.get(1));
        System.out.println("**");

//        map.clear();
//        System.out.println(map); // {}

        // print out all values from this map
        // to get all keys from the map --> keySet();

        Set <Integer> keysOfMap = map.keySet();
        // iterate over the set which contains all the keys(zipcodes)
        System.out.println(keysOfMap); // [3456, 1234, 4567, 2345]

        for (Integer key : keysOfMap){
            System.out.println(map.get(key)); // Denver, YYYY, Austin, California
            // pass each key into get method to get values
        }


        Collection<String> cities = map.values();
        System.out.println(cities); // [Denver, YYYY, Austin, California]

        System.out.println();

        for (String city: map.values()){ // source u ana yerden de cekebilirsin, store ettigin yerden cagirmasan da sonuca ulasirsin
            System.out.println(city); // Denver, YYYY, Austin, California
        }







    }
}
