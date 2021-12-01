package Projects;

public class Project2 {

    public static void main(String[] args) {

// Task-1

        /*
        1.  check internet connection;
        2.  if internet connection is good, find google browser on your device;
        3.  open google app;
        4.  click on the search box and type www.google.com, click enter;
        5.  find google search bar;
        6.  type any question in the search bar, click magnifier glass;
        7.  wait for the response, check if google gives you any results;
        8.  on the top right conner click in to google images to see if that would load and you are able to see pictures;
        9.  click return button;
        10. on the top right conner click in to gmail option (link) to see if your email would load;
        11. click return button until you get to the main page with google search and ask a question (of any kind);
        12. click enter;
        13. choose the most suitable link for you and click into this to see if that would load.
        14. make sure if it works.
        15. close your browser.

         */


        // Task-2

        int quarters = 5;
        int dimes = 4;
        int nickels = 3;
        int pennies = 2;
        float _quarters = 0.25f;
        float _dimes = 0.10f;
        float _nickels = 0.05f;
        float _pennies = 0.01f;
        float total = (quarters * _quarters) + (dimes * _dimes) + (nickels * _nickels) + (pennies * _pennies);

        System.out.print("The total in dollars is $");
        System.out.format("%.2f", total);

        // Task-3 Example-1

        int balance = 236;
        int quarter = 25;
        int dime = 10;
        int nickel = 05;
        int penny = 01;

        int result = balance / quarter;
        int result1 = balance - (quarter * result);
        int result2 = result1 / dime;
        int result3 = result1 - (dime * result2);
        int result4 = result3 / nickel;
        int result5 = result3 - (nickel * result4);
        int result6 = result5 / penny;

        System.out.println("\n" + "$" + balance * .01 + " will make " + result + " quarters " + result2 + " dime " + result4 + " nickels and " + result5 + " penny.");

        // Task-3 Example-2

        int _balance = 522;
        int _quarter = 25;
        int _dime = 10;
        int _nickel = 05;
        int _penny = 01;

        int _result = _balance / _quarter;
        int _result1 = _balance - (_quarter * _result);
        int _result2 = _result1 / _dime;
        int _result3 = _result1 - (_dime * _result2);
        int _result4 = _result3 / _nickel;
        int _result5 = _result3 - (_nickel * _result4);
        int _result6 = _result5 / _penny;

        System.out.println("$" + _balance * .01 + " will make " + _result + " quarters " + _result2 + " dime " + _result4 + " nickels and " + _result5 + " pennies.");

        // Task-4 Example-1

        int number = 578432;
        int digit1 = number % 10;
        number = number / 10;
        int digit2 = number % 10;
        number = number / 10;
        int digit3 = number % 10;
        number = number / 10;
        int digit4 = number % 10;
        number = number / 10;
        int digit5 = number % 10;
        number = number / 10;
        int digit6 = number % 10;

        System.out.println("Multiplication of all digits is " + digit6 * digit5 * digit4 * digit3 * digit2 * digit1);
        System.out.println("The Sum of all digits is " + (digit6 + digit5 + digit4 + digit3 + digit2 + digit1));

        // Task-4 Example-2

        int number1 = 327695;
        int _digit1 = number1 % 10;
        number1 = number1 / 10;
        int _digit2 = number1 % 10;
        number1 = number1 / 10;
        int _digit3 = number1 % 10;
        number1 = number1 / 10;
        int _digit4 = number1 % 10;
        number1 = number1 / 10;
        int _digit5 = number1 % 10;
        number1 = number1 / 10;
        int _digit6 = number1 % 10;

        System.out.println("Multiplication of all digits is " + _digit6 * _digit5 * _digit4 * _digit3 * _digit2 * _digit1);
        System.out.println("Sum of all digits is " + (_digit6 + _digit5 + _digit4 + _digit3 + _digit2 + _digit1));

        // Task-5 Example-1

        int number2 = 53876;
        int $digit1 = number2 % 10;
        number2 = number2 / 10;
        int $digit2 = number2 % 10;
        number2 = number2 / 10;
        int $digit3 = number2 % 10;
        number2 = number2 / 10;
        int $digit4 = number2 % 10;
        number2 = number2 / 10;
        int $digit5 = number2 % 10;

        System.out.println("The output is " + $digit1 + $digit2 + $digit3 + $digit4 + $digit5);

        // Task-5 Example-2

        int number3 = 97352;
        int lastDigit = number3 % 10;
        number3 = number3 / 10;
        int forthDigit = number3 % 10;
        number3 = number3 / 10;
        int thirdDigit = number3 % 10;
        number3 = number3 / 10;
        int secondDigit = number3 % 10;
        number3 = number3 / 10;
        int firstDigit = number3 % 10;

        System.out.println("The output is " + lastDigit + forthDigit + thirdDigit + secondDigit + firstDigit);

    }
}


