package medium;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WhiteSpacesBetweenLowerAndUppercaseLetters {

    public static String insertWhitespace(String s){
       return String.join(" ", s.split("(?=\\p{Upper})"));
    }

    @Test
    public void test1() {
        assertEquals("She Walks To The Beach", insertWhitespace("SheWalksToTheBeach"));
    }

    @Test
    public void test2() {
        assertEquals("Marvin Talks Too Much", insertWhitespace("MarvinTalksTooMuch"));
    }

    @Test
    public void test3() {
        assertEquals("Hopelessly Devoted To You", insertWhitespace("HopelesslyDevotedToYou"));
    }

    @Test
    public void test4() {
        assertEquals("Even The Best Fall Down Sometimes", insertWhitespace("EvenTheBestFallDownSometimes"));
    }

    @Test
    public void test5() {
        assertEquals("The Greatest Upset In History", insertWhitespace("TheGreatestUpsetInHistory"));
    }
}
