package hard;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.regex.Pattern;

import static org.testng.Assert.assertEquals;

public class SentenceSearcher {

    public static String sentenceSearcher(String s, String w) {
        Pattern pattern = Pattern.compile(Pattern.quote(w), Pattern.CASE_INSENSITIVE);
        String result = Arrays.stream(s.split("((?<=\\.))"))
                .filter(sentence -> pattern.matcher(sentence).find())
                .findFirst()
                .orElse("");
        return result.trim();
    }

    @Test
    public void test01() {
        assertEquals("I am all hers.", sentenceSearcher("For the love of Tesh. She is the love of my life. I am all hers.", "hers"));
    }

    @Test
    public void test02() {
        assertEquals("She is the love of my life.", sentenceSearcher("For the love of Tesh. She is the love of my life. I am all hers.", "LIFE"));
    }

    @Test
    public void test03() {
        assertEquals("She is the love of my life.", sentenceSearcher("For the love of Tesh. She is the love of my life. I am all hers.", "she"));
    }

    @Test
    public void test04() {
        assertEquals("For the love of Tesh.", sentenceSearcher("For the love of Tesh. She is the love of my life. I am all hers.", "LOVE"));
    }

    @Test
    public void test05() {
        assertEquals("I am all hers.", sentenceSearcher("For the love of Tesh. She is the love of my life. I am all hers.", "All"));
    }

    @Test
    public void test06() {
        assertEquals("For the love of Tesh.", sentenceSearcher("For the love of Tesh. She is the love of my life. I am all hers.", "for"));
    }

    @Test
    public void test07() {
        assertEquals("I have a cat.", sentenceSearcher("I have a cat. I have a mat. Things are going swell.", "cat"));
    }

    @Test
    public void test08() {
        assertEquals("I have a mat.", sentenceSearcher("I have a cat. I have a mat. Things are going swell.", "MAT"));
    }

    @Test
    public void test09() {
        assertEquals("I have a cat.", sentenceSearcher("I have a cat. I have a mat. Things are going swell.", "Have"));
    }

    @Test
    public void test10() {
        assertEquals("Things are going swell.", sentenceSearcher("I have a cat. I have a mat. Things are going swell.", "swell"));
    }

    @Test
    public void test11() {
        assertEquals("Things are going swell.", sentenceSearcher("I have a cat. I have a mat. Things are going swell.", "things"));
    }

    @Test
    public void test12() {
        assertEquals("", sentenceSearcher("I have a cat. I have a mat. Things are going swell.", "flat"));
    }

}
