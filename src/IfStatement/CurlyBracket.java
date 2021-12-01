package IfStatement;

public class CurlyBracket {

    public static void main(String[] args) {

        // appleNumber = 20;
        // orangeNumber = 30;

        int appleNumber = 40;
        int orangeNumber = 30;

        if (appleNumber>orangeNumber) {
            appleNumber++;
            appleNumber++;
            System.out.println("There are more apples in the store than oranges " + appleNumber);
        }
        if (orangeNumber>appleNumber) { // eger curly bracket yoksa ve bu condition true ise o zaman alt satirda ne kadar islem varsa calisacak
            // eger curly bracket yoksa ve bu condition false ise o zaman bir alt satir calismayacak sonraki satirlar calisacak
            orangeNumber++; // if statement false ise ve curly bracket yoksa bu islem calismayacak
            orangeNumber++;
            orangeNumber++;
            System.out.println("There are more oranges in the store than apples " + orangeNumber);
        }

        /*
         her iki if statementta da curly bracket varsa ve birinci if statement true ise;
         1- birinci if statement in body sinin icindeki islemler dahil print edilir.
         2- ikinci if statement print edilmez.
        */

        /*
         her iki if statementta da curly bracket varsa ve ikinci if statement true ise;
         1- ikinci if statement in body sinin icindeki islemler dahil print edilir.
         2- birinci if statement print edilmez.
        */

        /*
         birinci if statementta curly bracket yoksa ve true ise;
         1- birinci if statement in body sinin icindeki islemler dahil print edilir,
         2- ikinci if statement print edilmez.
        */

        /*
         birinci if statementta curly bracket yoksa ve false ise;
         1- birinci if statementta if satirinin altindaki satir isleme alinmaz sonraki satirlar isleme alinir ve
         islem satirlarinin sonundaki sout print edilir.
         2- ikinci if statement bodysindeki tum islemler dahil print edilir.
        */

         /*
         ikinci if statementta curly bracket yoksa ve true ise;
         1- ikinci if statement in body sinin icindeki islemler dahil print edilir,
         2- birinci if statement print edilmez.
        */

        /*
         ikinci if statementta curly bracket yoksa ve false ise;
         1- birinci if statement bodysi icindeki tum islemler dahil print edilir.
         2- ikinci if statement if satirinin altindaki satir isleme alinmaz sonraki satirlar isleme alinir ve
         islemler sonundaki sout print edilir.
        */

    }
}
