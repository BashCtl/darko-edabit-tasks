package medium;

public class IntegerDigitsCount {

    public static int count(int n) {
        int count = 0;
        if (n == 0)
            return 1;
        n = Math.abs(n);
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count(544));
        System.out.println(count(0));
    }
}
