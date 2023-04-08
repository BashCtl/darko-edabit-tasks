package medium;

public class SmallestNDigitNumber {

    public static int smallest(int digits, int value) {
        int result = 0;
        for (int i = (int) Math.pow(10, digits - 1); i < Math.pow(10, digits) - 1; i++) {
            if (i % value == 0) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(smallest(3,8));
        System.out.println(smallest(5,12));
        System.out.println(smallest(7,1));
    }
}
