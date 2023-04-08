package medium;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PalindromicDates {

    public static boolean palindromicDate(String date) {
        date = date.replace("/", "");
        String newFormat = date.substring(2, 4) + date.substring(0, 2) + date.substring(4);
        int halfLength = date.length() / 2;
        for (int i = 0; i < halfLength; i++) {
            if (date.charAt(i) != date.charAt(date.length() - i - 1)
                    || newFormat.charAt(i) != newFormat.charAt(newFormat.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void test1() {
        assertEquals(true, palindromicDate("02/02/2020"));
    }

    @Test
    public void test2() {
        assertEquals(false, palindromicDate("11/12/2019"));
    }

    @Test
    public void test3() {
        assertEquals(false, palindromicDate("11/02/2011"));
    }

    @Test
    public void test4() {
        assertEquals(false, palindromicDate("06/10/1469"));
    }

    @Test
    public void test5() {
        assertEquals(false, palindromicDate("06/05/3133"));
    }

    @Test
    public void test6() {
        assertEquals(true, palindromicDate("12/12/2121"));
    }

    @Test
    public void test7() {
        assertEquals(true, palindromicDate("09/09/9090"));
    }

    @Test
    public void test8() {
        assertEquals(false, palindromicDate("11/04/2203"));
    }

    @Test
    public void test9() {
        assertEquals(true, palindromicDate("07/07/7070"));
    }

    @Test
    public void test10() {
        assertEquals(false, palindromicDate("06/11/2923"));
    }

    @Test
    public void test11() {
        assertEquals(false, palindromicDate("03/08/8030"));
    }

    @Test
    public void test12() {
        assertEquals(true, palindromicDate("01/01/1010"));
    }

    @Test
    public void test13() {
        assertEquals(false, palindromicDate("03/11/3369"));
    }

    @Test
    public void test14() {
        assertEquals(false, palindromicDate("11/03/2775"));
    }

    @Test
    public void test15() {
        assertEquals(false, palindromicDate("03/03/1822"));
    }

}
