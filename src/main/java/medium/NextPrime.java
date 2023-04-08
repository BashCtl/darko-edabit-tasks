package medium;

public class NextPrime {

    public static int nextPrime(int num) {
        if (isPrime(num)) {
            return num;
        }
        return nextPrime(++num);
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(nextPrime(11));
        System.out.println(nextPrime(12));
    }
}
