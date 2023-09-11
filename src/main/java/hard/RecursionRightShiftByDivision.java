package hard;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecursionRightShiftByDivision {

    public static int shiftToRight(double x, double y){
        if (y==0){
            return (int) Math.floor(x);
        }
        return shiftToRight(x/2.0 ,--y);
    }

//    public static void main(String[] args) {
//        System.out.println(shiftToRight(80,3));
//        System.out.println(shiftToRight(-5,1));
//    }

    private int[][] numVector = new int[][] {{80, 3}, {-24, 2}, {-5, 1}, {38, 0}, {192, 4}, {4666, 6}, {3777, 6}, {1024, 5}, {-512, 10}};
    private int[] resVector = new int[] {10, -6, -3, 38, 12, 72, 59, 32, -1};

    @Test
    public void test01() {
        assertEquals(shiftToRight(numVector[0][0], numVector[0][1]), resVector[0]);
    }

    @Test
    public void test02() {
        assertEquals(shiftToRight(numVector[1][0], numVector[1][1]), resVector[1]);
    }

    @Test
    public void test03() {
        assertEquals(shiftToRight(numVector[2][0], numVector[2][1]), resVector[2]);
    }

    @Test
    public void test04() {
        assertEquals(shiftToRight(numVector[3][0], numVector[3][1]), resVector[3]);
    }

    @Test
    public void test05() {
        assertEquals(shiftToRight(numVector[4][0], numVector[4][1]), resVector[4]);
    }

    @Test
    public void test06() {
        assertEquals(shiftToRight(numVector[5][0], numVector[5][1]), resVector[5]);
    }

    @Test
    public void test07() {
        assertEquals(shiftToRight(numVector[6][0], numVector[6][1]), resVector[6]);
    }

    @Test
    public void test08() {
        assertEquals(shiftToRight(numVector[7][0], numVector[7][1]), resVector[7]);
    }

    @Test
    public void test09() {
        assertEquals(shiftToRight(numVector[8][0], numVector[8][1]), resVector[8]);
    }
    
}
