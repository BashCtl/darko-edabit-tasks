package medium;

import org.testng.annotations.Test;

import java.util.stream.IntStream;

import static org.testng.Assert.assertEquals;

public class CountPalindromeNumbersInRange {

    public static int countPalindromes(int num1, int num2) {
        return (int) IntStream.rangeClosed(num1, num2)
                .mapToObj(String::valueOf)
                .filter(x -> isPalindrome(x))
                .count();
    }

    public static boolean isPalindrome(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalindrome(str.substring(1, str.length() - 1));
        }
        return false;
    }

    @Test
    public void test1() {
        assertEquals(9, countPalindromes(1, 10));
    }

    @Test
    public void test2() {
        assertEquals(1, countPalindromes(555, 556));
    }

    @Test
    public void test3() {
        assertEquals(3, countPalindromes(878, 898));
    }

    @Test
    public void test4() {
        assertEquals(5, countPalindromes(8, 34));
    }

    @Test
    public void test5() {
        assertEquals(1, countPalindromes(1550, 1556));
    }

}
