package Mentoring;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Interview1 {

    /*
     Vowels are a,e,i,o,u.
     You can assume every string is having vowel .
     Create a function to find most common vowels and print out the appearances of vowels from given String. If vowel
     counts are tied print out counts in alphabetical order.

     For example: If given string is "ComeHere"
     Output should be e appears 3 times.

     If given string is "oouuaaTech"
     output should be a appears 2 times o appears 2 times u appears 2 times

     If given string is "ieTcd"
     Output should be e appears 1 time i appears 1 time
     */

    public static void solution(String str){

        // First we need to find count of every vowel
        // Them from those counts we need to find maximum count


        String vowels = "aeiou";

        Map<String,Integer> countMap = new TreeMap<>();
        for (int i = 0; i < str.length(); i++){
            String currentLetter = str.charAt(i)+"";
            if (vowels.contains(currentLetter)){
                // It means this letter is vowel
                if (!countMap.containsKey(currentLetter)){
                    countMap.put(currentLetter,1);
                }else {
                    // First we need to find count of this vowel from map and increase by one
                    int counter = countMap.get(currentLetter)+1;
                    countMap.put(currentLetter,counter);
                }
            }
        }// I will have map vowels and count of every vowel
        // ["a=1", "e=2"...]
        // How can we find maximum count from map?
        // We can find in one line
        // Return type of values method is collection
        int maximumCount = Collections.max(countMap.values());
        // Last step we should print all the vowels which have maximum count
        Set<String> keys = countMap.keySet();
        for (String key : keys){
            if (maximumCount == 1) {
                if (countMap.get(key) == maximumCount) {
                    System.out.println(key + " appears " + maximumCount + " time");
                }
            }
            else {
                if (countMap.get(key) == maximumCount) {
                        System.out.println(key + " appears " + maximumCount + " times");
                }
            }
        }
    }

    public static void main(String[] args) {

        solution("ComeHere");
    }
}
