package OOP.Inheritance3;

final public class TShirt extends Shirt{ // TShirt class is final class

    String color;
    public TShirt() {
        super("M",27.99); // eger burada initialize edersen parametrelerde ayrica super class verilerini almana gerek yok
    }


//    @Override
//    public String info(){ --> you cannot override a final method
//        return "This is info about T-Shirt";
//
//    }
}
