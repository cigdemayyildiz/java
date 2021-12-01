package OOP.Polymorphism;

public class Branch extends ATM{

    public void loan(){
        System.out.println("BRANCH can give you 100K");
    }

    public void hire(){
        System.out.println("BRANCH can hire Teller");
    }

    public void assistance(){
        System.out.println("BRANCH is helping");
    }
}
