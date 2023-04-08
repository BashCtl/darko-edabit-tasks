package medium;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ReturnSumOfTwoNumbersOnMoon {

    public static int lunarSum(int number1, int number2) {
        String sMax = String.valueOf(Math.max(number1, number2));
        String sMin = String.valueOf(Math.min(number1, number2));
        int maxLength = sMax.length();
        int minLength = sMin.length();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < minLength; i++) {
            int maxNum = Integer.parseInt(String.valueOf(sMax.charAt(maxLength - 1 - i)));
            int minNum = Integer.parseInt(String.valueOf(sMin.charAt(minLength - 1 - i)));
            result.append(Math.max(maxNum, minNum));
        }
        result.reverse();
        return maxLength == minLength ? Integer.parseInt(result.toString())
                : Integer.parseInt(sMax.substring(0, maxLength - minLength) + result);
    }

    @Test
    public void test1() {
        assertEquals(347, lunarSum(246, 317));
    }

    @Test
    public void test2() {
        assertEquals(154, lunarSum(134, 54));
    }

    @Test
    public void test3() {
        assertEquals(140, lunarSum(20, 140));
    }

    @Test
    public void test4() {
        assertEquals(1, lunarSum(1, 1));
    }

    @Test
    public void test5() {
        assertEquals(198, lunarSum(198, 44));
    }

    @Test
    public void test6() {
        assertEquals(36696, lunarSum(36602, 696));
    }

    @Test
    public void test7() {
        assertEquals(8893, lunarSum(91, 8823));
    }

    @Test
    public void test8() {
        assertEquals(128, lunarSum(123, 8));
    }

    @Test
    public void test9() {
        assertEquals(98212289, lunarSum(2289, 98211285));
    }

    @Test
    public void test10() {
        assertEquals(19, lunarSum(9, 11));
    }

    @Test
    public void test11() {
        assertEquals(22, lunarSum(11, 22));
    }

}
