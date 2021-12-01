package String;

import java.util.Locale;
import java.util.Scanner;

public class TaskPractice1 {

    public static void main(String[] args) {

        /*
        TASK: Ask user to enter a String value which should have space at the beginning or end
        - Replace all letter 'a's with single '*' and letter 'e's with double '**',
        - change all string value to UPPERCASE
        - Find index of First '*'
        - Multiply that value by 10 and
        - Print out the result
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a String"); //   Texas is a long star

        String string = input.nextLine();
        System.out.println(string);  //   Texas is a long star

        string = string.trim();
        System.out.println(string); // Texas is a long star --> no spaces

        string = string.replace("a","*");
        System.out.println(string);  // Tex*s is * long st*r

        string = string.replace("e","**");
        System.out.println(string); // T**x*s is * long st*r

        string = string.toUpperCase();
        System.out.println(string); // T**X*S IS * LONG ST*R

        int indexOfStar = string.indexOf("*");
        System.out.println(indexOfStar); // 1
        System.out.println(indexOfStar*10); // 10

        // find and print out middle char's index number
        int middleChar = string.indexOf(string.charAt((string.length()-1)/2));
        System.out.println(middleChar);

    }
}
