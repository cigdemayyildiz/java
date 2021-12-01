package Mentoring.InterviewQuestions;

public class A07Palindrome {

    public static void main(String[] args) {

        String str = "madam";
        String reversed = "";
        for (int i=str.length()-1; i>=0; i--){
            reversed=reversed+str.charAt(i);
        }if (str.equals(reversed)){
            System.out.println(reversed+" is Palindrome");
        }else {
            System.out.println(reversed+" is NOT Palindrome");
        }
    }
}
