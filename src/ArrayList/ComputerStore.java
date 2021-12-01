package ArrayList;

import java.util.ArrayList;

public class ComputerStore {

    public static void main(String[] args) {

            Computer comp1 = new Computer("Apple", "MacBook Air", 1500, 13.5);
            Computer comp2 = new Computer("Apple", "MacBook Pro", 2000, 16);
            Computer comp3 = new Computer("HP", "Envy", 1100, 15.0);
            Computer comp4 = new Computer("Lenovo", "ThinkPad", 900, 11);

            ArrayList<Computer> computer = new ArrayList();

            computer.add(comp1);
            computer.add(comp2);
            computer.add(comp3);
            computer.add(comp4);

            System.out.println(computer);

            Computer.price(computer); // you can call static method with class name
            System.out.println();
            comp1.price(computer); // you can call static method with help of object
            System.out.println();
            comp1.priceList(computer); // you can call non-static method with help of object
    }
}
