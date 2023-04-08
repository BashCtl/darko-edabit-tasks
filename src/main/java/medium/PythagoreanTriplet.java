package medium;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PythagoreanTriplet {

    public static boolean isTriplet(int a, int b, int c) {
        List<Integer> nums = Stream.of(a, b, c).sorted().collect(Collectors.toList());
        return nums.get(0) * nums.get(0) + nums.get(1) * nums.get(1) == nums.get(2) * nums.get(2);
    }

    public static void main(String[] args) {
        System.out.println(isTriplet(3,4,5));
        System.out.println(isTriplet(1,2,3));
    }
}
