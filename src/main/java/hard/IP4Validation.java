package hard;

import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;


public class IP4Validation {

    public static boolean isValidIP(String str) {
        Pattern pattern = Pattern.compile("^((25[0-5]|2[0-4][0-9]|[1]?[0-9][0-9]?)(\\.|$)){4}$");
        return pattern.matcher(str).find();
    }

    @Test
    public void test1() {
        System.out.println("This is a valid IPv4.");
        assertEquals(true,isValidIP("12.255.56.1"));
    }

    @Test
    public void test2() {
        System.out.println("This is a valid IPv4.");
        assertEquals(true,isValidIP("1.2.3.4"));
    }

    @Test
    public void test3() {
        System.out.println("IPv4 contain exactly four octets.");
        assertEquals(false,isValidIP("1.2.3"));
    }

    @Test
    public void test4() {
        System.out.println("IPv4 contain exactly four octets.");
        assertEquals(false,isValidIP("1.2.3.4.5"));
    }

    @Test
    public void test5() {
        System.out.println("This is a valid IPv4.");
        assertEquals(true,isValidIP("123.45.67.89"));
    }

    @Test
    public void test6() {
        System.out.println("Each octet must be a decimal value between 0 and 255.");
        assertEquals(false,isValidIP("123.456.78.90"));
    }

    @Test
    public void test7() {
        System.out.println("Each octet must be a decimal value between 0 and 255.");
        assertEquals(false,isValidIP("123.045.067.089"));
    }

    @Test
    public void test8() {
        System.out.println("An empty string is invalid.");
        assertEquals(false,isValidIP(""));
    }

    @Test
    public void test9() {
        System.out.println("This is not in dot decimal format.");
        assertEquals(false,isValidIP("abc.def.ghi.jkl"));
    }

    @Test
    public void test10() {
        System.out.println("Each octet must be a decimal value between 0 and 255.");
        assertEquals(false,isValidIP("123.456.789.0"));
    }

    @Test
    public void test11() {
        System.out.println("IPv4 contain exactly four octets.");
        assertEquals(false,isValidIP("12.34.56"));
    }

    @Test
    public void test12() {
        System.out.println("Check for spaces.");
        assertEquals(false,isValidIP("12.34.56 .1"));
    }

    @Test
    public void test13() {
        System.out.println("Check for invalid characters.");
        assertEquals(false,isValidIP("12.34.56.-1"));
    }

    @Test
    public void test14() {
        System.out.println("Each octet must be a decimal value between 0 and 255.");
        assertEquals(false,isValidIP("123.045.067.089"));
    }

    @Test
    public void test15() {
        System.out.println("This is a valid IPv4.");
        assertEquals(true,isValidIP("192.168.1.1"));
    }

    @Test
    public void test16() {
        System.out.println("IPs with trailing spaces are invalid.");
        assertEquals(false,isValidIP("192.168.1.1  "));
    }

    @Test
    public void test17() {
        System.out.println("IPs with leading spaces are invalid.");
        assertEquals(false,isValidIP("  192.168.1.1"));
    }

    @Test
    public void test18() {
        System.out.println("This is a valid IPv4.");
        assertEquals(true,isValidIP("0.232.47.227"));
    }

    @Test
    public void test19() {
        System.out.println("Each octet must be a decimal value between 0 and 255.");
        assertEquals(false,isValidIP("1e0.1e0.1e0.1e0"));
    }

}
