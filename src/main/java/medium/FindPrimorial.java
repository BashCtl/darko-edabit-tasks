package medium;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FindPrimorial {

    public static int primorial(int n) {
        int start = 2;
        int prim = 1;
        while (n != 0) {
            if (isPrime(start)) {
                n--;
                prim *= start;
            }
            start++;
        }
        return prim;
    }



    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

//    public static void main(String[] args) {
//        System.out.println(isPrime(4));
//    }



    @Test
    public void test1() {
        assertEquals(2, primorial(1));
    }

    @Test
    public void test2() {
        assertEquals(6, primorial(2));
    }

    @Test
    public void test3() {
        assertEquals(30, primorial(3));
    }

    @Test
    public void test4() {
        assertEquals(9699690, primorial(8));
    }
}
