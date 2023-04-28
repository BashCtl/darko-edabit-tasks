package medium;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class CountingAdverbs {

    public static int countAdverbs(String sentence) {
        return (int) Arrays.stream(sentence.replaceAll("[^\\w ]", "").split(" "))
                .filter(word -> word.endsWith("ly")).count();
    }

    @Test
    public void test1() {
        assertEquals(1, countAdverbs("She ran hurriedly towards the stadium."));
    }

    @Test
    public void test2() {
        assertEquals(2, countAdverbs("She ate the lasagna heartily and noisily."));
    }

    @Test
    public void test3() {
        assertEquals(0, countAdverbs("He hates potatoes."));
    }

    @Test
    public void test4() {
        assertEquals(3, countAdverbs("He was happily, crazily, foolishly over the moon."));
    }

    @Test
    public void test5() {
        assertEquals(1, countAdverbs("She writes poetry beautifully."));
    }

    @Test
    public void test6() {
        assertEquals(0, countAdverbs("There are many fat geese in the park."));
    }

    @Test
    public void test7() {
        assertEquals(2, countAdverbs("The horse acted aggressively and stubbornly."));
    }

    @Test
    public void test8() {
        System.out.println("-ly should not be counted if it is not at the end.");
        assertEquals(0, countAdverbs("She forgot where to buy the lysol."));
    }

    @Test
    public void test9() {
        System.out.println("-ly should not be counted if it is not at the end.");
        assertEquals(0, countAdverbs("Ilya ran to the store."));
    }

}
