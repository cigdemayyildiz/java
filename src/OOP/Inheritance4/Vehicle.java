package OOP.Inheritance4;

public class Vehicle {

    /*
    -Vehicle
        Variables:
        protected  model;
        default year;
        public brand;
     Methods:
        drive(); --> vehicle is moving
        stop(); --> return true, vehicle is stopping
        protected start(); --> return true, vehicle is starting
        default accelerate(); --> return Object
      Constructor: create a constructor to initialize instance variables

    -Car
      *extends Vehicle
      variables:
        model;
        engineType;
      Methods:
        Override drive(); --> Car is moving
        Override accelerate(); --> return Integer and calls model from parent class
     */

    protected String model;
    int year;
    public String brand;

    public Vehicle(String model, int year, String brand){
        this.model = model;
        this.year = year;
        this.brand = brand;

    }
    public static void drive(){ // static yaparsan override olmaktan cikar iki ayri class da iki ayri method a donusur
        System.out.println("Vehicle is moving");
    }
    public boolean stop(){
        System.out.println("Vehicle is stopping");
        return true;
    }
    protected final boolean start(){
        System.out.println("Vehicle is starting");
        return true;
    }
    protected Object accelerate(){
        return new Object();
    }
}
