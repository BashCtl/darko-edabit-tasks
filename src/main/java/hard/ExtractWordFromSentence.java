package hard;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ExtractWordFromSentence {

    public static String removeWord(final String sentence, String word) {
        return sentence.replace(word, "")
                .replace("  ", " ");
    }


    @Test
    public void test1() {
        assertEquals(
                "The quick brown jumped over the lazy dog",
                removeWord(
                        "The quick brown fox jumped over the lazy dog",
                        "fox"
                )
        );
    }

    @Test
    public void test2() {
        assertEquals(
                "The cow over the moon",
                removeWord(
                        "The cow jumped over the moon",
                        "jumped"
                )
        );
    }

    @Test
    public void test3() {
        assertEquals(
                "Sally sells seashells by seashore",
                removeWord(
                        "Sally sells seashells by the seashore",
                        "the"
                )
        );
    }

    @Test
    public void test4() {
        assertEquals(
                "I like to walk on ",
                removeWord(
                        "I like to walk on Sundays",
                        "Sundays"
                )
        );
    }

}
