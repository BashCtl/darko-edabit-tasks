package very_hard;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
The Out-Shuffle

An out-shuffle, also known as an out faro shuffle or a perfect shuffle,
is a controlled method for shuffling playing cards.
It is performed by splitting the deck into two equal halves and interleaving
them together perfectly, with the condition that the top card of the deck remains in place.

Using an array to represent a deck of cards, an out-shuffle looks like:

[1, 2, 3, 4, 5, 6, 7, 8] ➞ [1, 5, 2, 6, 3, 7, 4, 8]
// Card 1 remains in the first position.
If we repeat the process, the deck eventually returns to original order.

Shuffle 1:

[1, 2, 3, 4, 5, 6, 7, 8] ➞ [1, 5, 2, 6, 3, 7, 4, 8]
Shuffle 2:

[1, 5, 2, 6, 3, 7, 4, 8] ➞ [1, 3, 5, 7, 2, 4, 6, 8]
Shuffle 3:

[1, 3, 5, 7, 2, 4, 6, 8] ➞ [1, 2, 3, 4, 5, 6, 7, 8]
// Back where we started.
Write a function that takes a positive even integer representing the number
of the cards in a deck, and returns the number of out-shuffles required to return the deck to its original order.

Examples
shuffleCount(8) ➞ 3

shuffleCount(14) ➞ 12

shuffleCount(52) ➞ 8

Notes
The number of cards is always even and greater than one. Thus, the smallest possible deck size is two.
A recursive version of this challenge can be found via this link.


 */
public class OutShuffle {

    public static List<Integer> shuffle(List<Integer> deck) {
        List<Integer> result = new ArrayList<>();
        int mid = deck.size() / 2;
        for (int i = 0; i < mid; i++) {
            result.add(deck.get(mid + i));
            result.add(deck.get(i));
        }

        return result;
    }

    public static int shuffleCount(int num) {
        List<Integer> deck = IntStream.range(2, num).boxed().collect(Collectors.toList());
        int count = 0;
        List<Integer> tempDeck = shuffle(deck);
        count++;
        while (!deck.equals(tempDeck)) {
            count++;
            tempDeck = shuffle(tempDeck);
        }
        return count;
    }

    @Test
    public void test01() {
        assertEquals(1, shuffleCount(2));
    }

    @Test
    public void test02() {
        assertEquals(3, shuffleCount(8));
    }

    @Test
    public void test03() {
        assertEquals(12, shuffleCount(14));
    }

    @Test
    public void test04() {
        assertEquals(20, shuffleCount(26));
    }

    @Test
    public void test05() {
        assertEquals(8, shuffleCount(52));
    }

    @Test
    public void test06() {
        assertEquals(22, shuffleCount(70));
    }

    @Test
    public void test07() {
        assertEquals(51, shuffleCount(104));
    }

    @Test
    public void test08() {
        assertEquals(66, shuffleCount(208));
    }

}
