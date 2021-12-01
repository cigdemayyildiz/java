package OOP.Inheritance2;

public class Book {

    String title;
    double price;
    static int pageNumber = 404;

    public void info(){
        System.out.println(title+"---"+price+"----"+pageNumber);
    }

    public static int listen(){
        System.out.println("You're listening the book");
        return --pageNumber;
    }

    public static int listen(String name){ // method overloading
        System.out.println("You're listening the book" + name);
        return --pageNumber;
    }

    public Book(String title, double price, int pageNumber) {
        this.title = title;
        this.price = price;
        this.pageNumber = pageNumber;
    }

    public Book() {
    }
}
