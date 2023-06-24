package hard;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TemperatureConverter {

    public static String convert(String deg) {
        String[] temp = deg.split("\\*");
        if (temp.length == 1) {
            return "Error";
        }
        int t = Integer.parseInt(temp[0]);
        if (temp[1].equals("C")) {
            return Math.round((t * 9.0 / 5.0) + 32) + "*F";
        } else {
            return Math.round(((t - 32) * (5.0 / 9.0))) + "*C";
        }
    }

    @Test
    public void test1() {
        assertEquals("95*F", convert("35*C"));
    }

    @Test
    public void test2() {
        assertEquals("64*F", convert("18*C"));
    }

    @Test
    public void test3() {
        assertEquals("-18*C", convert("0*F"));
    }

    @Test
    public void test4() {
        assertEquals("212*F", convert("100*C"));
    }

    @Test
    public void test5() {
        assertEquals("21*C", convert("69*F"));
    }

    @Test
    public void test6() {
        assertEquals("318*F", convert("159*C"));
    }

    @Test
    public void test7() {
        assertEquals("-40*F", convert("-40*C"));
    }

    @Test
    public void test8() {
        assertEquals("-40*C", convert("-40*F"));
    }

    @Test
    public void test9() {
        assertEquals("61*F", convert("16*C"));
    }

    @Test
    public void test10() {
        assertEquals("932*F", convert("500*C"));
    }

    @Test
    public void test11() {
        assertEquals("Error", convert("33"));
    }

    @Test
    public void test12() {
        assertEquals("-7*C", convert("19*F"));
    }

    @Test
    public void test13() {
        assertEquals("185*F", convert("85*C"));
    }

    @Test
    public void test14() {
        assertEquals("32*F", convert("0*C"));
    }

    @Test
    public void test15() {
        assertEquals("969*C", convert("1777*F"));
    }

    @Test
    public void test16() {
        assertEquals("-130*F", convert("-90*C"));
    }

    @Test
    public void test17() {
        assertEquals("-9*C", convert("16*F"));
    }

    @Test
    public void test18() {
        assertEquals("356*F", convert("180*C"));
    }

    @Test
    public void test19() {
        assertEquals("Error", convert("7K"));
    }

    @Test
    public void test20() {
        assertEquals("38*C", convert("100*F"));
    }

}
