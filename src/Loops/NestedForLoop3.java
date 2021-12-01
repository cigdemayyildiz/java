package Loops;

public class NestedForLoop3 {

    public static void main(String[] args) {

        for (int a = 0; a < 2; a++) {
            if (a==0){
                continue; // am leri gormemek icin
            }
            for (int hours = 0; hours < 12; hours++) {
                if (hours >= 5 && hours <= 7) { // 5 ile 8 arasindakileri gosterme komutu
                    continue; // if den sonra bir tek line varsa kullandigim o zaman curly parantez olmasa da olur
                }
                for (int minutes = 0; minutes <= 59; minutes++) {
//                    if (hours>=10)
//                        break;
                    if (a == 0) {
                        if (hours>=10){
                            break;
                        }
                        System.out.println(hours + ":" + minutes + " am");
                    } else {
                        System.out.println(hours + ":" + minutes + " pm");
                    }
                }
            }
        }
    }
}
