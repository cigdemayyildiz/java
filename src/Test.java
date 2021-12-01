import com.sun.codemodel.internal.JWhileLoop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    /*
    From the list of strings which contain only number.
    String str = "1234";
    Write a method to find sum of all numbers from a given list of string

     */

    public static void palindrome(String name){
        String reversed ="";
        for (int i = name.length()-1; i>=0; i--){
            reversed+=name.charAt(i);
        }if (name.equals(reversed)){
            System.out.println(name+" is Palindrome");
        }
        else {
            System.out.println(name+" is NOT Palindrome");
        }
    }

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Texas", 233);
        map.put("New York",333);

        System.out.println(map.keySet());
        System.out.println(map.values()); // 233, 333
        map.put("Texas",455);
        System.out.println(map.values()); // 455, 333

        palindrome("madam");
    }
}
