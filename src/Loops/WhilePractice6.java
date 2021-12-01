package Loops;

public class WhilePractice6 {

    public static void main(String[] args) {

        // Summer ---> print out every single letter from this word
        // S, u, m, m, e, r


        String word = "Summer";

        int length = 0; /* eger tek tek Summer kelimesinin harflerini yazdirmak isteseydim charAt() kullanip
        parantez icindeki index degerini degistirmem gerekecekti. bu durumda degisken olan sey kelimenin
        index i. charAt() icine koymam gereken sey degisken olan sey olmali. degisken olan degeri de int icinde
        store ederek sifirdan baslamasi icin sifir degerini veriyorum. */

        while (length<word.length()){ /* eger index degerim yani int icine store ettigim degerim kelimemin uzunlugundan
                                    kucukse o zaman asagidakini print et */

            System.out.print(word.charAt(length) + ", "); /* eger ust satirdaki while icindeki condition dogru ise
                                    kelimemin charAt() parantezinin icindeki degiskenim yardimi ile yazdir. println
                                    kullanirsan alt alta satirlara yazdiracagi icin print kullaniyorum ki ayni satirda olsun */
            length++; // degisken olan degeri kelimemin uzunluguna denk gelene kadar artir

        }
    }
}
