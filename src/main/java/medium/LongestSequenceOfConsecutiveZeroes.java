package medium;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class LongestSequenceOfConsecutiveZeroes {

    public static String longestZero(String str) {

        String[] zeros = str.split("[1]+");
        Arrays.sort(zeros);
        return zeros.length > 0 ? zeros[zeros.length - 1] : "";
    }

    @Test
    public void test1() {
        assertEquals("0000", longestZero("01100001011000"));
    }

    @Test
    public void test2() {
        assertEquals("00", longestZero("100100100"));
    }

    @Test
    public void test3() {
        assertEquals("0", longestZero("111101"));
    }

    @Test
    public void test4() {
        assertEquals("0000000000", longestZero("1000000000011101"));
    }

    @Test
    public void test5() {
        assertEquals("00000", longestZero("100001110000100000"));
    }

    @Test
    public void test6() {
        assertEquals("00", longestZero("101001101"));
    }

    @Test
    public void test7() {
        assertEquals("0", longestZero("101010101"));
    }

    @Test
    public void test8() {
        assertEquals("00", longestZero("1001001"));
    }

    @Test
    public void test9() {
        assertEquals("", longestZero("111111"));
    }

}
