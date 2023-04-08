package medium;

public class CountDigits {

    public static int digitsCount(long n){
        if(n>-10&&n<10){
            return 1;
        }else {
            return 1 + digitsCount(n / 10);
        }
    }

    public static void main(String[] args) {
        System.out.println(digitsCount(4666));
        System.out.println(digitsCount(544));
        System.out.println(digitsCount(0));
    }
}
