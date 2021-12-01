package Loops;

import java.util.Random;
import java.util.Scanner;

public class HeadTailPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String answer;
        int randomNumber;

        do {
            System.out.println("Game is started! Make a GUESS!  HEAD/TAIL");
            String guess = input.next();
            randomNumber = random.nextInt(2);
            String flip = randomNumber == 0 ? "HEAD" : "TAIL";
            if (guess.equalsIgnoreCase(flip)){
                System.out.println("You're lucky, it is your day today.");
            }
            else{
                System.out.println("Sorry that was not the correct choice");
            }
            System.out.println("Do you want to play again?  Y/N");
            answer = input.next();
        }while (answer.equalsIgnoreCase("y"));
        System.out.println("It's OK, See you next time!");


    }
}
