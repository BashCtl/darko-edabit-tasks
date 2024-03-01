package expert;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
Recursion: Find The Longest Word

Write a recursive function that will return the longest word in a sentence.
In cases where more than one word is found, return the first one.

Examples
findLongest("I will and ever will be gratefully and perpetually loving you Tesh!😘") ➞ "perpetually"

findLongest("A thing of beauty is a joy forever.") ➞ "forever"

findLongest("Forgetfulness is by all means powerless!") ➞ "forgetfulness"

findLongest("The word strengths is the longest and most commonly used word with a single vowel.") ➞ "strengths"

Notes
Special characters and symbols don't count as part of the word.
Return the longest word found in lowercase letters.
You are expected to solve this challenge via a recursive approach.


 */

public class RecursionFindTheLongestWord {

    public static String findLongest(String sentence) {
        if (!sentence.contains(" ")) {
            return sentence;
        }
        String[] words = Arrays.stream(sentence.split(" "))
                .map(word -> word.split("'")[0]
                        .replaceAll("[^\\sa-zA-Z0-9]", "")
                        .toLowerCase()).toArray(String[]::new);
        String currentWord = words[0];
        sentence = Arrays.stream(words).skip(1).collect(Collectors.joining(" "));
        String nextWord = findLongest(sentence);
        return currentWord.length() > nextWord.length() ? currentWord : nextWord;
    }

    @Test
    public void test1() {
        assertEquals("perpetually", findLongest("I will and ever will be gratefully and perpetually loving you Tesh!😘"));
    }

    @Test
    public void test2() {
        assertEquals("darkness", findLongest("Hello darkness my old friend."));
    }

    @Test
    public void test3() {
        assertEquals("yourself", findLongest("Yourself is your soul's captain and fate's master."));
    }

    @Test
    public void test4() {
        assertEquals("daughter", findLongest("The pretty daughter's toy, a doll, is as pretty as her."));
    }

    @Test
    public void test5() {
        assertEquals("forever", findLongest("A thing of beauty is a joy forever."));
    }

    @Test
    public void test6() {
        assertEquals("forgetfulness", findLongest("Forgetfulness is by all means powerless!"));
    }

    @Test
    public void test7() {
        assertEquals("strengths", findLongest("\"Strengths\" is the longest and most commonly used word that contains only a single vowel."));
    }

}
