package Loops;

public class MultiplicationTable {

    public static void main(String[] args) {

        for (int a=1; a<=10; a++){

            if (a>6){
                break;
            }
            for (int b=1; b<=10; b++){
                System.out.println(a + " X "+b+" = "+a*b);
            }
            System.out.println();
        }
    }
}
