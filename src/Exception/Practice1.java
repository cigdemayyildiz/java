package Exception;

public class Practice1 {

    public static void main(String[] args) {

        System.out.println("This is my first print BEFORE exception");

        try {
            String str = "35c";
            int number = Integer.parseInt(str);
            System.out.println(number);
        }catch (NumberFormatException exception){
            System.out.println("This is inside of CATCH block"); // str icindeki degeri sayiya cevirsin istedik ama
            // str harf de icerdigi icin hata verdi, hata buldugu icin try i calistirdi ve try govdesindeki kisim bir
            // hata buldugu icin (harf yuzunden) hatayi yakaladi ve catch govdesindeki mesaji ekrana yazdirip programin
            // calismasina devam edip asagidaki mesaji da gosterdi.
            // sout yerine kodda yazilabilir, eger try govdesindeki hatali ise bunu yap der gibi
            // bir urunde herhangi bir hata meydana gelebilir ve o urunun kendine ait bir manuel i vardir ve orada
            // hata kodlari yazilidir, catch govdesine o manuel icindeki hata kodlari da yazilabilir, hatayi goren
            // kullanici manuel de bu hata kodunun nasil bir hata oldugunu kontrol edebilir.
        }

        System.out.println("This is my first print AFTER exception");



    }
}
