package medium;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class CloneList {

    public static Object[] clone(Object[] arr) {
        Object[] objects = Arrays.copyOf(arr, arr.length + 1);
        objects[objects.length-1]=arr;
        return objects;
    }


    @Test
    public void test01() {
        assertArrayEquals(new Object[] {1, 1, new Object[] {1, 1}}, CloneList.clone(new Object[] {1, 1}));
    }

    @Test
    public void test02() {
        assertArrayEquals(new Object[] {1, 2, 3, new Object[] {1, 2, 3}}, CloneList.clone(new Object[] {1, 2, 3}));
    }

    @Test
    public void test03() {
        assertArrayEquals(new Object[] {"x", "y", new Object[] {"x", "y"}}, CloneList.clone(new Object[] {"x", "y"}));
    }

    @Test
    public void test04() {
        assertArrayEquals(new Object[] {"a", "b", "c", new Object[] {"a", "b", "c"}}, CloneList.clone(new Object[] {"a", "b", "c"}));
    }

    @Test
    public void test05() {
        assertArrayEquals(new Object[] {5, 44, new Object[] {5, 44}}, CloneList.clone(new Object[] {5, 44}));
    }

    @Test
    public void test06() {
        assertArrayEquals(new Object[] {4, 666, new Object[] {4, 666}}, CloneList.clone(new Object[] {4, 666}));
    }

    @Test
    public void test07() {
        assertArrayEquals(new Object[] {new Object[] {}}, CloneList.clone(new Object[] {}));
    }

}
