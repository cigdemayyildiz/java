package StringBuilder;

public class Practice2 {

    public static void main(String[] args) {

         /*
        create a method that will take String as a parameter
        this method will delete '-' (dashes) given string
        use delete/deleteCharAt() method to solve (StringBuilder object)
        print final version of String/StringBuilder object with no dashes
        "I-n-t-e-r-v-i-e-w" >> Interview
         */

        Practice2 practice2 = new Practice2();
        practice2.delete("Bugun hava parcali-bulutlu");

        String str = "-I-n-t-e-r-v-i-e-w-";
        delete(str);
    }


    public static void delete(String dashes){
        StringBuilder builder = new StringBuilder(dashes);
        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == '-'){
                builder.deleteCharAt(i);
            }
        }
        System.out.println(builder);
    }
}
