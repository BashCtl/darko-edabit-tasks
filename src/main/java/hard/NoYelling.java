package hard;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NoYelling {

    public static String noYelling(String phrase){
       return phrase.replaceAll("(\\?|\\!){2,}$", "$1");
    }

    @Test
    public void test1() {
        assertEquals("What went wrong?", noYelling("What went wrong?????????"));
    }

    @Test
    public void test2() {
        assertEquals("Oh my goodness!", noYelling("Oh my goodness!!!"));
    }

    @Test
    public void test3() {
        assertEquals("WHAT!", noYelling("WHAT!"));
    }

    @Test
    public void test4() {
        assertEquals("WHAT?", noYelling("WHAT?"));
    }

    @Test
    public void test5() {
        assertEquals("Oh my goodness!", noYelling("Oh my goodness!"));
    }

    @Test
    public void test6() {
        assertEquals("I just cannot believe it.", noYelling("I just cannot believe it."));
    }

    @Test
    public void test7() {
        assertEquals("I just!!! can!!! not!!! believe!!! it!", noYelling("I just!!! can!!! not!!! believe!!! it!!!"));
    }

    @Test
    public void test8() {
        assertEquals("That's a ton!! of cheese!", noYelling("That's a ton!! of cheese!!!!"));
    }

}
