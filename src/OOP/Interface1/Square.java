package OOP.Interface1;

public class Square implements Shape{ // Square normal bir class ti implements keyword u ile Shape class inin child i
    // yaptik, Shape bir abstract class oldugu icin oradaki kuralin aynisi olan method override i burada yapmak
    // zorundayiz


    @Override
    public void area() {

    }

    @Override
    public void area1() {

    }

    @Override
    public int perimeter() {
        return 5;
    }

    @Override
    public Integer perimeter1(int side) { // parent class da Number olmasina ragmen burada Integer olmasi covariant olmasindan
        return side*side;
    }

    @Override
    public Double perimeter2() {
        return 10.5;
    }

    @Override
    public void info() {
        Shape.super.info();
    }

    @Override
    public void info(String name) {
        Shape.super.info(name);
    }
}
