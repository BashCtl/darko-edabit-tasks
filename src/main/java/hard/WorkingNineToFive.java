package hard;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class WorkingNineToFive {

    public static String overTime(double[] arr) {
        double start = arr[0];
        double end = arr[1];
        double hourlyRate = arr[2];
        double overtime = arr[3];
        if (end < 17) {
            return String.format("$%.2f", (end - start) * hourlyRate);
        } else if (start > 17) {
            return String.format("$%.2f", (end - start) * hourlyRate * overtime);
        } else {
            return String.format("$%.2f", (end - 17) * hourlyRate * overtime + (17 - start) * hourlyRate);
        }
    }

//    public static void main(String[] args) {
//        System.out.println(overTime(new double[]{9, 17, 30, 1.5}));
//    }

    @Test
    public void test1() {
        assertEquals("$240.00", overTime(new double[]{9, 17, 30, 1.5}));
    }

    @Test
    public void test2() {
        assertEquals("$400.00", overTime(new double[]{9, 18, 40, 2}));
    }

    @Test
    public void test3() {
        assertEquals("$325.00", overTime(new double[]{13, 20, 32.5, 2}));
    }

    @Test
    public void test4() {
        assertEquals("$100.00", overTime(new double[]{9, 13, 25, 1.5}));
    }

    @Test
    public void test5() {
        assertEquals("$364.00", overTime(new double[]{11.5, 19, 40, 1.8}));
    }

    @Test
    public void test6() {
        assertEquals("$210.00", overTime(new double[]{10, 17, 30, 1.5}));
    }

    @Test
    public void test7() {
        assertEquals("$209.63", overTime(new double[]{10.5, 17, 32.25, 1.5}));
    }

    @Test
    public void test8() {
        assertEquals("$84.00", overTime(new double[]{16, 18, 30, 1.8}));
    }

    @Test
    public void test9() {
        assertEquals("$130.00", overTime(new double[]{18, 20, 32.5, 2}));
    }

    @Test
    public void test10() {
        assertEquals("$52.50", overTime(new double[]{13.25, 15, 30, 1.5}));
    }

    @Test
    public void test11() {
        assertEquals("$432.32", overTime(new double[]{13, 21, 38.6, 1.8}));
    }

}
