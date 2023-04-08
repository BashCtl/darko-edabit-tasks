package medium;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;

public class LetterBestFriend {

    public static boolean bestFriend(String s, String a, String b) {
        if (a.equals(b)) {
            return false;
        }
        List<String> words = Arrays.stream(s.split(String.format("[^%s%s]", a, b))).filter(word -> word.contains(a))
                .collect(Collectors.toList());
        long count = words.stream().filter(word -> word.length() > 1
                        && word.startsWith(a) && word.endsWith(b))
                .count();
        return count == words.size();


    }

    @Test
    public void test01() {
        assertEquals(true, bestFriend("tesha has a pretty and a happy face", "h", "a"));
    }

    @Test
    public void test02() {
        assertEquals(true, bestFriend("tesh loves my messages", "e", "s"));
    }

    @Test
    public void test03() {
        assertEquals(false, bestFriend("we found your dynamite", "d", "y"));
    }

    @Test
    public void test04() {
        assertEquals(true, bestFriend("he headed to the store", "h", "e"));
    }

    @Test
    public void test05() {
        assertEquals(false, bestFriend("look they took the cookies", "o", "o"));
    }

    @Test
    public void test06() {
        assertEquals(true, bestFriend("i found an ounce with my hound", "o", "u"));
    }

    @Test
    public void test07() {
        assertEquals(false, bestFriend("go to edabit and meditate", "e", "d"));
    }

    @Test
    public void test08() {
        assertEquals(true, bestFriend("those were their thorns they said", "t", "h"));
    }
}
