package IfStatement;

public class IfPractice {

    public static void main(String[] args) {

        int a = 2;
        int b = 2;
        int c = 10;

        if (a==b){ // this condition will effect the block which you have something in it

            System.out.println("You can go to a picnic");
        }

        if (a == c){ // a ile c birbirine esit olmadigi icin block icindeki mesaji yayinlamayip blogu atlayacak

            System.out.println("This is second option for the picnic");
        }

        if (a == b || a != c){ // condition is true, it means it will go in the block

            System.out.println("Yaaaaaay!, I am going to the picnic");
        }

        System.out.println("I'll be happy");
    }
}
