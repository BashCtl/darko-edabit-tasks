package medium;

import org.testng.annotations.Test;

import java.util.regex.Pattern;

import static org.testng.Assert.assertEquals;

public class ValidatePin {

    public static boolean validate(String pin) {
        return Pattern.compile("^(\\d{4}|\\d{6}$)")
                .matcher(pin)
                .matches();
    }

    @Test
    public void test01() {
        assertEquals(true, validate("544466"));
    }

    @Test
    public void test02() {
        assertEquals(true, validate("121317"));
    }

    @Test
    public void test03() {
        assertEquals(false, validate("4512a5"));
    }

    @Test
    public void test04() {
        assertEquals(true, validate("123456"));
    }

    @Test
    public void test05() {
        assertEquals(false, validate(""));
    }

    @Test
    public void test06() {
        assertEquals(false, validate("21904"));
    }

    @Test
    public void test07() {
        assertEquals(true, validate("9451"));
    }

    @Test
    public void test08() {
        assertEquals(true, validate("213132"));
    }

    @Test
    public void test09() {
        assertEquals(false, validate(" 4520"));
    }

    @Test
    public void test10() {
        assertEquals(false, validate("15632 "));
    }

    @Test
    public void test11() {
        assertEquals(true, validate("000000"));
    }


}
