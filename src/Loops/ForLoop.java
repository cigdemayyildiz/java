package Loops;

public class ForLoop {

    public static void main(String[] args) {

        for (int number = 1; number<=5 ;number++ ){ // int number = 1; --> local variable. it cannot effect other variables.
            System.out.println("It is for LOOP " + number);
        }

        int number = 1; // global variable
        for (; number<=5 ;number++ ){
            System.out.println("It is second for LOOP " + number);
        }

        int numbers;
        for (numbers = 1; numbers<=5 ;numbers++ ){
            System.out.println("It is third for LOOP " + numbers);
        }

        for (; numbers<=5 ; ){ // you cannot move this condition to anywhere. it must be in the parantheses and middle of the semi colons
            numbers++;
            System.out.println("It is forth for LOOP " + numbers); // print edilmeyecek cunku numbers yukarda artirildi
                                                                    // ve guncel hali 5 den buyuk
        }

    }
}
