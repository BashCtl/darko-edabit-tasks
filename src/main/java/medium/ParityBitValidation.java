package medium;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class ParityBitValidation {

    public static boolean validateBinary(String bits) {
        return Arrays.stream(bits.split(""))
                .filter(x -> x.equals("1"))
                .count() % 2 == 0;
    }

    @Test
    public void test01() {
        assertEquals(true, validateBinary("00101101"));
    }

    @Test
    public void test02() {
        assertEquals(true, validateBinary("11000000"));
    }

    @Test
    public void test03() {
        assertEquals(false, validateBinary("11000001"));
    }

    @Test
    public void test04() {
        assertEquals(false, validateBinary("10010010"));
    }

    @Test
    public void test05() {
        assertEquals(false, validateBinary("10101101"));
    }

    @Test
    public void test06() {
        assertEquals(false, validateBinary("11000100"));
    }

    @Test
    public void test07() {
        assertEquals(true, validateBinary("11000101"));
    }

    @Test
    public void test08() {
        assertEquals(true, validateBinary("10010110"));
    }

    @Test
    public void test09() {
        assertEquals(false, validateBinary("10101101"));
    }

    @Test
    public void test10() {
        assertEquals(false, validateBinary("11001000"));
    }

    @Test
    public void test11() {
        assertEquals(true, validateBinary("11001001"));
    }

    @Test
    public void test12() {
        assertEquals(true, validateBinary("10011010"));
    }

}
