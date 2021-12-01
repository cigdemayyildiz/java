package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice4 {

    public static void main(String[] args) {

        /*
        Ask user how many names they want to store
          - get names from user to save
          - store those names in a String array
          - if the name has 5 or more letters; save it to an array as longNames
          - if the name has less than 5 letters; save it to an arras as shortNames
          - print out those arrays by using .toString() method
         */

    Scanner input = new Scanner(System.in);
        System.out.println("How many names you want to store?");
        int namesNumbers = input.nextInt();
        input.nextLine();

        String [] longNames = new String[namesNumbers];
        String [] shortNames = new String[namesNumbers];

        for (int i=0;i<namesNumbers;i++){

            System.out.println("Please enter " + (i+1) + ".name");
            String name = input.nextLine();
            if (name.length()>=5){
                longNames[i]=name;
            }else {
                shortNames[i]=name;
            }
        }
        System.out.println(Arrays.toString(longNames));
        System.out.println(Arrays.toString(shortNames));
    }
}
