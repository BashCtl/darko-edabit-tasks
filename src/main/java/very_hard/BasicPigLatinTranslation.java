package very_hard;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
Basic Pig Latin Translation

Create a function that takes a string of words and moves
the first letter of each word to the end of it, then adds "ay"
to the end of the word. This is called "Pig Latin"
and it gets more complicated than the rules in this particular challenge.
I've intentionally kept things simple, otherwise this would turn into an extremely tedious challenge.

Move the first letter of each word to the end of the word.
Add "ay" to the end of the word.
Words starting with a vowel (A, E, I, O, U) simply have "WAY" appended to the end.
Examples
pigLatin("Cats are great pets.")
➞ "Atscay areway reatgay etspay."

pigLatin("Tom got a small piece of pie.")
➞ "Omtay otgay away mallsay iecepay ofway iepay."

pigLatin("He told us a very exciting tale.")
➞ "Ehay oldtay usway away eryvay excitingway aletay."
Notes
Be sure to preserve proper capitalization and punctuation.

 */


public class BasicPigLatinTranslation {

    public static String processWord(String word) {
        if (word.matches("^[AEIOUaeiou].*$")) {
            return word + "way";
        } else {
            String s = word.substring(1) + word.charAt(0) + "ay";
            if (Character.isUpperCase(word.charAt(0))) {
                word = (s).toLowerCase();
                return word.substring(0, 1).toUpperCase() + word.substring(1);
            }
            return s;
        }
    }

    public static String pigLatin(String str) {
        String last = str.substring(str.length() - 1);
        str = str.substring(0, str.length() - 1);
        return Arrays.stream(str.split(" "))
                .map(word -> processWord(word))
                .collect(Collectors.joining(" ")) + last;
    }

    @Test
    public void test1() {
        assertEquals("Atscay areway reatgay etspay.", pigLatin("Cats are great pets."));
    }

    @Test
    public void test2() {
        assertEquals("Omtay otgay away mallsay iecepay ofway iepay.", pigLatin("Tom got a small piece of pie."));
    }

    @Test
    public void test3() {
        assertEquals("Ehay oldtay usway away eryvay excitingway aletay.", pigLatin("He told us a very exciting tale."));
    }

    @Test
    public void test4() {
        assertEquals("Away iamondday isway otnay enoughway.", pigLatin("A diamond is not enough."));
    }

    @Test
    public void test5() {
        assertEquals("Urryhay!", pigLatin("Hurry!"));
    }

}
