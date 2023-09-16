package hard;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class NumbersThatAlsoWriters {

    public static boolean isAutobiographical(int n) {
        List<Integer> numbers = Arrays.stream(String.valueOf(n).split(""))
                .mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        return IntStream.range(0, numbers.size()).allMatch(i -> Collections.frequency(numbers, i) == numbers.get(i));
    }

    @Test
    public void test1() {
        assertEquals(isAutobiographical(12345), false);
    }
    @Test
    public void test2() {
        assertEquals(isAutobiographical(1210), true);
    }
    @Test
    public void test3() {
        assertEquals(isAutobiographical(638), false);
    }
    @Test
    public void test4() {
        assertEquals(isAutobiographical(0), false);
    }

    @Test
    public void test5() {
        assertEquals(isAutobiographical(2020), true);
    }
    @Test
    public void test6() {
        assertEquals(isAutobiographical(3211000), true);
    }
    @Test
    public void test7() {
        assertEquals(isAutobiographical(3434343), false);
    }
    @Test
    public void test8() {
        assertEquals(isAutobiographical(2100), false);
    }

}
