package medium;

public class SameParity {

    public static boolean parityAnalysis(int num) {
        int numSum = 0;
        int temp = num;
        while (temp > 0) {
            numSum += temp % 10;
            temp = temp / 10;
        }
        return num % 2 == numSum % 2 || num % 2 != 0 && numSum % 2 != 0;
    }

    public static void main(String[] args) {
        System.out.println(parityAnalysis(243));
        System.out.println(parityAnalysis(12));
        System.out.println(parityAnalysis(3));
        System.out.println(parityAnalysis(20));
    }
}
