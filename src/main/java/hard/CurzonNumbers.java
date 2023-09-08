package hard;

import org.junit.Test;

import java.math.BigInteger;

import static org.testng.AssertJUnit.assertEquals;

public class CurzonNumbers {

    public static boolean isCurzon(int n) {
        BigInteger num = BigInteger.valueOf(2);
        BigInteger nBig = BigInteger.valueOf(n);
        BigInteger powNum = (num.pow(n)).add(BigInteger.valueOf(1));
        BigInteger multiNum = (num.multiply(nBig)).add(BigInteger.valueOf(1));

        return powNum.mod(multiNum).equals(BigInteger.valueOf(0));
    }

//    public static void main(String[] args) {
//        System.out.println(isCurzon(5));
//    }

    @Test
    public void test01() {
        assertEquals(true, isCurzon(5));
    }

    @Test
    public void test02() {
        assertEquals(false, isCurzon(10));
    }

    @Test
    public void test03() {
        assertEquals(true, isCurzon(14));
    }

    @Test
    public void test04() {
        assertEquals(true, isCurzon(18));
    }

    @Test
    public void test05() {
        assertEquals(false, isCurzon(27));
    }

    @Test
    public void test06() {
        assertEquals(true, isCurzon(33));
    }

    @Test
    public void test07() {
        assertEquals(true, isCurzon(41));
    }

    @Test
    public void test08() {
        assertEquals(true, isCurzon(54));
    }

    @Test
    public void test09() {
        assertEquals(true, isCurzon(65));
    }

    @Test
    public void test10() {
        assertEquals(true, isCurzon(86));
    }

    @Test
    public void test11() {
        assertEquals(true, isCurzon(90));
    }

    @Test
    public void test12() {
        assertEquals(false, isCurzon(115));
    }

    @Test
    public void test13() {
        assertEquals(false, isCurzon(120));
    }

    @Test
    public void test14() {
        assertEquals(true, isCurzon(194));
    }

    @Test
    public void test15() {
        assertEquals(true, isCurzon(293));
    }

}
