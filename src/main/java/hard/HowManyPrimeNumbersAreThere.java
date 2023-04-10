package hard;

import org.testng.annotations.Test;

import java.util.stream.IntStream;

import static org.testng.Assert.assertEquals;

public class HowManyPrimeNumbersAreThere {

    public static int primeNumbers(int num) {
        return (int) IntStream.rangeClosed(2, num)
                .filter(n -> isPrime(n)).count();
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void test1() {
        assertEquals(8, primeNumbers(20));
    }

    @Test
    public void test2() {
        assertEquals(10, primeNumbers(30));
    }

    @Test
    public void test3() {
        assertEquals(25, primeNumbers(100));
    }

    @Test
    public void test4() {
        assertEquals(46, primeNumbers(200));
    }

    @Test
    public void test5() {
        assertEquals(168, primeNumbers(1000));
    }

    @Test
    public void test6() {
        assertEquals(0, primeNumbers(-5));
    }

    @Test
    public void test7() {
        assertEquals(18, primeNumbers(66));
    }

    @Test
    public void test8() {
        assertEquals(32, primeNumbers(133));
    }

    @Test
    public void test9() {
        assertEquals(25, primeNumbers(99));
    }

}
