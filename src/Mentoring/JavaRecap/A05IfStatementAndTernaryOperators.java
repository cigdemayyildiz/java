package Mentoring.JavaRecap;

public class A05IfStatementAndTernaryOperators {

    public static void main(String[] args) {

        // We use if statements for conditions

        int a = 5;
        int b = 6;
        if (b>a){
            System.out.println("Hello");
        }else {
            System.out.println("no");
        }

        String result = (a>b) ? "hello" : "no";
        System.out.println(result);
        System.out.println((a<b) ? "hello" : 12);
    }
}
