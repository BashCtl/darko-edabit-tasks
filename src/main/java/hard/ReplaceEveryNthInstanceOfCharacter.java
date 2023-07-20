package hard;

import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ReplaceEveryNthInstanceOfCharacter {

    public static String replace_nth(String txt, int nth, String old_char, String new_char) {
        StringBuilder result = new StringBuilder(txt);
        int count = 0;
        for (int i = 0; i < result.length(); i++) {
            if (result.substring(i, i + 1).equals(old_char)) {
                count++;
                if (count == nth) {
                    result.replace(i, i + 1, new_char);
                    count = 0;
                }
            }
        }
        return result.toString();
    }

    @Test
    public void test1() {
        assertEquals("Sometimes it is b_tter to just walk away from things and go back to them lat_r when you're in a b_tter frame of mind.",replace_nth("Sometimes it is better to just walk away from things and go back to them later when you're in a better frame of mind.", 3, "e", "_"));
    }

    @Test
    public void test2() {
        assertEquals("The cl@ck within this bl@g and the cl@ck @n my lapt@p are 1 h@ur different fr@m each @ther.",replace_nth("The clock within this blog and the clock on my laptop are 1 hour different from each other.", 1, "o", "@"));
    }

    @Test
    public void test3() {
        assertEquals("Lets all be unique together until we rea#ise we are all the same.",replace_nth("Lets all be unique together until we realise we are all the same.", 4, "l", "#"));
    }

    @Test
    public void test4() {
        System.out.println("Tests are case sensitive.");
        assertEquals("Sometimes, all you NExD to do is completely make an ass of yourself and laugh it off to realise that LIFE isn't so bad AFTxR all.",replace_nth("Sometimes, all you NEED to do is completely make an ass of yourself and laugh it off to realise that LIFE isn't so bad AFTER all.", 2, "E", "x"));
    }

    @Test
    public void test5() {
        assertEquals("Is it free?",replace_nth("Is it free?", 100, "e", "Y"));
    }

    @Test
    public void test6() {
        assertEquals("A glittering gem is not enough.",replace_nth("A glittering gem is not enough.", 0, "o", "-"));
    }

    @Test
    public void test7() {
        assertEquals("Please wait outside of the house.",replace_nth("Please wait outside of the house.", -3, "s", "s"));
    }

    @Test
    public void test8() {
        assertEquals("Joe made the sugar cookies; Susan d*corated them.",replace_nth("Joe made the sugar cookies; Susan decorated them.", 5, "e", "*"));
    }

    @Test
    public void test9() {
        assertEquals("Writ3ng a list of random sentences 3s harder than I in3tially thought 3t would be.",replace_nth("Writing a list of random sentences is harder than I initially thought it would be.", 2, "i", "3"));
    }

    @Test
    public void test10() {
        assertEquals("The book is in front of the table.",replace_nth("The book is in front of the table.", 3, "f", "K"));
    }

}
