package OOP.Inheritance3;

public class Shirt {

    final String COLOR = "Blue"; // eger final keyword kullaniyorsan variable i burada initialize etmelisin ve final
                                // yapilan variable ismi yaygin olarak buyuk harflerle yazilir.
    String size;
    double price;


    public Shirt(String size, double price) { // constructor i final yapamazsin
        this.size = size;
        this.price = price;
    }

    final public String info(){
        return "This is info about shirt";
    }

    // overloading is possible for a final method
    final public String info(Boolean clean){
        return "This shirt is clean";
    }




}
