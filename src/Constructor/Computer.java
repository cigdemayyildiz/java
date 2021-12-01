package Constructor;

public class Computer {
    double price;

    public static double calculator(double [] compPrice){
        double totalPrice = 0;
        for (double price : compPrice) {
           totalPrice+=price;
        }
        return totalPrice;
    }

    public Computer(double price) {
        this.price = price;
        System.out.println("This is one argument constructor");
    }

    public Computer() {
        System.out.println("This is no argument constructor");
    }

    @Override
    public String toString() {
        return "Computer price is: "+ price;
    }

    public static void main(String[] args) {

        double [] array = {100, 200, 300, 400};
        double total = calculator(array);
        System.out.println(total);
    }
}
