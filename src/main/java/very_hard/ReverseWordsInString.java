package very_hard;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

/*
Reverse Words in a String
Given an input string, reverse the string word by word.

Examples
reverseWords("the sky is blue") ➞ "blue is sky the"

reverseWords("  hello world!  ") ➞ "world! hello"

reverseWords("a good   example") ➞ "example good a"
Notes
A word is defined as a sequence of non-space characters.
The input string may contain leading or trailing spaces.
However, your reversed string should not contain leading or trailing spaces.
You need to reduce multiple spaces between two words to a single space in the reversed string.
Try to solve this in linear time.

 */
public class ReverseWordsInString {


    public static String reverseWords(String s){
        List<String> strings = Arrays.stream(s.replaceAll("[ ]+", " ").trim().split(" "))
                .collect(Collectors.collectingAndThen(Collectors.toList(),
                        l->{Collections.reverse(l); return l;}));
        return String.join(" ", strings);
    }

    @Test
    public void test1() {
        assertEquals("world! hello", reverseWords("  hello world!  "));
    }

    @Test
    public void test2() {
        assertEquals("the sky is blue", reverseWords("blue is sky the"));
    }

    @Test
    public void test3() {
        assertEquals("example good a", reverseWords( "a good   example"));
    }
    @Test
    public void test4() {
        assertEquals("example good a", reverseWords( "a good   example"));
    }
    @Test
    public void test5() {
        assertEquals("this is another example of fraud!", reverseWords( "fraud! of example another is  this"));
    }
    @Test
    public void test6() {
        assertEquals("how in the world!abc did that happen!", reverseWords( "happen! that did world!abc the in how"));
    }
    @Test
    public void test7() {
        assertEquals("You are the man!", reverseWords( "man! the are You"));
    }

}
