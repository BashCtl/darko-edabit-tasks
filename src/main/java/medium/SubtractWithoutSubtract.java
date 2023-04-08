package medium;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SubtractWithoutSubtract {

    public static int mySub(int a, int b) {
        if (b == 0)
            return Math.abs(a);
        return mySub(a ^ b, (~a & b) << 1);
    }

    @Test
    public void test1() {
        assertEquals(4, mySub(5, 9));
    }

    @Test
    public void test2() {
        assertEquals(20, mySub(10, 30));
    }

    @Test
    public void test3() {
        assertEquals(0, mySub(0, 0));
    }
}
