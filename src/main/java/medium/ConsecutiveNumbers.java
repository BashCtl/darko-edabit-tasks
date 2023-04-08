package medium;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.testng.Assert.assertEquals;

public class ConsecutiveNumbers {

    public static boolean cons(int[] arr) {
        Arrays.sort(arr);
        return IntStream.range(0, arr.length - 1)
                .allMatch(i -> arr[i + 1] - arr[i] == 1);
    }

    @Test
    public void test1() {
        assertEquals(true, cons(new int[]{5, 1, 4, 3, 2}));
    }

    @Test
    public void test2() {
        assertEquals(true, cons(new int[]{55, 59, 58, 56, 57}));
    }

    @Test
    public void test3() {
        assertEquals(true, cons(new int[]{-3, -2, -1, 1, 0}));
    }

    @Test
    public void test4() {
        assertEquals(false, cons(new int[]{5, 1, 4, 3, 2, 8}));
    }

    @Test
    public void test5() {
        assertEquals(false, cons(new int[]{5, 6, 7, 8, 9, 9}));
    }

    @Test
    public void test6() {
        assertEquals(false, cons(new int[]{5, 3}));
    }

}
