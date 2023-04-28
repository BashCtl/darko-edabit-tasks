package hard;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;

public class MangleString {

    public static String mangle(String str) {
        return Arrays.stream(str.split(" "))
                .map(word -> transform(word))
                .collect(Collectors.joining(" "));
    }

    public static String transform(String word) {
        return Arrays.stream(word.split(""))
                .map(letter -> {
                    if (letter.matches("\\w")) {
                        letter = !letter.matches("[zZ]")
                                ? String.valueOf((char) (letter.charAt(0) + 1))
                                : letter.equals("z") ? "a" : "A";
                        if (letter.matches("[aeiou]")) {
                            letter = letter.toUpperCase();
                        }
                    }
                    return letter;
                }).collect(Collectors.joining());
    }

    @Test
    public void test1() {
        assertEquals("GvO Ujnft!", mangle("Fun times!"));
    }

    @Test
    public void test2() {
        System.out.println();
        assertEquals("UIf rvjdl cspxO gpy.", mangle("The quick brown fox."));
    }

    @Test
    public void test3() {
        assertEquals("Pnfhb", mangle("Omega"));
    }

    @Test
    public void test4() {
        assertEquals("J xjmm Ofwfs cf UIjt zpvOh bhbjO. Fwfs. PI EbnO… J kvtU hpU pmEfs.", mangle("I will never be this young again. Ever. Oh damn… I just got older."));
    }

    @Test
    public void test5() {
        assertEquals("TIpvmE xf tUbsU dmbtt Opx, ps tIpvmE xf xbjU gps fwfszpOf Up hfU Ifsf?", mangle("Should we start class now, or should we wait for everyone to get here?"));
    }

    @Test
    public void test6() {
        assertEquals("DIfdl cbdl Upnpsspx; J xjmm tff jg UIf cppl Ibt bssjwfE.", mangle("Check back tomorrow; I will see if the book has arrived."));
    }

    @Test
    public void test7() {
        assertEquals("UIf mblf jt b mpOh xbz gspn Ifsf.", mangle("The lake is a long way from here."));
    }

    @Test
    public void test8() {
        assertEquals("JU xbt hfUUjOh Ebsl, bOE xf xfsfO’U UIfsf zfU.", mangle("It was getting dark, and we weren’t there yet."));
    }

    @Test
    public void test9() {
        assertEquals("UIf nztUfsjpvt Ejbsz sfdpsEt UIf wpjdf.", mangle("The mysterious diary records the voice."));
    }

    @Test
    public void test10() {
        assertEquals("DbUt bsf hppE qfUt, gps UIfz bsf dmfbO bOE bsf OpU Opjtz.", mangle("Cats are good pets, for they are clean and are not noisy."));
    }

    @Test
    public void test11() {
        System.out.println("Don't forget that \"z\" becomes \"a\"!");
        assertEquals("bcdA", mangle("abcz"));
    }

    @Test
    public void test12() {
        System.out.println("If a letter is already uppercase, return it as uppercase.");
        assertEquals("BCDA", mangle("ABCZ"));
    }


}
