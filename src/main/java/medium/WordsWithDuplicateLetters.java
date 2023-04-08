package medium;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;

public class WordsWithDuplicateLetters {

    public static boolean noDuplicateLetters(String phrase) {
        phrase = phrase.toLowerCase();
        String[] words = phrase.split(" ");
        for (String word : words) {
            Set<String> wordSet = Arrays.stream(word.split(""))
                    .collect(Collectors.toSet());
            if (wordSet.size() != word.length()) {
                return false;
            }
        }
        return true;
    }


    @Test
    public void test1() {
        assertEquals(true, noDuplicateLetters("Easy does it."));
    }

    @Test
    public void test2() {
        assertEquals(false, noDuplicateLetters("So far, so good."));
    }

    @Test
    public void test3() {
        assertEquals(false, noDuplicateLetters("Better late than never."));
    }

    @Test
    public void test4() {
        assertEquals(true, noDuplicateLetters("Beat around the bush."));
    }

    @Test
    public void test5() {
        assertEquals(false, noDuplicateLetters("Give them the benefit of the doubt."));
    }

    @Test
    public void test6() {
        assertEquals(false, noDuplicateLetters("Your guess is as good as mine."));
    }

    @Test
    public void test7() {
        assertEquals(true, noDuplicateLetters("Make a long story short."));
    }

    @Test
    public void test8() {
        assertEquals(true, noDuplicateLetters("Go back to the drawing board."));
    }

    @Test
    public void test9() {
        assertEquals(true, noDuplicateLetters("Wrap your head around something."));
    }

    @Test
    public void test10() {
        assertEquals(false, noDuplicateLetters("Get your act together."));
    }

    @Test
    public void test11() {
        assertEquals(false, noDuplicateLetters("To make matters worse."));
    }

    @Test
    public void test12() {
        assertEquals(true, noDuplicateLetters("No pain, no gain."));
    }

    @Test
    public void test13() {
        assertEquals(false, noDuplicateLetters("We'll cross that bridge when we come to it."));
    }

    @Test
    public void test14() {
        assertEquals(false, noDuplicateLetters("Call it a day."));
    }

    @Test
    public void test15() {
        assertEquals(false, noDuplicateLetters("It's not rocket science."));
    }

    @Test
    public void test16() {
        assertEquals(false, noDuplicateLetters("A blessing in disguise."));
    }

    @Test
    public void test17() {
        assertEquals(true, noDuplicateLetters("Get out of hand."));
    }

    @Test
    public void test18() {
        assertEquals(true, noDuplicateLetters("A dime a dozen."));
    }

    @Test
    public void test19() {
        assertEquals(true, noDuplicateLetters("Time flies when you're having fun."));
    }

    @Test
    public void test20() {
        assertEquals(true, noDuplicateLetters("The best of both worlds."));
    }

    @Test
    public void test21() {
        assertEquals(true, noDuplicateLetters("Speak of the devil."));
    }

    @Test
    public void test22() {
        assertEquals(false, noDuplicateLetters("You can say that again."));
    }

    @Test
    public void test23() {
        assertEquals(false, noDuplicateLetters("Always be closing."));
    }

}
