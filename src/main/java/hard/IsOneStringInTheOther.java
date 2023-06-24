package hard;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.testng.AssertJUnit.assertEquals;

public class IsOneStringInTheOther {
    public static boolean overlap(String str1, String str2) {
        if(str1.length()>str2.length()){
            String temp = str2;
            str2 = str1;
            str1 = temp;
        }
        String lower2 = str2.toLowerCase().substring(str2.length() - str1.length());
        String lower1 = str1.toLowerCase();
        return IntStream.range(0, lower1.length()).allMatch(i -> lower1.charAt(i) == lower2.charAt(i)
        || lower1.charAt(i)=='*'||lower2.charAt(i)=='*');
    }

    @Test
    public void test1() {
        assertEquals(true, overlap("ABC", "Ican'tsingmyABC"));
    }

    @Test
    public void test2() {
        assertEquals(true, overlap("abc", "Ican'tsingmyABC"));
    }

    @Test
    public void test3() {
        assertEquals(true, overlap("Ican'tsingmyABC", "abc"));
    }

    @Test
    public void test4() {
        assertEquals(true, overlap("*bc", "Ican'tsingmyABC"));
    }

    @Test
    public void test5() {
        assertEquals(true, overlap("abc", "Ican'tsingmy***"));
    }

    @Test
    public void test6() {
        assertEquals(false, overlap("ab", "Ican'tsingmy**c"));
    }

    @Test
    public void test7() {
        assertEquals(false, overlap("hello world", "hello"));
    }

    @Test
    public void test8() {
        assertEquals(true, overlap("+=", "this should work too +="));
    }

    @Test
    public void test9() {
        assertEquals(true, overlap("don't forget hyphens-", "-"));
    }

    @Test
    public void test10() {
        assertEquals(false, overlap("don't forget periods ", "."));
    }

    @Test
    public void test11() {
        assertEquals(true, overlap("this will always be true", "*"));
    }

    @Test
    public void test12() {
        assertEquals(false, overlap("this will always be false", "F"));
    }

    @Test
    public void test13() {
        assertEquals(true, overlap("hey", "*********"));
    }

    @Test
    public void test14() {
        assertEquals(true, overlap("a*c", "*b*"));
    }

    @Test
    public void test15() {
        assertEquals(true, overlap("last test", "congrats you passed the last test"));
    }

}
