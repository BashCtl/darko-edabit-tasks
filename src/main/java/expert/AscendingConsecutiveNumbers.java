package expert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/*
Ascending Consecutive Numbers

Write a function that returns true if a string consists
of ascending or ascending AND consecutive numbers.

Examples
ascending("232425") ➞ true
// Consecutive numbers 23, 24, 25

ascending("2324256") ➞ false
// No matter how this string is divided, the numbers are not consecutive.

ascending("444445") ➞ true
// Consecutive numbers 444 and 445.

Notes
A number can consist of any number of digits, so long as the numbers
are adjacent to each other, and the string has at least two of them.

 */
public class AscendingConsecutiveNumbers {

    public static boolean ascending(String str) {

        for (int i = 1; i <= str.length() / 2; i++) {
            long firstNum = Long.parseLong(str.substring(0, i));
            long currentNum = firstNum;
            int j = i;

            while (j < str.length()) {
                long nextNum = currentNum + 1;
                String nextStr = String.valueOf(nextNum);

                if (j + nextStr.length() > str.length() || !str.substring(j, j + nextStr.length()).equals(nextStr))
                    break;
                currentNum = nextNum;
                j += nextStr.length();
            }

            if (j == str.length())
                return true;
        }
        return false;
    }

    @Test
    public void test1() {
        assertEquals(true,ascending("232425"));
    }

    @Test
    public void test2() {
        assertEquals(true,ascending("444445"));
    }

    @Test
    public void test3() {
        assertEquals(true,ascending("1234567"));
    }

    @Test
    public void test4() {
        assertEquals(true,ascending("123412351236"));
    }

    @Test
    public void test5() {
        assertEquals(true,ascending("57585960616263"));
    }

    @Test
    public void test6() {
        assertEquals(true,ascending("500001500002500003"));
    }

    @Test
    public void test7() {
        assertEquals(true,ascending("919920921"));
    }

    @Test
    public void test8() {
        assertEquals(false,ascending("2324256"));
    }

    @Test
    public void test9() {
        assertEquals(false,ascending("1235"));
    }

    @Test
    public void test10() {
        assertEquals(false,ascending("121316"));
    }

    @Test
    public void test11() {
        assertEquals(false,ascending("12131213"));
    }

    @Test
    public void test12() {
        assertEquals(false,ascending("54321"));
    }

    @Test
    public void test13() {
        assertEquals(false,ascending("56555453"));
    }

    @Test
    public void test14() {
        assertEquals(false,ascending("90090190290"));
    }

    @Test
    public void test15() {
        assertEquals(false,ascending("35236237238"));
    }

}
