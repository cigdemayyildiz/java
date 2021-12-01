package ArrayList;

import java.util.ArrayList;

public class Flower {

    String color;
    String name;
    int numberOfPetals;
    double price;

    public Flower(String color, String name, int numberOfPetals, double price) {
        this.color = color;
        this.name = name;
        this.numberOfPetals = numberOfPetals;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", numberOfPetals=" + numberOfPetals +
                ", price=" + price +
                '}';

    }

    public static double totalPrice(ArrayList <Flower> flowers){
        double sum=0;
        for (int i = 0; i< flowers.size(); i++) {
            sum+=flowers.get(i).price;
        }
        return sum;
    }

    // create few flower objects and store them in an ArrayList
    public static void main(String[] args) {

        ArrayList<Flower> flowers = new ArrayList(); // arraylist olusturabilmek icin object e ihtiyac var,
        // Flower bizim olusturdugumuz bir class java da default olarak yok o yuzden object e ihtiyaci var ki
        // behavior inin ne oldugunu anlasin

        Flower fl1 = new Flower("red", "rose", 12,3.99);  // it is an object
        Flower fl2 = new Flower("yellow", "rose,",11,4.99);
        Flower fl3 = new Flower("pink", "rose,",10,5.99);

        flowers.add(fl1);
        flowers.add(fl2);
        flowers.add(fl3);
        System.out.println(flowers);
        System.out.println(fl3.price); // 5.99
        System.out.println(flowers.get(2).price); // 5.99 flowers icinde iki index numarasi var 0,1,2 burada 2.nin price ini cagiriyoruz.

        // create a method that will take an ArrayList as a parameter
        // this method will return total prices of the flowers

        System.out.println(totalPrice(flowers)); // 14.97
    }
}
