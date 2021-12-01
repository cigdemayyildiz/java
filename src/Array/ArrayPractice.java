package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

    public static void main(String[] args) {

        // 1.Primitives and objects can be stored in array
        // 2.Data type you want to store must be same data type except object type because object covers everything
        // 3.Array has/uses index (0,1,2,3 ...)
        // 4.Array has default values
            // numbers default --> 0 / 0.0
            // String default --> null
            // Char default --> '' (empty)
            // Object default --> null
            // Boolean --> false
        // 5.Array has fixed size (if you say i am going to create 3 you can create only 3 you cannot create more than 3
        // 6.You can store duplicate values in array

        int [] numbers  = new int [5]; // you can store only int data type in it

        System.out.println(numbers); // it gives a hashcode ([I@5cad8086) which it means location of your array

        numbers [0] = 11;
        numbers [1] = 22;
        numbers [3] = 44;
        // numbers [5] = 55; // it will give ArrayIndexOutOfBoundsException since there is no 5th index

        System.out.println(numbers[1]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        System.out.println(Arrays.toString(numbers)); // they will come all together like a bundle
        // .toString is a method

        System.out.println(numbers.length); // 5

        for (int i=0;i<numbers.length;i++){
            System.out.println("** "+numbers[i]); // 11 - 22 - 0 - 44 - 0 --> they will come by one by
        }

        int b [] = {1,3,5,7,9};
        System.out.println(Arrays.toString(b));
        System.out.println(""+b[3]+","+b[0]);

        String [] str = {"we", "are", "here", "now"};
        System.out.println(Arrays.toString(str));
        System.out.println(str[0]+" "+str[3]);

        String [] names = new String[5]; // you can only store String type of data in it
        names [0] = "Cigdem";
        names [1] = "John";
        names [2] = "Ozlem";
        names [3] = "Koray";
        names [4] = "Leyla";
        System.out.println(names[2]);

        Object [] object = new Object[6]; // you can store primitives and objects data types in it
        object [1] = "ABC";
        object [2] = 10;
        object [3] = 1.0;
        object [4] = 'C';


        System.out.println(Arrays.toString(object));
        System.out.println(""+object[2]+" "+object[0]+" "+object[1]); // 10 null ABC

        boolean [] bool = new boolean[2];
        bool [1]=true;
        System.out.println(Arrays.toString(bool));

    }
}
