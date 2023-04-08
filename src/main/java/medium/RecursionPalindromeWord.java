package medium;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RecursionPalindromeWord {

    public static boolean isPalindrome(String wrd) {
        if (wrd.length() == 0 || wrd.length() == 1) {
            return true;
        }
        if (wrd.charAt(0) == wrd.charAt(wrd.length() - 1)) {
            return isPalindrome(wrd.substring(1, wrd.length() - 1));
        }
        return false;
    }

    private String[] strVector = new String[] {"rascal", "racecar", "madam", "adieu", "radar", "rotor", "abacus", "rotator", "scholars"};
    private boolean[] resVector = new boolean[] {false, true, true, false, true, true, false, true, false};

    @Test
    public void test01() {
        assertEquals(isPalindrome(strVector[0]), resVector[0]);
    }

    @Test
    public void test02() {
        assertEquals(isPalindrome(strVector[1]), resVector[1]);
    }

    @Test
    public void test03() {
        assertEquals(isPalindrome(strVector[2]), resVector[2]);
    }

    @Test
    public void test04() {
        assertEquals(isPalindrome(strVector[3]), resVector[3]);
    }

    @Test
    public void test05() {
        assertEquals(isPalindrome(strVector[4]), resVector[4]);
    }

    @Test
    public void test06() {
        assertEquals(isPalindrome(strVector[5]), resVector[5]);
    }

    @Test
    public void test07() {
        assertEquals(isPalindrome(strVector[6]), resVector[6]);
    }

    @Test
    public void test08() {
        assertEquals(isPalindrome(strVector[7]), resVector[7]);
    }

    @Test
    public void test09() {
        assertEquals(isPalindrome(strVector[8]), resVector[8]);
    }

}
