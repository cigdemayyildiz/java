package Mentoring.JavaRecap.ObjectAndMethod;

public class GroceryStoreTest {

    public static void main(String[] args) {

        GroceryStore houstonStore = new GroceryStore(534,0.99,
                429,0.87);
        GroceryStore seattleStore = new GroceryStore(765,0.86,
                842,0.91);

//        houstonStore.numberOfApplesSoldPerYear = 534;
//        houstonStore.retailPriceOfEachApple = 0.99;
//        houstonStore.numberOfOrangesSoldPerYear = 429;
//        houstonStore.retailPriceOfEachOrange = 0.87;
//
//        seattleStore.numberOfApplesSoldPerYear = 765;
//        seattleStore.retailPriceOfEachApple = 0.86;
//        seattleStore.numberOfOrangesSoldPerYear = 842;
//        seattleStore.retailPriceOfEachOrange = 0.91;

        System.out.println("Houston Store: ");
        System.out.println("Apples sold - "+houstonStore.numberOfApplesSoldPerYear);
        System.out.println("Apple retail cost: $"+houstonStore.retailPriceOfEachApple);
        System.out.println();
        System.out.println("Orange sold - "+houstonStore.numberOfOrangesSoldPerYear);
        System.out.println("Orange retail cost: $"+houstonStore.retailPriceOfEachOrange);

        System.out.println();
        System.out.println("Seattle Store: ");
        System.out.println("Apples sold - "+seattleStore.numberOfApplesSoldPerYear);
        System.out.println("Apple retail cost: $"+seattleStore.retailPriceOfEachApple);
        System.out.println();
        System.out.println("Orange sold - "+seattleStore.numberOfOrangesSoldPerYear);
        System.out.println("Orange retail cost: $"+seattleStore.retailPriceOfEachOrange);

        System.out.println();
        houstonStore.grossRevenue("Houston");
        seattleStore.grossRevenue("Seattle");

        double value = houstonStore.grossRevenue1("Houston");
        double value1 = seattleStore.grossRevenue1("Seattle");
        System.out.println(1+2+value);
    }
}
