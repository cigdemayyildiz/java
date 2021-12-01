package Primitives;

public class ModulusPractice {

    public static void main(String[] args) {

        // modulus = left over/remainder

        // % (modulus) will give the remainder of division

        int studentCount = 9;
        int divisor = 2;

        int resultOfDivision = studentCount / divisor;

        System.out.println("The result is --> " + resultOfDivision); // 4

        int remainder = studentCount % divisor;

        System.out.println("The remainder is --> " + remainder); // 1


        System.out.println("              4 divison");
        System.out.println("           ____________");
        System.out.println("           |");
        System.out.println("9 dividend |  2 divisor");
        System.out.println("           |");
        System.out.println("           ------------");
        System.out.println("              1 remainder");


        int x =15; // I want to divide 15 by 6 and find the remainder --> 3

        int result = x % 6;

        System.out.println(result); // 3




    }

}
