package hard;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RemoveTrailingLeadingZeros {

    public static String removeLeadingTrailing(String n) {
        n = n.replaceAll("\\.(0+)$", "");
        n = n.replaceAll("(\\.\\d+[1-9])(0+)$", "$1");
        n = n.replaceAll("^(0+)([1-9])", "$2");
        n = n.replaceAll("^0+$","0");
        n = n.replaceAll("^(0+)(0\\.)","$2");

        return n;
    }

//    public static void main(String[] args) {
//        System.out.println(removeLeadingTrailing("30.000020"));
//        System.out.println(removeLeadingTrailing("00200.1900001"));
//        System.out.println(removeLeadingTrailing("230.000"));
//        System.out.println(removeLeadingTrailing("03.1400"));
//        System.out.println(removeLeadingTrailing("30"));
//        System.out.println(removeLeadingTrailing("00402"));
//    }

    @Test
    public void test1() {
        assertEquals("230", removeLeadingTrailing("230.000"));
    }

    @Test
    public void test2() {
        assertEquals("402", removeLeadingTrailing("00402"));
    }

    @Test
    public void test3() {
        assertEquals("3.14", removeLeadingTrailing("03.1400"));
    }

    @Test
    public void test4() {
        assertEquals("30", removeLeadingTrailing("30"));
    }

    @Test
    public void test5() {
        assertEquals("30", removeLeadingTrailing("30.0000"));
    }

    @Test
    public void test6() {
        assertEquals("24340", removeLeadingTrailing("24340"));
    }

    @Test
    public void test7() {
        assertEquals("404040", removeLeadingTrailing("0404040"));
    }

    @Test
    public void test8() {
        assertEquals("0", removeLeadingTrailing("0"));
    }

    @Test
    public void test9() {
        assertEquals("0", removeLeadingTrailing("00"));
    }

    @Test
    public void test10() {
        assertEquals("0", removeLeadingTrailing("0.000000"));
    }

    @Test
    public void test11() {
        assertEquals("0", removeLeadingTrailing("0000.000"));
    }

    @Test
    public void test12() {
        assertEquals("0.0001", removeLeadingTrailing("00.0001"));
    }

    @Test
    public void test13() {
        assertEquals("10000", removeLeadingTrailing("10000"));
    }

    @Test
    public void test14() {
        assertEquals("1345", removeLeadingTrailing("1345"));
    }

    @Test
    public void test15() {
        assertEquals("30.00002", removeLeadingTrailing("30.000020"));
    }

    @Test
    public void test16() {
        assertEquals("200.1900001", removeLeadingTrailing("00200.1900001"));
    }

}
