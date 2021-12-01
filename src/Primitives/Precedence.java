package Primitives;

public class Precedence {

    public static void main(String[] args) {

        int count = 10 + 15;
        int count1 = count + 3 * 5;

        System.out.println(count); // 25
        System.out.println(count1); // 40

        int count2 = count - count1 / 2 * 3;

        System.out.println(count2); // -35

        int count3 = 6 / 3 * 5 % 3;

        System.out.println(count3); // 1

        int count4 = 6 - 4 - count + count3;

        System.out.println(count4); // -22
        System.out.println("The total of count3 and count4 --> " + (count3+count4));

        double food = 50;
        double electronics = 250;
        double shoes = 80;
        double taxOfFood = 10;
        double taxOfElectronics = 20;
        double taxOfShoes = 15;

        double resultOfFoodTax = food*taxOfFood/100;
        double resultOfElectronicsTax = electronics*taxOfElectronics/100;
        double resultOfShoesTax = shoes*taxOfShoes/100;

        double resultOfFood = food*taxOfFood/100+food;
        double resultOfElectronics = electronics*taxOfElectronics/100+electronics;
        double resultOfShoes = shoes*taxOfShoes/100+shoes;

        System.out.println("Food is $" + food + ", tax is $" + resultOfFoodTax + " and, food with tax --> $" + resultOfFood);
        System.out.println("Electronics are $" + electronics + ", tax is $" + resultOfElectronicsTax + " and, electronics with tax --> $" + resultOfElectronics);
        System.out.println("Shoes are $" + shoes + ", tax is $" + resultOfShoesTax + " and, shoes with tax --> $" + resultOfShoes);

        System.out.println("Total shopping $" + (food+electronics+shoes));
        System.out.println("Total tax $" + (resultOfFoodTax+resultOfElectronicsTax+resultOfShoesTax));
        System.out.println("Total amount you have to pay $" + (resultOfFood+resultOfElectronics+resultOfShoes));

    }
}
