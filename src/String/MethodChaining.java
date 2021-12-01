package String;

import java.util.Scanner;

public class MethodChaining {

    public static void main(String[] args) {

        String word = "  just do it  ";
        word = word.trim().replace("a","*").replace("e","**").toUpperCase();
        // String
        // sadece sonucunda String degerleri alacagin metodlari String icine store edebilirsin
        System.out.println(word);  // JUST DO IT

        int result = word.trim().replace("a","*").replace("e","**").toUpperCase().indexOf("*");
        // indexOf sayi sonucu verdigi icin onu int icinde store etmelisin
        // eger indexOf metodunu bu zincir icinde kullaniyorsan o zaman String ya da char icinde store edemezsin
        System.out.println(result); // -1

        char result1 = word.trim().replace("a","*").replace("e","**").toUpperCase().charAt(0);
        // charAt karakter sonucu verdigi icin char icinde store etmelisin
        // eger charAt metodunu zincir icinde kullandiysan o zaman String ya da int icine store edemezsin cunku char karakter sonucu verir
        System.out.println(result1); // J
    }
}
