package medium;

import org.testng.annotations.Test;

import java.util.stream.IntStream;

import static org.testng.Assert.assertEquals;

public class PowerRanger {

    public static int powerRanger(int power, int min, int max){
       return (int) IntStream.rangeClosed((int)Math.ceil(Math.pow(min,1.0/power)),
               (int)Math.floor(Math.pow(max, 1.0/power))).count();
    }

    @Test
    public void test1() {
        assertEquals(1, powerRanger(5, 31, 33));
    }

    @Test
    public void test2() {
        assertEquals(3, powerRanger(4, 250, 1300));
    }

    @Test
    public void test3() {
        assertEquals(2, powerRanger(2, 49, 65));
    }

    @Test
    public void test4() {
        assertEquals(3, powerRanger(3, 1, 27));
    }

    @Test
    public void test5() {
        assertEquals(1, powerRanger(10, 1, 5));
    }

    @Test
    public void test6() {
        assertEquals(5, powerRanger(1, 1, 5));
    }

    @Test
    public void test7() {
        assertEquals(10, powerRanger(2, 1, 100));
    }

}
