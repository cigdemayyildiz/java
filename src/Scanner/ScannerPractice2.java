package Scanner;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Your name is: " + name);

        String lastName;
        System.out.print("Please enter your last name: ");
        lastName = input.nextLine();
        System.out.println("Your last name is: " + lastName);

        System.out.println("Your full name is: " + name + " " + lastName);

        String number = "1";
        number+="2"; // number = number + "2";  // 12 --> number string olarak 1 idi, bu satirda o veriye bir de string olarak 2 ekledik bu durumda 12 oldu
        number+=2; // number = number + 2;  // 122 --> number bir ust satirdan sonra 12 idi bu satirla birlikte number a 2 ekledik 122 oldu, toplama yapmadi cunku variable type is String, string ile basladigi icin toplama islemi yapmiyor ekleme islemi yapiyor.
        System.out.println(number);

        System.out.println("Please enter your age:");
        int age = input.nextInt();
        System.out.println("Your age will be " + (age + 10) + " in 10 years.");

        int ageInFiveYears = age+5;
        System.out.println("Your age will be " + ageInFiveYears + " in five years.");

        System.out.println("Please enter your city name: ");
        name+= input.next();
        System.out.println(name);



    }
}
