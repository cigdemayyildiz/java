package OOP.Inheritance;

public class Lion extends WildAnimal{

    public void sleep(){ // Oerriding method from parent class
        System.out.println("Lion is sleeping");
    }

    public void eat(){
        System.out.println("Lion is eating");
    }

    public Lion run(){ // override edildigi class da access modifier i default olmasina ragmen burada public olarak
        // override edebiliyoruz cunku, public default access modifier indan daha accessible
        // WildAnimal class da bu method Animal return type ina sahipken burada Lion return type ina sahip olabilir cunku
        // method overriding yaparken return type ayni level ya da daha alt levellardan olabilir.
        // Eger Animal class da bu methodun return type i Lion olsaydi o zaman WildAnimal class da da return type Lion olmaliydi.
        System.out.println("Lion is running");
        return new Lion();
    }

    public void roar(){
        System.out.println("Lion is roaring");

    }

}
