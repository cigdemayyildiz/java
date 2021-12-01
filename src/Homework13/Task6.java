package Homework13;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Task6 {

    public void bigram(String text){



        Map<String,String> map = new LinkedHashMap<>();
        for (int i = 0; i < text.length()-1; i++) {
           // map.put(text.charAt(i), text.charAt(text.indexOf(' ')-1));
            map.put((text.substring(text.charAt(i),text.charAt(text.indexOf(' ')-1))), text.substring(text.charAt(text.indexOf(' ')+1), text.charAt(text.indexOf(' '))));
        }
        System.out.println(map);




    }

    public static void main(String[] args) {

        Task6 task6 = new Task6();
        String text = "The quick brown fox and the quick blue hare";
        task6.bigram(text);


    }

}
