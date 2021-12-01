package Exception;

public class Practice5 {

    public static void main(String[] args) throws Exception {
        int a = 15;
        int b = 10;
        if (a<b){
            throw new RuntimeException();
        }else if (a>b){
            throw new IndexOutOfBoundsException("You are going out of bound");
        }
        Thread.sleep(3000);
    }
}
