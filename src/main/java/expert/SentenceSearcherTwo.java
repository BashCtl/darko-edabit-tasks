package expert;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.Arrays;

/*
Sentence Searcher II

Create a function that returns the sentence
that contains the word at index n. Remember to include the full stop at the end.

Worked Example
final String txt = "I love Tesh. My world evolves in hers. My love for life.";

sentenceSearcher(txt, 4) ➞ "My world evolves in hers."
// The word at index 4 is "world".
// The full sentence that contains the word at index 4 is "My world evolves in hers."
Examples
sentenceSearcher(txt, 2) ➞ "I love Tesh."

sentenceSearcher(txt, 5) ➞ "My world evolves in hers."

sentenceSearcher(txt, -1) ➞ "My love for life."
// The index at -1 is the last word.
// The last word is "life".

Notes
All sentences will end with a full stop.
You need to account for negative indexes as well.


 */
public class SentenceSearcherTwo {

    public static String sentenceSearcher(String str, int n) {
        String[] sentences = str.split("\\.");
        int wordsCount = (int)Arrays.stream(sentences)
                .flatMap(s -> Arrays.stream(s.trim()
                        .split(" "))).count();
        n = n < 0 ? wordsCount + n : n;
        for (String sentence : sentences) {
            String[] words = sentence.trim().split(" ");
            if (n < words.length) {
                return sentence.trim() + ".";
            }
            n -= words.length;
        }
        return sentences[sentences.length - 1].trim() + ".";
    }

    @Test
    public void test01() {
        assertEquals("I love Tesh.", sentenceSearcher("I love Tesh. My world evolves in hers. My love for life.", 0));
    }

    @Test
    public void test02() {
        assertEquals("I love Tesh.", sentenceSearcher("I love Tesh. My world evolves in hers. My love for life.", 1));
    }

    @Test
    public void test03() {
        assertEquals("I love Tesh.", sentenceSearcher("I love Tesh. My world evolves in hers. My love for life.", -12));
    }

    @Test
    public void test04() {
        assertEquals("I love Tesh.", sentenceSearcher("I love Tesh. My world evolves in hers. My love for life.", -11));
    }

    @Test
    public void test05() {
        assertEquals("I love Tesh.", sentenceSearcher("I love Tesh. My world evolves in hers. My love for life.", -10));
    }

    @Test
    public void test06() {
        assertEquals("My love for life.", sentenceSearcher("I love Tesh. My world evolves in hers. My love for life.", -3));
    }

    @Test
    public void test07() {
        assertEquals("My love for life.", sentenceSearcher("I love Tesh. My world evolves in hers. My love for life.", -2));
    }

    @Test
    public void test08() {
        assertEquals("My love for life.", sentenceSearcher("I love Tesh. My world evolves in hers. My love for life.", -1));
    }

    @Test
    public void test09() {
        assertEquals("My world evolves in hers.", sentenceSearcher("I love Tesh. My world evolves in hers. My love for life.", -9));
    }

    @Test
    public void test10() {
        assertEquals("My world evolves in hers.", sentenceSearcher("I love Tesh. My world evolves in hers. My love for life.", -8));
    }

    @Test
    public void test11() {
        assertEquals("My world evolves in hers.", sentenceSearcher("I love Tesh. My world evolves in hers. My love for life.", -7));
    }

    @Test
    public void test12() {
        assertEquals("My world evolves in hers.", sentenceSearcher("I love Tesh. My world evolves in hers. My love for life.", -6));
    }

    @Test
    public void test13() {
        assertEquals("My world evolves in hers.", sentenceSearcher("I love Tesh. My world evolves in hers. My love for life.", -5));
    }

    @Test
    public void test14() {
        assertEquals("My love for life.", sentenceSearcher("I love Tesh. My world evolves in hers. My love for life.", -4));
    }

    @Test
    public void test15() {
        assertEquals("I love Tesh.", sentenceSearcher("I love Tesh. My world evolves in hers. My love for life.", 0));
    }

    @Test
    public void test16() {
        assertEquals("I love Tesh.", sentenceSearcher("I love Tesh. My world evolves in hers. My love for life.", 1));
    }

    @Test
    public void test17() {
        assertEquals("I love Tesh.", sentenceSearcher("I love Tesh. My world evolves in hers. My love for life.", 2));
    }

    @Test
    public void test18() {
        assertEquals("My world evolves in hers.", sentenceSearcher("I love Tesh. My world evolves in hers. My love for life.", 3));
    }

    @Test
    public void test19() {
        assertEquals("My world evolves in hers.", sentenceSearcher("I love Tesh. My world evolves in hers. My love for life.", 4));
    }

    @Test
    public void test20() {
        assertEquals("My world evolves in hers.", sentenceSearcher("I love Tesh. My world evolves in hers. My love for life.", 5));
    }

    @Test
    public void test21() {
        assertEquals("My world evolves in hers.", sentenceSearcher("I love Tesh. My world evolves in hers. My love for life.", 6));
    }

    @Test
    public void test22() {
        assertEquals("My world evolves in hers.", sentenceSearcher("I love Tesh. My world evolves in hers. My love for life.", 7));
    }

