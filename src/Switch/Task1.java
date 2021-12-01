package Switch;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 7");
        int number = input.nextInt();  // eger sayi disinda bir deger verilirse InputMismatchException hatasi alinir

        switch (number){
            case 1:
                System.out.println("It is Monday");
                break;
            case 2:
                System.out.println("It is Tuesday");
                break;
            case 3:
                System.out.println("It is Wednesday");
                break;
            case 4:
                System.out.println("It is Thurdsay");
                break;
            case 5:
                System.out.println("It is Friday");
                break;
            case 6:
                System.out.println("It is Saturday");
                break;
            case 7:
                System.out.println("It is Sunday");
                break;
            default:
                System.out.println("You need to enter a number between 1 and 7");

        }
    }
}
