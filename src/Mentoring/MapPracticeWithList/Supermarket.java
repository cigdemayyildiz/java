package Mentoring.MapPracticeWithList;

import java.util.*;

public class Supermarket {

    public static void main(String[] args) {

        Supermarket supermarket = new Supermarket();
        supermarket.printDairy();
        supermarket.printChips();
        supermarket.printCookies();
        supermarket.printDairyPrice();
        supermarket.printChipsPrice();
        supermarket.printCookiesPrice();
        supermarket.dairyNameAndPrice();
        supermarket.chipsNameAndPrice();
        supermarket.cookiesNameAndPrice();
        supermarket.allProductNameAndPrice();
        supermarket.nameOfItem();

    }

    //LETS DO IT STEP BY STEP:

    //Store following dairy to the array: Milk, Cheese, Butter, Yogurt, Cream, Casein
    String [] dairy = {"Milk", "Cheese", "Butter", "Yogurt", "Cream", "Casein"};

    //Store following chips to the array: Lays, Fritos, Cheetos, Doritos, Ruffles, Pringles
    String [] chips = {"Lays", "Fritos", "Cheetos", "Doritos", "Ruffles", "Pringles"};

    //Store following cookies to the array: Nabisco,Oreo, Nestle, Amos, SnackWell ,MaryLand
    String [] cookies = {"Nabisco", "Oreo", "Nestle", "Amos", "SnackWell", "MaryLand"};


    //TASK 1:
    // Create three more arrays to store the prices for these products.
    // dairyPrice :  2.99, 1.99, 3.99, 2.49, 0.99, 1.69
    double [] dairyPrice = {2.99, 1.99, 3.99, 2.49, 0.99, 1.69};

    // chipsPrice :  3.99,  2.99,  4.99,  3.49,  1.99,  2.69
    double [] chipsPrice = {3.99,  2.99,  4.99,  3.49,  1.99,  2.69};

    // cookiesPrice: 4.99,  3.99,  5.99,  4.49,  2.99,  3.69
    double [] cookiesPrice = {4.99,  3.99,  5.99,  4.49,  2.99,  3.69};


    // TASK 2:
    // Create the method to print the Dairy.(do it with the list, think about the reason why)
    public void printDairy(){
        ArrayList<String> allDairyList = new ArrayList<>();
        for (String dairyList : dairy){
            allDairyList.add(dairyList);
            // System.out.println(dairyList);
        }
        System.out.println(allDairyList);
    }

    // Create the method to print the Chips.(do it with the list, think about the reason why)
    public void printChips(){
        ArrayList<String> allChipsList = new ArrayList<>();
        for (String chipsList : chips){
            allChipsList.add(chipsList);
            //System.out.println(chipsList);
        }
        System.out.println(allChipsList);
    }

    // Create the method to print the Cookies (do it with the list, think about the reason why)
    public void printCookies(){
        ArrayList<String> allCookiesList = new ArrayList<>(); // yeni bir arraylist olusturduk
        for (String cookiesList : cookies){ // bos bir String icine her bir elementi dongu ile koymak icin dongu olusturduk
            allCookiesList.add(cookiesList); // arraylist icine olusturdugumuz String leri listeledik
            //System.out.println(cookiesList);
        }
        System.out.println(allCookiesList);
    }


    //TASK 3:
    // Create the method to print the DairyPrice.(do it with the list, think about the reason why)
    public void printDairyPrice(){
        ArrayList<Double> allDairyPriceList = new ArrayList<>();
        for (Double allDairyPrice : dairyPrice){
            allDairyPriceList.add(allDairyPrice);
        }
        System.out.println(allDairyPriceList);
    }

    // Create the method to print the ChipsPrice.(do it with the list, think about the reason why)
    public void printChipsPrice(){
        ArrayList<Double> allChipsPriceList = new ArrayList<>();
        for (Double allChipsPrice : chipsPrice){
        allChipsPriceList.add(allChipsPrice);
        }
        System.out.println(allChipsPriceList);
    }

    // Create the method to print the CookiesPrice (do it with the list, think about the reason why)
    public void printCookiesPrice(){
        ArrayList<Double> allCookiesPriceList = new ArrayList<>();
        for (Double allCookiesPrice : cookiesPrice){
            allCookiesPriceList.add(allCookiesPrice);
        }
        System.out.println(allCookiesPriceList);
    }


    //TASK 4:
    // Create the method to print the DairyName and DairyPrice.(do it with the map, think about the reason why)
    public void dairyNameAndPrice(){
        Map<String,Double> allDairyNameAndPrice = new LinkedHashMap<>();
        for (int i = 0; i < dairy.length; i++) {
            allDairyNameAndPrice.put(dairy[i], dairyPrice[i]);
        }
        System.out.println(allDairyNameAndPrice);
    }

    // Create the method to print the ChipsName and ChipsPrice.(do it with the map, think about the reason why)
    public void chipsNameAndPrice(){
        Map<String,Double> allChipsNameAndPrice = new LinkedHashMap<>();
        for (int i = 0; i < chips.length; i++){
            allChipsNameAndPrice.put(chips[i], chipsPrice[i]);
        }
        System.out.println(allChipsNameAndPrice);
    }

    // Create the method to print the CookiesName and CookiesPrice (do it with the map, think about the reason why)
    public void cookiesNameAndPrice(){
        Map<String,Double> allCookiesNameAndPrice = new LinkedHashMap<>();
            for (int i = 0; i < cookies.length; i++) {
                allCookiesNameAndPrice.put(cookies[i],cookiesPrice[i]);
            }
            System.out.println(allCookiesNameAndPrice);
    }


    //TASK 5:
    // Do all Task4 in a same method
    public void allProductNameAndPrice(){
        Map<String,Double> allProduct = new LinkedHashMap<>();
        for (int i = 0; i < dairy.length; i++){
            allProduct.put(dairy[i],dairyPrice[i]);
            allProduct.put(chips[i],chipsPrice[i]);
            allProduct.put(cookies[i],chipsPrice[i]);
        }
        System.out.println(allProduct);
    }

    //TASK 6:
    // Create a method with the parameter String nameOfItem and find the price of the product
    public void nameOfItem(){
        Map<String,Double> nameOfItems = new LinkedHashMap<>();
        for (int i = 0; i < dairy.length; i++){
            nameOfItems.put(dairy[i],dairyPrice[i]);
            System.out.print(" "+dairy[i]+" = ");
            System.out.print(nameOfItems.get(dairy[i]));

        }

    }

    // Create a method with the parameter String nameOfItem and replace it from the map

}
