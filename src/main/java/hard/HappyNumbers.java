package hard;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class HappyNumbers {

    public static boolean happy(int num) {
        int temp = num;
        int summed = 0;
        while (summed != 4) {
            summed = Arrays.stream(String.valueOf(temp).split(""))
                    .mapToInt(n -> (int) Math.pow(Integer.valueOf(n), 2))
                    .sum();
            if (summed == 1) {
                return true;
            }
            temp=summed;
        }
        return false;
    }

    @Test
    public void test1() {
        assertEquals(true, happy(100));
    }

    @Test
    public void test2() {
        assertEquals(false, happy(101));
    }

    @Test
    public void test3() {
        assertEquals(false, happy(102));
    }

    @Test
    public void test4() {
        assertEquals(true, happy(103));
    }

    @Test
    public void test5() {
        assertEquals(false, happy(104));
    }

    @Test
    public void test6() {
        assertEquals(false, happy(105));
    }

    @Test
    public void test7() {
        assertEquals(false, happy(106));
    }

    @Test
    public void test8() {
        assertEquals(false, happy(107));
    }

    @Test
    public void test9() {
        assertEquals(false, happy(108));
    }

    @Test
    public void test10() {
        assertEquals(true, happy(109));
    }

    @Test
    public void test11() {
        assertEquals(false, happy(110));
    }

}
