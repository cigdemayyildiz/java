package Array;

import java.util.Arrays;

public class MultidimensionalArray2 {

    public static void main(String[] args) {

        String [][] states = new String[3][2];

        states[0][0] = "NY";
        states[0][1] = "PA";
        states[1][0] = "IL";
        states[1][1] = "OH";
        states[2][0] = "CA";
        states[2][1] = "WA";

        System.out.println(Arrays.deepToString(states)); // [[NY, PA], [IL, OH], [CA, WA]]

        // please create a for loop to print these states in 2 min

        String [] stateEmails = new String[6];
        int k =0;
        for (int i = 0; i < states.length; i++) {
            for (int j = 0; j < states[i].length; j++) {
                stateEmails[k]=states[i][j].toLowerCase()+"@info.com";
                System.out.println(states[i][j]);
                k++;
            }
        }
        System.out.println(Arrays.toString(stateEmails));

        // please create a for EACH loop to print these states in 2 min

        for (String str[]: states) {
            System.out.println(Arrays.toString(str));
        }

        for (String state []: states) {
            for (String stat: state) {
                System.out.println(stat);
            }
        }

        // print these states in lower case

        for (String state []: states) {
            for (String stat: state) {
                System.out.println(stat.toLowerCase());
            }
        }


        for (String state []: states) {
            for (String stat: state) {
                System.out.println(stat.toLowerCase()+"@info.com");

            }
        }




    }
}
