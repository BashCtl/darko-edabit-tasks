package very_hard;

import java.util.Arrays;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/*
Find Greatest Common Divisor of N Numbers

Create a function that takes an array of numbers and returns the greatest common factor of those numbers.

Examples
gcd({84, 70, 42, 56}) ➞ 14

gcd({19, 38, 76, 133}) ➞ 19

gcd({120, 300, 95, 425, 625}) ➞ 5
Notes
The GCD is the largest factor that divides all numbers in the array.

 */
public class FindGreatestCommonDivisorOfNumbers {

    private static int gcdTwo(int a, int b){
        while(b>0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static int gcd(int[] arr){
       return Arrays.stream(arr).reduce(0, (a,b) -> gcdTwo(a,b));
    }

    @Test
    public void test1() {
        assertEquals(gcd(new int[]{84, 70, 42, 56}), 14);
    }
    @Test
    public void test2() {
        assertEquals(gcd(new int[]{19, 38, 76, 133}), 19);
    }
    @Test
    public void test3() {
        assertEquals(gcd(new int[]{120, 300, 95, 425, 625}), 5);
    }
    @Test
    public void test4() {
        assertEquals(gcd(new int[]{6, 18}), 6);
    }
    @Test
    public void test5() {
        assertEquals(gcd(new int[]{5, 15}), 5);
    }
    @Test
    public void test6() {
        assertEquals(gcd(new int[]{120, 105, 300, 95, 425, 625, 18}), 1);
    }
}
