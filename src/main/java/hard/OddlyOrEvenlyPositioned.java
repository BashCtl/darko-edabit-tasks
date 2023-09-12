package hard;

import org.junit.Test;

import java.util.Collections;
import java.util.stream.IntStream;

import static org.junit.Assert.assertArrayEquals;


public class OddlyOrEvenlyPositioned {
    public static Object[] charAtPos(Object[] arr, String par){
        int isEven = par.equals("even")? 1: 0;
        Object[] result = IntStream.range(0, arr.length)
                .filter(i -> ((i) & 1) == isEven)
                .boxed()
                .sorted(Collections.reverseOrder())
                .map(i -> arr[arr.length - 1 - i])
                .toArray(Object[]::new);
        return result;
    }

    @Test
    public void test01() {
        assertArrayEquals(new Character[] {'E', 'A', 'I'},
                charAtPos(new Character[] {'E', 'D', 'A', 'B', 'I', 'T'}, "even"));
    }

    @Test
    public void test02() {
        assertArrayEquals(new Character[] {'D', 'B', 'T'},
                charAtPos(new Character[] {'E', 'D', 'A', 'B', 'I', 'T'}, "odd"));
    }

    @Test
    public void test03() {
        assertArrayEquals(new Character[] {'Q', 'E', 'T', 'U', 'O'},
                charAtPos(new Character[] {'Q', 'W','E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P'}, "even"));
    }

    @Test
    public void test04() {
        assertArrayEquals(new Character[] {'O', 'U', 'T', 'E', 'Q'},
                charAtPos(new Character[] {'P', 'O', 'I', 'U', 'Y', 'T', 'R', 'E', 'W', 'Q'}, "odd"));
    }

    @Test
    public void test05() {
        assertArrayEquals(new Character[] {'S', 'F', 'H', 'K', 'Z'},
                charAtPos(new Character[] {'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'Z'}, "odd"));
    }

    @Test
    public void test06() {
        assertArrayEquals(new Character[] {'A', 'D', 'G', 'J', 'L'},
                charAtPos(new Character[] {'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'Z'}, "even"));
    }

    @Test
    public void test07() {
        assertArrayEquals(new Integer[] {4, 8},
                charAtPos(new Integer[] {2, 4, 6, 8, 10}, "even"));
    }

    @Test
    public void test08() {
        assertArrayEquals(new Integer[] {2, 4, 6, 8, 10},
                charAtPos(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, "odd"));
    }

    @Test
    public void test09() {
        assertArrayEquals(new String[] {"@", "$", "^", "*", ")"},
                charAtPos(new String[] {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")"}, "odd"));
    }

    @Test
    public void test10() {
        assertArrayEquals(new String[] {"(", "&", "%", "#", "!"},
                charAtPos(new String[] {")", "(", "*", "&", "^", "%", "$", "#", "@", "!"}, "odd"));
    }

    @Test
    public void test11() {
        assertArrayEquals(new String[] {"O", "B", "T", "Y"},
                charAtPos(new String[] {"O", "R", "B", "I", "T", "L", "Y"}, "odd"));
    }

    @Test
    public void test12() {
        assertArrayEquals(new String[] {"R", "I", "L"},
                charAtPos(new String[] {"O", "R", "B", "I", "T", "L", "Y"}, "even"));
    }
    
    
    
}
