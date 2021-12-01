package Exception;

import Mentoring.MapPracticeWithList.Supermarket;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Practice3 {

    public static void main(String[] args){

        try{
            FileInputStream file = null;

            file = new FileInputStream("Test.txt");
            System.out.println(file); // Bu sekilde file a ulasamazsin
            System.out.println();
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch (FileNotFoundException e){
            System.out.println("File not FOUND"); // Dosyayi buldugu icin bu mesaji gostermedi cunku ortada hata yok

        }


        System.out.println();

        try{
            FileInputStream file = null;

            file = new FileInputStream("Test1.txt"); // Dosya adini degistirince bulamadi ve hatayi yakaladi

        }catch (FileNotFoundException e){
            System.out.println("File not FOUND"); // mesaji gosterdi
            System.out.println(e.getStackTrace()); // [Ljava.lang.StackTraceElement;@266474c2 --> array oldugu icin alttaki satir
            System.out.println(Arrays.toString(e.getStackTrace()));
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.getCause());
            System.out.println(Arrays.toString(e.getSuppressed()));
            System.out.println(e.fillInStackTrace());
        }
        finally {
            System.out.println("This is finally block");
        }
    }
}
