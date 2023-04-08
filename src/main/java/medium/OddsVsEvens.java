package medium;

public class OddsVsEvens {

    public static String oddsVsEvens(int num) {
        int even = 0;
        int odd = 0;
        while (num > 0) {
            int number = num % 10;
            if (number % 2 == 0) {
                even += number;
            } else {
                odd += number;
            }
            num = num / 10;
        }
        return even > odd ? "even" : even == odd ? "equal" : "odd";
    }

    public static void main(String[] args) {
        System.out.println(oddsVsEvens(97428));
        System.out.println(oddsVsEvens(81961));
        System.out.println(oddsVsEvens(54870));
    }
}
