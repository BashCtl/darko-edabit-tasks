package medium;

import org.testng.annotations.Test;

import java.util.stream.IntStream;

import static org.testng.Assert.assertEquals;

public class MiniPeaks {

    public static int[] miniPeaks(int[] arr) {
        return IntStream.range(1, arr.length - 1).mapToObj(i -> {
                    if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                        return arr[i];
                    }
                    return -1;
                }).filter(x -> x > 0)
                .mapToInt(Integer::valueOf)
                .toArray();
    }

    @Test
    public void test1() {
        assertEquals(miniPeaks(new int[]{4, 5, 2, 1, 4, 9, 7, 2}), new int[]{5, 9});
    }

    @Test
    public void test2() {
        assertEquals(miniPeaks(new int[]{1, 2, 1, 1, 3, 2, 5, 4, 4}), new int[]{2, 3, 5});
    }

    @Test
    public void test3() {
        assertEquals(miniPeaks(new int[]{1, 2, 3, 4, 5, 6}), new int[]{});
    }

    @Test
    public void test4() {
        assertEquals(miniPeaks(new int[]{6, 4, 3}), new int[]{});
    }

    @Test
    public void test5() {
        assertEquals(miniPeaks(new int[]{1, 1, 1, 1, 2, 1, 1, 1}), new int[]{2});
    }

    @Test
    public void test6() {
        assertEquals(miniPeaks(new int[]{1, 9, 1, 8, 2, 7, 6}), new int[]{9,8,7});
    }

    @Test
    public void test7() {
        assertEquals(miniPeaks(new int[]{7, 8, 7, 8, 7, 8, 5, 1, 2, 0}), new int[]{8, 8, 8, 2});
    }

}
