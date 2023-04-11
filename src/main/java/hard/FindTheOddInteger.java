package hard;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;

public class FindTheOddInteger {

    public static int findOdd(int[] arr) {
        List<Integer> numList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        return Arrays.stream(arr).filter(n -> Collections.frequency(numList, n) % 2 != 0)
                .findFirst().getAsInt();
    }


    @Test
    public void test1() {
        assertEquals(findOdd(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}), 5);
    }

    @Test
    public void test2() {
        assertEquals(findOdd(new int[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5}), -1);
    }

    @Test
    public void test3() {
        assertEquals(findOdd(new int[]{20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5}), 5);
    }

    @Test
    public void test4() {
        assertEquals(findOdd(new int[]{10}), 10);
    }

    @Test
    public void test5() {
        assertEquals(findOdd(new int[]{1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1}), 10);
    }

    @Test
    public void test6() {
        assertEquals(findOdd(new int[]{5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10}), 1);
    }

}
