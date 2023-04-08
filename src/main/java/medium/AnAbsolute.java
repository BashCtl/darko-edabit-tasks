package medium;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AnAbsolute {

    public static String absolute(String s) {
        s = s.replaceAll(" a ", " an absolute ");
        s = s.replaceAll("A ", "An absolute ");
        return s;

    }

//    public static void main(String[] args) {
//        System.out.println(absolute("Truly, a heart that beats for no one but for Tesh."));
//        System.out.println(absolute("A spread of love, not hate."));
//    }

    @Test
    public void test01() {
        assertEquals("Truly, an absolute heart that beats for no one but for Tesh.", absolute("Truly, a heart that beats for no one but for Tesh."));
    }

    @Test
    public void test02() {
        assertEquals("An absolute spread of love, not hate.", absolute("A spread of love, not hate."));
    }

    @Test
    public void test03() {
        assertEquals("An absolute thing of beauty is an absolute joy forever.", absolute("A thing of beauty is a joy forever."));
    }

    @Test
    public void test04() {
        assertEquals("An absolute world of hers where mine evolves.", absolute("A world of hers where mine evolves."));
    }

    @Test
    public void test05() {
        assertEquals("Tesh is an absolute woman of true substance and an absolute beauty.", absolute("Tesh is a woman of true substance and a beauty."));
    }

    @Test
    public void test06() {
        assertEquals("An absolute journey of many miles starts with an absolute step.", absolute("A journey of many miles starts with a step."));
    }

    @Test
    public void test07() {
        assertEquals("An apple for an absolute day keeps an absolute doctor away.", absolute("An apple for a day keeps a doctor away."));
    }

    @Test
    public void test08() {
        assertEquals("An absolute beginner's luck.", absolute("A beginner's luck."));
    }

    @Test
    public void test09() {
        assertEquals("I am an absolute champion!", absolute("I am a champion!"));
    }

    @Test
    public void test10() {
        assertEquals("Such an amazing bowler.", absolute("Such an amazing bowler."));
    }

    @Test
    public void test11() {
        assertEquals("An absolute man with no haters.", absolute("A man with no haters."));
    }

    @Test
    public void test12() {
        assertEquals("An absolute hero of the leaf.", absolute("A hero of the leaf."));
    }

    @Test
    public void test13() {
        assertEquals("That place is such an absolute beauty.", absolute("That place is such a beauty."));
    }

}
