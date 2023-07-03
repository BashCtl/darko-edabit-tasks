package hard;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class TwoDistinctElements {

    public static int[] returnUnique(int[] n){
        List<Integer> numbers = Arrays.stream(n).boxed().collect(Collectors.toList());
        return Arrays.stream(n).filter(number -> Collections.frequency(numbers,number)==1)
                .toArray();
    }

    @Test
    public void test01() {
        assertArrayEquals(new int[] {1, 3}, returnUnique(new int[] {5, 4, 5, 1, 4, 3, 4, 6, 6, 6}));
    }

    @Test
    public void test02() {
        assertArrayEquals(new int[] {2, 3}, returnUnique(new int[] {1, 2, 1, 3, 1, 7, 1, 9, 7, 9}));
    }

    @Test
    public void test03() {
        assertArrayEquals(new int[] {9, 7}, returnUnique(new int[] {1, 9, 8, 8, 7, 6, 1, 6}));
    }

    @Test
    public void test04() {
        assertArrayEquals(new int[] {2, 1}, returnUnique(new int[] {5, 5, 2, 4, 4, 4, 9, 9, 9, 1}));
    }

    @Test
    public void test05() {
        assertArrayEquals(new int[] {5, 6}, returnUnique(new int[] {9, 5, 6, 8, 7, 7, 1, 1, 1, 1, 1, 9, 8}));
    }

    @Test
    public void test06() {
        assertArrayEquals(new int[] {3, 2}, returnUnique(new int[] {4, 3, 9, 9, 1, 1, 6, 1, 6, 2, 4}));
    }

    @Test
    public void test07() {
        assertArrayEquals(new int[] {2, 0}, returnUnique(new int[] {44, 44, 44, 2, 55, 55, 55, 0, 66, 66, 66}));
    }

    @Test
    public void test08() {
        assertArrayEquals(new int[] {7, 1}, returnUnique(new int[] {-9,-9,-9, 7,-9,-9, 1}));
    }

    @Test
    public void test09() {
        assertArrayEquals(new int[] {-19, 4}, returnUnique(new int[] {2, 2,-19, 2, 7, 7, 4, 9, 9, 0, 0, 3, 3, 3}));
    }
    

}
