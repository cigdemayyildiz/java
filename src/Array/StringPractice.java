package Array;

import java.util.Arrays;

public class StringPractice {

    public static void main(String[] args) {

        // String Practice
        String [] studentNames = new String[6];

        studentNames[5] = "Zolie";
        studentNames[1] = "Cigdem";
        studentNames[3] = "David";
        studentNames[4] = "John";
        studentNames[0] = "John";

        System.out.println(Arrays.toString(studentNames));

        studentNames[4] = "Diana"; // reassignment

        System.out.print(Arrays.toString(studentNames));

        System.out.println();

        // create a loop to print out elements from the array
        for (int i=0;i<studentNames.length;i++) {
            System.out.print(studentNames[i] + " ");
        }
    }
}
