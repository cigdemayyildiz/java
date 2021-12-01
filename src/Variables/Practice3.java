package Variables;

public class Practice3 {

    public static void main(String[] args) {

        int apple; // declaring variable which means giving the data type and name

        apple = 25; // initializing variable which is assigning the value for it

        int banana = 2; // declaring and initializing in one line

        System.out.println("Number of apples: " + apple); // 25

        apple = 23; // reassign

        System.out.println("Number of apples: " + apple); // 23

        int $apples = 10;
        int _apples = 11;
        int apples$ = 12;
        int apples_ = 13;

        // int %apples = 15;  compile time error
        // int 2apple = 16;  compile time error

        int apple2 = 17; // you cannot start with a number but you can end with a number
        int a$pp$les = 18;

        // there are 23 apples and 2 bananas
        int applePrice = 3;
        int bananaPrice = 2;

        System.out.println("Total apple price is " + (apple*applePrice) + " and total banana price is " + (banana*bananaPrice) + ".");

        int totalApplePrices = apple*applePrice;
        int totalBananaPrices = banana*bananaPrice;

        System.out.println("Total apple price is " + totalApplePrices + " and total banana price is " + totalBananaPrices + ".");

        int payment = totalApplePrices+totalBananaPrices;

        System.out.println("Your total payment is $" + payment + ".");
    }
}
