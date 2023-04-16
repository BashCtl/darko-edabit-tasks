package hard;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class Parseltongue {

    public static boolean isParselTongue(String sentence) {
        sentence = sentence.toLowerCase().trim();
        String[] words = sentence.split(" ");
        long sCount = Arrays.stream(words)
                .filter(word -> word.contains("s")).count();
        long ssCount = Arrays.stream(words)
                .filter(word -> word.matches(".*s{2,}.*"))
                .count();
        return ssCount == 1 ? sCount == ssCount : ssCount > 1;
    }


    @Test
    public void test1() {
        assertEquals(true, isParselTongue("Sshe ssselects to eat that apple."));
    }

    @Test
    public void test2() {
        assertEquals(false, isParselTongue("She ssselects to eat that apple."));
    }

    @Test
    public void test3() {
        assertEquals(true, isParselTongue("You ssseldom sssspeak sso boldly, ssso messmerizingly."));
    }

    @Test
    public void test4() {
        assertEquals(false, isParselTongue("Steve likes to eat pancakes"));
    }

    @Test
    public void test5() {
        assertEquals(true, isParselTongue("Sssteve likess to eat pancakess"));
    }

    @Test
    public void test6() {
        assertEquals(false, isParselTongue("Beatrice samples lemonade"));
    }

    @Test
    public void test7() {
        assertEquals(true, isParselTongue("Beatrice enjoysss lemonade"));
    }

}
