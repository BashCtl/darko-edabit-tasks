package very_hard;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/*
Maximize the First Number

Write a function that makes the first number as large
as possible by swapping out its digits for digits in the second number.

To illustrate:

maxPossible(9328, 456) ➞ 9658
// 9658 is the largest possible number built from swaps from 456.
// 3 replaced with 6 and 2 replaced with 5.
Examples
maxPossible(523, 76) ➞ 763

maxPossible(9132, 5564) ➞ 9655

maxPossible(8732, 91255) ➞ 9755
Notes
Each digit in the second number can only be used once.
Zero to all digits in the second number may be used.


 */


public class MaximizeFirstNumber {

    public static int maxPossible(int n1, int n2) {
        List<Integer> numbers1 = Arrays.stream(String.valueOf(n1).split(""))
                .mapToInt(Integer::valueOf)
                .boxed().collect(Collectors.toList());
        List<Integer> numbers2 = Arrays.stream(String.valueOf(n2).split(""))
                .mapToInt(Integer::valueOf)
                .boxed().sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        for(Integer num2: numbers2){
            for (int i =0;i<numbers1.size();i++){
                if(numbers1.get(i)<num2){
                    numbers1.set(i, num2);
                    break;
                }
            }
        }
        return Integer.parseInt(numbers1.stream().map(String::valueOf).collect(Collectors.joining()));
    }

    @Test
    public void test1() {
        assertEquals(9658, maxPossible(9328, 456));
    }

    @Test
    public void test2() {
        assertEquals(763, maxPossible(523, 76));
    }

    @Test
    public void test3() {
        assertEquals(9655, maxPossible(9132, 5564));
    }

    @Test
    public void test4() {
        assertEquals(9755, maxPossible(8732, 91255));
    }

    @Test
    public void test5() {
        assertEquals(789, maxPossible(589, 777));
    }

    @Test
    public void test6() {
        assertEquals(1, maxPossible(1, 0));
    }

    @Test
    public void test7() {
        assertEquals(9, maxPossible(8, 9));
    }

    @Test
    public void test8() {
        assertEquals(98, maxPossible(28, 19));
    }

    @Test
    public void test9() {
        assertEquals(42345, maxPossible(12345, 4));
    }
}
