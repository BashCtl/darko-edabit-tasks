package medium;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class InTheCenter {

    public static boolean isCentered(String str) {
        String character = str.trim();
        String[] spaces = str.split(character);
        return spaces.length >= 2 ? spaces[0].length() == spaces[1].length()
                : str.equals(character);

    }

//    public static void main(String[] args) {
//        isCentered("  l ");
//    }

    @Test
    public void test1() {
        assertEquals(isCentered("  #  "), true);
    }

    @Test
    public void test2() {
        assertEquals(isCentered(" 2    "), false);
    }

    @Test
    public void test3() {
        assertEquals(isCentered("@"), true);
    }

    @Test
    public void test4() {
        assertEquals(isCentered(" 1"), false);
    }

    @Test
    public void test5() {
        assertEquals(isCentered("7 "), false);
    }

    @Test
    public void test6() {
        assertEquals(isCentered("  l "), false);
    }

    @Test
    public void test7() {
        assertEquals(isCentered(" a  "), false);
    }

    @Test
    public void test8() {
        assertEquals(isCentered("    G    "), true);
    }

    @Test
    public void test9() {
        assertEquals(isCentered("        %        "), true);
    }

}
