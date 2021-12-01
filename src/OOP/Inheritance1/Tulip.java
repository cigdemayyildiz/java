package OOP.Inheritance1;

public class Tulip extends Flower{

    public Tulip(){
        super("xxx","yyy",2.5);
    }

    public Tulip(String name, String color, double height) {
        super(name, color, height);
    }

    public Tulip(String color){
        super.color = color;
    }

}
