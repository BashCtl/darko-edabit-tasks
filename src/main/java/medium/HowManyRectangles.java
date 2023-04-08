package medium;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HowManyRectangles {

    public static int rectangles(int step){
      return (int)  Math.pow((step*(step+1))/2,2);
    }

    @Test
    public void test1() {
        assertEquals(4326400, rectangles(64));
    }

    @Test
    public void test2() {
        assertEquals(8561476, rectangles(76));
    }

    @Test
    public void test3() {
        assertEquals(3025, rectangles(10));
    }

    @Test
    public void test4() {
        assertEquals(9985600, rectangles(79));
    }

    @Test
    public void test5() {
        assertEquals(12744900, rectangles(84));
    }

    @Test
    public void test6() {
        assertEquals(0, rectangles(0));
    }

    @Test
    public void test7() {
        assertEquals(3348900, rectangles(60));
    }

    @Test
    public void test8() {
        assertEquals(189225, rectangles(29));
    }

    @Test
    public void test9() {
        assertEquals(29241, rectangles(18));
    }

    @Test
    public void test10() {
        assertEquals(7700625, rectangles(74));
    }

    @Test
    public void test11() {
        assertEquals(18496, rectangles(16));
    }

    @Test
    public void test12() {
        assertEquals(4326400, rectangles(64));
    }

}
