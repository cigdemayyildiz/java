package Mentoring.InterviewQuestions;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {


        // How can you remove all duplicates from ArrayList?
        List<String> aList = Arrays.asList("John", "Jane", "James", "Jasmine", "Jane", "James");
        Set<String> set = new HashSet<>(aList);
        System.out.println(set);


        // Second way
        Set<String> set1 = new HashSet<>();
        for (String name : aList){
            set1.add(name);
        }
        System.out.println(set1);

    }
}
