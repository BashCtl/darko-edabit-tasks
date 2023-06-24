package hard;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertArrayEquals;

public class ReversibleInclusiveListRanges {

    public static int[] reversibleInclusiveList(int start, int end) {
        if (start < end) {
            return IntStream.rangeClosed(start, end).toArray();
        } else {
            return IntStream.rangeClosed(end, start)
                    .map(n -> start - n + end)
                    .toArray();
        }
    }

    @Test
    public void test01() {
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, reversibleInclusiveList(5, 1));
    }

    @Test
    public void test02() {
        assertArrayEquals(new int[]{6, 5, 4, 3, 2}, reversibleInclusiveList(6, 2));
    }

    @Test
    public void test03() {
        assertArrayEquals(new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}, reversibleInclusiveList(10, 20));
    }

    @Test
    public void test04() {
        assertArrayEquals(new int[]{24, 23, 22, 21, 20, 19, 18, 17}, reversibleInclusiveList(24, 17));
    }

    @Test
    public void test05() {
        assertArrayEquals(new int[]{40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50}, reversibleInclusiveList(40, 50));
    }

    @Test
    public void test06() {
        assertArrayEquals(new int[]{51, 50, 49, 48, 47, 46, 45, 44, 43, 42, 41}, reversibleInclusiveList(51, 41));
    }

    @Test
    public void test07() {
        assertArrayEquals(new int[]{11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66}, reversibleInclusiveList(11, 66));
    }

    @Test
    public void test08() {
        assertArrayEquals(new int[]{9, 8, 7, 6, 5, 4, 3}, reversibleInclusiveList(9, 3));
    }

    @Test
    public void test09() {
        assertArrayEquals(new int[]{6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16}, reversibleInclusiveList(6, 16));
    }
}
