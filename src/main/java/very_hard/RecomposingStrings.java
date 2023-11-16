package very_hard;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/*
Recomposing Strings

In this challenge, the goal is recomposing scrambled strings made of two or more words.

Every string has to be reversed not in its totality, but by vowels or consonants
clusters in the order they are found; after splitting the string in groups,
and reversing every group with more than a letter, you'll obtain the correct sequence:

String = "KiKdaola"

Separation vowels/consonants = K  i  Kd  ao  l  a

Reversing the groups = K  i  dK  oa  l  a

New string = KidKoala
Now, you have to insert a space between the words. A word starts with a capital letter:

String = "KidKoala"

Result = "Kid Koala"
Given a string, implement a function that returns, in turn, a new correct string, following the above instructions.

Examples
recompose("KiKdaola") ➞ "Kid Koala"

recompose("BaosdrOCfanada") ➞ "Boards Of Canada"
// B  ao  sdr  O  Cf  a  n  a  d  a
// B  oa  rds  O  fC  a  n  a  d  a

recompose("hCemicarBlohtesr") ➞ "Chemical Brothers"
// hC  e  m  i  c  a  rBl  o  ht  e  sr
// Ch  e  m  i  c  a  lBr  o  th  e  rs
Notes
Every given string will be valid, containing only letters and at least two words (identified by the capital letters).
Remember to reverse the clusters of letters and not the entire string.

 */

public class RecomposingStrings {

    public static String recompose(String str) {
        String[] strings = str.split("(?<=[aeiouAEIOU])(?!([aeiouAEIOU]|$))|(?<!([aeiouAEIOU]|^))(?=[aeiouAEIOU])");

        String s = Arrays.stream(strings).map(l ->
                new StringBuilder(l).reverse().toString()
        ).collect(Collectors.joining());
        return Arrays.stream(s.split("(?=\\p{Lu})")).collect(Collectors.joining(" "));


    }

    @Test
    public void test1() {
        assertEquals("Kid Koala", recompose("KiKdaola"));
    }

    @Test
    public void test2() {
        assertEquals("Boards Of Canada", recompose("BaosdrOCfanada"));
    }

    @Test
    public void test3() {
        assertEquals("Chemical Brothers", recompose("hCemicarBlohtesr"));
    }

    @Test
    public void test4() {
        assertEquals("Mouse On Mars", recompose("MuosOeMnasr"));
    }

    @Test
    public void test5() {
        assertEquals("Aphex Twin", recompose("AhpewTxin"));
    }

    @Test
    public void test6() {
        assertEquals("Massive Attack", recompose("MassivAettakc"));
    }

    @Test
    public void test7() {
        assertEquals("Does It Offend You Yeah", recompose("DeosItOffeYdnuoYaeh"));
    }

}

