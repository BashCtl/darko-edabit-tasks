package hard;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CapitalChallenge {

    public static String selectLetters(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s2.length(); i++) {
            if (Character.isUpperCase(s2.charAt(i)) && i < s1.length()) {
                result.append(s1.charAt(i));
            }
        }
        for (int i = 0; i < s1.length(); i++) {
            if (Character.isUpperCase(s1.charAt(i)) && i < s2.length()) {
                result.append(s2.charAt(i));
            }
        }
        return result.toString();
    }

//    public static void main(String[] args) {
//        System.out.println(selectLetters("heLLO", "GUlp"));
//    }

    @Test
    public void test1() {
        assertEquals("help", selectLetters("heLLO", "GUlp"));
    }

    @Test
    public void test2() {
        assertEquals("135", selectLetters("1234567", "XxXxX"));
    }

    @Test
    public void test3() {
        assertEquals("EYSomeThings", selectLetters("EVERYTHING", "SomeThings"));
    }

    @Test
    public void test4() {
        assertEquals("atrpten", selectLetters("PaTtErN", "pAtTeRn"));
    }

    @Test
    public void test5() {
        assertEquals("", selectLetters("nothing", "nothing"));
    }

    @Test
    public void test6() {
        assertEquals("What doR", selectLetters("What do you think of it so far?", "RUBBISH!"));
    }
    
}
