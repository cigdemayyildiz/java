package Constructor;

public class Cup_GC {

    int sizeOfCup;
    boolean isClean;
    double liquidAmount;

    public Cup_GC(int size, boolean clean, double amount){ // uc argumentli constructor
        this(); // bos olan constructor i bu constructor in icine cagiriyoruz, en basta olmasi gerekiyor, alt siralara yazamazsin
        this.sizeOfCup = size;
        this.isClean = clean;
        this.liquidAmount = amount;

        // this. keyword is referring the current class
        // this(); --> calling constructor, it's turn must be very first line
    }

    public Cup_GC(int newSize, boolean newClean){ // iki argumentli constructor
        this.sizeOfCup = newSize;
        this.isClean = newClean;
        System.out.println("This is two argument constructor");
    }

    public Cup_GC(){ // bos constructor
        this(33, true); // burada da iki argument olan diger constructo i hic argument olmayan constructor icine cagirdik
        System.out.println("This is no argument constructor");
    }

    public void info(){
        System.out.println("Size is: "+sizeOfCup+" - Is it clean?: "+isClean+" - Liquid amount is: "+liquidAmount);
    }

    public String toString(){
        // return "*** *** *** ***"; --> eger bu yildizlari dondurseydik CupTest class da object lerin isimlerini
        // sout icinde yazdirmak istedimizde o zaman bu yildizlari gorecektik
        return "Size is: "+sizeOfCup+"\nIs it clean?: "+isClean+"\nLiquid amount is: "+liquidAmount;
        // eger toString methodu olusturdugumda object ismini cagirdigimda toString method icindeki bilgilere
        // ulasabiliyorsam, toString methodu icine object in info sunu girersem object ismini sout icinde yazdirmak
        // istedigimde object name inin infosunu verecek. bu sayede bir tane ekstra info methodu kullanmaya gerek yok.
    }

    protected void finalize(){ // garbage collecter calisinca bu mesaji goster demek icin bu method kullaniliyor
        System.out.println("Now one object went to the garbage");
    }

    /* Method Overriding
    when you override a method:
        - method signature stays the same but implementation of the method changes
        - method overriding happens in different classes
        - there should be parent-child relationship between those two class
    */
}
