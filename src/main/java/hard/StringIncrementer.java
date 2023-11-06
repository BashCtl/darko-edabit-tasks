package hard;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/*
String Incrementer

Write a function which increments a string to create a new string.

If the string ends with a number, the number should be incremented by 1.
If the string doesn't end with a number, 1 should be added to the new string.
If the number has leading zeros, the amount of digits should be considered.


Examples
incrementString("foo") ➞ "foo1"

incrementString("foobar0009") ➞ "foobar0010"

incrementString("foo099") ➞ "foo100"

 */

public class StringIncrementer {

    public static String incrementString(String str) {
        Pattern lastDigitsPattern = Pattern.compile("([a-zA-Z]+)([0-9]+)?$");
        Matcher matcher = lastDigitsPattern.matcher(str);
        String start="";
        String end="";
        if (matcher.find()) {
            start = matcher.group(1);
            String numbersStr = matcher.group(2);
            if (numbersStr != null) {
                int number = Integer.parseInt(numbersStr);
                number++;
                int zerosLength = numbersStr.length() - String.valueOf(number).length();
                end = new String(new char[zerosLength]).replace("\0", "0") + number;

            } else {
                end = "1";
            }

        }
        return start + end;
    }

    @Test
    public void test1() {
        assertEquals("foo1", incrementString("foo"));
    }

    @Test
    public void test2() {
        assertEquals("foobar01003", incrementString("foobar01002"));
    }

    @Test
    public void test3() {
        assertEquals("foobar00600", incrementString("foobar00599"));
    }

    @Test
    public void test4() {
        assertEquals("foo100", incrementString("foo099"));
    }

    @Test
    public void test5() {
        assertEquals("foo10000", incrementString("foo09999"));
    }
}
