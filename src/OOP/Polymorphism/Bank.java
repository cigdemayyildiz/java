package OOP.Polymorphism;

public class Bank extends Branch{

    public void loan(){
        System.out.println("BANK can give up to 1M");
    }

    public void hire(){
        System.out.println("BANK can hire for CEO");
    }

    public void openAccount(){
        System.out.println("BANK can open Business Account");
    }


}
