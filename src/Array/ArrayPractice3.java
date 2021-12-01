package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many names you want to store?");
        int namesNumbers = input.nextInt();
        input.nextLine();

        String [] names = new String[namesNumbers];

        for (int i=0;i<names.length;i++){

            System.out.println("Please enter " + (i+1) + ".name");
            names[i]=input.nextLine();

        }System.out.println(Arrays.toString(names));

    }
}
