package Homework13;

import java.util.Arrays;
import java.util.TreeSet;

public class Task4 {

    public void ascendingString(String[] array){
        TreeSet<String> set = new TreeSet(Arrays.asList(array));
        System.out.println(set);
    }

    public static void main(String[] args) {

        Task4 task4 = new Task4();
        String[] array = {"java", "phyton", "javascript", "c++", "java", "c++"};
        task4.ascendingString(array);
    }
}
