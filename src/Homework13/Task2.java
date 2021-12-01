package Homework13;

import java.util.*;

public class Task2 {

    public void descending(int[] array) {
        TreeSet<Integer> set = new TreeSet<>();
        for (Integer a : array) {
            set.add(a);
        }
        System.out.print(set.descendingSet());
    }

    public static void main(String[] args) {

        int [] array = {2,3,4,4,7,2,1};
        Task2 task2 = new Task2();
        task2.descending(array);
    }
}
