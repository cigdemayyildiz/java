package Scanner;

import java.util.Scanner; // you have to import to be able to use the scanner object

public class ScannerPractice {

    public static void main(String[] args) {

        // new keyword means you create an object

        Scanner input = new Scanner(System.in); // this is a scanner object

        String firstName = "Fluffy";
        String lastName = "Brown";
        System.out.println(lastName); // Brown

        System.out.println("Please enter the last name:");
        lastName = input.nextLine();
        System.out.println(lastName); // whatever user types

        String middleName;
        System.out.println("Please enter your middle name: ");
        middleName = input.nextLine();
        System.out.println(middleName); // whatever users type
        System.out.println(firstName+" "+middleName+" "+lastName);

    }
}
