package hard;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

/*
The Humble Sequence of the Modest Numbers

In this challenge, you have to establish if a positive integer
is a Modest number, accordingly to the following algorithm:

Divide the number into two left and right partitions.
For each combination of left and right parts, you have to check
if a condition is true: the remainder of the number divided by the right part is equal to the left part.
If at least a combination of two parts satisfies the above condition, the number is Modest, otherwise, it's not.
Given an integer num, implement a function that returns true if num is a Modest number, or false if it's not.

Example #1
isModest(2036) ➞ true

Combination 1:
Left = 2 | Right = 036 = 36 (Leading zeros are not considered)
Number (2036) % Right (36) =  20 != Left (2)

Combination 2:
Left = 20 | Right = 36
Number (2036) % Right (36) = 20 = Left (20)

// At least a combination satisfies the condition
// It's a Modest number
Example #2
isModest(3412) ➞ false

Combination 1:
Left = 3 | Right = 412
3412 % 412 = 116 != Left

Combination 2:
Left = 34 | Right = 12
3412 % 12 = 4 != Left

Combination 3:
Left = 341 | Right = 2
3412 % 2 = 0 != Left

// It's not a Modest number
// Notice how left and right parts are made:
// They are not permutations or combinations...
// ...but partitions of consecutive digits.
Example #3
isModest(21333) ➞ true

Combination 1:
Left = 2 | Right = 1333
21333 % 1333 = 5 != Left

Combination 2:
Left = 21 | Right = 333
21333 % 333 = 21 = Left

// At least a combination satisfies the condition
// It's a Modest number
Example #4
isModest(8) ➞ false
// An integer with less than two digits can't be partitioned.

Notes
In the right part, leading zeros are not considered (see example #1).
Remember to not confuse partitions with permutations or combinations.
In the Instructions, "combination" is related to a combination
of the left and the right part containing consecutive digits
(see example #2, where is reported each combination of possible partitions).
Trivially, every positive integer lower than 10 can't be partitioned
into two parts and it's not a Modest number (see example #4).

 */
public class HumbleSequenceOfModestNumbers {

    public static boolean isModest(int num) {
        String strNum = String.valueOf(num);
        return IntStream.range(1, strNum.length())
                .anyMatch(i -> Integer.parseInt(strNum.substring(i)) != 0
                        && num % Integer.parseInt(strNum.substring(i)) == Integer.parseInt(strNum.substring(0, i)));

    }


    @Test
    public void test1() {
        assertEquals(true, isModest(2036));
    }

    @Test
    public void test2() {
        assertEquals(false, isModest(3412));
    }

    @Test
    public void test3() {
        assertEquals(true, isModest(21333));
    }

    @Test
    public void test4() {
        assertEquals(false, isModest(8));
    }

    @Test
    public void test5() {
        assertEquals(true, isModest(13));
    }

    @Test
    public void test6() {
        assertEquals(false, isModest(329));
    }

    @Test
    public void test7() {
        assertEquals(true, isModest(433));
    }

    @Test
    public void test8() {
        assertEquals(true, isModest(2037));
    }

    @Test
    public void test9() {
        assertEquals(false, isModest(2038));
    }

    @Test
    public void test10() {
        assertEquals(true, isModest(12036));
    }

    @Test
    public void test11() {
        assertEquals(false, isModest(20010));
    }

    @Test
    public void test12() {
        assertEquals(true, isModest(450810));
    }

    @Test
    public void test13() {
        assertEquals(false, isModest(4221344));
    }

    @Test
    public void test14() {
        assertEquals(true, isModest(9111111));
    }
}
