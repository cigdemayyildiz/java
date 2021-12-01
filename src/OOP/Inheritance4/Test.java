package OOP.Inheritance4;

public class Test {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Q80", 2015, "Infinity");
        vehicle.drive();
        vehicle.stop();
        vehicle.start();
        vehicle.accelerate();

        Car car = new Car("Pathfinder", 2013,"Nissan", "Diesel");
        car.drive();
        car.accelerate();

        car.start();
        car.stop();
    }
}
