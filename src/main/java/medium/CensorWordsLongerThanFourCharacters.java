package medium;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;

public class CensorWordsLongerThanFourCharacters {

    public static String censor(String str) {

      return   Arrays.stream(str.split(" "))
                .map(word-> word.length()>4? "*".repeat(word.length()): word)
                .collect(Collectors.joining(" "));

    }

    @Test
    public void test1() {
        assertEquals("The code is ******", censor("The code is fourty"));
    }

    @Test
    public void test2() {
        assertEquals("Two plus ***** is five", censor("Two plus three is five"));
    }

    @Test
    public void test3() {
        assertEquals("aaaa ***** 1234 *****", censor("aaaa aaaaa 1234 12345"));
    }

    @Test
    public void test4() {
        assertEquals("****************", censor("abcdefghijklmnop"));
    }

    @Test
    public void test5() {
        assertEquals("a", censor("a"));
    }
}
