package hard;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MagicSigilGenerator {

    public static String sigilize(String desire) {
        return desire.toLowerCase().replaceAll("(.)(?=.*\\1)", "")
                .replaceAll("\\s","")
                .replaceAll("[aeiuo]", "")
                .toUpperCase();
    }

    @Test
    public void test1() {
        assertEquals("FRNDSWHLVM", sigilize("I HAVE WONDERFUL FRIENDS WHO LOVE ME"));
    }

    @Test
    public void test2() {
        assertEquals("MBNYCSFL", sigilize("My business is financially successful"));
    }

    @Test
    public void test3() {
        assertEquals("HVBJNDTPYSWL", sigilize("I have a job I enjoy and it pays well"));
    }

    @Test
    public void test4() {
        assertEquals("CSMPLYGNTHRD", sigilize("I heard the song closing time playing on the radio"));
    }

    @Test
    public void test5() {
        assertEquals("MLTHY", sigilize("i am healthy"));
    }

    @Test
    public void test6() {
        assertEquals("FNDYSLMT", sigilize("I FOUND MY SOULMATE"));
    }
}
