package very_hard;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
Bit Rotation

Java offers some bit operations but not bit rotation. To complete that, create a function that takes three parameters:

n: Integer, which in binary representaion should be rotated.
m: Number of rotation steps that should be performed.
d: Boolean value; true = rotation right, false = rotation left.
Your function should return an integer as a result of its rotated binary representation.

Examples
bitRotate(8, 1, true) ➞ 4
// 8 in bin: 1000, rotated 1 step to the right: 0100, in dec: 4

bitRotate(16, 1, false) ➞ 1
// 16 in bin: 10000, rotated 1 step to the left: 00001, in dec: 1

bitRotate(17, 2, false) ➞ 6
// 17 in bin: 10001, rotated 2 steps to the left: 00110, in dec: 6
Notes
For parameters use unsigned integers only.

 */

public class BitRotation {

    public static int bitRotate(int n, int m, boolean d) {
        String binaryString = Integer.toBinaryString(n);
        List<String> bits = Arrays.stream(binaryString.split(""))
                .collect(Collectors.toList());
        Collections.rotate(bits, d ? m : -m);
        String num = bits.stream().collect(Collectors.joining());

        return Integer.parseInt(num, 2);


    }


    @Test
    public void test1() {
        assertEquals(4, bitRotate(8, 1, true));
    }

    @Test
    public void test2() {
        assertEquals(4, bitRotate(16, 2, true));
    }

    @Test
    public void test3() {
        assertEquals(110, bitRotate(283, 7, true));
    }

    @Test
    public void test4() {
        assertEquals(1, bitRotate(16, 1, false));
    }

    @Test
    public void test5() {
        assertEquals(6, bitRotate(17, 2, false));
    }

    @Test
    public void test6() {
        assertEquals(122, bitRotate(122, 7, false));
    }

    @Test
    public void test7() {
        assertEquals(95, bitRotate(125, 10, true));
    }

    @Test
    public void test8() {
        assertEquals(767, bitRotate(1022, 8, false));
    }

    @Test
    public void test9() {
        assertEquals(33, bitRotate(33, 6, true));
    }
}
