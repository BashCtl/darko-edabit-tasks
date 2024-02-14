package very_hard;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.Assert.assertArrayEquals;

/*
Sorting Band Names Without Articles


Write a function that sorts the given array of band names discounting
the articles "the", "a", "an" if the first word of the band name categorically belongs to.

Examples
sortWithoutArticles(["The New Yardbirds", "The Beatles", "The Square Roots", "On A Friday", "An Irony"])
➞ ["The Beatles", "An Irony", "The New Yardbirds", "On A Friday", "The Square Roots"]

sortWithoutArticles(["The Platters", "A Yard of Yarn", "The Everly Brothers", "A Monster Effect", "The Sex Maggots"])
➞ ["The Everly Brothers", "A Monster Effect", "The Platters", "The Sex Maggots", "A Yard of Yarn"]

sortWithoutArticles(["But Myth", "An Old Dog", "Def Leppard", "The Any Glitters", "The Dawn"])
➞ ["The Any Glitters", "But Myth", "The Dawn", "Def Leppard", "An Old Dog"]

Notes
You have to return the sorted full band names.
 */

public class SortingBandNamesWithoutArticles {


    public static String[] sortWithoutArticles(String[] bands) {
        String pattern = "( ?the | ?a | ?an )";
        return Arrays.stream(bands)
                .sorted(Comparator.comparing(a -> a.toLowerCase().replaceAll(pattern, "")))
                .toArray(String[]::new);
    }


    @Test
    public void test01() {
        assertArrayEquals(new String[]{"Anywhere But Here", "The Bled", "Counterparts", "The Devil Wears Prada", "The Midway State", "Norma Jean", "Oh, Sleeper", "An Old Dog", "Pierce the Veil", "The Plot in You", "Say Anything", "A Skylit Drive", "We Came as Romans"}, sortWithoutArticles(new String[]{"The Plot in You", "The Devil Wears Prada", "Pierce the Veil", "Norma Jean", "The Bled", "Say Anything", "The Midway State", "We Came as Romans", "Counterparts", "Oh, Sleeper", "A Skylit Drive", "Anywhere But Here", "An Old Dog"}));
    }

    @Test
    public void test02() {
        assertArrayEquals(new String[]{"The Beatles", "An Irony", "The New Yardbirds", "On A Friday", "The Square Roots"}, sortWithoutArticles(new String[]{"The New Yardbirds", "The Beatles", "The Square Roots", "On A Friday", "An Irony"}));
    }

    @Test
    public void test03() {
        assertArrayEquals(new String[]{"The Everly Brothers", "A Monster Effect", "The Platters", "The Sex Maggots", "A Yard of Yarn"}, sortWithoutArticles(new String[]{"The Platters", "A Yard of Yarn", "The Everly Brothers", "A Monster Effect", "The Sex Maggots"}));
    }

    @Test
    public void test04() {
        assertArrayEquals(new String[]{"The Any Glitters", "But Myth", "The Dawn", "Def Leppard", "An Old Dog", "Thereafter"}, sortWithoutArticles(new String[]{"But Myth", "An Old Dog", "Def Leppard", "Thereafter", "The Any Glitters", "The Dawn"}));
    }

    @Test
    public void test05() {
        assertArrayEquals(new String[]{"Analytics", "The Beastie Boys", "The Gamma Ray", "Led Zeppelin", "Radiohead", "Van Halen"}, sortWithoutArticles(new String[]{"Van Halen", "Analytics", "The Beastie Boys", "Radiohead", "The Gamma Ray", "Led Zeppelin"}));
    }

    @Test
    public void test06() {
        assertArrayEquals(new String[]{"The Artistics", "Coldplay", "The Fugees", "The Grateful Dead", "The Young Guns"}, sortWithoutArticles(new String[]{"The Young Guns", "The Fugees", "Coldplay", "The Grateful Dead", "The Artistics"}));
    }

    @Test
    public void test07() {
        assertArrayEquals(new String[]{"The Bee Gees", "The Cure", "Goo Goo Dolls", "The Old American Rejects", "The Who"}, sortWithoutArticles(new String[]{"The Old American Rejects", "The Cure", "The Who", "Goo Goo Dolls", "The Bee Gees"}));
    }
}
