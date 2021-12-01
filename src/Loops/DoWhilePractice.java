package Loops;

public class DoWhilePractice {

    public static void main(String[] args) {

        int number = 10;

        // while ile yapmak isteseydim boyle olurdu, once condition i verip onun dogru olup olmadigini kontrol ettikten
        // sonra body icini dikkate alirdi.
        //   while (number>=0){
        //       System.out.println(number);
        //       number--;
        //   }

        // do while da once islemleri yapiyor sonra condition i kontrol ediyor
        do {
            System.out.println(number);
            number--;
        } while (number>=0);

        // find the sum of numbers from 10 to 15 and print the result as "The total is: ... "

        int num = 10; // baslangic noktasi
        int sum = 0; // toplamlari alip icinde toplayacagim storage

        do {
            sum = sum+num; // toplami alacagim storage in icine her adimda num i ekle. sum in degerini num her degistiginde guncelle
            num++; // num in degerini her adimda bir artir
        }while (num<=15); // num 15 den kucuk oldugu surece alttaki mesaji yazdir
        System.out.println("The total is: " + sum); // eger sout i do govdesinin icine koyarsan 5 ayri satirda islemleri sirasi
                                                    // ile gorursun, en sona yazarsan tek kalemde sonucu gorursun.
    }
}
