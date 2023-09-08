package hard;

import org.junit.Test;

import java.util.Arrays;

import static org.testng.AssertJUnit.assertEquals;

public class FindTheLCMofThreeNumbers {

    public static int lcmOfThree(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int result = max;
        while (true) {
            if (result % arr[0] == 0 && result % arr[1]==0 && result % arr[2] == 0){
                return result;
            }
            result++;
        }
    }

    @Test
    public void test01() {
        assertEquals(60, lcmOfThree(new int[] {4, 5, 6}));
    }

    @Test
    public void test02() {
        assertEquals(690, lcmOfThree(new int[] {6, 5, 46}));
    }

    @Test
    public void test03() {
        assertEquals(54, lcmOfThree(new int[] {9, 18, 27}));
    }

    @Test
    public void test04() {
        assertEquals(46, lcmOfThree(new int[] {2, 46, 23}));
    }

    @Test
    public void test05() {
        assertEquals(455, lcmOfThree(new int[] {5, 7, 13}));
    }

    @Test
    public void test06() {
        assertEquals(1168440, lcmOfThree(new int[] {104, 105, 107}));
    }

    @Test
    public void test07() {
        assertEquals(38399, lcmOfThree(new int[] {19, 47, 43}));
    }

    @Test
    public void test08() {
        assertEquals(12, lcmOfThree(new int[] {3, 4, 12}));
    }

    @Test
    public void test09() {
        assertEquals(1392, lcmOfThree(new int[] {6, 16, 348}));
    }

    @Test
    public void test10() {
        assertEquals(3007291, lcmOfThree(new int[] {97, 103, 301}));
    }

    @Test
    public void test11() {
        assertEquals(29109409, lcmOfThree(new int[] {97, 997, 301}));
    }
    

}
