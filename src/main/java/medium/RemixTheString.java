package medium;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RemixTheString {

    public static String remix(String str, int[] arr) {
        String[] result = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[arr[i]] = String.valueOf(str.charAt(i));
        }
        return String.join("", result);
    }

    @Test
    public void test1() {
        assertEquals("acdb", remix("abcd", new int[]{0, 3, 1, 2}));
    }

    @Test
    public void test2() {
        assertEquals("OPtl", remix("PlOt", new int[]{1, 3, 0, 2}));
    }

    @Test
    public void test3() {
        assertEquals("cmourpte", remix("computer", new int[]{0, 2, 1, 5, 3, 6, 7, 4}));
    }

    @Test
    public void test4() {
        assertEquals("wistt", remix("twist", new int[]{4, 0, 1, 2, 3}));
    }

    @Test
    public void test5() {
        assertEquals("rtibliensyopis", remix("responsibility", new int[]{0, 6, 8, 11, 10, 7, 13, 5, 3, 2, 4, 12, 1, 9}));
    }

    @Test
    public void test6() {
        assertEquals("enrfeeIrcnte", remix("Interference", new int[]{6, 9, 10, 11, 7, 3, 0, 2, 5, 1, 8, 4}));
    }

    @Test
    public void test7() {
        assertEquals("encqusee", remix("sequence", new int[]{5, 7, 3, 4, 0, 1, 2, 6}));
    }

}
