package Homework13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Task5 {

    public void descendingString(String[] array){

        TreeSet<String> set = new TreeSet<>(Arrays.asList(array));
        System.out.println(set.descendingSet());
        System.out.print("{");
        for (String list : set){
            System.out.print(list+ ", ");
        }
        System.out.println("}");
    }

    public static void main(String[] args) {

        Task5 task5 = new Task5();
        String[] array = {"java", "phyton", "javascript", "c++", "java", "c++"};
        task5.descendingString(array);
    }
}
