package OOP.Inheritance1;

public class Rose extends Flower {

    public Rose() {
        super("Rose1", "Yellow", 12);
    }

    public Rose(String color){
        super("Rose2", "Red",33);
        this.color = color;
        super.color = "Blue";
    }
}
