package Methods;

public class TechtorialStudent {

    static String schoolName; // okul ismi static cunku tum ogrenciler icin ayni bir bilgi
    static String schoolAddress;
    String studentName; // ogrenci adi non-static cunku isim kisiden kisiye degisecek
    String studentTableNumber;
    int studentAge;

    public void setStudentName(String studentName1){
        studentName=studentName1;
    }
    public static void setSchoolName(String schoolName1){
        schoolName=schoolName1;
    }
    public void setStudentTableNumber(String studentTableNumber1){
        studentTableNumber=studentTableNumber1;
    }
    public static void setSchoolAddress(String schoolAddress1){
        schoolAddress=schoolAddress1;
    }
    public void setStudentAge(int studentAge1){
        studentAge=studentAge1;
    }

}