    @Test
    public void test23() {
        assertEquals("My love for life.", sentenceSearcher("I love Tesh. My world evolves in hers. My love for life.", 8));
    }

    @Test
    public void test24() {
        assertEquals("My love for life.", sentenceSearcher("I love Tesh. My world evolves in hers. My love for life.", 9));
    }

    @Test
    public void test25() {
        assertEquals("My love for life.", sentenceSearcher("I love Tesh. My world evolves in hers. My love for life.", 10));
    }

    @Test
    public void test26() {
        assertEquals("My love for life.", sentenceSearcher("I love Tesh. My world evolves in hers. My love for life.", 11));
    }

    @Test
    public void test27() {
        assertEquals("I have a dog.", sentenceSearcher("I have a dog. I have a log. There is no stopping me now.", -14));
    }

    @Test
    public void test28() {
        assertEquals("I have a dog.", sentenceSearcher("I have a dog. I have a log. There is no stopping me now.", -13));
    }

    @Test
    public void test29() {
        assertEquals("I have a dog.", sentenceSearcher("I have a dog. I have a log. There is no stopping me now.", -12));
    }

    @Test
    public void test30() {
        assertEquals("I have a dog.", sentenceSearcher("I have a dog. I have a log. There is no stopping me now.", -11));
    }

    @Test
    public void test31() {
        assertEquals("I have a log.", sentenceSearcher("I have a dog. I have a log. There is no stopping me now.", -10));
    }

    @Test
    public void test32() {
        assertEquals("There is no stopping me now.", sentenceSearcher("I have a dog. I have a log. There is no stopping me now.", -3));
    }

    @Test
    public void test33() {
        assertEquals("There is no stopping me now.", sentenceSearcher("I have a dog. I have a log. There is no stopping me now.", -2));
    }

    @Test
    public void test34() {
        assertEquals("There is no stopping me now.", sentenceSearcher("I have a dog. I have a log. There is no stopping me now.", -1));
    }

    @Test
    public void test35() {
        assertEquals("I have a log.", sentenceSearcher("I have a dog. I have a log. There is no stopping me now.", -9));
    }

    @Test
    public void test36() {
        assertEquals("I have a log.", sentenceSearcher("I have a dog. I have a log. There is no stopping me now.", -8));
    }

    @Test
    public void test37() {
        assertEquals("I have a log.", sentenceSearcher("I have a dog. I have a log. There is no stopping me now.", -7));
    }

    @Test
    public void test38() {
        assertEquals("There is no stopping me now.", sentenceSearcher("I have a dog. I have a log. There is no stopping me now.", -6));
    }

    @Test
    public void test39() {
        assertEquals("There is no stopping me now.", sentenceSearcher("I have a dog. I have a log. There is no stopping me now.", -5));
    }

    @Test
    public void test40() {
        assertEquals("There is no stopping me now.", sentenceSearcher("I have a dog. I have a log. There is no stopping me now.", -4));
    }

    @Test
    public void test41() {
        assertEquals("I have a dog.", sentenceSearcher("I have a dog. I have a log. There is no stopping me now.", 0));
    }

    @Test
    public void test42() {
        assertEquals("I have a dog.", sentenceSearcher("I have a dog. I have a log. There is no stopping me now.", 1));
    }

    @Test
    public void test43() {
        assertEquals("I have a dog.", sentenceSearcher("I have a dog. I have a log. There is no stopping me now.", 2));
    }

    @Test
    public void test44() {
        assertEquals("I have a dog.", sentenceSearcher("I have a dog. I have a log. There is no stopping me now.", 3));
    }

    @Test
    public void test45() {
        assertEquals("I have a log.", sentenceSearcher("I have a dog. I have a log. There is no stopping me now.", 4));
    }

    @Test
    public void test46() {
        assertEquals("I have a log.", sentenceSearcher("I have a dog. I have a log. There is no stopping me now.", 5));
    }

    @Test
    public void test47() {
        assertEquals("I have a log.", sentenceSearcher("I have a dog. I have a log. There is no stopping me now.", 6));
    }

    @Test
    public void test48() {
        assertEquals("I have a log.", sentenceSearcher("I have a dog. I have a log. There is no stopping me now.", 7));
    }

    @Test
    public void test49() {
        assertEquals("There is no stopping me now.", sentenceSearcher("I have a dog. I have a log. There is no stopping me now.", 8));
    }

    @Test
    public void test50() {
        assertEquals("There is no stopping me now.", sentenceSearcher("I have a dog. I have a log. There is no stopping me now.", 9));
    }

    @Test
    public void test51() {
        assertEquals("There is no stopping me now.", sentenceSearcher("I have a dog. I have a log. There is no stopping me now.", 10));
    }

    @Test
    public void test52() {
        assertEquals("There is no stopping me now.", sentenceSearcher("I have a dog. I have a log. There is no stopping me now.", 11));
    }

    @Test
    public void test53() {
        assertEquals("There is no stopping me now.", sentenceSearcher("I have a dog. I have a log. There is no stopping me now.", 12));
    }

    @Test
    public void test54() {
        assertEquals("There is no stopping me now.", sentenceSearcher("I have a dog. I have a log. There is no stopping me now.", 13));
    }

}
