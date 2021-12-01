package SET;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Practice3 {

    public static void main(String[] args) {

        // You're given an Array of colors
        // find out and store duplicate elements into an ArrayList from this Array

        String [] colors = {"red", "black", "black", "white", "red", "orange"};

        List<String> list = Arrays.asList(colors); // once ArrayList'e alip listeliyoruz.
        System.out.println(list); // [red, black, black, white, red, orange]

        HashSet set = new HashSet(list); // List i Set'e cevirdik cunku Set duplicate elemente izin vermiyor.
        System.out.println(set); // --> This is Set [red, orange, white, black]

        HashSet set1 = new HashSet(Arrays.asList(colors)); // line 17 yi olusturmadan direkt bu sekilde de yapabilirsin
        System.out.println(set1); // --> Set [red, orange, white, black]

        ArrayList list2 = new ArrayList(); // yeni ArrayList object i olusturduk
        HashSet set2 = new HashSet(); // yeni HashSet object i olusturduk

        for (String color : colors){
            if (!set2.add(color)){
                list2.add(color);
            }
        }
        System.out.println(list2); // [black, red]

        // forEach loop da String Array icindeki elementleri donguye aldik. set duplicate elementlere izin vermedigi icin
        // set icinde kalan elementler unique olanlar. dongu String Array elementlerinden red e bakti if() comparisonda
        // red elementinin set icinde olmamasi durumunda list i yazdir dedi. String Arraydeki ilk red set icinde oldugu
        // icin o elendi. black kontrol edildi o da set icinde oldugu icin o da elendi. ikinci black kontrol edildi ve
        // set icinde black oldugu icin o yazdirildi. white kontrol edildi ve set icinde oldugu icin o da es gecildi.
        // ikinci red kontrol edildi ve set icinde bir tane red oldugu icin o da yazdirildi. son olarak orange kontrol
        // edildi set icinde oldugu icin o da elendi ve list icin black ve red elementleri kaldigi icin onlar yazildi.


    }
}
