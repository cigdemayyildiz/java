package Homework13;

import java.util.*;

public class Task1 {

    public void ascending(Integer[]array){
        List<Integer> list = Arrays.asList(array);
        Set<Integer> set = new TreeSet<>(list);
        for (Integer arr : set){
            System.out.print(arr + " ");
        }
    }

    public static void main(String[] args) {

        Task1 task1 = new Task1();
        Integer[] array = {2,3,4,4,7,2,1};
        task1.ascending(array);
    }
}


