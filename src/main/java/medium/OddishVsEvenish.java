package medium;

public class OddishVsEvenish {

    public static String oddishOrEvenish(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum % 2 == 0 ? "Evenish" : "Oddish";
    }

    public static void main(String[] args) {
        System.out.println(oddishOrEvenish(43));
        System.out.println(oddishOrEvenish(373));
        System.out.println(oddishOrEvenish(4433));
    }

}
