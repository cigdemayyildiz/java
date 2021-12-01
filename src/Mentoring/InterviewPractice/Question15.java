package Mentoring.InterviewPractice;

public class Question15 {

    public static void main(String[] args) {

        // How to print the star tree?
        int star = 3;
        for (int i=0; i<=star; i++){
            for (int j=0; j<=star-i; j++){
                System.out.print(" ");
        }for (int k=0; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
