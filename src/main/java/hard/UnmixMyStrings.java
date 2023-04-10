package hard;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class UnmixMyStrings {

    public static String unmix(String str){
       return str.replaceAll("(.)(.)","$2$1");
    }

    @Test
    public void test1() {
        assertEquals("214365", unmix("123456"));
    }

    @Test
    public void test2() {
        assertEquals("This is a mixed up string.", unmix("hTsii  s aimex dpus rtni.g"));
    }

    @Test
    public void test3() {
        assertEquals("abcde", unmix("badce"));
    }

    @Test
    public void test4() {
        assertEquals("I am feeling a little dizzy!", unmix(" Imaf eeilgna l tilt eidzz!y"));
    }

    @Test
    public void test5() {
        System.out.println("Should work with empty strings as well.");
        assertEquals("", unmix(""));
    }

}
