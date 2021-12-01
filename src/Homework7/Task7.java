package Homework7;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);
        input.nextLine();
        System.out.println("Please enter the user name");
        String userName = input.nextLine();
        System.out.println("Please enter the password");
        String password = input.nextLine();
        boolean isLoginInfoMatch = false;
        int loginCount = 0;

        do {
            System.out.println("Enter your user name");
            String actualUserName = input.nextLine();
            System.out.println("Enter your password");
            String actualPassword = input.nextLine();
            isLoginInfoMatch = !(actualUserName.equalsIgnoreCase(userName) && actualPassword.equalsIgnoreCase(password));
            loginCount++;
            if (loginCount > 3) {
                System.out.println("Your account is on hold for 5 min! Try after 5 min.");
                Thread.sleep(5000);
                loginCount = 0;
            }
        }while (isLoginInfoMatch) ;
        System.out.println("Congrats you successfully login.");

    }
}
