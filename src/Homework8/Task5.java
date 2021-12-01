package Homework8;

public class Task5 {

    public static void main(String[] args) {

        int numbers = 12345;
        int reversed = 0;

        while (numbers!=0){
            int digit1 = numbers%10;
            reversed = reversed*10+digit1;
            numbers/=10;
        }
        System.out.println(reversed);

        // Second one for TASK-5

        int num = 12345;

        for (;num>0;num/=10){
            System.out.print(num%10);
        }
        System.out.println();

    }
}
