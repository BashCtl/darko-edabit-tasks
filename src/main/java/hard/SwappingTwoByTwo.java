package hard;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SwappingTwoByTwo {

    public static String swapTwo(String str) {
        return str.replaceAll("(.{2})(.{2})", "$2$1");
    }

//    public static void main(String[] args) {
//        System.out.println(swapTwo("ABCDEFGH"));
//        System.out.println(swapTwo("munchkins"));
//    }

    @Test
    public void test1() {
        assertEquals("CDABGHEF", swapTwo("ABCDEFGH"));
    }

    @Test
    public void test2() {
        assertEquals("BBAADDCCFFEE", swapTwo("AABBCCDDEEFF"));
    }

    @Test
    public void test3() {
        assertEquals("mpooooalmpa", swapTwo("oompaloompa"));
    }

    @Test
    public void test4() {
        assertEquals("ncmuinhks", swapTwo("munchkins"));
    }

    @Test
    public void test5() {
        assertEquals("GGFFHHI", swapTwo("FFGGHHI"));
    }

    @Test
    public void test6() {
        assertEquals("FFG", swapTwo("FFG"));
    }

    @Test
    public void test7() {
        assertEquals("", swapTwo(""));
    }

}
