package hard;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecursionMultiplicationByAddition {

    public static int multiply(int x, int y) {
        if (y == 0) {
            return y;
        }

        if (x < 0 && y < 0) {
            x = Math.abs(x);
        } else if (x > 0 && y < 0) {
            x *= -1;
        }
        y = Math.abs(y);

        return x + multiply(x, --y);
    }

//    public static void main(String[] args) {
//        System.out.println(multiply(10, 2));
//        System.out.println(multiply(-51, -4));
//        System.out.println(multiply(273, -6));
//    }


    private int[][] numVector = new int[][]{{10, 2}, {-51, -4}, {3, 9}, {-21, 5}, {1024, 7}, {273, -6}, {0, 4}};
    private int[] resVector = new int[]{20, 204, 27, -105, 7168, -1638, 0};

    @Test
    public void test01() {
        assertEquals(multiply(numVector[0][0], numVector[0][1]), resVector[0]);
    }

    @Test
    public void test02() {
        assertEquals(multiply(numVector[1][0], numVector[1][1]), resVector[1]);
    }

    @Test
    public void test03() {
        assertEquals(multiply(numVector[2][0], numVector[2][1]), resVector[2]);
    }

    @Test
    public void test04() {
        assertEquals(multiply(numVector[3][0], numVector[3][1]), resVector[3]);
    }

    @Test
    public void test05() {
        assertEquals(multiply(numVector[4][0], numVector[4][1]), resVector[4]);
    }

    @Test
    public void test06() {
        assertEquals(multiply(numVector[5][0], numVector[5][1]), resVector[5]);
    }

    @Test
    public void test07() {
        assertEquals(multiply(numVector[6][0], numVector[6][1]), resVector[6]);
    }

}
