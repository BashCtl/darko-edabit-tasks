package hard;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumSwapsToAlternateBinaryString {

    public static int minSwaps(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (((i & 1) == 0) && str.charAt(i) == '1') {
                count++;
            }
            if (((i & 1) == 1) && str.charAt(i) == '0') {
                count++;
            }
        }
        return Math.min(count, str.length() - count);
    }

    @Test
    public void test1() {
        assertEquals(4, minSwaps("010010111"));
    }

    @Test
    public void test2() {
        assertEquals(0, minSwaps("010101010"));
    }

    @Test
    public void test3() {
        assertEquals(1, minSwaps("101010100"));
    }

    @Test
    public void test4() {
        assertEquals(2, minSwaps("101010000"));
    }

    @Test
    public void test5() {
        assertEquals(3, minSwaps("101000000"));
    }

    @Test
    public void test6() {
        assertEquals(1, minSwaps("10001"));
    }

    @Test
    public void test7() {
        assertEquals(2, minSwaps("10010"));
    }

}
