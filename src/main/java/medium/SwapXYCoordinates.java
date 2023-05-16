package medium;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SwapXYCoordinates {

    public static String swapXY(String str){
       return str.replaceAll("\\((-?\\d+), (-?\\d+)\\), \\((-?\\d+), (-?\\d+)\\)","($2, $1), ($4, $3)");
    }

//    public static void main(String[] args) {
//        System.out.println(swapXY("(1, 2), (3, 4)"));
//        System.out.println(swapXY("(-5, -3), (7, 4)"));
//    }

    @Test
    public void test1() {
        assertEquals("(2, 1), (4, 3)", swapXY("(1, 2), (3, 4)"));
    }

    @Test
    public void test2() {
        assertEquals("(23, 11), (99, 43)", swapXY("(11, 23), (43, 99)"));
    }

    @Test
    public void test3() {
        assertEquals("(-3, -5), (4, 7)", swapXY("(-5, -3), (7, 4)"));
    }

    @Test
    public void test4() {
        assertEquals("(-321, -1095), (-88, 0)", swapXY("(-1095, -321), (0, -88)"));
    }

}
