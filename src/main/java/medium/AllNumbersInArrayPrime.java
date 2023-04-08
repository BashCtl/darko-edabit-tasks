package medium;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AllNumbersInArrayPrime {

    public static boolean allPrime(int[] arr) {
        for (int num : arr) {
            if (!isPrime(num)|| num==1) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(int x) {
        for (int i = 2; i < x / 2; ++i) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void test01() {
        assertEquals(false, allPrime(new int[] {7, 5, 2, 4, 6}));
    }

    @Test
    public void test02() {
        assertEquals(true, allPrime(new int[] {2, 3, 5, 7, 13, 17, 19, 23, 29}));
    }

    @Test
    public void test03() {
        assertEquals(false, allPrime(new int[] {1, 5, 3}));
    }

    @Test
    public void test04() {
        assertEquals(true, allPrime(new int[] {5, 3}));
    }

    @Test
    public void test05() {
        assertEquals(false, allPrime(new int[] {23, 53, 61, 73, 89, 91}));
    }

    @Test
    public void test06() {
        assertEquals(true, allPrime(new int[] {3, 5, 7, 11, 17, 19}));
    }

}
