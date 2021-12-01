package ArrayList;

import com.sun.crypto.provider.HmacMD5KeyGenerator;

import java.util.ArrayList;

public class Computer {

    /*
    Instance fields: make       model           price       screen
                     apple      MacBook Air     1500        13.5
                     apple      MacBook Pro     2000        16
                     HP         Envy            1100        15.0
                     Lenovo     ThinkPad        900         11
     */

    String make;
    String model;
    double price;
    double screen;

    public Computer(String make, String model, double price, double screen) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.screen = screen;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", screen=" + screen +
                '}';
    }

    public static void price(ArrayList<Computer>computers){
        for (int i = 0; i < computers.size(); i++) {
            if (computers.get(i).price>=500 && computers.get(i).price<=1500){
                System.out.println(computers.get(i).make+"-"+computers.get(i).model);

            }
        }
    }
    public void priceList(ArrayList<Computer>computers){
        for (int i = 0; i < computers.size(); i++) {
            if (computers.get(i).price>=500 && computers.get(i).price<=1500){
                System.out.println(computers.get(i).make+"-"+computers.get(i).model);
            }
        }
    }
}
