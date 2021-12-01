package Methods;

public class Math {

    // create a method that will add two integer numbers and show the sum of those two numbers

    public void sum(int a, int b){ // kullaniciya sormak gibi ama burada degerleri yazacak kisi kodu goren kisi, user degil

//        int a = 2;
//        int b = 3;

        int sum = a+b;

        System.out.println("The sum of a ("+a+") and b ("+b+") is "+sum+".");

        // void return type sadece goruntulemeye yariyor bu yuzden return satiri burada ise yaramiyor.
        // sadece yaptigin islemleri goruntuleyebiliyorsun uzerinde degistirme yapamiyorsun test kisminda
    }
    // create a method that will take String parameter for
    // name of the operation and two other parameters as int
    // this method will print the result according to the provided operation

    public void operation (String operation, int num1, int num2){

        switch (operation) {
            case "add":
                System.out.println("The sum is: " + (num1 + num2));
                break;
            case "subtract":
                System.out.println("The subtraction is: " + (num1 - num2));
                break;
            case "divide":
                System.out.println("The division is: " + (num1 / num2));
                break;
            case "multiply":
                System.out.println("The product is: " + (num1 * num2));
                break;
            case "remainder":
                System.out.println("The product is: " + (num1 % num2));
                break;

            default:
                System.out.println("Operation name should be: add/subtract/divide/multiply/remainder");
        }
    }

    // Return Types of Methods
    // return types could be: void, primitive data types, String of Object

    // public void sum(){}
    // public int sum(){}
    // public double sum(){}
    // public String sum(){};
    // public Math sum(){};

    public int sum1(int a, int b, int c){

        int sum = a+b+c;

        System.out.println("The sum of a ("+a+") and b ("+b+")"+" and c ("+c+") is "+sum+".");

        return sum; // return e verdigin isim anlamli olmali, eger return e 23 degerini verirsen
                    // test sinifinda int olarak store ettigin yerde 23 olarak gorursun
                    // int x = total.sum1(1,3,6); --> buradaki x i 23 olarak gorursun ve
                    // System.out.println(x+25); --> bu islemin sonucu 23+25=48 cikar
    }
}
