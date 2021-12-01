package Loops;

import java.util.Random;

public class RandomPractice {

    public static void main(String[] args) {

        Random number = new Random();

        int randomNumber = number.nextInt(2000); // parantez icindeki deger maksimum cikabilecegi degeri gosteriyor

        System.out.println(randomNumber);

    }
}
