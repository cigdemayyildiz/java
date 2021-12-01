package SET;

import java.util.*;

public class Practice2 {

    public static void main(String[] args) {

        HashSet <Integer> hash1 = new HashSet<>();

        LinkedHashSet <Integer> link1 = new LinkedHashSet<>();

        TreeSet <Integer> tree1 = new TreeSet<>();

        hash1.add(91);
        hash1.add(82);
        hash1.add(33);
        hash1.add(64);
        hash1.add(91); // ayni elementi birden fazla ekleyemiyorsun
        hash1.add(null);
        System.out.println(hash1); // [64, null, 33, 82, 91] --> random order --> hernagi bir siralama kurali yok
        System.out.println("**********************");

        link1.add(51);
        link1.add(22);
        link1.add(83);
        link1.add(14);
        link1.add(14); // ayni elementi birden fazla ekleyemiyorsun
        link1.add(null);
        System.out.println(link1); // [51, 22, 83, 14, null] --> insertion order --> hangi sira ile element eklediysek
                                                                                    // o sira ile gosteriyor
        System.out.println("**********************");

        tree1.add(61);
        tree1.add(32);
        tree1.add(13);
        tree1.add(94);
        tree1.add(13); // ayni elementi birden fazla ekleyemiyorsun
        //tree1.add(null); // treeSet e null value ekleyemiyorsun
        System.out.println(tree1); // [13, 32, 61, 94] --> ascending order --> kucukten buyuge siraliyor


        for (Integer number : tree1){
            boolean b = number.toString().equalsIgnoreCase("32");
            System.out.println(b + " " + number.toString());
            String str = number == 32 ? "I found 32" : "Couldn't find 32";
            System.out.println(str + (number));

            /*
                **false 13
                Couldn't find 3213
                **true 32
                I found 3232
                **false 61
                Couldn't find 3261
                **false 94
                Couldn't find 3294
             */

        }

        // [13, 32, 61, 94]
        Iterator iter = tree1.iterator();

        while (iter.hasNext()){
            System.out.println(iter.next()); // 13, 32, 61, 94
        }

        System.out.println();

        // [51, 22, 83, 14, null]
        Iterator iter1 = link1.iterator();

        while (iter1.hasNext()){
            System.out.println(iter1.next()); // 51, 22, 83, 14, null
        }

        System.out.println();

        // [64, null, 33, 82, 91]
        Iterator iter2 = hash1.iterator();

        while (iter2.hasNext()){
            System.out.println(iter2.next()); // 64, null, 33, 82, 91
        }

        System.out.println();

        ArrayList <String> veggies = new ArrayList();

        veggies.add("tomato");
        veggies.add("lettuce");
        veggies.add("carrot");
        veggies.add("lettuce");

        // looping over ArrayList by using iterator
        Iterator vegIter = veggies.iterator();

        while (vegIter.hasNext()){
            System.out.println(vegIter.next()); // tomato, lettuce, carrot, lettuce
        }

        System.out.println();

        // sorting collection via sort(); method
        Collections.sort(veggies);
        System.out.println(veggies); // [carrot, lettuce, lettuce, tomato]

        System.out.println();

        // convert ArrayList to set

        HashSet set1 = new HashSet(veggies);
        System.out.println("This is list to set: "+set1); // This is list to set: [tomato, lettuce, carrot]

        System.out.println();

        // set to ArrayList

        ArrayList list = new ArrayList(set1);
        System.out.println("This is new ArrayList from set: "+list); // This is new ArrayList from set: [tomato, lettuce, carrot]

        System.out.println();

        list.add("tomato");
        System.out.println("After adding tomato once again: "+list); // After adding tomato once again: [tomato, lettuce, carrot, tomato]
        System.out.println(list.get(2)); // carrot


    }
}
