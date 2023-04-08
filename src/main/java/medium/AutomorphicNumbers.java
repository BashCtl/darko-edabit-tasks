package medium;

public class AutomorphicNumbers {

    public static boolean isAutomorphic(int n) {
        long x = n;
        return x == x * x % (Math.pow(10, String.valueOf(n).length()));
    }

    public static void main(String[] args) {
        System.out.println(isAutomorphic(7109376));
        System.out.println(isAutomorphic(5));
        System.out.println(isAutomorphic(8));
        System.out.println(isAutomorphic(76));
    }
}
