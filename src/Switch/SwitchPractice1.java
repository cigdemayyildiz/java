package Switch;

public class SwitchPractice1 {

    public static void main(String[] args) {

        int number = 15;

        switch (number) {

            case 3:
                System.out.println("First");
                break;
            case 2:
                System.out.println("Second");
                break;
            default: // istedigin yere koyabilirsin ama eger en sonda degilse buna da break eklemelisin
                System.out.println("This is default");
                break;
            case 5:
                System.out.println("Third");
                break;
            case 25:
                System.out.println("Fourth");
                break;



        }

    }
}
