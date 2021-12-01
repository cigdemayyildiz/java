package OOP.Inheritance4;

public class Car extends Vehicle{

    String model;
    String engineType;

    public Car(String model, int year, String brand, String engineType){
        super(model, year, brand);
//        this.model = model;
//        this.engineType = engineType;
    }
    public static void drive(){
        System.out.println("Car is moving");
    }
    public Integer accelerate(){
        System.out.println(super.model);
        return 5;
    }
}
