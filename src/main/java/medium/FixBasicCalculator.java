package medium;

public class FixBasicCalculator {
    public static Object basicCalculator(int a, String o, int b) {


        if (o.equals("+")) {
            return a + b;
        } else if (o.equals("-")) {
            return a - b;
        } else if (o.equals("/") && b != 0) {
            return a / b;
        } else if (o.equals("*")) {
            return a * b;
        } else {
            return null;
        }

    }

    public static void main(String[] args) {
        System.out.println(basicCalculator(2, "+", 4));
        System.out.println(basicCalculator(6, "-", 5));
    }
}
