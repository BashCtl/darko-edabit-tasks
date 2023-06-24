package hard;

import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class PowerfulNumbers {

    public static boolean isPowerful(int num) {
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                if (num % (i * i) != 0 && num%i==0) {
                    return false;
                }
            }
        }
        return true;
    }



    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void test1() {
        assertEquals(true, isPowerful(36));
    }

    @Test
    public void test2() {
        assertEquals(true, isPowerful(27));
    }

    @Test
    public void test3() {
        assertEquals(true, isPowerful(32));
    }

    @Test
    public void test4() {
        assertEquals(true, isPowerful(72));
    }

    @Test
    public void test5() {
        assertEquals(true, isPowerful(243));
    }

    @Test
    public void test6() {
        assertEquals(true, isPowerful(968));
    }

    @Test
    public void test7() {
        assertEquals(false, isPowerful(951));
    }

    @Test
    public void test8() {
        assertEquals(true, isPowerful(144));
    }

    @Test
    public void test9() {
        assertEquals(false, isPowerful(674));
    }

    @Test
    public void test10() {
        assertEquals(false, isPowerful(600));
    }

    @Test
    public void test11() {
        assertEquals(true, isPowerful(500));
    }

    @Test
    public void test12() {
        assertEquals(false, isPowerful(320));
    }

    @Test
    public void test13() {
        assertEquals(false, isPowerful(720));
    }

}
