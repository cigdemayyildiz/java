package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Practice4 {

    public static void main(String[] args) throws FileNotFoundException { // throws Exception da olabilir ama genellikle
        // main method icindeki hata ile ayni olmasi beklenir

            FileInputStream file = null;

            file = new FileInputStream("Test.txt");
            System.out.println();
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }





    }
}
