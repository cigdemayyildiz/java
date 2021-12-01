package String;

public class EqualsMethod {

    public static void main(String[] args) {

        String a = "David";

        String b = "David";

        String c = new String("David");

        String d = new String("David");

        System.out.println(a == b); // true
        // isim olarak David den bahsediliyor, David ismi David ismine esittir

        System.out.println(a.equals(b)); // true
        // kisi olarak David den bahsediliyor, iki ayri David birbirine esit degildir

        System.out.println(a == c); // false
        // isim olan David ile kisi olan David karsilastiriliyor, isim ile kisi birbirine esit degildir

        System.out.println(a.equals(c)); // true

        System.out.println(c == d); // false
        // kisi olarak iki ayri David den bahsediliyor, iki ayri David birbirine esit degildir

        System.out.println(c.equals(d)); // true
        // cins olarak ayni degerlere esit olduklari icin true

        System.out.println(a == "David"); // true
        // a nin degeri ile David karsilastiriliyor, a nin degeri de David oldugu icin birbirine esit


        System.out.println(d.equals("David")); // true
        // d nin degeri David e esit mi diye bakiliyor, d nin degeri David e birebir esit

        System.out.println(a == new String("David")); // false
        // a is in the Stack
        // new String("David"); is in the Heap
        // isim olan David ile kisi olan David karsilastiriliyor, isim ile kisi birbirine esit degil

        System.out.println(c == "David"); // false
        // kisi olan David ile bir deger karsilastiriliyor, cinsleri ayni degil esit degiller

        String e = a;
        String f = c;
        System.out.println(e == b); // true
        // eger e a ya esitse o zaman e bir isim, b de bir isim oldugu icin e ile b birbirine esit
        System.out.println(f.equals(d)); // true
        // eger f c ye esitse f bir kisi, d de bir kisi oldugu icin f d yi birebir iceriyor
        System.out.println(e == f); // false
        // e a ya esit olduguna gore ve a bir isim oldugu icin ve f c ye esit olduguna gore ve c bir kisi oldugu icin
        // e ve f birbirine esit degildir
    }
}
