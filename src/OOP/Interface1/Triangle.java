package OOP.Interface1;

public class Triangle implements Shape{

    // (base * height) / 2

    int height;

    public void area(){

    }

    public void area1(){

    }

    public int perimeter(){
        return 5;
    }


    public Integer perimeter1(int side){
        return (side*height)/2;

    }

    public Double perimeter2(){
        return 10.5;

    }

    @Override
    public void info() {
        System.out.println("I am info about Triangle");
    }
}
