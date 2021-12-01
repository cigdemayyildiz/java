package Mentoring.InterviewPractice;

public class Question14 {

    public static void main(String[] args) {

        // How to find the perfect number?

        int number = 30;
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number && number!=1) {
            System.out.println(number + " is a perfect number");
        } else {
            System.out.println(number + " is NOT a perfect number");
        }


        System.out.println(isPerfect(28));

    }

        static boolean isPerfect(int n) {
            // To store sum of divisors
            int sum = 1;
            // Find all divisors and add them
            for (int i = 2; i * i <= n; i++) // 2 4 9 16 25
            {
                if (n % i==0)
                {
                    if(i * i != n) {
                        sum = sum + i + n / i; //17, 17+4+7=28
                    } else
                        sum = sum + i;
                }
            }
            // If sum of divisors is equal to
            // n, then n is a perfect number
            if (sum == n && n != 1) {
                return true; }

            return false;
        }

}
