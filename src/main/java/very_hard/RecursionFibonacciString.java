package very_hard;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
Recursion: Fibonacci String


A Fibonacci string is a precedence of the Fibonacci series.
It works with any two characters of the English alphabet
(as opposed to the numbers 0 and 1 in the Fibonacci series)
as its initial items and concatenates them together
as it progresses similarly to that of the Fibonacci series.

Examples
generate(3, ["j", "h"]) ➞ "j, h, hj"

generate(5, ["e", "a"]) ➞ "e, a, ae, aea, aeaae"

generate(6, ["n", "k"]) ➞ "n, k, kn, knk, knkkn, knkknknk"

generate(1, ["f", "g"]) ➞ "invalid"
// return "invalid" if n is less than 2

Notes
You are expected to solve this challenge via recursion

 */
public class RecursionFibonacciString {


    public static String generate(int n, String[] s) {
        if (n < 2 && s.length == 2) {
            return "invalid";
        }
        if (s.length == 2) {
            s = Arrays.copyOf(s, n);
            n -= 2;
        }
        if (n == 0) {
            return String.join(", ", s);
        }
        s[s.length - n] = s[s.length - n - 1] + s[s.length - n - 2];
        return generate(--n, s);

    }

    @Test
    public void test01() {
        assertEquals("j, h, hj", generate(3, new String[]{"j", "h"}));
    }

    @Test
    public void test02() {
        assertEquals("e, a, ae, aea, aeaae", generate(5, new String[]{"e", "a"}));
    }

    @Test
    public void test03() {
        assertEquals("n, k, kn, knk, knkkn, knkknknk", generate(6, new String[]{"n", "k"}));
    }

    @Test
    public void test04() {
        assertEquals("f, c, cf, cfc, cfccf, cfccfcfc, cfccfcfccfccf", generate(7, new String[]{"f", "c"}));
    }

    @Test
    public void test05() {
        assertEquals("b, a, ab, aba, abaab, abaababa, abaababaabaab, abaababaabaababaababa, abaababaabaababaababaabaababaabaab", generate(9, new String[]{"b", "a"}));
    }

    @Test
    public void test06() {
        assertEquals("z, x, xz, xzx, xzxxz, xzxxzxzx, xzxxzxzxxzxxz, xzxxzxzxxzxxzxzxxzxzx, xzxxzxzxxzxxzxzxxzxzxxzxxzxzxxzxxz, xzxxzxzxxzxxzxzxxzxzxxzxxzxzxxzxxzxzxxzxzxxzxxzxzxxzxzx, xzxxzxzxxzxxzxzxxzxzxxzxxzxzxxzxxzxzxxzxzxxzxxzxzxxzxzxxzxxzxzxxzxxzxzxxzxzxxzxxzxzxxzxxz", generate(11, new String[]{"z", "x"}));
    }

    @Test
    public void test07() {
        assertEquals("t, d, dt, dtd, dtddt, dtddtdtd, dtddtdtddtddt, dtddtdtddtddtdtddtdtd, dtddtdtddtddtdtddtdtddtddtdtddtddt, dtddtdtddtddtdtddtdtddtddtdtddtddtdtddtdtddtddtdtddtdtd, dtddtdtddtddtdtddtdtddtddtdtddtddtdtddtdtddtddtdtddtdtddtddtdtddtddtdtddtdtddtddtdtddtddt, dtddtdtddtddtdtddtdtddtddtdtddtddtdtddtdtddtddtdtddtdtddtddtdtddtddtdtddtdtddtddtdtddtddtdtddtdtddtddtdtddtdtddtddtdtddtddtdtddtdtddtddtdtddtdtd", generate(12, new String[]{"t", "d"}));
    }

    @Test
    public void test08() {
        assertEquals("x, t, tx, txt", generate(4, new String[]{"x", "t"}));
    }
}
