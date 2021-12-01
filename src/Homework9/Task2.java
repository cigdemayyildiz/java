package Homework9;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String [] name = {"Liam", "Emma", "Noah", "Olivia", "William"};
        System.out.println(Arrays.toString(name));
        System.out.println("Please provide any string value");
        String provided = input.nextLine();
        System.out.println("Please enter an index number");
        int indexNumber = input.nextInt();

        for (int i=0; i<name.length; i++){
            if (indexNumber==i){
                name[i]=provided;
            }
        }
        System.out.println(Arrays.toString(name));
    }
}
