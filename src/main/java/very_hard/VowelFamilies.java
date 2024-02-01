package very_hard;

import java.util.Arrays;
import java.util.regex.Pattern;

import static org.hamcrest.core.Is.is;

import org.junit.Test;

import static org.junit.Assert.assertThat;

/*
Vowel Families

Write a function that selects all words that have all the same vowels
(in any order and/or number) as the first word, including the first word.

Examples
sameVowelGroup(["toe", "ocelot", "maniac"]) ➞ ["toe", "ocelot"]

sameVowelGroup(["many", "carriage", "emit", "apricot", "animal"]) ➞ ["many"]

sameVowelGroup(["hoops", "chuff", "bot", "bottom"]) ➞ ["hoops", "bot", "bottom"]

Notes

Words will contain only lowercase letters, and may contain whitespaces.
Frequency does not matter (e.g. if the first word is "loopy",
then you can include words with any number of o's, so long as they only contain o's, and not any other vowels).

 */
public class VowelFamilies {

    public static String[] sameVowelGroup(String[] words) {
        String vowels = words[0].replaceAll("[^aeiou]", "");
        Pattern pattern = Pattern.compile("[" + vowels + "]");
        return Arrays.stream(words)
                .filter(word -> {
                            boolean isFirstVowels = pattern.matcher(word).find();
                            word = word.replaceAll("[" + vowels + "]", "");
                            boolean isNoVowels = Pattern.compile("[aeiou]").matcher(word).find();
                            return isFirstVowels && !isNoVowels;
                        }
                ).toArray(String[]::new);

    }

    @Test
    public void test1() {
        assertThat(sameVowelGroup(new String[]{"hoops", "chuff", "bot", "bottom"}), is(new String[]{"hoops", "bot", "bottom"}));
    }

    @Test
    public void test2() {
        assertThat(sameVowelGroup(new String[]{"crop", "nomnom", "bolo", "yodeller"}), is(new String[]{"crop", "nomnom", "bolo"}));
    }

    @Test
    public void test3() {
        assertThat(sameVowelGroup(new String[]{"semantic", "aimless", "beautiful", "meatless icecream"}), is(new String[]{"semantic", "aimless", "meatless icecream"}));
    }

    @Test
    public void test4() {
        assertThat(sameVowelGroup(new String[]{"many", "carriage", "emit", "apricot"}), is(new String[]{"many"}));
    }

    @Test
    public void test5() {
        assertThat(sameVowelGroup(new String[]{"toe", "ocelot", "maniac"}), is(new String[]{"toe", "ocelot"}));
    }

    @Test
    public void test6() {
        assertThat(sameVowelGroup(new String[]{"a", "apple", "flat", "map", "shark"}), is(new String[]{"a", "flat", "map", "shark"}));
    }

    @Test
    public void test7() {
        assertThat(sameVowelGroup(new String[]{"a", "aa", "ab", "abc", "aaac", "abe"}), is(new String[]{"a", "aa", "ab", "abc", "aaac"}));
    }

}
