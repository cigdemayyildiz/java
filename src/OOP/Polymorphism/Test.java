package OOP.Polymorphism;

public class Test {

    public static void main(String[] args) {

        ATM atm = new ATM(); // ATM class inin object i
        atm.balance(); // balance(); ATM class inin methodu

        Branch branch = new Branch(); // Branch class inin object i
        branch.assistance(); // assistance(); Branch class inin methodu
        branch.balance(); // balance(); ATM class inin methodu, Branch class ATM class inin
        // child i oldugu icin ona erisim izni var

        Bank bank = new Bank(); // Bank class inin object i
        bank.openAccount(); // openAccount(); Bank class inin methodu
        bank.assistance(); // assistance(); Branch class inin methodu ama Bank class i Branch class inin
        // child i oldugu icin Branch icindeki methodlara erisim izni var
        bank.withdraw(); // withdraw(); methodu ATM class inin methodu, Bank class ATM class inin grandchild i oldugu
        // icin ATM class inin methodlarina erisim izni var

        ATM branch1 = new Branch(); // ATM class ini referens alarak olusturulan Branch objecti
        branch1.deposit(); // deposit(); ATM class inin methodu, Branch class ATM class inin child i oldugu icin ATM
        // icindeki methodlara erisim izni var
        // branch1.assistance(); --> ATM class ini referans alarak object olusturdugumuzda, Branch class kendi icindeki
        // methoda erisemiyor.
        ((Branch) branch1).assistance(); // ATM class i referan alinarak olusturulmus bir object ile Branch class i
        // icindeki bir methoda ulasmak istenirse, Branch class ile casting yapilarak method object ismi ile cagriliyor.

        ATM bank2 = new Bank(); // ATM class i referans alinarak Bank object i olusturuldu
        bank2.balance(); // ATM class i referans alinarak olusturulmus object ile ATM icindeki methoda erisim saglandi
        // Down casting the object to the child reference
        ((Bank)bank2).hire(); // Bank class icindeki herhangi bir methoda ulasabilmek icin Bank class i ile casting
        // yapmak gerekiyor.
        ((Branch)bank2).hire(); // Branch ile casting yapilirsa yine Bank icindeki implementation calisacak cunku object
        // Bank icin olusturuldu.


        ATM branch2 = new Branch();
        ((Branch)branch2).hire();
        // ((Bank)atm2).hire(); --> object Branch object i oldugu icin Branch den asagidaki sinif icin calismiyor


        Bank bank1 = new Bank();
        bank1.withdraw();
        bank1.hire();
        bank1.assistance();
        // Upcasting
        ((Branch)bank1).assistance(); // bunu yapmak zorunda degilsin bu zaten halihazirda casting olmasa da kosan bir method

//        Bank bank2 = (Bank) new Branch();
//        bank2.hire();





    }
}
