package medium;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Decimator {

    public static String decimator(String s){
        int decimator = (int) Math.ceil(s.length()/10.0);
        return s.substring(0, s.length()-decimator);
    }

    @Test
    public void test1() {
       assertEquals(decimator("1234567890"), "123456789");
    }

    @Test
    public void test2() {
       assertEquals(decimator("1234567890AB"), "1234567890");
    }

    @Test
    public void test3() {
       assertEquals(decimator("123"), "12");
    }

    @Test
    public void test4() {
       assertEquals(decimator("123456789012345678901"), "123456789012345678");
    }

    @Test
    public void test5() {
       assertEquals(decimator("ABCDEFGHIJKLMNOPQRSTUVWXYZ"), "ABCDEFGHIJKLMNOPQRSTUVW");
    }

    @Test
    public void test6() {
       assertEquals(decimator("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"), "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrst");
    }

    @Test
    public void test7() {
       assertEquals(decimator("A"), "");
    }

    @Test
    public void test8() {
       assertEquals(decimator(""), "");
    }
}
