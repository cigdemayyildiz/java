package WrapperClass;

public class WrapperClass {

    public static void main(String[] args) {


        /*
        Converting from a String

        Wrapper Classes         Converting String to Primitive          Converting String to Wrapper Class

        Boolean                 Boolean.parseBoolean("true");           Boolean.valueOf("TRUE");
        Byte                    Byte.parseByte("123");                  Byte.valueOf("456");
        Short                   Short.parseShort("123");                Short.valueOf("456");
        Integer                 Integer.parseInteger("123");            Integer.valueOf("456");
        Long                    Long.parseLong("123");                  Long.valueOf("456");
        Float                   Float.parseFloat("123");                Float.valueOf("456");
        Double                  Double.parseDouble("123");              Double.valueOf("456");
        Character               We can not convert                      We can not convert

                                parse --> primitive type                valueOf --> object type
         */

        String str = ""+'3';
        String ab = String.valueOf('3');
        System.out.println(str);
        System.out.println(ab);
        String st = Integer.toString(3);
        System.out.println(st);

        byte b1 = 2; // b1 ile method cagiramazsin
        Byte bt1 = new Byte(b1); // ama bt1 ile method cagirabilirsin because objects can have methods
        // Wrapper Class --> Byte bt1 = new Byte();
        System.out.println(bt1); // 2

        short s1 = 23;
        Short sh1 = new Short(s1); // short data type oldugunu belirtmen icin s1 demelisin, sh1 yerine 4 dediginde
                                    // java bu sayinin short olup olmadigini bilmiyor.
        System.out.println(sh1); // 23
        System.out.println((short)5); // 5 --> eger boyle yazarsan casting yapmis oldugun icin java su anda bu data nin
                                    // short tipinde oldugunu biliyor.

        Integer in1 = new Integer(125); // burada casting yapmaya ya da bir int data olusturup onun uzerinden
                                    // value cagirmaya gerek yok cunku java sayilarda default olarak int aliyor.
        System.out.println(in1); // 125


        long l1 = 9999;
        Long ln1 = new Long(l1);
        System.out.println(ln1); // 9999
        System.out.println((long)9999); // 9999
        Long ln2 = new Long(1234); // bu sekilde de yazsan oluyor cunku long zaten integer dan buyuk oldugu icin
        // integer in tavan sinirina ulasana kadar her sayi integer olarak sayiliyor

        Double db1 = new Double(3.5);
        System.out.println(db1); // 3.5

        Float fl1 = new Float(4.8);
        System.out.println(fl1); // 4.8

        Character ch1 = new Character('&');
        System.out.println(ch1); // &
        char c1 = 't';
        Character ch2 = new Character(c1);
        System.out.println(ch2); // t
        Character ch3 = new Character('5');
        System.out.println(ch3); // 5
        // Character ch4 = new Character(65); --> compile time error, sayi giremezsin


        Boolean bl1 = new Boolean(true);
        System.out.println(bl1); // true
        System.out.println(bl1 == true); // true

        Boolean bl2 = new Boolean("true");
        System.out.println(bl2); // true
        System.out.println(bl2 == true); // true
        System.out.println(bl2 = false); // false


        // AutoBoxing --> converting primitive data to Object type (Wrapper Class Object)

        Integer i2 = 25; // i2 is an object and 25 is a primitive data type
        // object i once yazip, reference verip arkasindan primitive data type olusturur gibi syntax yaziyorsan autoboxing yapiyorsun.
        int x = i2; // unboxing --> i2 bir box icindeydi object ti ve onu box dan cikarip primitive data type icine aldik
        Boolean bl3 = true; // Boolean is an object type and true is a primitive type

        // UnBoxing --> converting Wrapper Class Object to primitive data

        int a = new Integer(56); // a is a primitive data and Integer is an object
        // primitive data type yazar gibi baslayip arkasindan object olusturma syntax ine geciyorsan unboxing yapiyorsun.

        char ch4 = ch1; // ch4 primitive data and ch1 an object

        double db2 = db1; // unboxing --> db2 is a primitive data and db1 is an object
        System.out.println(db2);










    }
}
