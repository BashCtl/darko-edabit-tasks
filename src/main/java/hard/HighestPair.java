package hard;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/*
Highest Pair

You will be given a collection of five cards (representing a player's hand in poker). If your hand contains at least one pair, return the card number of the highest pair (trivial if there only exists a single pair). Else, return "".

Examples
highestPair(["A", "A", "Q", "Q", "6" ]) ➞ "A"

highestPair(["J", "6", "3", "10", "8"]) ➞ ""

highestPair(["K", "7", "3", "9", "3"]) ➞ "3"

highestPair(["K", "9", "10", "J", "Q"]) ➞ ""

highestPair(["3", "5", "5", "5", "5"]) ➞ "5"
Notes
Hands with three or more of the same card still count as containing a pair (see the last example).

 */

public class HighestPair {


    public static String highestPair(String[] hand) {
        // Create a map to count occurrences of each card
        Map<String, Integer> countMap = new HashMap<>();
        for (String card : hand) {
            countMap.put(card, countMap.getOrDefault(card, 0) + 1);
        }

        Map<String, Integer> rankValue = new HashMap<>();
        rankValue.put("2", 2);
        rankValue.put("3", 3);
        rankValue.put("4", 4);
        rankValue.put("5", 5);
        rankValue.put("6", 6);
        rankValue.put("7", 7);
        rankValue.put("8", 8);
        rankValue.put("9", 9);
        rankValue.put("10", 10);
        rankValue.put("J", 11);
        rankValue.put("Q", 12);
        rankValue.put("K", 13);
        rankValue.put("A", 14);

        String highestPair = "";
        int highestValue = 0;

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            String card = entry.getKey();
            int count = entry.getValue();
            if (count >= 2) {
                int value = rankValue.get(card);
                if (value > highestValue) {
                    highestValue = value;
                    highestPair = card;
                }
            }
        }

        return highestPair;
    }


    @Test
    public void test1() {
        assertEquals("A", highestPair(new String[]{"A", "A", "K", "K", "3"}));
    }

    @Test
    public void test2() {
        assertEquals("", highestPair(new String[]{"A", "K", "Q", "J", "10"}));
    }

    @Test
    public void test3() {
        assertEquals("K", highestPair(new String[]{"A", "K", "K", "K", "Q"}));
    }

    @Test
    public void test4() {
        assertEquals("K", highestPair(new String[]{"A", "K", "K", "K", "Q"}));
    }

    @Test
    public void test5() {
        assertEquals("Q", highestPair(new String[]{"A", "K", "Q", "Q", "5"}));
    }
}
