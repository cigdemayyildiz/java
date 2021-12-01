package Immutable;

public class Phone {

    // eger bir sinifi immutable yapmak istiyorsak instance variable lari private yapip
    // setter methodlarini eklemiyoruz. sadece getter methodlarini ekliyoruz.

    private String brand = "IPhone", color;
    private double price, size;

    public Phone(){
    }

    public String getBrand(){
        return brand;
    }

    public String getColor() {
        return color;
    }

    public double getPrice(){
        return price;
    }

    public double getSize(){
        return size;
    }

    private void call(){ // private yapinca bu siniftan baska hicbir yerden ulasilamaz oluyor.
        System.out.println("Calling friend...");
    }
}
