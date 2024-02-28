package expert;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

/*
Multi-Dimensional Array Into Single-Dimensional Array

Write a recursive function that transforms a multi-dimensional array into a single-dimensional array.

Examples
flatten([[17.2, 500, "code"], "generate"]) ➞ [17.2, 500, "code", "generate"]

flatten([[[[[2, 14, "core"]]], 2, 3, 4]]) ➞ [2, 14, "core", 2, 3, 4]

flatten([["dimension"], "vertical", [["objective"]]]) ➞ ["dimension", "vertical", "objective"]

flatten([[[[[["construct"]]]]]]) ➞ ["construct"]
Notes
Array contains at least one element.
A recursive approach to solving this challenge is gretly advised and is more convenient than the iterative approach.

 */

public class MultiDimensionalArrayIntoSingleDimensionalArray {

    public static Object[] flatten(Object[] arr) {
        ArrayList<Object> flattened = new ArrayList<>();
        for (Object obj : arr) {
            if (obj instanceof Object[]) {
                flattened.addAll(Arrays.asList(flatten((Object[]) obj)));
            } else {
                flattened.add(obj);
            }
        }
        return flattened.toArray();

    }

    private Object[][] objVector = new Object[][]{
            {new Object[]{17.2, 500, "code"}, "generate"},
            {new Object[]{new Object[]{new Object[]{new Object[]{2, 14, "core"}}}, 2, 3, 4}},
            {new Object[]{"dimension"}, "vertical", new Object[]{new Object[]{"objective"}}},
            {new Object[]{new Object[]{new Object[]{new Object[]{new Object[]{"construct"}}}}}},
            {0, new Object[]{12, "recurrence", new Object[]{new Object[]{2}}}},
            {new Object[]{3.1415926, 3.2e5, "absolute", "edabit"}},
            {4, 6, 6, 6, new Object[]{579, 466, 876, 696}},
            {new Object[]{3.14, new Object[]{1.59, new Object[]{2.65, new Object[]{3.58, new Object[]{9.79}}}}}}
    };
    private Object[][] resVector = new Object[][]{
            {17.2, 500, "code", "generate"},
            {2, 14, "core", 2, 3, 4},
            {"dimension", "vertical", "objective"},
            {"construct"},
            {0, 12, "recurrence", 2},
            {3.1415926, 320000.0, "absolute", "edabit"},
            {4, 6, 6, 6, 579, 466, 876, 696},
            {3.14, 1.59, 2.65, 3.58, 9.79}
    };

    @Test
    public void test01() {
        assertArrayEquals(flatten(objVector[0]), resVector[0]);
    }

    @Test
    public void test02() {
        assertArrayEquals(flatten(objVector[1]), resVector[1]);
    }

    @Test
    public void test03() {
        assertArrayEquals(flatten(objVector[2]), resVector[2]);
    }

    @Test
    public void test04() {
        assertArrayEquals(flatten(objVector[3]), resVector[3]);
    }

    @Test
    public void test05() {
        assertArrayEquals(flatten(objVector[4]), resVector[4]);
    }

    @Test
    public void test06() {
        assertArrayEquals(flatten(objVector[5]), resVector[5]);
    }

    @Test
    public void test07() {
        assertArrayEquals(flatten(objVector[6]), resVector[6]);
    }

    @Test
    public void test08() {
        assertArrayEquals(flatten(objVector[7]), resVector[7]);
    }

}
