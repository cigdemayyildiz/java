package MAP;

import java.util.*;

public class CountAndStore {

    public static void main(String[] args) {

        String [] brands = {"Nike","Adidas","Reebok","Puma","Armani","Clark","Nike","Puma","Puma"};
        System.out.println(Arrays.toString(brands)); // [Nike, Adidas, Reebok, Puma, Armani, Clark, Nike, Puma, Puma]

        HashMap <String, Integer> brandCounts = new HashMap<>();

        for (int i = 0; i < brands.length; i++) {

            if (!brandCounts.containsKey(brands[i])){ // eger brandCounts brands in i elementini icermiyorsa
                brandCounts.put(brands[i], 1);
            }else {
//                int count = brandCounts.get(brands[i]); // store ederek yapilmis hali
//                brandCounts.put(brands[i], count+1); // eger int a store edersek bu sekilde yazmamis gerekirdi
                brandCounts.put(brands[i], brandCounts.get(brands[i])+1);
            }
        }
        System.out.println(brandCounts); // {Nike=2, Reebok=1, Clark=1, Armani=1, Adidas=1, Puma=3}
    }
}
