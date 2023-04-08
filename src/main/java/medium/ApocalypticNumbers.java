package medium;

import org.testng.annotations.Test;

import java.math.BigInteger;
import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class ApocalypticNumbers {

    public static String isApocalyptic(int number) {
        BigInteger pow = new BigInteger("2").pow(number);
        long count = Arrays.stream(pow.toString().split("[^6]"))
                .filter(x -> x.contains("666"))
                .count();
        if (count == 1) {
            return "Single";
        }
        if (count == 2) {
            return "Double";
        }
        if (count == 3) {
            return "Triple";
        }

        return "Safe";
    }

    @Test
    public void test1() {
        assertEquals("Safe", isApocalyptic(66));
    }

    @Test
    public void test2() {
        assertEquals("Single", isApocalyptic(157));
    }

    @Test
    public void test3() {
        assertEquals("Double", isApocalyptic(220));
    }

    @Test
    public void test4() {
        assertEquals("Triple", isApocalyptic(931));
    }

    @Test
    public void test5() {
        assertEquals("Safe", isApocalyptic(166));
    }

    @Test
    public void test6() {
        assertEquals("Double", isApocalyptic(529));
    }

    @Test
    public void test7() {
        assertEquals("Single", isApocalyptic(443));
    }

    @Test
    public void test8() {
        assertEquals("Safe", isApocalyptic(166));
    }

    @Test
    public void test9() {
        assertEquals("Safe", isApocalyptic(703));
    }

    @Test
    public void test10() {
        assertEquals("Single", isApocalyptic(528));
    }

    @Test
    public void test11() {
        assertEquals("Double", isApocalyptic(648));
    }
}
