package hard;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FindTheMissingLetter {

    public static String missingLetter(String[] arr) {
        String result = "";
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1].charAt(0) - arr[i].charAt(0) != 1) {
                result = String.valueOf((char)(arr[i].charAt(0) + 1));
                break;
            }
        }
        return result;
    }

    @Test
    public void test1() {
        assertEquals(missingLetter(new String[]{"a", "b", "c", "e", "f", "g"}), "d");
    }

    @Test
    public void test2() {
        assertEquals(missingLetter(new String[]{"O", "Q", "R", "S"}), "P");
    }

    @Test
    public void test3() {
        assertEquals(missingLetter(new String[]{"t", "u", "v", "w", "x", "z"}), "y");
    }

    @Test
    public void test4() {
        assertEquals(missingLetter(new String[]{"m", "o"}), "n");
    }

    @Test
    public void test5() {
        assertEquals(missingLetter(new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}), "i");
    }

    @Test
    public void test6() {
        assertEquals(missingLetter(new String[]{"q", "s", "t"}), "r");
    }

    @Test
    public void test7() {
        assertEquals(missingLetter(new String[]{"c", "d", "e", "f", "g", "h", "i", "k", "l", "m", "n"}), "j");
    }

    @Test
    public void test8() {
        assertEquals(missingLetter(new String[]{"e", "f", "g", "h", "i", "j", "k", "m", "n", "o", "p"}), "l");
    }

    @Test
    public void test9() {
        assertEquals(missingLetter(new String[]{"t", "u", "w", "x"}), "v");
    }

    @Test
    public void test10() {
        assertEquals(missingLetter(new String[]{"B", "D"}), "C");
    }

}
