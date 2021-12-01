package Homework13;

import java.util.Arrays;
import java.util.TreeSet;

public class Task3 {

    public void howManyUnique(String[] array){
        TreeSet<String> set = new TreeSet<>(Arrays.asList(array));
        System.out.println(set.size());
    }

    public static void main(String[] args) {

        Task3 task3 = new Task3();
        String[] array = {"java", "phyton", "javascript", "c++", "java", "c++"};
        task3.howManyUnique(array);

    }
}
