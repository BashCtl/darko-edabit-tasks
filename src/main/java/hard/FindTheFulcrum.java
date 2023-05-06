package hard;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.AssertJUnit.assertEquals;

public class FindTheFulcrum {

    public static int findFulcrum(int[] arr) {

        for (int i = 1; i < arr.length - 1; i++) {
            int left = Arrays.stream(subArray(arr, 0, i)).sum();
            int right = Arrays.stream(subArray(arr, i + 1, arr.length)).sum();
            if (left == right) {
                return arr[i];
            }
        }
        return -1;
    }

    public static int[] subArray(int[] arr, int beg, int end) {
        return Arrays.copyOfRange(arr, beg, end);
    }

//    public static void main(String[] args) {
//        System.out.println(findFulcrum(new int[]{3, 1, 5, 2, 4, 6, -1}));
//    }

    @Test
    public void test01() {
        assertEquals(2, findFulcrum(new int[] {3, 1, 5, 2, 4, 6,-1}));
    }

    @Test
    public void test02() {
        assertEquals(4, findFulcrum(new int[] {1, 2, 4, 9, 10,-10,-9, 3}));
    }

    @Test
    public void test03() {
        assertEquals(1, findFulcrum(new int[] {9, 1, 9}));
    }

    @Test
    public void test04() {
        assertEquals(0, findFulcrum(new int[] {7,-1, 0,-1, 1, 1, 2, 3}));
    }

    @Test
    public void test05() {
        assertEquals(-1, findFulcrum(new int[] {8, 8, 8, 8}));
    }

    @Test
    public void test06() {
        assertEquals(-1, findFulcrum(new int[] {9, 3, 4, 8, 1}));
    }

    @Test
    public void test07() {
        assertEquals(10, findFulcrum(new int[] {1,-1, 10, 5,-4,-1}));
    }

    @Test
    public void test08() {
        assertEquals(-1, findFulcrum(new int[] {5, 4, 4, 4, 6, 6, 6}));
    }

    @Test
    public void test09() {
        assertEquals(5, findFulcrum(new int[] {1, 4, 3, 5, 4, 4}));
    }

    @Test
    public void test10() {
        assertEquals(6, findFulcrum(new int[] {4, 6, 6, 1, 5, 4}));
    }


}
