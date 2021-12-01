package Homework9;

public class Task8 {

    public static void main(String[] args) {

        int [] numbers ={1,1,2,2,3,4,4};
        String unique = "";
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i]==numbers[j]){
                    unique+=numbers[i];
                    break;
                }
            }if (!unique.contains(numbers[i]+"")){
                System.out.println(numbers[i]);
            }
        }
    }
}
