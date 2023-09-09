package hard;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.Assert.assertEquals;

public class FindTheLongestWord {

    public static String findLongest(String sentence) {
        return Arrays.stream(sentence.split("[^\\w]"))
                .max(Comparator.comparingInt(String::length)
                        ).get().toLowerCase();
    }

//    public static void main(String[] args) {
//        System.out.println(findLongest("I will and ever will be gratefully and perpetually loving you Tesh!😘"));
//    }

    @Test
    public void test1() {
        assertEquals("perpetually",findLongest("I will and ever will be gratefully and perpetually loving you Tesh!😘"));
    }

    @Test
    public void test2() {
        assertEquals("darkness",findLongest("Hello darkness my old friend."));
    }

    @Test
    public void test3() {
        assertEquals("yourself",findLongest("Yourself is your soul's captain and fate's master."));
    }

    @Test
    public void test4() {
        assertEquals("daughter",findLongest("The pretty daughter's toy, a doll, is as pretty as her."));
    }

    @Test
    public void test5() {
        assertEquals("forever",findLongest("A thing of beauty is a joy forever."));
    }

    @Test
    public void test6() {
        assertEquals("forgetfulness",findLongest("Forgetfulness is by all means powerless!"));
    }

    @Test
    public void test7() {
        assertEquals("strengths",findLongest("\"Strengths\" is the longest and most commonly used word that contains only a single vowel."));
    }
    
}
