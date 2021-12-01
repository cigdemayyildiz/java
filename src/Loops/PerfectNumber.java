package Loops;

public class PerfectNumber {

    public static void main(String[] args) {
        int number = 9;
        int sum = 0;

        for (int divisor=1; divisor<=number/2; divisor++){
            if (number%divisor==0){
                sum+=divisor;
                //System.out.println(divisor);
            }
        }
        System.out.println("The sum is " + sum);
        if (sum==number){
            System.out.println(number+" is a perfect number.");
        } else {
            System.out.println(number+" is not a perfect number.");
        }
    }
}
