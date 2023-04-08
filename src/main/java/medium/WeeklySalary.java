package medium;

import java.util.stream.IntStream;

public class WeeklySalary {

    public static int weeklySalary(int[] hours) {
        return IntStream.range(0, 7).map(i -> {
            int rate = 10;
            int overHour = 15;
            if (i > 4) {
                rate *= 2;
                overHour *= 2;
            }
            if (hours[i] > 8) {
                return (hours[i] - 8) * overHour + 8 * rate;
            } else {
                return hours[i] * rate;
            }
        }).sum();
    }

    public static void main(String[] args) {
        System.out.println(weeklySalary(new int[]{8, 8, 8, 8, 8, 0, 0}));
        System.out.println(weeklySalary(new int[]{10, 10, 10, 0, 8, 0, 0}));
        System.out.println(weeklySalary(new int[]{0, 0, 0, 0, 0, 12, 0}));
    }
}
