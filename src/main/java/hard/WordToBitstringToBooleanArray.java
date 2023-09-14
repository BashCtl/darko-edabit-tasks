package hard;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
public class WordToBitstringToBooleanArray {

    public static Boolean[] toBoolArray(String bits) {
        return Arrays.stream(bits.split("")).map(n-> n.equals("1")).toArray(Boolean[]::new);
    }

    public static String toBitString(String word) {
        char start = 'a';
        return word.chars().boxed()
                .map(code -> {
                    int diff = (code - (int) start) + 1;
                    if (diff % 2 == 0) {
                        return "0";
                    }
                    return "1";

                }).collect(Collectors.joining());
    }

    @Test
    public void test01() {
        assertArrayEquals(new Boolean[] {true, false, true, false, true, true, false, true}, toBoolArray(toBitString("charming")));
    }

    @Test
    public void test02() {
        assertArrayEquals(new Boolean[] {true, false, true, true, true, true, true, false, true}, toBoolArray(toBitString("exquisite")));
    }

    @Test
    public void test03() {
        assertArrayEquals(new Boolean[] {true, false, true, true, false, true}, toBoolArray(toBitString("admire")));
    }

    @Test
    public void test04() {
        assertArrayEquals(new Boolean[] {false, true, true, false}, toBoolArray(toBitString("deep")));
    }

    @Test
    public void test05() {
        assertArrayEquals(new Boolean[] {false, true, false, true, true}, toBoolArray(toBitString("loves")));
    }

    @Test
    public void test06() {
        assertArrayEquals(new Boolean[] {false, true, true, false}, toBoolArray(toBitString("tesh")));
    }

    @Test
    public void test07() {
        assertArrayEquals(new Boolean[] {false, true, false, true, true, false}, toBoolArray(toBitString("xavier")));
    }

    @Test
    public void test08() {
        assertArrayEquals(new Boolean[] {true, false, true, false, true, true}, toBoolArray(toBitString("adores")));
    }

    @Test
    public void test09() {
        assertArrayEquals(new Boolean[] {false, true, true, false, true}, toBoolArray(toBitString("tesha")));
    }

    @Test
    public void test10() {
        assertArrayEquals(new Boolean[] {true, true, true, true, true, false, true}, toBoolArray(toBitString("esquire")));
    }

    @Test
    public void test11() {
        assertArrayEquals(new Boolean[] {false, true, false, false, true, true, true, false, true}, toBoolArray(toBitString("randomize")));
    }

    @Test
    public void test12() {
        assertArrayEquals(new Boolean[] {true, false, true, false, true, true}, toBoolArray(toBitString("exotic")));
    }

}
