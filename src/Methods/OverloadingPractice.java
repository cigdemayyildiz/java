package Methods;

public class OverloadingPractice {

    // Method Overloading

    // you need to use same method name but different parameters to overload a method
    // changing return type is not method overloading
    // changing access modifier is not method overloading

    // create a method that will take two double parameters
    // this method will be named as areaCalculator
    // overloading has to be in same class, you cannot create overloading method different classes

    public double areaCalculator(double length, double width){ // bu methodun bire bir aynisini olusturamazsin ama
        // parantez icindeki parametreleri degistirirsen o zaman overloading yapmis olur ve olusturabilirsin.

        double rectangleArea = length*width;

        System.out.println(length*width);

        return rectangleArea;
        // return length*width; --> boyle de yapabilirsin
    }

    public double areaCalculator(double length){ // bir ustteki method ile ayni ama parantez icindeki parametre degisik
                                    // bu yuzden olusturabiliyorsun. overloading yapmis oluyorsun.

        double area = length*length; // sout u burada yapmadim main method altinda print out ettim
        return area;
    }

    public static void main(String[] args) {

        OverloadingPractice object = new OverloadingPractice();

        object.areaCalculator(1.2,3.4);

        System.out.println(object.areaCalculator(1.2,3.4)); // bu sekilde de print edebilirsin,
                                                                        // ama eger kodu olusturdugun kisimda sout varsa
                                                                        // bir kere oradan gelir bir kere de buradan iki tane olur

        System.out.println(object.areaCalculator(3));



    }


}
