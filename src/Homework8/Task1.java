package Homework8;

public class Task1 {

    public static void main(String[] args) {

        int terms = 5;
        int sum = 0;

        for (int i=1, j=1; i<=terms; i++){
            sum+=j;
            // I need to do something different in the last iteration
            if (i==terms){
                System.out.println(j);
            }else {
                System.out.print(j+" + "); // 1 + 11 + 111 + 1111 + 11111
            }
            j=(j*10)+1;
        }
        System.out.println("The sum is: " + sum); // The sum is: 12345
    }
}
