package Methods;

public class CalculatorTest {

    public static void main(String[] args) {

        // Calling integer parameter static --> Calculator class dan int data type static methodu cagirma satiri
        Calculator.findSquare(5);
        System.out.println("main-->"+Calculator.findSquare(5));

        // Calculator class dan non-static method icin olusturulan method
        Calculator calculatorObject = new Calculator();
        long longNumber = 9999; // method non-static olunca method parametresini disarda olusturuyoruz
        System.out.println(longNumber); // 9999
        System.out.println(calculatorObject.findSquare(longNumber)); // 99980001

        // if our method is non static we can only call by creating object out of class

        calculatorObject.findSquare(longNumber); // bu long icin olusturdugumuz object den cagiriliyor, yani Calculator class daki non-static findSquare methodundan
        // but if the method is static, we can call by creating an object or just by class name
        calculatorObject.findSquare(2); // Calculator class daki static methodun object araciligi ile cagrilmasi
        Calculator.findSquare(2); // Calculator class daki static metodun isim ile (object siz) cagrilmasi

        System.out.println(Calculator.findSquare(2)); // 4
        System.out.println(calculatorObject.findSquare(2)); // 4


    }
}
