package Mentoring.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAndArrayList {

    // What is the different between Array and ArrayList?

    /*
    Array --> Fixed size
              Syntax is different
              It doesn't have methods
              It stores primitive data, String and object
    ArrayList --> It's size is flexible, dynamic, changable
                  It has methods
                  It stores only objects (Integer, Double, Boolean, String, Object)


                  Primitive data doesn't have methods
                  Objects have methods
     */

    public static void main(String[] args) {

        String [] array = {"Ahmet","Diana","Elvira","Ramazan"};
        String [] array1 = new String [5];
        int [] number = new int[2];

        array1[0] = "Arzu";
        array1[1] = "Nikita";
        array1[2] = "Julia";
        System.out.println(Arrays.toString(array1)); // [Arzu, Nikita, Julia, null, null]

        ArrayList <String> name = new ArrayList<>();
        name.add("Ahmet");
        name.add("Adam");
        name.add("Tuba");
        name.add("Berry");
        name.add("Maksat");
        name.add("Adel");
        name.add("Kana");
        name.add("Bota");
        System.out.println(name);

        // create a method and void sout the name (if it is there)
        // write a java program to search an element in ArrayList

        nameSearch(name,"Ahmet");
    }
    // first key point: I have to access each of the element by using loop
    // I have to get the element from the list and compare it
    public static void nameSearch(ArrayList<String>allNames, String name){
        String serachName = name;
        for (int i = 0; i < allNames.size(); i++) {
            if (allNames.get(i).equalsIgnoreCase(serachName)){
                System.out.println("Your name is there");
                break;
            }else {
                System.out.println("Your name is not there");
            }
        }
    }
}
