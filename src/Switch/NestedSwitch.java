package Switch;

import java.util.Scanner;

public class NestedSwitch {

    public static void main(String[] args) {

        // int, byte, short, char, String

        Scanner input = new Scanner(System.in);
        System.out.println("Which department do you want to talk to?  \n 1- IT Dept. \n 2- HR Dept. \n 3- Repr.Dept.");
        int department = input.nextInt();

        switch (department){
            case 1:
                System.out.println("Who do you want to talk with? \n 1- Raj \n 2- Alex \n 3- Jessi");
                int nameOfIt = input.nextInt();
                switch (nameOfIt){
                    case 1:
                        System.out.println("You will speak with Raj");
                        break;
                    case 2:
                        System.out.println("You will speak with Alex");
                        break;
                    case 3:
                        System.out.println("You will speak with Jessi");
                        break;
                    default:
                        System.out.println("Please enter a valid number");
                        break;
                }
                break;
            case 2:
                System.out.println("Who do you want to talk with? \n 1- Ana \n 2- Tima");
                int nameOfHr = input.nextInt();
                switch (nameOfHr){
                    case 1:
                        System.out.println("You will speak with Ana");
                        break;
                    case 2:
                        System.out.println("You will speak with Tima");
                        break;
                    default:
                        System.out.println("Please enter a valid number");
                        break;
                }
                break;
            case 3:
                System.out.println("Who do you want to talk with? \n 1- Jeremiah \n 2- John \n 3- David");
                int nameOfRep = input.nextInt();
                switch (nameOfRep){
                    case 1:
                        System.out.println("You will speak with Jeremiah");
                        break;
                    case 2:
                        System.out.println("You will speak with John");
                        break;
                    case 3:
                        System.out.println("You will speak with David");
                        break;
                    default:
                        System.out.println("Please enter a valid number");
                        break;
                }
                break;
            default:
                System.out.println("Please choose a correct department number!");
                break;
        }
    }
}
