package medium;

public class ReverseNumber {

    public static String rev(int n){
        n = Math.abs(n);
        if(n==0){
            return "";
        }

        return n % 10 + rev(n/10);
    }

    public static void main(String[] args) {
        System.out.println(rev(69));
        System.out.println(rev(5121));
        System.out.println(rev(-122157));
    }
}
