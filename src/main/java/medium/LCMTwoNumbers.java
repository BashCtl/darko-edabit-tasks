package medium;

public class LCMTwoNumbers {

    public static int lcm(int n1, int n2) {
        int result = 0;
        for (int i = Math.min(n1, n2); i <= n1 * n2; i++) {
            if (i % n1 == 0 && i % n2 == 0) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(lcm(9,18));
        System.out.println(lcm(8,5));
        System.out.println(lcm(17,11));
    }
}
