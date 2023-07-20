package hard;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class SharedDigits {

    public static boolean sharedDigits(int[] num) {

        return IntStream.range(0, num.length - 1)
                .allMatch(i -> Arrays.stream(String.valueOf(num[i]).split(""))
                        .anyMatch(n ->hasNumber(num[i+1], Integer.parseInt(n))));
    }

    public static boolean hasNumber(int number, int target){
            while (number > 0) {
                if (number % 10 == target) {
                    return true;
                }
                number /= 10;
            }
            return false;
    }

    @Test
    public void test01() {
        assertEquals(true, sharedDigits(new int[]{12, 13, 17, 19, 79}));
    }

    @Test
    public void test02() {
        assertEquals(true, sharedDigits(new int[]{33, 53, 6351, 12, 2242, 44}));
    }

    @Test
    public void test03() {
        assertEquals(false, sharedDigits(new int[]{33, 44, 55, 66, 77}));
    }

    @Test
    public void test04() {
        assertEquals(false, sharedDigits(new int[]{1, 12, 123, 1234, 1235, 6789}));
    }

    @Test
    public void test05() {
        assertEquals(true, sharedDigits(new int[]{5789, 798, 98, 995, 599, 699}));
    }

    @Test
    public void test06() {
        assertEquals(false, sharedDigits(new int[]{5, 4, 44, 444}));
    }

    @Test
    public void test07() {
        assertEquals(true, sharedDigits(new int[]{5, 65, 66, 76, 78}));
    }

    @Test
    public void test08() {
        assertEquals(true, sharedDigits(new int[]{5, 55, 665, 66665555, 65, 66, 76, 78, 989}));
    }

    @Test
    public void test09() {
        assertEquals(false, sharedDigits(new int[]{5, 55, 665, 4444, 65, 66, 76, 78, 989}));
    }

    @Test
    public void test10() {
        assertEquals(true, sharedDigits(new int[]{1, 11, 12, 13, 14, 15, 16}));
    }


}
