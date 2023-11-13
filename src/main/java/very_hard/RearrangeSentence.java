package very_hard;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
Given a sentence with numbers representing a word's location embedded within each word, return the sorted sentence.

Examples
rearrange("Tesh3 th5e 1I lov2e way6 she7 j4ust i8s.") ➞ "I love Tesh just the way she is."

rearrange("the4 t3o man5 Happ1iest of6 no7 birt2hday steel8!") ➞ "Happiest birthday to the man of no steel!"

rearrange("is2 Thi1s T4est 3a") ➞ "This is a Test"

rearrange("4of Fo1r pe6ople g3ood th5e the2") ➞ "For the good of the people"

rearrange(" ") ➞ ""

Notes
Only the integers 1-9 will be used.

 */

public class RearrangeSentence {

    public static String rearrange(String s){
       return Arrays.stream(s.split(" "))
                .sorted(Comparator.comparingInt(a -> Integer.parseInt(a.replaceAll("[^\\d]", ""))))
        .map(word -> word.replaceAll("[\\d]", ""))
        .collect(Collectors.joining(" "));
    }

    @Test
    public void test01() {
        assertEquals("I love Tesh just the way she is.", rearrange("Tesh3 th5e 1I lov2e way6 she7 j4ust i8s."));
    }

    @Test
    public void test02() {
        assertEquals("Happiest birthday to the man of no steel!", rearrange("the4 t3o man5 Happ1iest of6 no7 birt2hday steel8!"));
    }

    @Test
    public void test03() {
        assertEquals("A lawyer's perspective on the issues at hand.", rearrange("persp3ective ha8nd. o4n is6sues at7 1A law2yer's t5he"));
    }

    @Test
    public void test04() {
        assertEquals("An olive juice on your birthday, Tesh!", rearrange("birth6day, 5your An1 juic3e o4n Tesh7! oli2ve"));
    }

    @Test
    public void test05() {
        assertEquals("I'm in love with the birthday girl.", rearrange("2in the5 I1'm with4 lov3e gir7l. birthd6ay"));
    }

    @Test
    public void test06() {
        assertEquals("This is a Test", rearrange("is2 Thi1s T4est 3a"));
    }

    @Test
    public void test07() {
        assertEquals("For the good of the people", rearrange("4of Fo1r pe6ople g3ood th5e the2"));
    }

    @Test
    public void test08() {
        assertEquals("", rearrange(" "));
    }

    @Test
    public void test09() {
        assertEquals("Cristiano Ronaldo is the best.", rearrange("is3 Cri1stiano 4the Rona2ldo 5best."));
    }

    @Test
    public void test10() {
        assertEquals("I eat samosa", rearrange("samosa3 I1 e2at"));
    }

    @Test
    public void test11() {
        assertEquals("happy coding yall!", rearrange("h1appy y3all! coding2"));
    }
}
