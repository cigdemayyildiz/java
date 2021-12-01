package Mentoring.JavaRecap;

public class A12StaticAndInstanceBlock {

    // Possible Interview Question
    // What is the difference between Instance and Static block
    // The main difference between them is all about calling static block which belongs to class 1 time and all the way top.
    // Instance block belongs object and it will go after static as many as object you created.


    static {
        System.out.println("Static block"); // main method icine alamazsin bu sinifa ait methoda ait degil
    }

    static { // birden fazla olusturabilirsin, hangisini once yazdiysan ilk o gelir
        // static block en once yazdirilir
    }

    {
        System.out.println("Instance block from class"); // bu main method run edildiginde gelmeyecek cunku bunun
        // object e ihtiyaci var
    }


    public static void main(String[] args) {

        {
            System.out.println("Instance block");
        }


    }
}
