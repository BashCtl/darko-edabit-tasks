package hard;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.testng.Assert.assertEquals;

public class LargestGap {

    public static int largestGap(int[] numbers) {
        Arrays.sort(numbers);
        return IntStream.range(0, numbers.length - 1)
                .mapToObj(i -> numbers[i + 1] - numbers[i])
                .mapToInt(Integer::valueOf)
                .max().getAsInt();
    }

    @Test
    public void test01() {
        assertEquals(11, largestGap(new int[] {9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5}));
    }

    @Test
    public void test02() {
        assertEquals(4, largestGap(new int[] {14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7}));
    }

    @Test
    public void test03() {
        assertEquals(2, largestGap(new int[] {13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9}));
    }

    @Test
    public void test04() {
        assertEquals(6, largestGap(new int[] {21, 28, 0, 5, 11, 6, 17, 25, 2, 19}));
    }

    @Test
    public void test05() {
        assertEquals(9, largestGap(new int[] {26, 17, 4, 25, 29, 26, 8, 30, 4, 20, 2, 7, 29, 7, 20, 30, 23, 5}));
    }

    @Test
    public void test06() {
        assertEquals(4, largestGap(new int[] {12, 13, 17, 20, 23, 25, 29, 26, 12, 7, 9}));
    }

}
