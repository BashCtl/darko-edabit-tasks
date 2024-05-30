package very_hard;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/*
Books and Book Ends

Suppose a pair of identical characters serve as book ends for all characters in between them. Write a function that returns the total number of unique characters (books, so to speak) between all pairs of book ends.

The function will look like:

countUniqueBooks("stringSequence", "bookEnd")
Examples
countUniqueBooks("AZYWABBCATTTA", 'A') ➞ 4

// 1st bookend group: "AZYWA" : 3 unique books: "Z", "Y", "W"
// 2nd bookend group: "ATTTA": 1 unique book: "T"
// "ABBCA" not included since the first "A" was used in the 1st bookend group.

countUniqueBooks("$AA$BBCATT$C$$B$", '$') ➞ 3

countUniqueBooks("ZZABCDEF", 'Z') ➞ 0
Notes
No book characters will be identical to the bookend character.
There will always be an even number of bookends.
Once a bookend is used to complete a pair, a new bookend must be found to create another pair.
Return 0 if bookends contain zero books.


 */

public class BooksAndBookEnds {
    public static int countUniqueBooks(String sequence, char bookEnd) {
        Set<Character> uniqueBooks = new HashSet<>();
        boolean insideBookends = false;

        for (char c : sequence.toCharArray()) {
            if (c == bookEnd) {
                if (insideBookends) {
                    insideBookends = false;
                } else {
                    insideBookends = true;
                }
            } else if (insideBookends) {
                uniqueBooks.add(c);
            }
        }

        return uniqueBooks.size();
    }


    @Test
    public void test1() {
        assertEquals(4, countUniqueBooks("AZYWABBCATTTA", 'A'));
    }

    @Test
    public void test2() {
        assertEquals(3, countUniqueBooks("$AA$BBCATT$C$$B$", '$'));
    }

    @Test
    public void test3() {
        assertEquals(0, countUniqueBooks("ZZABCDEF", 'Z'));
    }

    @Test
    public void test4() {
        assertEquals(6, countUniqueBooks("A#BBCD##GGA##!#", '#'));
    }

    @Test
    public void test5() {
        assertEquals(1, countUniqueBooks("&AAAAAAAAAAAA&", '&'));
    }

    @Test
    public void test6() {
        assertEquals(0, countUniqueBooks("&&&&&&&&", '&'));
    }

    @Test
    public void test7() {
        assertEquals(2, countUniqueBooks("&A&&&&&&C&", '&'));
    }

    @Test
    public void test8() {
        assertEquals(2, countUniqueBooks("&A&33333&C&", '&'));
    }

    @Test
    public void test9() {
        assertEquals(1, countUniqueBooks("&3&3&3&", '&'));
    }

    @Test
    public void test10() {
        assertEquals(2, countUniqueBooks("&4&3&3&", '&'));
    }

    @Test
    public void test11() {
        assertEquals(0, countUniqueBooks("&AA&", 'A'));
    }

    @Test
    public void test12() {
        assertEquals(3, countUniqueBooks("AZAAABDZCCZZ", 'Z'));
    }

    @Test
    public void test13() {
        assertEquals(1, countUniqueBooks("AZAAABDZCCZZ", 'A'));
    }
    
}
