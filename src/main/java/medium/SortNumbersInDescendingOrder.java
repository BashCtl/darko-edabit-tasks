package medium;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;

public class SortNumbersInDescendingOrder {

    public static int sortDesc(final int num) {
        return Integer.parseInt(Arrays.stream(String.valueOf(num).split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining()));
    }

    @Test
    public void test1() {
        assertEquals(321, sortDesc(123));
    }

    @Test
    public void test2() {
        assertEquals(977766200, sortDesc(670276097));
    }

    @Test
    public void test3() {
        assertEquals(9865210, sortDesc(2619805));
    }

    @Test
    public void test4() {
        assertEquals(98421, sortDesc(81294));
    }

    @Test
    public void test5() {
        assertEquals(987654321, sortDesc(123495678));
    }

    @Test
    public void test6() {
        assertEquals(98421, sortDesc(81294));
    }

    @Test
    public void test7() {
        assertEquals(0000000, sortDesc(0000000));
    }

    @Test
    public void test8() {
        assertEquals(321, sortDesc(321));
    }

    @Test
    public void test9() {
        assertEquals(986420, sortDesc(628904));
    }
    
    @Test
    public void test10() {
        assertEquals(987653220, sortDesc(289327560));
    }

}
