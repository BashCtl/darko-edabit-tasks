package hard;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class FlipTheArray {

    public static Object[] flipArray(Object[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        if (arr[0] instanceof Object[]) {
            return Arrays.stream(arr).flatMap(n -> Arrays.stream((Object[]) n)).toArray();
        } else {
            return Arrays.stream(arr).map(n -> new Object[]{n}).toArray();
        }
    }

    @Test
    public void test1() {
        assertArrayEquals(new Object[] {new Object[] {1}, new Object[] {2}, new Object[] {3}, new Object[] {4}},flipArray(new Object[] {1, 2, 3, 4}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new Object[] {5, 6, 9},flipArray(new Object[] {new Object[] {5}, new Object[] {6}, new Object[] {9}}));
    }

    @Test
    public void test3() {
        assertArrayEquals(new Object[] {7, 8, 9, 55},flipArray(new Object[] {new Object[] {7}, new Object[] {8}, new Object[] {9}, new Object[] {55}}));
    }

    @Test
    public void test4() {
        assertArrayEquals(new Object[] {new Object[] {7}, new Object[] {8}, new Object[] {9}, new Object[] {55}},flipArray(new Object[] {7, 8, 9, 55}));
    }

    @Test
    public void test5() {
        assertArrayEquals(new Object[] {1, 2},flipArray(new Object[] {new Object[] {1}, new Object[] {2}}));
    }

    @Test
    public void test6() {
        assertArrayEquals(new Object[] {new Object[] {5}, new Object[] {8}},flipArray(new Object[] {5, 8}));
    }

    @Test
    public void test7() {
        assertArrayEquals(new Object[] {new Object[] {2}},flipArray(new Object[] {2}));
    }

    @Test
    public void test8() {
        assertArrayEquals(new Object[] {},flipArray(new Object[] {}));
    }

    @Test
    public void test9() {
        assertArrayEquals(new Object[] {new Object[] {5}, new Object[] {4}, new Object[] {4}},flipArray(new Object[] {5, 4, 4}));
    }

    @Test
    public void test10() {
        assertArrayEquals(new Object[] {4, 6, 6, 6},flipArray(new Object[] {new Object[] {4}, new Object[] {6}, new Object[] {6}, new Object[] {6}}));
    }

}
