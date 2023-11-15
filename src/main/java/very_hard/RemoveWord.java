package very_hard;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/*
Remove The Word!
Create a function that takes an array and string. The function should
remove the letters in the string from the array, and return the array.

Examples
removeLetters(["s", "t", "r", "i", "n", "g", "w"], "string") ➞ ["w"]

removeLetters(["b", "b", "l", "l", "g", "n", "o", "a", "w"], "balloon") ➞ ["b", "g", "w"]

removeLetters(["d", "b", "t", "e", "a", "i"], "edabit") ➞ []
Notes
If number of times a letter appears in the array is greater than the number
of times the letter appears in the string, the extra letters should be left behind (see example #2).
If all the letters in the array are used in the string, the function should return an empty array (see example #3).


 */

public class RemoveWord {

    public static String[] removeLetters(String[] letters, String word) {
        List<String> listLetters = Arrays.stream(letters).collect(Collectors.toList());
        List<String> wordLetters = Arrays.stream(word.split("")).collect(Collectors.toList());
        wordLetters.forEach(listLetters::remove);
        return listLetters.stream().toArray(String[]::new);

    }

    @Test
    public void test1() {
        assertThat(removeLetters(new String[]{"s", "t", "r", "i", "n", "g", "w"}, "string"), is(new String[]{"w"}));
    }

    @Test
    public void test2() {
        assertThat(removeLetters(new String[]{"b", "b", "l", "l", "g", "n", "o", "a", "w"}, "balloon"), is(new String[]{"b", "g", "w"}));
    }

    @Test
    public void test3() {
        assertThat(removeLetters(new String[]{"d", "b", "t", "e", "a", "i"}, "edabit"), is(new String[]{}));
    }

    @Test
    public void test4() {
        assertThat(removeLetters(new String[]{"t", "t", "e", "s", "t", "u"}, "testing"), is(new String[]{"t", "u"}));
    }

}
