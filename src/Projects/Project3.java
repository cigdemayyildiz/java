package Projects;

import java.util.Scanner;

public class Project3 {

    public static void main(String[] args) {

        // TASK-2

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a String value");
        String string = input.nextLine(); // Definition of Science
        System.out.println("Please enter the starting number"); // 2
        int startingNumber = input.nextInt();
        System.out.println("Please enter the ending number"); // 5
        int endingNumber = input.nextInt();
        System.out.println(string.substring(startingNumber-1, endingNumber)); // efin

        // TASK-3

        String word1 = " Snicker ";
        String word2 = "Cookie";

        System.out.println(word1.trim().toUpperCase().substring(0).charAt(0)); // S
        System.out.println(word2.toLowerCase().replace('o', 'u').concat("s").startsWith("C")); // false

        // TASK-4

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first word include with Java");
        String firstWord = scanner.nextLine();
        System.out.println("Please enter the second word include with Java");
        String secondWord = scanner.nextLine();
        System.out.println("Please enter the third word include with Java");
        String thirdWord = scanner.nextLine();
        int firstWordLength = firstWord.length();
        int secondWordLength = secondWord.length();
        int thirdWordLength = thirdWord.length();
        boolean isAllLengthSame = firstWordLength == secondWordLength && secondWordLength == thirdWordLength;
        boolean doAllContainJava = firstWord.toLowerCase().contains("java") && secondWord.toLowerCase().contains("java") &&
                                   thirdWord.toLowerCase().contains("java");
        boolean doAllStartsWithUpperCase = ('A' <= firstWord.charAt(0) && firstWord.charAt(0) <= 'Z') &&
                                           ('A' <= secondWord.charAt(0) && secondWord.charAt(0) <= 'Z') &&
                                           ('A' <= thirdWord.charAt(0) && thirdWord.charAt(0) <= 'Z');
        boolean isAllConditionProvided = isAllLengthSame && doAllContainJava && doAllStartsWithUpperCase;
        System.out.println(isAllConditionProvided);

        // TASK-5

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter any three words with space between them");
        String usersInput = scanner1.nextLine();
        String firstWord1 = usersInput.substring(0, usersInput.indexOf(' '));
        String lastTwoWord = usersInput.substring(usersInput.indexOf(' ')+1);
        String secondWord1 = lastTwoWord.substring(0, lastTwoWord.indexOf(' '));
        int firstWordLastIndex = firstWord1.length()-1;
        int secondWordLastIndex = firstWord1.length()+secondWord1.length();
        int lastWordLastIndex = usersInput.length()-1;
        System.out.println(""+firstWordLastIndex + "--> index number of '" + (firstWord1.charAt(firstWord1.length()-1))+"'");
        System.out.println(""+secondWordLastIndex+ "--> index number of '" + secondWord1.charAt(secondWord1.length()-1)+"'");
        System.out.println(""+lastWordLastIndex+ "--> index number of '" + lastTwoWord.charAt(lastTwoWord.length()-1)+"'");
        System.out.println("The sum: " + (firstWordLastIndex+secondWordLastIndex+lastWordLastIndex));


        // TASK-6

        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter three ingredients with spaces:");
        String ingredients = input1.nextLine();
        System.out.println("Please enter the int number:");
        int number = input1.nextInt();

        String firstIngredient = (ingredients.substring(0, ingredients.indexOf(" ")));
        String firstWordStartingWithNumber = number+firstIngredient.substring(1);
        System.out.println(firstWordStartingWithNumber);

        String lastTwoIngredients = ingredients.substring(ingredients.indexOf(" ")+1);
        String lastTwoWordStartingWithNumber = number+lastTwoIngredients.substring(1);
       // System.out.println(lastTwoWordStartingWithNumber);

        String secondIngredient = lastTwoIngredients.substring(0, lastTwoIngredients.indexOf(" "));
        String secondWordStartingWithNumber = ++number+secondIngredient.substring(1);
        System.out.println(secondWordStartingWithNumber);

        String lastIngredient = lastTwoIngredients.substring(lastTwoIngredients.indexOf(' ')+1);
        String lastWordStartingWithNumber = ++number+lastIngredient.substring(1);
        System.out.println(lastWordStartingWithNumber);


        // TASK-7

        Scanner input2 = new Scanner(System.in);
        System.out.println("Please enter the String with the following format “ word “");
        String twoWord = input2.nextLine();


        String trimmed = twoWord.trim();
        System.out.println(trimmed);
        String firstPartOfTwoWord = trimmed.substring(0, trimmed.indexOf(" "));
        String secondPartOfTwoWord = trimmed.substring(trimmed.indexOf(' ')+1);
        System.out.println(firstPartOfTwoWord + " " + secondPartOfTwoWord.substring(0,1).toUpperCase()+secondPartOfTwoWord.substring(1));

    }
}
