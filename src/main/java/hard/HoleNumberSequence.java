package hard;

import org.junit.Test;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.IntStream;

import static org.testng.AssertJUnit.assertEquals;

public class HoleNumberSequence {

    public static int sumOfHoles(int N) {
        return IntStream.rangeClosed(1, N).map(n -> countHoles(n))
                .sum();
    }

    public static int countHoles(int n) {
        Map<String, Integer> holeNumbers = Map.of("4", 1, "6", 1, "8", 2, "9", 1,"0",1);
        return Arrays.stream(String.valueOf(n).split(""))
                .mapToInt(k -> holeNumbers.getOrDefault(k, 0))
                .sum();
    }

//    public static void main(String[] args) {
//        System.out.println(sumOfHoles(6259));
//    }

    @Test
    public void test1() {
        assertEquals(0, sumOfHoles(1));
    }

    @Test
    public void test2() {
        assertEquals(1, sumOfHoles(4));
    }

    @Test
    public void test3() {
        assertEquals(2, sumOfHoles(6));
    }

    @Test
    public void test4() {
        assertEquals(4, sumOfHoles(8));
    }

    @Test
    public void test5() {
        assertEquals(5, sumOfHoles(9));
    }

    @Test
    public void test6() {
        assertEquals(6, sumOfHoles(10));
    }

    @Test
    public void test7() {
        assertEquals(90, sumOfHoles(88));
    }

    @Test
    public void test8() {
        assertEquals(22893, sumOfHoles(10000));
    }

    @Test
    public void test9() {
        assertEquals(27991, sumOfHoles(12345));
    }

}
