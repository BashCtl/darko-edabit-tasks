package hard;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class BalancedWords {

    public static boolean balanced(String word) {
        String secondPart = word.length() % 2 == 0 ? word.substring(word.length() / 2)
                : word.substring((word.length() / 2) + 1);
        return sumValues(word.substring(0, word.length() / 2))
                == sumValues(secondPart);
    }

    public static int sumValues(String str) {
        return Arrays.stream(str.split(""))
                .mapToInt(s -> {
                    if (s.charAt(0) == 'a') {
                        return 1;
                    }
                    return s.charAt(0) - 'a' + 1;
                }).sum();
    }


    @Test
    public void test1() {
        assertEquals(false, balanced("at"));
    }

    @Test
    public void test2() {
        assertEquals(false, balanced("forgetful"));
    }

    @Test
    public void test3() {
        assertEquals(true, balanced("vegetation"));
    }

    @Test
    public void test4() {
        assertEquals(false, balanced("disillusioned"));
    }

    @Test
    public void test5() {
        assertEquals(true, balanced("abstract"));
    }

    @Test
    public void test6() {
        assertEquals(false, balanced("clever"));
    }

    @Test
    public void test7() {
        assertEquals(true, balanced("seasoning"));
    }

    @Test
    public void test8() {
        assertEquals(false, balanced("measure"));
    }

    @Test
    public void test9() {
        assertEquals(true, balanced("conditionalities"));
    }

    @Test
    public void test10() {
        assertEquals(false, balanced("uptight"));
    }

    @Test
    public void test11() {
        assertEquals(false, balanced("ticket"));
    }

    @Test
    public void test12() {
        assertEquals(false, balanced("calculate"));
    }

    @Test
    public void test13() {
        assertEquals(false, balanced("join"));
    }

    @Test
    public void test14() {
        assertEquals(true, balanced("anesthesiologies"));
    }

    @Test
    public void test15() {
        assertEquals(false, balanced("command"));
    }

    @Test
    public void test16() {
        assertEquals(true, balanced("graphite"));
    }

    @Test
    public void test17() {
        assertEquals(true, balanced("quadratically"));
    }

    @Test
    public void test18() {
        assertEquals(false, balanced("right"));
    }

    @Test
    public void test19() {
        assertEquals(true, balanced("fossil"));
    }

    @Test
    public void test20() {
        assertEquals(false, balanced("sparkling"));
    }

    @Test
    public void test21() {
        assertEquals(true, balanced("dolphin"));
    }

    @Test
    public void test22() {
        assertEquals(true, balanced("baseball"));
    }

    @Test
    public void test23() {
        assertEquals(false, balanced("immense"));
    }

    @Test
    public void test24() {
        assertEquals(true, balanced("pattern"));
    }

    @Test
    public void test25() {
        assertEquals(false, balanced("hand"));
    }

    @Test
    public void test26() {
        assertEquals(true, balanced("radar"));
    }

    @Test
    public void test27() {
        assertEquals(false, balanced("oven"));
    }

    @Test
    public void test28() {
        assertEquals(true, balanced("immutability"));
    }

    @Test
    public void test29() {
        assertEquals(true, balanced("kayak"));
    }

    @Test
    public void test30() {
        assertEquals(true, balanced("bartender"));
    }

    @Test
    public void test31() {
        assertEquals(false, balanced("weight"));
    }

    @Test
    public void test32() {
        assertEquals(true, balanced("lightbulbs"));
    }

    @Test
    public void test33() {
        assertEquals(true, balanced("tail"));
    }

}
