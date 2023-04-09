package hard;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;

public class ReverseOddLengthWords {

    public static String reverseOdd(String str) {
        return Arrays.stream(str.split(" ")).map(word -> {
            if (word.length() % 2 != 0) {
                return new StringBuilder(word).reverse().toString();
            }
            return word;
        }).collect(Collectors.joining(" "));
    }

    @Test
    public void test1() {
        assertEquals("enO owt eerht four", reverseOdd("One two three four"));
    }

    @Test
    public void test2() {
        assertEquals("Make sure you only reverse words of odd length", reverseOdd("Make sure uoy only esrever sdrow of ddo length"));
    }

    @Test
    public void test3() {
        System.out.println("Should work with empty string.");
        assertEquals("", reverseOdd(""));
    }

    @Test
    public void test4() {
        System.out.println("Should work with only one word.");
        assertEquals("sananaB", reverseOdd("Bananas"));
    }

    @Test
    public void test5() {
        assertEquals("Even even even even even even even even even", reverseOdd("Even even even even even even even even even"));
    }

    @Test
    public void test6() {
        assertEquals("ddO ddo ddo ddo ddo ddo ddo ddo ddo ddo ddo", reverseOdd("Odd odd odd odd odd odd odd odd odd odd odd"));
    }

}
