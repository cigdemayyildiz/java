package Loops;

import java.util.Scanner;

public class StarPractice {

    public static void main(String[] args) {

         /*
        Star Tree
        ask user to give you a whole number which is integer
        make a star tree for that many lines
        ex: 5
        *
        **
        ***
        ****
        *****
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();

        String star = "*";

        do {
            number--; // kullanici sifirdan daha buyuk bir sayi girecegi icin verilen sayiyi sifira cekmek icin bunu kullan
            System.out.println(star);
            star+="*"; // her satira birer star eklemek icin sout tan sonra bir star ekle komutunu koy. cunku eger sout tan once koyarsan ilk satirda iki star ile baslar.

        }while (number>0); // eger kullanicinin verdigi sayi 0 dan buyukse number-- sayiyi sifira kadar indir demek


        int num = 5;
        String stars = "*";

        // eksilterek
        while (num>0){
            num--;
            System.out.println(stars);
            stars+="*";
        }

        int num1 = 0;
        String str = "*";

        // arttirarak
        while (num1<5){
            System.out.println(str);
            str+="*";
            num1++;

        }

    }
}
