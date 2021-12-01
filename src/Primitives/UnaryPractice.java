package Primitives;

public class UnaryPractice {

    public static void main(String[] args) {

        // DD buy 12 get $1 off next time
        // KK buy 12 and pay $11 now

        int dd = 12;
        int kk = 12;

        System.out.println("Payment for dd " + dd--); // 12
        System.out.println("Payment for kk " + --kk); // 11
        System.out.println(dd);
        System.out.println(kk);

    }
}
