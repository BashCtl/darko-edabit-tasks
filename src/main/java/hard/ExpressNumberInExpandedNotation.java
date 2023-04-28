package hard;

import org.testng.annotations.Test;

import java.util.Collections;

import static org.testng.Assert.assertEquals;

public class ExpressNumberInExpandedNotation {

    public static String expand(long num) {
        StringBuilder result = new StringBuilder();
        String strNum = String.valueOf(num);
        while (strNum.length() > 0) {
            if (strNum.length() > 1 && strNum.charAt(0) != '0') {
                result.append(strNum.charAt(0))
                        .append("0".repeat(strNum.length() - 1));
            } else if (strNum.charAt(0) != '0') {
                result.append(strNum.charAt(0));

            }

            strNum = strNum.substring(1);
            if (strNum.length() > 0 && strNum.charAt(0) != '0') {
                result.append(" + ");
            }
        }

        return result.toString();
    }

//    public static void main(String[] args) {
////        System.out.println(expand(13));
//        System.out.println(expand(17000000));
//    }

    @Test
    public void test1() {
        assertEquals("10 + 3", expand(13));
    }

    @Test
    public void test2() {
        assertEquals("80 + 6", expand(86));
    }

    @Test
    public void test3() {
        assertEquals("10000000 + 7000000", expand(17000000));
    }

    @Test
    public void test4() {
        assertEquals("400000000 + 20000000 + 300000 + 70000 + 20 + 2", expand(420370022));
    }

    @Test
    public void test5() {
        assertEquals("70000 + 300 + 4", expand(70304));
    }

    @Test
    public void test6() {
        assertEquals("9000000", expand(9000000));
    }

    @Test
    public void test7() {
        assertEquals("5000 + 300 + 20 + 5", expand(5325));
    }

    @Test
    public void test8() {
        assertEquals("2000000000000 + 90000000000 + 6000000000 + 30000000 + 9000000 + 400000 + 80000 + 5000 + 200 + 90 + 3", expand(2096039485293L));
    }

    @Test
    public void test9() {
        assertEquals("90000000000000 + 2000000000000 + 90000000000 + 3000000000 + 400000000 + 3000000 + 30000 + 4000 + 500 + 70 + 3", expand(92093403034573L));
    }
}
