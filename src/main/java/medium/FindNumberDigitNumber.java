package medium;

public class FindNumberDigitNumber {

    public static int numOfDigit(int num) {
        if (num < 10 && num > -10) {
            return 1;
        }
        return numOfDigit(num / 10) + 1;
    }

    public static void main(String[] args) {
        System.out.println(numOfDigit(1000));
        System.out.println(numOfDigit(12));
        System.out.println(numOfDigit(0));
    }
}
