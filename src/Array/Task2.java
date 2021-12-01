package Array;

public class Task2 {

    public static void main(String[] args) {

        /*
        print out the number pairs that their sum is 30
		{14,21,6,5,74,25,9,84,16}
		hint: nested for loop
		ex: 14 and 16 makes 30
			21 and 9 makes 30
        */

        int [] number = {14,21,6,5,74,25,9,84,16};

        for (int numbers: number){
            for (int i=0;i<number.length;i++){
                if (number[i]+numbers==30){
                    System.out.println(number[i] +"+"+ numbers +"="+30);
                }
            }
        }
        System.out.println();

       for (int i=0;i<number.length/2;i++){
           for (int k=0;k<number.length;k++){
               if (number[i]+number[k]==30){
                   System.out.println(number[i]+" -- "+number[k]);
               }
           }
       }
    }
}
