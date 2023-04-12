package hard;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;

public class ReorderDigits {

    public static int[] reorderDigits(int[] arr, String orderBy) {
        return Arrays.stream(arr).map(number -> {
            if (orderBy.equals("asc")) {
                return Integer.parseInt(Arrays.stream(String.valueOf(number).split(""))
                        .sorted().collect(Collectors.joining()));
            }
            return Integer.parseInt(Arrays.stream(String.valueOf(number).split(""))
                    .sorted(Comparator.reverseOrder()).collect(Collectors.joining()));
        }).toArray();
    }

    @Test
    public void test1() {
        assertEquals(reorderDigits(new int[]{515, 341, 98, 44, 211}, "asc"), new int[]{155, 134, 89, 44, 112});
    }

    @Test
    public void test2() {
        assertEquals(reorderDigits(new int[]{515, 341, 98, 44, 211}, "desc"), new int[]{551, 431, 98, 44, 211});
    }

    @Test
    public void test3() {
        assertEquals(reorderDigits(new int[]{63251, 78221}, "asc"), new int[]{12356, 12278});
    }

    @Test
    public void test4() {
        assertEquals(reorderDigits(new int[]{63251, 78221}, "desc"), new int[]{65321, 87221});
    }

    @Test
    public void test5() {
        assertEquals(reorderDigits(new int[]{1, 2, 3, 4}, "asc"), new int[]{1, 2, 3, 4});
    }

    @Test
    public void test6() {
        assertEquals(reorderDigits(new int[]{1, 2, 3, 4}, "desc"), new int[]{1, 2, 3, 4});
    }

    @Test
    public void test7() {
        assertEquals(reorderDigits(new int[]{12, 21, 15, 51}, "asc"), new int[]{12, 12, 15, 15});
    }

    @Test
    public void test8() {
        assertEquals(reorderDigits(new int[]{12, 21, 15, 51}, "desc"), new int[]{21, 21, 51, 51});
    }

}
