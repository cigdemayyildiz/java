package OOP.Interface2;

public class Bird implements Flyable{ // bird is concrete class cunku methodlari bu implement etti

    public void fly(){
        System.out.println("Bird is flying");
    }

    public void eat(){
        System.out.println("Bird is eating");
    }

    public void sleep(){
        System.out.println("Bird is sleeping");
    }
}
