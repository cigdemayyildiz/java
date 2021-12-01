package Mentoring.InterviewPractice;

import java.util.ArrayList;
import java.util.HashSet;

public class Question9 {

    public static void main(String[] args) {

        // How can you remove all duplicates from ArrayList?

        ArrayList<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Ali");
        list.add("Veli");

        for (String lis : list){
            System.out.println(lis);
        }

        HashSet<String> set = new HashSet<>(list);
        System.out.println(set);

        ArrayList<String> list2 = new ArrayList<String>(set);
        System.out.println(list2);

        for (String l : list2){
            System.out.println(l);
        }
    }
}
