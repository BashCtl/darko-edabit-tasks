package expert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/*
Word Chain 2.0
Let's update our previous word-chain definition. In this 2.0 version,
a word-chain is an array of words, where the next word is formed by either:

Changing exactly one letter from the previous word.
Adding or subtracting one letter.
Examples
isWordChain(["row", "crow", "crown", "brown", "brawn"]) ➞ true
// add "c" to "row" to get "crow", "n" to get "crown", etc.

isWordChain(["flew", "flaw", "flan", "flat", "fat", "rat", "rot", "tot"]) ➞ true

isWordChain(["meek", "meet", "meat", "teal"]) ➞ false
// "meat" => "teal" changes 2 letters (can only change 1).

isWordChain(["run", "runny", "bunny"]) ➞ false
// "run" => "runny" adds 2 letters (can only add 1).
Notes
You can only do one (not both) for each word change.
All words will be in lower-case.


 */

public class WordChainTwo {
    private static boolean isValidTransition(String from, String to) {
        if (Math.abs(from.length() - to.length()) > 1) {
            return false;
        }

        if (from.length() == to.length()) {
            int diffCount = 0;
            for (int i = 0; i < from.length(); i++) {
                if (from.charAt(i) != to.charAt(i)) {
                    diffCount++;
                    if (diffCount > 1) {
                        return false;
                    }
                }
            }
            return diffCount == 1;
        }

        String shorter = from.length() < to.length() ? from : to;
        String longer = from.length() > to.length() ? from : to;

        for (int i = 0, j = 0; i < shorter.length() && j < longer.length(); i++, j++) {
            if (shorter.charAt(i) != longer.charAt(j)) {
                if (++j >= longer.length() || shorter.charAt(i) != longer.charAt(j)) {
                    return false;
                }
            }
        }

        return true;
    }


    public static boolean isWordChain(String[] words) {
        for (int i = 0; i < words.length - 1; i++) {
            if (!isValidTransition(words[i], words[i + 1])) {
                return false;
            }
        }
        return true;
    }


    @Test
    public void test1() {
        assertEquals(true, isWordChain(new String[]{"row", "crow", "crown", "brown", "brawn"}));
    }

    @Test
    public void test2() {
        assertEquals(true, isWordChain(new String[]{"flew", "flaw", "flan", "flat", "fat", "rat", "rot", "tot"}));
    }

    @Test
    public void test3() {
        assertEquals(false, isWordChain(new String[]{"meek", "meet", "meat", "teal"}));
    }

    @Test
    public void test4() {
        assertEquals(false, isWordChain(new String[]{"run", "runny", "bunny"}));
    }

    @Test
    public void test5() {
        assertEquals(true, isWordChain(new String[]{"fun", "fund", "find", "bind", "wind", "wild", "wile", "wiles"}));
    }

    @Test
    public void test6() {
        assertEquals(true, isWordChain(new String[]{"nut", "but", "bot", "boot", "loot", "look", "book", "brook"}));
    }

    @Test
    public void test7() {
        assertEquals(true, isWordChain(new String[]{"some", "tome", "tame", "lame", "flame", "flamer", "blamer", "blamers"}));
    }

    @Test
    public void test8() {
        assertEquals(false, isWordChain(new String[]{"a", "at", "hat", "that", "what", "flat"}));
    }

    @Test
    public void test9() {
        assertEquals(false, isWordChain(new String[]{"link", "blink", "wink", "sink"}));
    }
}
