package ArrayList;

import Constructor.Car; // bu Java nin default unda olmadigi icin * bunu kapsamiyor
import java.util.*; // Java da default olan her seyi import etmis oluyorsun, tek tek import etmene gerek kalmiyor

public class ArrayToArrayList {

    public static void main(String[] args) {

        Object [] obj = {2, true, "yes", "no", 2.5, new Car(), '$'};

        String [] str = {"Yes", "no"};

        // How to convert Array to ArrayList
        List<String> strn = Arrays.asList(str);
        List<Object> list = Arrays.asList(obj);

        System.out.println(list.size()); // 7
        System.out.println(strn.size()); // 2

        //list.add("new element"); // olusturdugun Object array inin belirli bir kapasitesi var ve fix lenmis,
        // ekleme yapmak istediginde hata verecek
        //System.out.println(list); // UnsupportedOperationException
        //list.remove("yes"); // cikarma yaptiginda da hata verecek cunku size i degistirmeye calisiyorsun.
        //System.out.println(list); // UnsupportedOperationException
    }
}
