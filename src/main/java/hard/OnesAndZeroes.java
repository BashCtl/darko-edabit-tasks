package hard;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class OnesAndZeroes {

    public static boolean sameLength(String str) {
        String[] zeroes = Arrays.stream(str.split("[1]"))
                .filter(n -> !n.isEmpty()).toArray(String[]::new);
        String[] ones = Arrays.stream(str.split("[0]"))
                .filter(n -> !n.isEmpty()).toArray(String[]::new);
        if (zeroes.length != ones.length) {
            return false;
        }
        for (int i = 0; i < zeroes.length; i++) {
            if (zeroes[i].length() != ones[i].length()) {
                return false;
            }
        }
        return true;
    }

//    public static void main(String[] args) {
//        System.out.println(sameLength("110011100010"));
//    }

    @Test
    public void test1() {
        assertEquals(true, sameLength("10"));
    }

    @Test
    public void test2() {
        assertEquals(true, sameLength("1010"));
    }

    @Test
    public void test3() {
        assertEquals(true, sameLength("1100"));
    }

    @Test
    public void test4() {
        assertEquals(true, sameLength("10101110001100"));
    }

    @Test
    public void test5() {
        assertEquals(true, sameLength("1111000010101100"));
    }

    @Test
    public void test6() {
        assertEquals(false, sameLength("1001"));
    }

    @Test
    public void test7() {
        assertEquals(false, sameLength("101001"));
    }

    @Test
    public void test8() {
        assertEquals(false, sameLength("101"));
    }

    @Test
    public void test9() {
        assertEquals(false, sameLength("10010"));
    }

    @Test
    public void test10() {
        assertEquals(false, sameLength("110"));
    }

    @Test
    public void test11() {
        assertEquals(false, sameLength("11001"));
    }

    @Test
    public void test12() {
        assertEquals(false, sameLength("11100011000"));
    }

}
