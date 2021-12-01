package TernaryOperation;

public class Practice {

    public static void main(String[] args) {

        // condition ? value1 : value2;
        // condition icinde iki degeri karsilastiriyorsun sonuc true ise value1, false ise value2 print ediliyor.
        // soru isaretinden sonra verdigin value ne type sa ona gore store ediyorsun
        // sayi ise sayi icine, String ise strign icine, char ise char icine vs.
        // if / else in tek satirda yazilmis hali gibi

        int num1 = 5;
        int num2 = 5;
        int num3 = 6;

        int result = num1 == num2 ? 25 : 30;
        System.out.println(result);

        String result1 = num2 == num3 ? "Hello" : "Bye";
        System.out.println(result1);

        char result2 = num1 == num3 ?  'C' : 'J';
        System.out.println(result2);

        System.out.println(num1 < num3 ? "Good morning" : 5);
        // iki ayri data type varsa o zaman hicbir yerde storage edemeyecegin icin direkt sout icine yaziyorsun

        int result3 = num1 == num3 ? num1++ + num2++ : num3++ + num3;
        System.out.println(result3);


    }
}
