package Constructor;

import com.sun.xml.internal.xsom.impl.scd.Step;

public class CarTest {

    public static void main(String[] args) {

        Car myCar = new Car("Nissan");
        System.out.println(myCar.brandOfCar);
        myCar.move();

        Car yourCar = new Car("Toyota");
        System.out.println(yourCar.brandOfCar);
        yourCar.move();

        Car herCar = new Car("Nissan");
        Car hisCar = new Car("Infinity");


        System.out.println(yourCar); // Your car brand is Toyota
        yourCar=null;
        //System.gc();

        // equals();  vs   ==

        String str = "Test";
        String str2 = "Test";
        String str3 = "Test";

        String str4 = new String("Test");
        String str5 = new String("Test");


        System.out.println(myCar == myCar); // true --> iki object karsilastirirken == kullan
        System.out.println(myCar == herCar); // false --> iki object karsilastirilirken Stack icindeki reference ile
        // Heap icindeki object karsilastiriliyor ve her yeni reference icin yeni bir object olusturuldugu icin myCar
        // ile herCar ayni value ye sahip olsa dahi ayri iki object oldugu icin false return ediyor.

        System.out.println(str.equals(str2)); // true --> String karsilastirirken Stack memory de reference Heap memory
        // icindeki String pool memory de value oluyor. Stack deki str, str2, str3 String pool icindeki value ile
        // karsilastiriliyor, eger String pool icindeki veri str, str2 ve str3 icin ayniysa o zaman true return ediyor.
        System.out.println(str == str3); // true --> iki String karsilastirirken == yerine equals(); method kullan

        System.out.println(str4.equals(str5)); // true --> iki object karsilastirirken equals(); method kullanirsan bu
        // objectleri degil value lari karsilastiracagi icin yaniltir, o yuzden sadece String karsilastirirken equal();
        // methodu kullan, object karsilastirirken == kullan.
        System.out.println(str4 == str5); // false --> str4 ve str5 objectleri ayni degil bu nedenle false dondurmesi normal.

        System.out.println(str3.equals(str4)); // true --> String object de olsa karsilastirmayi equals(); method ile
        // degil == ile yap. cunku iki object karsilastiriyor olmana ragmen equals(); method ile karsilastirdigin icin
        // value karsilastirmasi yapiyor ve iki object i ayni olarak algiliyor bu dogru degil.
        System.out.println(str3 == str4); // false --> str3 object ile str4 object birbirine esit degil yani dogru return ediyor.


        // eger object veya String object karsilastiriyorsan o zaman == kullan
        // eger iki String karsilastiriyorsan equals(); method kullan


    }
}
