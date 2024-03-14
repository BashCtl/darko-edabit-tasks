package expert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

/*
Recursion: Flatten the Curves

The nesting of arrays can be viewed indirectly as curves and barriers
of the real data embedded in arrays, thus, defeats the very purpose
of directly accessing them thru indexes and slices. Write a recursive
function to flatten those curves (i.e. level, iron, compress, raze, topple)
and expose those data as a single array other than an array of arrays.

Examples
flatten(["Tesh", 121317, ["Love", "of", ["my", ["life", ["and", "my", ["world"], "entirely"]]]]])
➞ ["Tesh", 121317, "Love", "of", "my", "life", "and", "my", "world", "entirely"]

flatten([[[[[["direction"], [372], ["one"], [[[[[["Era"]]]], "Sruth", 3337]]], "First"]]]])
➞ ["direction", 372, "one", "Era", "Sruth", 3337, "First"]

flatten([[4666], [5394], [466], [[["Saskia", [[[[["DXTD"]], "Lexi"]]]]]]])
➞ [4666, 5394, 466, "Saskia", "DXTD", "Lexi"]

flatten([[696], ["friend"], ["power"], [[[["Marcus"]]]], ["philus"]])
➞ [696, "friend", "power", "Marcus", "philus"]

flatten([[["deep"], [[["ocean"]]], [["Marge"]], ["rase", 876]]])
➞ ["deep", "ocean", "Marge", "rase", 876]

Notes
Every array has at least one element.
You are expected to solve this challenge via a recursive approach.

 */

public class RecursionFlattenCurves {

    public static Object[] flatten(Object[] r) {
        List<Object> result = new ArrayList<>();

        for (Object o : r) {
            if (o instanceof Object[]) {
                result.addAll(Arrays.asList(flatten((Object[]) o)));
            } else {
                result.add(o);
            }
        }

        return result.toArray();
    }

    private Object[][] objVector = new Object[][] {
            {"Tesh", 121317, new Object[] {"Love", "of", new Object[] {"my", new Object[] {"life", new Object[] {"and", "my", new Object[] {"world"}, "entirely"}}}}},
            {new Object[] {new Object[] {new Object[] {new Object[] {new Object[] {"direction"}, new Object[] {372}, new Object[] {"one"}, new Object[] {new Object[] {new Object[] {new Object[] {new Object[] {new Object[] {"Era"}}}}, "Sruth", 3337}}}, "First"}}}},
            {new Object[] {4666}, new Object[] {5394}, new Object[] {466}, new Object[] {new Object[] {new Object[] {"Saskia", new Object[] {new Object[] {new Object[] {new Object[] {new Object[] {"DXTD"}}, "Lexi"}}}}}}},
            {new Object[] {696}, new Object[] {"friend"}, new Object[] {"power"}, new Object[] {new Object[] {new Object[] {new Object[] {"Marcus"}}}}, new Object[] {"philus"}},
            {new Object[] {new Object[] {"deep"}, new Object[] {new Object[] {new Object[] {"ocean"}}}, new Object[] {new Object[] {"Marge"}}, new Object[] {"rase", 876}}},
            {"I", new Object[] {19.79, "love", new Object[] {12.17}, "edabit"}},
            {new Object[] {"The", new Object[] {"first", new Object[] {"of", new Object[] {"May", 0.0, 1, }}}, 2, 3, 4}},
            {7, new Object[] {11, "lived", new Object[] {new Object[] {229}}}},
            {"and", 6, new Object[] {3, "scores", new Object[] {"six", 100}}}
    };
    private Object[][] resVector = new Object[][] {
            {"Tesh", 121317, "Love", "of", "my", "life", "and", "my", "world", "entirely"},
            {"direction", 372, "one", "Era", "Sruth", 3337, "First"},
            {4666, 5394, 466, "Saskia", "DXTD", "Lexi"},
            {696, "friend", "power", "Marcus", "philus"},
            {"deep", "ocean", "Marge", "rase", 876},
            {"I", 19.79, "love", 12.17, "edabit"},
            {"The", "first", "of", "May", 0.0, 1, 2, 3, 4},
            {7, 11, "lived", 229},
            {"and", 6, 3, "scores", "six", 100}
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

    @Test
    public void test09() {
        assertArrayEquals(flatten(objVector[8]), resVector[8]);
    }
}
