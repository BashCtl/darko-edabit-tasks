package hard;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BitwiseOperatorCheckOddRegularExpressionCheckEven {


    public static String isOdd(int number) {
        return (number & 1) != 0 ? "Yes" : "No";
    }

    public static String isEven(String number) {
        return number.matches("^-?\\d*[02468]$") ? "Yes" : "No";
    }

    @Test
    public void test01() {
        assertEquals("Yes", isOdd(-7));
    }

    @Test
    public void test02() {
        assertEquals("Yes", isOdd(-5));
    }

    @Test
    public void test03() {
        assertEquals("Yes", isOdd(17));
    }

    @Test
    public void test04() {
        assertEquals("No", isOdd(-6));
    }

    @Test
    public void test05() {
        assertEquals("No", isOdd(0));
    }

    @Test
    public void test06() {
        assertEquals("No", isEven("-7"));
    }

    @Test
    public void test07() {
        assertEquals("No", isEven("111"));
    }

    @Test
    public void test08() {
        assertEquals("Yes", isEven("0"));
    }

    @Test
    public void test09() {
        assertEquals("Yes", isEven("-12"));
    }

    @Test
    public void test10() {
        assertEquals("Yes", isEven("40"));
    }

}
