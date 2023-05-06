package hard;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

import static org.testng.AssertJUnit.assertEquals;

public class WordRankScoringSystem {

    public static String word_rank(String str) {
        Map<String, Integer> wordsAndSum = Arrays.stream(str.split("[^\\w]"))
                .filter(word->!word.isEmpty())
                .distinct()
                .collect(Collectors.toMap(word -> word, word -> wordToInt(word)));
        return Collections.max(wordsAndSum.entrySet(), Map.Entry.comparingByValue()).getKey();


    }

    public static int wordToInt(String word) {
        return Arrays.stream(word.toLowerCase().split(""))
                .mapToInt(n -> n.charAt(0) == 'a' ? 1 : (int) n.charAt(0) - (int) 'a'+1)
                .sum();
    }

//    public static void main(String[] args) {
//        System.out.println(word_rank("Wednesday is hump day."));
//        System.out.println(wordToInt("your"));
//        System.out.println(wordToInt("chocolate"));
//    }

    @Test
    public void test1() {
        assertEquals("chocolate", word_rank("If the Easter Bunny and the Tooth Fairy had babies would they take your teeth and leave chocolate for you?"));
    }

    @Test
    public void test2() {
        assertEquals("memory", word_rank("The memory we used to share is no longer coherent."));
    }

    @Test
    public void test3() {
        assertEquals("dentist", word_rank("He didn't want to go to the dentist, yet he went anyway."));
    }

    @Test
    public void test4() {
        assertEquals("consumption", word_rank("What was the person thinking when they discovered cow's milk was fine for human consumption... and why did they do it in the first place!?"));
    }

    @Test
    public void test5() {
        assertEquals("plays", word_rank("Mary plays the piano."));
    }

    @Test
    public void test6() {
        assertEquals("pretty", word_rank("I hear that Nancy is very pretty."));
    }

    @Test
    public void test7() {
        assertEquals("sounds", word_rank("If you like tuna and tomato sauce- try combining the two. It's really not as bad as it sounds."));
    }

    @Test
    public void test8() {
        assertEquals("works", word_rank("She works two jobs to make ends meet; at least, that was her reason for not having time to join us."));
    }

    @Test
    public void test9() {
        assertEquals("Wednesday", word_rank("Wednesday is hump day, but has anyone asked the camel if he's happy about it?"));
    }

    @Test
    public void test10() {
        assertEquals("metaphysics", word_rank("The body may perhaps compensates for the loss of a true metaphysics."));
    }

    @Test
    public void test11() {
        assertEquals("different", word_rank("The clock within this blog and the clock on my laptop are 1 hour different from each other."));
    }

    @Test
    public void test12() {
        assertEquals("tomorrow", word_rank("Check back tomorrow; I will see if the book has arrived."));
    }


}
