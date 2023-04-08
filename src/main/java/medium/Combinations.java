package medium;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class Combinations {

    public static int combinations(int ...nums){
      return   Arrays.stream(nums).filter(x->x!=0)
                .reduce(1,(a,b)->a*b);
    }

    @Test
    public void test1() {
        assertEquals(2, combinations(2));
    }

    @Test
    public void test2() {
        assertEquals(6, combinations(2, 3));
    }

    @Test
    public void test3() {
        assertEquals(15, combinations(3, 5));
    }

    @Test
    public void test4() {
        assertEquals(625, combinations(5, 5, 5, 5));
    }

    @Test
    public void test5() {
        assertEquals(162, combinations(3, 6, 9));
    }

    @Test
    public void test6() {
        assertEquals(3628800, combinations(2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

    @Test
    public void test7() {
        assertEquals(120, combinations(4, 5, 6));
    }

    @Test
    public void test8() {
        assertEquals(1680, combinations(5, 6, 7, 8));
    }

    @Test
    public void test9() {
        assertEquals(42, combinations(6, 7, 0));
    }
    
}
