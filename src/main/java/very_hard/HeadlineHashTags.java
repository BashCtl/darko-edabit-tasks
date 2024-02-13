package very_hard;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/*
Headline Hash Tags

Write a function that retrieves the top 3 longest words of a newspaper
headline and transforms them into hashtags.
If multiple words tie for the same length, retrieve the word that occurs first.

Examples
getHashTags("How the Avocado Became the Fruit of the Global Trade")
➞ ["#avocado", "#became", "#global"]

getHashTags("Why You Will Probably Pay More for Your Christmas Tree This Year")
➞ ["#christmas", "#probably", "#will"]

getHashTags("Hey Parents, Surprise, Fruit Juice Is Not Fruit")
➞ ["#surprise", "#parents", "#fruit"]

getHashTags("Visualizing Science")
➞ ["#visualizing", "#science"]

Notes
If the title is less than 3 words, just order the words in the title by length in descending order (see example #4).
Punctuation does not count towards a word's length.

 */

public class HeadlineHashTags {

    public static String[] getHashTags(String str) {
        return Arrays.stream(str.split("[^\\w]"))
                .sorted((a, b) -> b.length() - a.length())
                .limit(3)
                .map(word -> "#" + word.toLowerCase())
                .toArray(String[]::new);
    }


    @Test
    public void test1() {
        assertThat(getHashTags("How the Avocado Became the Fruit of the Global Trade"), is(new String[]{"#avocado", "#became", "#global"}));
    }

    @Test
    public void test2() {
        assertThat(getHashTags("Why You Will Probably Pay More for Your Christmas Tree This Year"), is(new String[]{"#christmas", "#probably", "#will"}));
    }

    @Test
    public void test3() {
        assertThat(getHashTags("Hey Parents, Surprise, Fruit Juice Is Not Fruit"), is(new String[]{"#surprise", "#parents", "#fruit"}));
    }

    @Test
    public void test4() {
        assertThat(getHashTags("Visualizing Science"), is(new String[]{"#visualizing", "#science"}));
    }

    @Test
    public void test5() {
        assertThat(getHashTags("Minecraft Stars on Youtube Share Secrets to Their Fame"), is(new String[]{"#minecraft", "#youtube", "#secrets"}));
    }

    public void test6() {
        assertThat(getHashTags("Are You an Elite Entrepreneur?"), is(new String[]{"#entrepreneur", "#elite", "#are"}));
    }
}
