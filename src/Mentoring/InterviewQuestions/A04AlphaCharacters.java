package Mentoring.InterviewQuestions;

public class A04AlphaCharacters {

    public static void main(String[] args) {

        // print out only alphabetic characters
        // print out only digit characters
        // print out only symbols (other characters)

        String given = "ertwsFADSF::IJ67585498testtest8732484375efds*&(&*^)5%^";
        System.out.println(given);
        String onlyAlphabets = "";
        String onlyDigits = "";
        String onlySpecial = "";
        // i need to reach out each of the letters

        for (int i = 0; i < given.length(); i++) {

            char ch = given.charAt(i);

            if (Character.isAlphabetic(ch) & !Character.isDigit(ch)){
                onlyAlphabets+=ch;
            }else if (Character.isDigit(ch) & !Character.isAlphabetic(ch)){
                onlyDigits+=ch;
            }else {
                onlySpecial+=ch;
            }
        }
        System.out.println("Alphabets: "+onlyAlphabets);
        System.out.println("Digits: "+onlyDigits);
        System.out.println("Special Characters: "+onlySpecial);

        // Second way to find alpha characters and how many alpha characters are there
        String replaced = given.replaceAll("[^A-Za-z]","");
        System.out.println(replaced); // ertwsFADSFIJtesttestefds
        System.out.println(replaced.length()); // 24

        // Second way to find digit characters and how many digits are there
        System.out.println(given.replaceAll("[^0-9]","")); // 6758549887324843755
        System.out.println(given.replaceAll("[^0-9]","").length()); // 19
    }
}
