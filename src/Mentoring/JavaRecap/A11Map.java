package Mentoring.JavaRecap;

import java.util.LinkedHashMap;
import java.util.Map;

public class A11Map {

    // Possible Interview Question
    // Can you tell me about Map and why do you use Map in your project?
    // Map is the way of storing data as a key and value format
    // I love using map in my project because key and value format which is good for my project to store like customer
    // name with the balance
    // What is the connection between Map and Collection?
    // Map is the combination of Set and List. Map has key and value, key only stores unique value which means is acting
    // like set, value may or may not stores duplicate elements which means is acting like list.
    // What is the type of Map and difference between them?
    // HashMap --> no order, randomly
    // LinkedHashMap --> insertion order
    // TreeMap --> ascending order
    // **What is the difference between HashMap and HashTable?
    // HashMap is non-synchronized -- HashTable is synchronized


    public static void main(String[] args) {

        String[] brands = {"Apple", "Banana", "Orange", "Peach", "Apple", "Orange", "Strawberry", "Banana", "Apple",
                "Orange", "Banana", "Apple"};

        Map<String,Integer> map = new LinkedHashMap<>();
        for (int i=0; i<brands.length; i++){
            if (!map.containsKey(brands[i])) {
                map.put(brands[i],1);
            }else {
                map.put(brands[i],map.get(brands[i])+1);
            }
        }
        System.out.println(map);


    }


}
