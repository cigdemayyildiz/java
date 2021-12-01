package Switch;

public class SwitchPractice2 {

    public static void main(String[] args) {

        String name = "Luna".toUpperCase();

        switch (name){

            default:
                System.out.println("Student is not here.");
                break; // eger break kullanmazsan ilk gordugu break e kadar yazdirir
            case "ALEX":
                System.out.println("Alex is here.");
                break;
            case "DAVID":
                System.out.println("David is here.");
                break;
            case "LUNA":
                System.out.println("Luna is here.");
                break;


        }

    }
}
