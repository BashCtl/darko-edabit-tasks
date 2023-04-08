package medium;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class SevenBoom {

    public static String sevenBoom(int[] arr) {
        boolean isSeven = Arrays.stream(arr)
                .mapToObj(String::valueOf)
                .anyMatch(x -> x.contains("7"));
        return isSeven ? "Boom!" : "there is no 7 in the array";
    }

    @Test
    public void test1() {
        assertEquals("Boom!", sevenBoom(new int[]{2, 6, 7, 9, 3}));
    }

    @Test
    public void test2() {
        assertEquals("there is no 7 in the array", sevenBoom(new int[]{33, 68, 400, 5}));
    }

    @Test
    public void test3() {
        assertEquals("there is no 7 in the array", sevenBoom(new int[]{86, 48, 100, 66}));
    }

    @Test
    public void test4() {
        assertEquals("Boom!", sevenBoom(new int[]{76, 55, 44, 32}));
    }

    @Test
    public void test5() {
        assertEquals("Boom!", sevenBoom(new int[]{35, 4, 9, 37}));
    }

}
