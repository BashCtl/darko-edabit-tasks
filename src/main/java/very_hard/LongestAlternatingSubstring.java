package very_hard;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;
/*
Longest Alternating Substring

Given a string of digits, return the longest substring
with alternating odd/even or even/odd digits. If two or more substrings
have the same length, return the substring that occurs first.

Examples
longestSubstring("225424272163254474441338664823") ➞ "272163254"
// substrings = 254, 272163254, 474, 41, 38, 23

longestSubstring("594127169973391692147228678476") ➞ "16921472"
// substrings = 94127, 169, 16921472, 678, 476

longestSubstring("721449827599186159274227324466") ➞ "7214"
// substrings = 7214, 498, 27, 18, 61, 9274, 27, 32
// 7214 and 9274 have same length, but 7214 occurs first.
Notes
The minimum alternating substring size is 2.


 */

public class LongestAlternatingSubstring {

    public static String longestSubstring(String digits){
        StringBuilder first = new StringBuilder(String.valueOf(digits.charAt(0)));
        IntStream.range(1, digits.length()).forEach(i->{
            if(Integer.parseInt(String.valueOf(digits.charAt(i-1))) %2!=
            Integer.parseInt(String.valueOf(digits.charAt(i)))%2){
               first.append(digits.charAt(i));
            }else {
              first.append(" ").append(digits.charAt(i));
            }
        });

        return Arrays.stream(first.toString().split(" "))
                .max(Comparator.comparingInt(String::length)).get();

    }


    @Test
    public void test1() {
        assertEquals("56327256", longestSubstring("844929328912985315632725682153"));
    }

    @Test
    public void test2() {
        assertEquals("27212947", longestSubstring("769697538272129475593767931733"));
    }

    @Test
    public void test3() {
        assertEquals("894561", longestSubstring("937948289456111258444958189244"));
    }

    @Test
    public void test4() {
        assertEquals("636", longestSubstring("736237766362158694825822899262"));
    }

    @Test
    public void test5() {
        assertEquals("369", longestSubstring("369715978955362655737322836233"));
    }

    @Test
    public void test6() {
        assertEquals("496985", longestSubstring("345724969853525333273796592356"));
    }

    @Test
    public void test7() {
        assertEquals("8581", longestSubstring("548915548581127334254139969136"));
    }

    @Test
    public void test8() {
        assertEquals("78521", longestSubstring("417922164857852157775176959188"));
    }

    @Test
    public void test9() {
        assertEquals("638569", longestSubstring("251346385699223913113161144327"));
    }

    @Test
    public void test10() {
        assertEquals("18785", longestSubstring("483563951878576456268539849244"));
    }

    @Test
    public void test11() {
        assertEquals("474", longestSubstring("853667717122615664748443484823"));
    }

    @Test
    public void test12() {
        assertEquals("98785", longestSubstring("398785511683322662883368457392"));
    }

    @Test
    public void test13() {
        assertEquals("76361", longestSubstring("368293545763611759335443678239"));
    }

    @Test
    public void test14() {
        assertEquals("4947", longestSubstring("775195358448494712934755311372"));
    }

    @Test
    public void test15() {
        assertEquals("76523", longestSubstring("646113733929969155976523363762"));
    }

    @Test
    public void test16() {
        assertEquals("478369", longestSubstring("575337321726324966478369152265"));
    }

    @Test
    public void test17() {
        assertEquals("545258", longestSubstring("754388489999793138912431545258"));
    }

    @Test
    public void test18() {
        assertEquals("2581418569", longestSubstring("198644286258141856918653955964"));
    }

    @Test
    public void test19() {
        assertEquals("349", longestSubstring("643349187319779695864213682274"));
    }

    @Test
    public void test20() {
        assertEquals("36361", longestSubstring("919331281193713636178478295857"));
    }

}
