package Constructor;

public class Car {

    String brandOfCar;

    public Car() {

    }
    public Car(String brand){
        this.brandOfCar = brand;
    }

    public void move(){
        System.out.println(brandOfCar+" is moving");
    }

    @Override
    public String toString(){
        return "Car brand is "+ brandOfCar;
    }
    @Override
    protected void finalize(){
        System.out.println("Your car is going to the garbage");
    }
}
