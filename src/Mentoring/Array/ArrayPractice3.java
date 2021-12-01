package Mentoring.Array;

public class ArrayPractice3 {

    public static void main(String[] args) {

        // int [] numbers = {4,4,5,12,6,7,12,7,1,1,2,2,3};
        // print out only one of each number

        int [] numbers = {4,4,5,12,6,7,12,7,1,1,2,2,3};

        String unique = "";
        for (int i=0; i<numbers.length; i++){
            boolean isUnique = true;
            for (int j=0; j<i; j++){
                if (numbers[i]==numbers[j]){
                    isUnique=false;
                }
            }if (isUnique){
                unique+=numbers[i]+",";
            }
        }
        System.out.println(unique);
    }
}
