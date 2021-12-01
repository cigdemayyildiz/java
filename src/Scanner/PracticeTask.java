package Scanner;

import java.util.Scanner;

public class PracticeTask {

    public static void main(String[] args) {

        /*
        by using scanner
        Ask user to provide their height and weight
        and calculate their BMI
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your height:"); // 1.65
        double height = input.nextDouble();
        System.out.println("Please enter your weight:"); // 52
        double weight = input.nextDouble();
        double yourBMI = (int)(weight / (height*height));

        System.out.println("Your BMI is: " + yourBMI); // Your BMI is: 19.100091827364558
    }
}
