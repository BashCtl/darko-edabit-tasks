package medium;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.testng.Assert.assertEquals;

public class SumOfMissingNumbers {

    public static int sumMissing(int[] arr) {
        Arrays.sort(arr);
        return IntStream.range(0, arr.length - 1)
                .map(i -> {
                    if (arr[i + 1] - arr[i] != 1) {
                        return IntStream.range(arr[i] + 1, arr[i + 1]).sum();
                    }
                    return 0;
                }).sum();
    }

    @Test
    public void test1() {
        assertEquals(29, sumMissing(new int[]{1, 3, 5, 7, 10}));
    }

    @Test
    public void test2() {
        assertEquals(1575, sumMissing(new int[]{10, 20, 30, 40, 50, 60}));
    }

    @Test
    public void test3() {
        assertEquals(40, sumMissing(new int[]{7, 3, 8, 5, 12}));
    }

    @Test
    public void test4() {
        assertEquals(4782, sumMissing(new int[]{99, 2, 45, 4, 17}));
    }

    @Test
    public void test5() {
        assertEquals(29, sumMissing(new int[]{10, 7, 5, 3, 1}));
    }

    @Test
    public void test6() {
        assertEquals(0, sumMissing(new int[]{7, 8, 9, 10}));
    }

}
