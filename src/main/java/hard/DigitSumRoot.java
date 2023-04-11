package hard;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class DigitSumRoot {

    public static int digitRoot(long n) {
        if (n / 10 == 0) {
            return (int) n;
        }
        int number = Arrays.stream(String.valueOf(n).split(""))
                .mapToInt(Integer::valueOf).sum();
        return digitRoot(number);
    }

    private long[] numVector = new long[]{
            999888777, 1799877799877998777L, 9876546839792379L,
            1238763636555555555L, 1238222222222222226L, 3612376363612876636L, 0
    };
    private int[] resVector = new int[]{9, 7, 3, 9, 3, 4, 0};

    @Test
    public void test01() {
        assertEquals(digitRoot(numVector[0]), resVector[0]);
    }

    @Test
    public void test02() {
        assertEquals(digitRoot(numVector[1]), resVector[1]);
    }

    @Test
    public void test03() {
        assertEquals(digitRoot(numVector[2]), resVector[2]);
    }

    @Test
    public void test04() {
        assertEquals(digitRoot(numVector[3]), resVector[3]);
    }

    @Test
    public void test05() {
        assertEquals(digitRoot(numVector[4]), resVector[4]);
    }

    @Test
    public void test06() {
        assertEquals(digitRoot(numVector[5]), resVector[5]);
    }

    @Test
    public void test07() {
        assertEquals(digitRoot(numVector[6]), resVector[6]);
    }

}
