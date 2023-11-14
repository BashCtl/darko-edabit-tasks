package very_hard;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.Arrays;

/*
LCM of More Than Three Numbers

Create a function that takes an array of more than three numbers and returns the Least Common Multiple (LCM).

Examples
lcmOfArray([5, 4, 6, 46, 54, 12, 13, 17]) ➞ 2744820

lcmOfArray([46, 54, 466, 544]) ➞ 78712992

lcmOfArray([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) ➞ 2520

lcmOfArray([13, 6, 17, 18, 19, 20, 37]) ➞ 27965340

Notes
The LCM of an array of numbers is the smallest positive number that is divisible by each of the numbers in the array.

 */

public class LCMMoreThanThreeNumbers {

    private static int gcd(int a, int b){
        while(b>0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

    private static int lcm(int a, int b){
        return (a*b)/gcd(a, b);

    }
    public static int lcmOfArray(int[] arr){
        Arrays.sort(arr);
        int reduce = Arrays.stream(arr).reduce(1, LCMMoreThanThreeNumbers::lcm);
        return reduce;
    }


    @Test
    public void test01() {
        assertEquals(2520,lcmOfArray(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }

    @Test
    public void test02() {
        assertEquals(27965340,lcmOfArray(new int[] {13, 6, 17, 18, 19, 20, 37}));
    }

    @Test
    public void test03() {
        assertEquals(2333760,lcmOfArray(new int[] {44, 64, 12, 17, 65}));
    }

    @Test
    public void test04() {
        assertEquals(2692800,lcmOfArray(new int[] {200, 30, 18, 11, 8, 64, 34}));
    }

    @Test
    public void test05() {
        assertEquals(2744820,lcmOfArray(new int[] {5, 4, 6, 46, 54, 12, 13, 17}));
    }

    @Test
    public void test06() {
        assertEquals(78712992,lcmOfArray(new int[] {46, 54, 466, 544}));
    }


}
