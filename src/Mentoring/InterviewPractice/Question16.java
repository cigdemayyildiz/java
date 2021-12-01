package Mentoring.InterviewPractice;

public class Question16 {

    public static void main(String[] args) {

        // How to find the sum of digits from a given number?
        int number = 123;
        int sum = 0;
        String str = Integer.toString(number);
        System.out.println(str);
        for (int i=0; i<str.length(); i++){
            sum+=Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        System.out.println(sum);

        int number1=4577;
        int originalNum=number1;
        int sum1=0;
        // 4577- 457 - 45 - 4 - 0
        while (number1>0){
            sum1=sum1+(number1%10);
            number1=number1/10;
        }
        System.out.println("The sum of "+originalNum+" is equals to "+sum1);

        int num = 345;
        int originNum = num;
        int summ = 0;
        while (num>0){
            summ+=(num%10);
            num=num/10;
        }
        System.out.println(summ);
    }
}
