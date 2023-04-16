package hard;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;


public class SortUnsortable {

    public Object[] sortIt(Object[] arr) {

        Arrays.sort(arr, new TaskComparator());
        return arr;
    }

    private class TaskComparator implements Comparator<Object> {
        @Override
        public int compare(Object o1, Object o2) {
            int v1 = o1.getClass().isArray() ? ((int[]) o1)[0] : (int) o1;
            int v2 = o2.getClass().isArray() ? ((int[]) o2)[0] : (int) o2;
            return v1 - v2;
        }
    }

    @Test
    public void test01() {
        assertArrayEquals(new Object[]{1, 3, 4}, sortIt(new Object[]{4, 1, 3}));
    }

    @Test
    public void test02() {
        assertArrayEquals(new Object[]{new int[]{1}, new int[]{3}, new int[]{4}}, sortIt(new Object[]{new int[]{4}, new int[]{1}, new int[]{3}}));
    }

    @Test
    public void test03() {
        assertArrayEquals(new Object[]{12, new int[]{12}, 13, 17, 1979, new int[]{2000}}, sortIt(new Object[]{13, new int[]{2000}, 1979, 12, new int[]{12}, 17}));
    }

    @Test
    public void test04() {
        assertArrayEquals(new Object[]{new int[]{1}, 3, 4}, sortIt(new Object[]{4, new int[]{1}, 3}));
    }

    @Test
    public void test05() {
        assertArrayEquals(new Object[]{1, new int[]{3}, new int[]{4}}, sortIt(new Object[]{new int[]{4}, 1, new int[]{3}}));
    }

    @Test
    public void test06() {
        assertArrayEquals(new Object[]{1, new int[]{2}, new int[]{3}, 4, new int[]{5}, 6}, sortIt(new Object[]{new int[]{3}, 4, new int[]{2}, new int[]{5}, 1, 6}));
    }

    @Test
    public void test07() {
        assertArrayEquals(new Object[]{1, new int[]{3}, new int[]{5}, 6, 7, new int[]{9}}, sortIt(new Object[]{new int[]{3}, 7, new int[]{9}, new int[]{5}, 1, 6}));
    }

    @Test
    public void test08() {
        assertArrayEquals(new Object[]{1, new int[]{3}, new int[]{5}, 6, 7, new int[]{8}, new int[]{9}}, sortIt(new Object[]{new int[]{3}, 7, new int[]{9}, new int[]{5}, 1, 6, new int[]{8}}));
    }


}
