package hard;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WrongNumber {

    public static int wrongNumber(int[][] m) {
        int result = 0;
        int[] rowTotal = Arrays.stream(m)
                .mapToInt(row -> Arrays.stream(row).limit(row.length - 1).sum()).toArray();
        int[] columnsTotal = IntStream.range(0, m.length)
                .mapToObj(i -> Arrays.stream(m).limit(m.length - 1).mapToInt(row -> row[i]).sum()).mapToInt(Integer::intValue).toArray();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (columnsTotal[i] != m[m.length - 1][i] && rowTotal[j] != m[j][m.length - 1]) {
                    int wrongNumber = m[j][i];
                    int diff = m[j][m.length - 1] - rowTotal[j];
                    result = i == m.length - 1 ? wrongNumber - diff : wrongNumber + diff;
                    break;
                }
            }
        }
        return result;
    }


    @Test
    public void test01() {
        assertEquals(1, wrongNumber(new int[][]{{2, 2, 3, 6}, {4, 5, 6, 15}, {7, 8, 9, 24}, {12, 15, 18, 45}}));
    }

    @Test
    public void test02() {
        assertEquals(4, wrongNumber(new int[][]{{1, 2, 3, 6}, {5, 5, 6, 15}, {7, 8, 9, 24}, {12, 15, 18, 45}}));
    }

    @Test
    public void test03() {
        assertEquals(3, wrongNumber(new int[][]{{1, 2, 4, 6}, {4, 5, 6, 15}, {7, 8, 9, 24}, {12, 15, 18, 45}}));
    }

    @Test
    public void test04() {
        assertEquals(5, wrongNumber(new int[][]{{1, 2, 3, 6}, {4, 6, 6, 15}, {7, 8, 9, 24}, {12, 15, 18, 45}}));
    }

    @Test
    public void test05() {
        assertEquals(4, wrongNumber(new int[][]{{1, 2, 3, 6}, {3, 5, 6, 15}, {7, 8, 9, 24}, {12, 15, 18, 45}}));
    }

    @Test
    public void test06() {
        assertEquals(6, wrongNumber(new int[][]{{1, 2, 3, 7}, {4, 5, 6, 15}, {7, 8, 9, 24}, {12, 15, 18, 45}}));
    }

    @Test
    public void test07() {
        assertEquals(45, wrongNumber(new int[][]{{1, 2, 3, 6}, {4, 5, 6, 15}, {7, 8, 9, 24}, {12, 15, 18, 46}}));
    }

    @Test
    public void test08() {
        assertEquals(15, wrongNumber(new int[][]{{1, 2, 3, 6}, {4, 5, 6, 15}, {7, 8, 9, 24}, {12, 13, 18, 45}}));
    }

    @Test
    public void test09() {
        assertEquals(15, wrongNumber(new int[][]{{1, 2, 3, 6}, {4, 5, 6, 17}, {7, 8, 9, 24}, {12, 15, 18, 45}}));
    }

}
