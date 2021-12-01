package Mentoring.InterviewPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class Question11 {

    public static void main(String[] args) {

        // How to find count of each letter in the String?

        String str = "Today is a beautiful day to study Java";

        Map<Character, Integer> result = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (result.containsKey(str.charAt(i))){
                int count = result.get(str.charAt(i));
                result.replace(str.charAt(i),++count);
            }else {
                result.put(str.charAt(i),1);
            }
        }
        System.out.println(result);
        System.out.println(result.entrySet());

    }
}
