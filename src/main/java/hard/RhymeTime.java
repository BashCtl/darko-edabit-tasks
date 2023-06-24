package hard;

import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class RhymeTime {

    public static boolean doesRhyme(String str1, String str2) {
        String[] words1 = str1.toLowerCase().split(" ");
        String[] words2 = str2.toLowerCase().split(" ");
        String lastWord1 = words1[words1.length-1];
        String lastWord2 = words2[words2.length-1];
        String v1 = lastWord1.replaceAll("[^aioue]", "");
        String v2 = lastWord2.replaceAll("[^aioue]", "");
        return v1.equals(v2);
    }

//    public static void main(String[] args) {
//        System.out.println(doesRhyme("Sam I am!", "Green eggs and ham."));
//    }

    @Test
    public void test1() {
        System.out.println("Should work with punctuation.");
        assertEquals(true, doesRhyme("Sam I am!", "Green eggs and ham."));
    }

    @Test
    public void test2() {
        System.out.println("Should work with uppercase/punctuation.");
        assertEquals(true, doesRhyme("Sam I am!", "Green eggs and HAM."));
    }

    @Test
    public void test3() {
        assertEquals(true, doesRhyme("head straight to town", "give me not a frown"));
    }

    @Test
    public void test4() {
        assertEquals(true, doesRhyme("with an unpleasant bump", "in a slump"));
    }

    @Test
    public void test5() {
        System.out.println("Should work with punctuation.");
        assertEquals(true, doesRhyme("your elbow and chin!", "how much can you win?"));
    }

    @Test
    public void test6() {
        System.out.println("Should work with upper case letters.");
        assertEquals(true, doesRhyme("you will start to race", "the waiting Place"));
    }

    @Test
    public void test7() {
        System.out.println("Should work with punctuation.");
        assertEquals(true, doesRhyme("All that waiting and staying.", "where the band are playing."));
    }

    @Test
    public void test8() {
        assertEquals(false, doesRhyme("You are off to the races", "a splendid day."));
    }

    @Test
    public void test9() {
        assertEquals(false, doesRhyme("and frequently do?", "you gotta move."));
    }

    @Test
    public void test10() {
        assertEquals(false, doesRhyme("down by the bay", "where the watermelons grow"));
    }

    @Test
    public void test11() {
        assertEquals(false, doesRhyme("back to my home", "i dare not go"));
    }

}
