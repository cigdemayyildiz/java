package Scanner;

import java.util.Scanner;

public class ScannerPractice3 {

    public static void main(String[] args) {

        // .next()

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your full name: ");
        String fullName = scanner.next(); // next kullaninca sadece bosluktan onceki bir kelimeyi print edersin
        System.out.println(fullName); // it will just take one word before the space

        // charAt()

        System.out.println("What is you state: ");
        char firstLetter = scanner.next().charAt(0); // yukaridaki ornegi next() ile yaptigim icin next(), bu nextLine() da olabilir
        System.out.println(firstLetter);


    }
}
