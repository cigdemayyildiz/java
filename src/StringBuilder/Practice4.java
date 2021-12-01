package StringBuilder;

public class Practice4 {

    public static void main(String[] args) {

        // create a method that will take a StringBuilder as a parameter
        // this method will calculate and return sum of the digits from given StringBuilder object

        StringBuilder builder = new StringBuilder("urjsd123idfvne5y24fgiero%8lk");
        System.out.println(calculate(builder));
    }

    public static int calculate(StringBuilder digits){
        int sum = 0;
        for (int i = 0; i < digits.length(); i++) {
            if (Character.isDigit(digits.charAt(i))){
                // sum = sum+digits.charAt(i); --> ASCII table degerlerini topladi
                sum+=Integer.parseInt(String.valueOf(digits.charAt(i))); // sum degiskeninin data tipi int oldugu icin
                // String bir degeri int primitive cevirmek icin parseInt(); methodunu kullaniyoruz ve parseInt();
                // methodunun parantez icine bekledigi parametre String olmak zorunda oldugu icin, digits.charAt(i);
                // String.valueOf(digits.charAt(i)), String olan 1235248 sayilarini int e cevirecek ve sum+= ile de
                // toplamini alarak sum icine ekleyecek.
            }
        }
        return sum;
    }
}

