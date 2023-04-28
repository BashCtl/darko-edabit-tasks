package medium;

import org.testng.annotations.Test;

import java.util.stream.IntStream;

import static org.testng.Assert.assertEquals;

public class GCDandLCM {
    public static int gcd(int a, int b){
        return  IntStream.rangeClosed(1,Math.min(a, b))
                .filter(n-> a%n==0&&b%n==0)
                .boxed()
                .mapToInt(Integer::valueOf)
                .max().getAsInt();
    }

    @Test
    public void test1() {
        assertEquals(2, gcd(6, 10));
    }

    @Test
    public void test2() {
        assertEquals(17, gcd(17, 85));
    }

    @Test
    public void test3() {
        assertEquals(9, gcd(18, 153));
    }

    @Test
    public void test4() {
        assertEquals(14, gcd(14, 14));
    }

    @Test
    public void test5() {
        assertEquals(1, gcd(6, 31));
    }
}
