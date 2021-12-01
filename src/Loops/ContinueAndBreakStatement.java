package Loops;

public class ContinueAndBreakStatement {

    public static void main(String[] args) {

        // inside of a loop when you have continue statement --> it behaves as skip
        // inside of a loop when you have break statement --> it stops the execution of the loop
        // when you have nested loop, you can have labels for the loops and you can refer to any loop you want to by using the label
        // condition for the If Statement will be check only ONCE, but condition for the For Loop will be checked after each iteration


        OUTER:
        for (int number=0; number<15; number++){

            if (number>=1 && number<=3){
                continue;
            }
            for (char ch = 'A'; ch < 'H'; ch++){
                if (number==4){
                    break OUTER;
                }
                if (ch == 'C' || ch == 'F'){
                    continue; // it means skip it
                }

                System.out.print(number);
                System.out.println(" " + ch);
            }
            System.out.println();
        }

    }
}
