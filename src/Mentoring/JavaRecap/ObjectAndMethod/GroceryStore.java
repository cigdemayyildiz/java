package Mentoring.JavaRecap.ObjectAndMethod;

public class GroceryStore {

    int numberOfApplesSoldPerYear;
    double retailPriceOfEachApple;
    int numberOfOrangesSoldPerYear;
    double retailPriceOfEachOrange;

    GroceryStore(){}

    public GroceryStore(int numberOfApplesSoldPerYear, double retailPriceOfEachApple, int numberOfOrangesSoldPerYear,
                        double retailPriceOfEachOrange) {
        this.numberOfApplesSoldPerYear = numberOfApplesSoldPerYear;
        this.retailPriceOfEachApple = retailPriceOfEachApple;
        this.numberOfOrangesSoldPerYear = numberOfOrangesSoldPerYear;
        this.retailPriceOfEachOrange = retailPriceOfEachOrange;
    }

    public void grossRevenue(String name){
        double grossRevenue = (numberOfApplesSoldPerYear*retailPriceOfEachApple)+
                (numberOfOrangesSoldPerYear*retailPriceOfEachOrange);
        System.out.println("The gross revenue of "+name+" $"+grossRevenue);
    }

    public double grossRevenue1(String name){
        double grossRevenue = (numberOfApplesSoldPerYear*retailPriceOfEachApple)+
                (numberOfOrangesSoldPerYear*retailPriceOfEachOrange);
        System.out.println("The gross revenue of "+name+" $"+grossRevenue);
        return grossRevenue;
    }


}
