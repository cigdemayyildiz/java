package Primitives;

public class CompoundAssignment {

    public static void main(String[] args) {

        int carNumber = 7;

        carNumber = carNumber+5;
        System.out.println(carNumber); // 12

        carNumber+=5;
        System.out.println(carNumber); // 17

        carNumber/=2; // carNumber = carNumber / 2;
        System.out.println(carNumber); // 8

        int count;

        count = carNumber * 2;
        System.out.println(count); // 16

        int count1;
        // count1 += 10; // this will not compile because java doesn't know value of count1

        count -= carNumber;
        System.out.println(count); // 8

        double payment = 50;
        payment *= carNumber; // payment = payment * carNumber;
        System.out.println(payment);

        int modulus = 1000;
        modulus %= payment; // first java divides 1000 by 400 and finds the remainder and then it assigns the value for modulus variable

        System.out.println(modulus); // 200


    }
}
