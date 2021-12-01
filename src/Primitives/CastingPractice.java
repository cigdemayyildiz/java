package Primitives;

public class CastingPractice {

    public static void main(String[] args) {

        long l1 = 120;

        // int i1 = l1; --> larger data type cannot be stored in smaller data type

        int i2 = (int) l1; // explicit casting (auto narrowing)

        double d1 = l1; // double can store long data type you don't need casting
        double d2 = (double) l1; // implicit casting (auto widening)

        short apple = 800;
        short samsung = 600;
        short total = (short)(apple+samsung); // you need parantheses to cast all values
        System.out.println(total); // 1400

        byte tota1l = (byte)(apple+samsung);
        System.out.println(tota1l); // 120 byte(-128 ve 127 arasi sayilari store eder) en cok 127 ye kadar cikabiliyor, 127 den sonra dongu olarak sinirin diger basina geciyor -128 e.

        byte a =12;
        short b = a;

        short c = 324;
        byte d = (byte)c;
        System.out.println(d); // 324 byte icin buyuk bir sayi o yuzden 127 den sonrasini donguye sokuyor. yine 324 e kadar sayiyor ama kendi sistemi ile. sonuc 68.

        int total2 = apple+samsung; // int bu degerleri store edebildigi icin casting e ihtiyac yok.

        double d3 = 2.3;
        int i3 = 12;
        i3+=d3; // when you do assignments, you do not need to do explicit casting
        System.out.println(i3); // 14
        int i4 = (int) d3;
        System.out.println(i4);

    }
}
