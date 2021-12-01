package Methods;

public class Calculator {

    // one method with public access modifier
    // let's call in this class
    // we should use one int parameter and we should find square of the parameter and return it

    public static int findSquare(int square){ // static method

        return square*square;
    }

    public long findSquare(long square){ // non-static method

        return square*square;
    }

    // Since we are in same class we can just call with method name
    public static void main(String[] args) {

        // ayni class icindeyken yalniz method ismi ile cagirabilirsin,
        // farkli bir classdan cagirmak istediginde basina class adini yazip
        // .(nokta)dan sonra method ismini yazarak cagirabilirsin. static methodda.
        System.out.println(findSquare(21)); // 441
        System.out.println(findSquare(5)); // 25

        // ayni class icinde olsan da baska class icinde olsan da
        // object olusturmadan non-static bir method cagiramazsin
        Calculator calculTest = new Calculator();
        long number = 8888;
        calculTest.findSquare(number);
        System.out.println(calculTest.findSquare(number)); // 78996544
        calculTest.findSquare(76l); // 76 nin sonundaki l harfini silersen int parametresi
        // olan static findSquare methoduna donuyor otomatik olarak, ama rakamlarin sonunda
        // l oldugu surece lon data type a sahip olan non-statik findSquare methoduna tabii
    }
}
