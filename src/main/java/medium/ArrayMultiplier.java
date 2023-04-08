package medium;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class ArrayMultiplier {

    public static Object[][] multiply(Object[] items) {
        int length = items.length;
        Object[][] result = new Object[length][];
        for (int i = 0; i < length; i++) {
            Object[] temp = new Object[length];
            Arrays.fill(temp, items[i]);
            result[i] = temp;
        }
        return result;
    }


    @Test
    public void test01() {
        assertArrayEquals(new Object[][]{{12, 12, 12}, {13, 13, 13}, {"TT", "TT", "TT"}}, multiply(new Object[]{12, 13, "TT"}));
    }

    @Test
    public void test02() {
        assertArrayEquals(new Object[][]{{12, 12, 12}, {17, 17, 17}, {"DX", "DX", "DX"}}, multiply(new Object[]{12, 17, "DX"}));
    }

    @Test
    public void test03() {
        assertArrayEquals(new Object[][]{{"d", "d", "d"}, {"x", "x", "x"}, {"t", "t", "t"}}, multiply(new Object[]{"d", "x", "t"}));
    }

    @Test
    public void test04() {
        assertArrayEquals(new Object[][]{{"T", "T", "T", "T", "T"}, {"E", "E", "E", "E", "E"}, {"S", "S", "S", "S", "S"}, {"H", "H", "H", "H", "H"}, {"A", "A", "A", "A", "A"}}, multiply(new Object[]{"T", "E", "S", "H", "A"}));
    }

    @Test
    public void test05() {
        assertArrayEquals(new Object[][]{{"A", "A", "A", "A", "A"}, {"B", "B", "B", "B", "B"}, {"C", "C", "C", "C", "C"}, {"D", "D", "D", "D", "D"}, {"E", "E", "E", "E", "E"}}, multiply(new Object[]{"A", "B", "C", "D", "E"}));
    }

    @Test
    public void test06() {
        assertArrayEquals(new Object[][]{{1}}, multiply(new Object[]{1}));
    }

    @Test
    public void test07() {
        assertArrayEquals(new Object[][]{{1, 1}, {0, 0}}, multiply(new Object[]{1, 0}));
    }

    @Test
    public void test08() {
        assertArrayEquals(new Object[][]{{"*", "*", "*"}, {"%", "%", "%"}, {"$", "$", "$"}}, multiply(new Object[]{"*", "%", "$"}));
    }

    @Test
    public void test09() {
        assertArrayEquals(new Object[][]{{4, 4}, {5, 5}}, multiply(new Object[]{4, 5}));
    }

}
