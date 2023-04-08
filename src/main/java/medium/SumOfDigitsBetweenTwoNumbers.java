package medium;

import org.testng.annotations.Test;

import java.util.stream.IntStream;

import static org.testng.Assert.assertEquals;

public class SumOfDigitsBetweenTwoNumbers {

    public static int sumDigits(int a, int b) {
        return IntStream.range(a, ++b)
                .map(n -> sumNum(n))
                .sum();
    }

    public static int sumNum(int n){
        if(n==0){
            return 0;
        }
        return n%10 + sumNum(n/10);
    }

    @Test
    public void test1() {
        assertEquals(15, sumDigits(7, 8));
    }

    @Test
    public void test2() {
        assertEquals(29, sumDigits(17, 20));
    }

    @Test
    public void test3() {
        assertEquals(6, sumDigits(10, 12));
    }

    @Test
    public void test4() {
        assertEquals(56, sumDigits(500, 506));
    }

    @Test
    public void test5() {
        assertEquals(9324, sumDigits(66, 789));
    }
}
