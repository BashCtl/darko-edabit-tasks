package hard;





import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.testng.AssertJUnit.assertEquals;


public class PeelingOffTheOuterLayers {

    public static Object[][] peelLayer(Object[][] arr) {
        return IntStream.range(1, arr.length - 1)
                .mapToObj(i -> Arrays.copyOfRange(arr[i], 1, arr[i].length - 1))
                .toArray(Object[][]::new);
    }

    @Test
    public void test1() {
        assertEquals(
                new Character[][]{
                        {'f', 'g'},
                        {'j', 'k'}
                },
                peelLayer(
                        new Character[][]{
                                {'a', 'b', 'c', 'd'},
                                {'e', 'f', 'g', 'h'},
                                {'i', 'j', 'k', 'l'},
                                {'m', 'n', 'o', 'p'}
                        }
                )
        );
    }

    @Test
    public void test2() {
        assertEquals(
                new Integer[][]{
                        {7, 8, 9},
                        {12, 13, 14},
                        {17, 18, 19},
                        {22, 23, 24},
                        {27, 28, 29}
                },
                peelLayer(
                        new Integer[][]{
                                {1, 2, 3, 4, 5},
                                {6, 7, 8, 9, 10},
                                {11, 12, 13, 14, 15},
                                {16, 17, 18, 19, 20},
                                {21, 22, 23, 24, 25},
                                {26, 27, 28, 29, 30},
                                {31, 32, 33, 34, 35}
                        }
                )
        );
    }

    @Test
    public void test3() {
        assertEquals(
                new Boolean[][]{{false}},
                peelLayer(
                        new Boolean[][]{
                                {true, false, true},
                                {false, false, true},
                                {true, true, true}
                        }
                )
        );
    }

    @Test
    public void test4() {
        assertEquals(
                new String[0],
                peelLayer(
                        new String[][]{
                                {"hello", "world"},
                                {"hello", "world"}
                        }
                )
        );
    }

    @Test
    public void test5() {
        assertEquals(
                new Object[][]{{false, true, 5, 6, 7}},
                peelLayer(
                        new Object[][]{
                                {true, false, true, 1, 2, 3, 4},
                                {false, false, true, 5, 6, 7, 8},
                                {true, true, true, 9, 10, 11, 12}
                        }
                )
        );
    }

}
