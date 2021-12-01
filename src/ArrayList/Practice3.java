package ArrayList;

import java.util.ArrayList;

public class Practice3 {

    // name you method as --> printFruit
    // create a method that will take an ArrayList as a parameter
    // print the elements if they have 5 or more letters

    public static void printFruits(ArrayList <String> fruits){

        for (String fruit:fruits) {
            if (fruit.length()>=5) {
                System.out.println(fruit); // Apple, Pineapple, Orange
            }
        }

        System.out.println();
        for (int i=0; i<fruits.size(); i++){
            if (fruits.get(i).length()<=5){
                fruits.remove(i);

            }else {
                System.out.println(fruits.get(i)); // Pineapple, Orange

            }
        }
        System.out.println();
        System.out.println(fruits); // [Kiwi, Pineapple, Orange]

    }


    public static void main(String[] args) {

        ArrayList<String> fruitNames = new ArrayList<>();
        fruitNames.add("Apple");
        fruitNames.add("Kiwi");
        fruitNames.add("Pineapple");
        fruitNames.add("Orange");
        fruitNames.add("Plum");

        // printFruits(fruitNames);

        // eger method static olmasaydi o zaman object e gerek olacakti
        Practice3 object = new Practice3();
        object.printFruits(fruitNames);
    }
}
