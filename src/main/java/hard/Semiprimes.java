package hard;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Semiprimes {

    public static String semiprime(int n) {

        int root = (int) Math.sqrt(n);
        if (root * root == n && isPrime(root)) {
            return "Semiprime";
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                int quotient = n / i;
                if (isPrime(i) && isPrime(quotient)) {
                    return "Squarefree Semiprime";
                }
            }
        }

        return "Neither";
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

//    public static void main(String[] args) {
//        System.out.println(semiprime(19));
//    }

    @Test
    public void test1() {
        assertEquals("Semiprime", semiprime(49));
    }

    @Test
    public void test2() {
        assertEquals("Squarefree Semiprime", semiprime(15));
    }

    @Test
    public void test3() {
        assertEquals("Neither", semiprime(19));
    }

    @Test
    public void test4() {
        assertEquals("Neither", semiprime(75));
    }

    @Test
    public void test5() {
        assertEquals("Semiprime", semiprime(169));
    }

    @Test
    public void test6() {
        assertEquals("Squarefree Semiprime", semiprime(203));
    }

    @Test
    public void test7() {
        assertEquals("Squarefree Semiprime", semiprime(177));
    }

    @Test
    public void test8() {
        assertEquals("Neither", semiprime(125));
    }

    @Test
    public void test9() {
        assertEquals("Neither", semiprime(70));
    }

}
