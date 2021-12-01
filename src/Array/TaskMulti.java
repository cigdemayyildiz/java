package Array;

import java.util.Arrays;

public class TaskMulti {

    public static void main(String[] args) {

        /*
        Computers
        Apple, Lenovo, HP, DEll, Acer
        TVs
        Samsung, LG, Sony
        Speakers
        Alexa, Google, Logitech, JBL
        --------------
        Prices
        Computers
        Apple --2500, Lenovo-1600, HP-1800, DEll-1900, Acer-1100
        TVs
        Samsung-2199, LG-1799, Sony-1599
        Speakers
        Alexa-79.99, Google-89.99, Logitech-64.99, JBL-55.99
        // STORE Brand in a multidimensional array
        // STORE Prices in a multidimensional array
        // print out prices for each product as:
        // "price for Apple is $2500"
         */

        String [][] brands = {{"Apple", "Lenovo", "HP", "DELL", "Acer"}, {"Samsung", "LG", "Sony"},
                {"Alexa", "Google", "Logitech", "JBL"}};

        double [][] prices = {{2500, 1600, 1800, 1900, 1100}, {2199, 1799, 1599}, {79.99, 89.99, 64.99, 55.99}};

        for (int i=0; i< brands.length; i++){
            for (int j=0; j< prices.length; j++){
                System.out.println("Price for " + brands[i][j]+" is $"+prices[j][j]);
            }
        }


    }
}
