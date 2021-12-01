package SET;

import java.util.HashSet;
import java.util.Set;

public class Practice1 {

    public static void main(String[] args) {

        // you cannot store duplicates element

        /*
        HashSet     --> no order, stores null value
         - doesn't keep order
         - there is no get(); method to reach out for specific element
         - unique elements
        LinkedSet   --> insertion order, stores null value
        TreeSet     --> ascending order, no null value
         */

        HashSet set1 = new HashSet();

        HashSet <String> set2 = new HashSet();

        Set <String> set3 = new HashSet();

        Set set4 = new HashSet<String>();

        Set <String> set5 = new HashSet<>();

        Set <String> set6 = new HashSet<String>();


        set1.add("Chicago");
        set1.add("Dallas");
        set1.add("Columbus");
        set1.add("Denver");
        set1.add("New York");
        set1.add(12);
        set1.add(true);
        set1.add(null);
        set1.add("Denver"); // ikinci kere yazdirmadi
        System.out.println(set1); // [null, New York, Chicago, Columbus, Denver, Dallas, 12, true]

        System.out.println(set1.contains("New York")); // true --> contains ile aramak istedigin element set listende
        // var mi diye bakabilirsin ama sadece boolean result alirsin, o element uzerinde degisiklik yapamazsin

        for (Object x : set1) {
            System.out.println(x); // tum elementleri liste disina cikardi
        }

        // print only denver from the set1

//        for (Object x : set1){
//            if (x.equals("Denver")){
//                    System.out.println(x);
//            }
//        }

        set1.remove(null);
        System.out.println(set1); // [New York, Chicago, Columbus, Denver, Dallas, 12, true]

        for (Object x : set1){
            if (x.equals("Denver")){
                System.out.println(x); // Denver
            }
        }

        for (int i = 0; i < set1.size(); i++){
            if (set1.contains("Denver")){
                System.out.println("Denver"); // Denver
                break;
            }
        }

        set1.clear();
        System.out.println(set1); // []

    }
}
