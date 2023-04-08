package medium;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.testng.Assert.assertEquals;

public class CommonDivisorOfArray {

    public static int GCD(int[] array) {
        int maxNum = Arrays.stream(array).max().getAsInt();
        return IntStream.rangeClosed(1, maxNum)
                .filter(x -> Arrays.stream(array).allMatch(n -> n % x == 0))
                .max().getAsInt();
    }

    @Test
    public void test1() {
        assertEquals(10, GCD(new int[]{10,20,40}));
    }

    @Test
    public void test2() {
        assertEquals(1, GCD(new int[]{7,11}));
    }

    @Test
    public void test3() {
        assertEquals(12, GCD(new int[]{156,84,60,1188,252}));
    }

    @Test
    public void test4() {
        assertEquals(1, GCD(new int[]{1,2,3,4,5}));
    }

    @Test
    public void test5() {
        assertEquals(7, GCD(new int[]{777,77,7,14}));
    }

    @Test
    public void test6() {
        assertEquals(43, GCD(new int[]{731,43,473,2623}));
    }

    @Test
    public void test7() {
        assertEquals(20, GCD(new int[]{20,20,40,100}));
    }

}
