package medium;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class Persistence {

    public static int persistence(long num) {
        if (num / 10 == 0) {
            return 0;
        }
        long number = Arrays.stream(String.valueOf(num).split(""))
                .mapToLong(Long::valueOf).reduce(1, (a, b) -> a * b);
        return 1 + persistence(number);
    }

    @Test
    public void test1() {
        assertEquals(0, persistence(0));
    }

    @Test
    public void test2() {
        assertEquals(1, persistence(10));
    }

    @Test
    public void test3() {
        assertEquals(2, persistence(25));
    }

    @Test
    public void test4() {
        assertEquals(3, persistence(39));
    }

    @Test
    public void test5() {
        assertEquals(4, persistence(77));
    }

    @Test
    public void test6() {
        assertEquals(5, persistence(679));
    }

    @Test
    public void test7() {
        assertEquals(6, persistence(6788));
    }

    @Test
    public void test8() {
        assertEquals(7, persistence(68889));
    }

    @Test
    public void test9() {
        assertEquals(8, persistence(2677889));
    }

    @Test
    public void test10() {
        assertEquals(9, persistence(26888999));
    }

    @Test
    public void test11() {
        assertEquals(10, persistence(3778888999L));
    }

    @Test
    public void test12() {
        assertEquals(11, persistence(277777788888899L));
    }

}
