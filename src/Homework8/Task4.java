package Homework8;

public class Task4 {

    public static void main(String[] args) {

        for (int i=1; i<=100; i++){
            int counter = 0;
            for (int j=i; j>=1; j--){
                if (i%j==0){
                    counter=counter+1;
                }
            }if (counter==2){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println();
    }
}
