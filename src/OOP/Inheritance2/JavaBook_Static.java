package OOP.Inheritance2;

public class JavaBook_Static extends Book{

    // instance variables, methods and blocks can be static
    // if a method is static method, you cannot override that static method but you can overload it


    public JavaBook_Static(String title, double price, int pageNumber) {
        super(title, price, pageNumber);
    }

    public JavaBook_Static() {
    }

    @Override
    public void info(){
        System.out.println("Hi, I'm in the Java Book class");
    }


    public static int listen(){ // static keyword u olan methodlar override edilemiyor. bu listen method Book sinifindaki
                                // listen methodunun override i degil artik ikisi ayri ayri methodlar
        System.out.println("You're listening Java Book");
        return pageNumber;
    }


    public static void main(String[] args) {

        Book book = new Book("Blue Book", 19.99,500);

        JavaBook_Static javaBookStatic = new JavaBook_Static();
        javaBookStatic.pageNumber=700;
        System.out.println(javaBookStatic.pageNumber);

        JavaBook_Static javaBookStatic1 = new JavaBook_Static("Java Book", 49.99, 400);
        System.out.println(javaBookStatic1.title);
        System.out.println(javaBookStatic1.pageNumber);

        JavaBook_Static javaBookStatic2 = new JavaBook_Static();
        System.out.println(javaBookStatic2.title);
        System.out.println(javaBookStatic2.pageNumber); // javabook1 parametresini aliyor cunku pageNumber Book sinifinda static

        book.info();
        javaBookStatic2.info();

        book.listen();
        javaBookStatic.listen();

        javaBookStatic.listen(" java audio");
        book.listen(" audio");
        Book.listen();

        JavaBook_Static.listen();

        listen();
    }
}
