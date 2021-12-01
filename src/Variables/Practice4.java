package Variables;

public class Practice4 {

    public static void main(String[] args) {

        int cows = 12;
        int chickens = 23;

        int costOfChickens = 10;
        int costOfCows = 500;

        int totalCost = cows*costOfCows+chickens*costOfChickens;

        int cowsLegs = 4*cows;
        int chickensLegs = 2*chickens;

        int totalLegs = cowsLegs+chickensLegs;

        System.out.println("Total number of legs of the animals in this farm: " + totalLegs + ".");
        System.out.println("Total cost of animals in this farm: $" + totalCost + ".");


    }
}
