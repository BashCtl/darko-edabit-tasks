package hard;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ClosestPalindromeNumber {

    public static int closestPalindrome(int num) {
        int next = num;
        int previous = num;
        if (String.valueOf(num).contentEquals(new StringBuilder(String.valueOf(num)).reverse())) {
            return num;
        }
        while (true) {
            next++;
            String nextStr = String.valueOf(next);
            if (nextStr.contentEquals(new StringBuilder(nextStr).reverse())) {
                break;
            }
        }
        while (true) {
            previous--;
            String previousStr = String.valueOf(previous);
            if (previousStr.contentEquals(new StringBuilder(previousStr).reverse())) {
                break;
            }
        }

        if (next - num < num - previous) {
            return next;
        } else if (next - num > num - previous) {
            return previous;
        }

        return previous;

    }

    @Test
    public void test1() {
        assertEquals(888, closestPalindrome(887));
    }

    @Test
    public void test2() {
        assertEquals(888, closestPalindrome(888));
    }

    @Test
    public void test3() {
        assertEquals(22, closestPalindrome(27));
    }

    @Test
    public void test4() {
        assertEquals(515, closestPalindrome(519));
    }

    @Test
    public void test5() {
        assertEquals(4884, closestPalindrome(4892));
    }

    @Test
    public void test6() {
        assertEquals(1, closestPalindrome(1));
    }

    @Test
    public void test7() {
        assertEquals(99, closestPalindrome(100));
    }

    @Test
    public void test8() {
        assertEquals(33333, closestPalindrome(33344));
    }

    @Test
    public void test9() {
        assertEquals(123321, closestPalindrome(123456));
    }

    @Test
    public void test10() {
        assertEquals(978212879, closestPalindrome(978215236));
    }


}
