package Exception;

public class Practice2 {

    public static void main(String[] args) {

        System.out.println("This is my first print BEFORE exception");

        try {
            String str = "35";
            int number = Integer.parseInt(str);
            System.out.println(number);

            String sub = str.substring(5);
        }catch (IllegalArgumentException exception){
            System.out.println("This is inside of CATCH block");
        }catch (IndexOutOfBoundsException exception){
            System.out.println("This is SECOND CATCH block");
        }
        try {
            String str = "35";
            String sub = str.substring(5);
        }catch (IndexOutOfBoundsException e){
            System.out.println("This is SECOND TRY-CATCH block");
        }

        System.out.println("This is my first print AFTER exception");
    }
}
