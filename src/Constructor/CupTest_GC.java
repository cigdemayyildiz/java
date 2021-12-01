package Constructor;

public class CupTest_GC {

    public static void main(String[] args) {

        Cup_GC myCup = new Cup_GC(10, true, 6); // there are three argument in the parenthesis
        System.out.println(myCup.sizeOfCup); // 10
        System.out.println(myCup.isClean); // true
        System.out.println(myCup.liquidAmount); // 6.0
        // bu object i yazdirdiginda ayni zamanda "This is two argument constructor" ve "This is no argument
        // constructor" mesajlarini da goreceksin, cunku Cup Class da constructorlarin icine birbirlerini gizledik.
        // 3 argumenti olan constructor in icinde bos olan, bos olan constructor in icine de iki argumenti olan
        // constructor i ekledik. burada sout ile cagirilmiyor olsalar bile onlar otomatik olarak gelecek cunku
        // oraya tanimlandilar. 3 argumentli olan bos olani bos olan da gelirken iki argument li olani getiriyor.
        System.out.println(); // bunu ekranda arada bosluk olsun diye koyuyorum, kafani karistirmasin

        Cup_GC yourCup = new Cup_GC(); // bu object parantezinin icinde herhangi bir argument olmadigi icin bu Cup class daki
        // bos olan constructor in icindeki mesaji default olarak alip yazdiriyor
        // This is two argument constructor and This is no argument constructor
        // iki mesaji da yazdiriyor cunku "This is no argument constructor" mesaji bos olan constructor dan
        // "This is two argument constructor" mesaji da Cup class daki bos constructor icindeki gizlenen 2 argumenti
        // olan constructor dan geliyor.
        System.out.println(yourCup.liquidAmount); // 0.0 Cup class dan bos constructor dan geliyor bu yuzden
        // liquidAmount in degeri sifir

        System.out.println();
        System.out.println(myCup); // Constructor.Cup@5cad8086 --> Cup class da olusturdugumuz public String toString(){}
        // methodundan sonra hashcode gidip yerine method body deki mesaj geldi, eger Cup class da toString methodunu
        // olusturmamis olsaydik o zaman hashcode goruntulenecekti, toString methodunun olusturulmasi myCup object ini
        // cagirdigimda toString icine ne mesaj yazdiysam onu goruntulemeyi sagliyor
        System.out.println();
        System.out.println(yourCup); // Cup class daki toString icinde ne varsa o mesaj gelecek, burada instance variable
        // ozelliklerini gorecegiz cunku Cup class icindeki toString methodunun body sine instance variable lari yazdirdik.

        System.out.println();
        myCup.info(); // Cup class da olusturdugumuz public void info(){} methodunun bodysindeki mesaj myCup objesi
        // icindeki verilerle goruntulenecek
        System.out.println();
        yourCup.info(); // Cup class icindeki olusturdugumuz public void info(){} methodunun bodysindeki mesaji yourCup
        // objesi icindeki verilerle cekecek, yourCup objesi bos olusturuldugu icin, parantez icinde veri olmadigi icin
        // Cup class daki bos constructor in yapisini kullanacak, onu kendine ornek alacak, Cup class icindeki bos
        // constructor in bodysinde iki argument i olan constructor cagrildigi icin bos olan constructor artik iki
        // argumenti olan constructor in da ozelliklerini tasiyor, Cup class da iki argumenti olan constructor i bos
        // olan constructor icine cagirdiktan sonra argumentlere deger verdigimiz icin burada yourCup objesi bos olan
        // constructor in icindeki iki argumentli constructor a verilen degerlerle birlikte gelecek
        System.out.println();

        Cup_GC herCup = new Cup_GC(15,false,5); // uc argument li bir object olusturdugumuz icin, uc argumentli
        // constructor in icinde bos olan constructor da geldigi icin, bos olan constructor da iki argumentli constructor
        // ile birlikte geldigi icin Cup class daki constructor larin icinde sout ile ne mesaj yazdiysak hepsini bu
        // object altinda gorecegiz.
        System.out.println(herCup); // toString icindeki mesaji burada goruntuleyecegiz
        System.out.println();

        Cup_GC hisCup = herCup; // reassigned object --> yeni bir object olusturduk ama elimizdeki baska bir object i
        // referens gosterdik. eski bir object in verileri ile yeni bir object olusturmus olduk.
        System.out.println(hisCup); // hisCup i yazdirinca herCup in bilgileri goruntulenecek.
        System.out.println();
        hisCup = null; // hisCup object ini garbage a gonderdik
        System.out.println(hisCup); // hisCup garbage a gittigi icin herhangi bir sey print edemeyecek
        System.out.println();
        myCup = null; // reassign myCup with null --> bu da cope gonderildi
        System.out.println(myCup); // myCup da garbage a gonderildigi icin herhangi bir sey print edemeyecek
        System.out.println();

        System.gc(); // garbage collector --> bu class icinde kullanilmayan ne varsa cope gonderiyor,
        // null olarak tanimladigimiz her seyi java cope gondersin diye en sona bu komutu yaziyoruz.
        // it should be at the end of the class(all codes)
        // it clears the unused data





    }
}
