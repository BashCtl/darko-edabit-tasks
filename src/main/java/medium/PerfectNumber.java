package medium;

public class PerfectNumber {

    public static boolean checkPerfect(int num) {
        int sumFactors = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sumFactors += i;
            }
        }
        return sumFactors == num;
    }

    public static void main(String[] args) {
        System.out.println(checkPerfect(6));
        System.out.println(checkPerfect(12));
        System.out.println(checkPerfect(97));
        System.out.println(checkPerfect(28));
    }
}
