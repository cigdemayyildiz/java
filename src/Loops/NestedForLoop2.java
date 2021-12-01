package Loops;

public class NestedForLoop2 {

    public static void main(String[] args) {

        // print out the months for the every year for the years from 2020 to 2023


        for (int year=2020;year<=2023;year++){
            System.out.print(year);

            for (int months=1;months<=12;months++){
                System.out.print(" --> " + months);

                for (int weeks=1;weeks<=4; weeks++){
                    System.out.print("--> " + weeks);
                }

            }
            System.out.println();
        }

    }
}
