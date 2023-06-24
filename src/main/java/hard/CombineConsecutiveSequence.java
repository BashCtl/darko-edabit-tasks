package hard;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.testng.Assert.assertEquals;

public class CombineConsecutiveSequence {

    public static boolean consecutiveCombo(int[] r, int[] s) {
        List<Integer> rList = Arrays.stream(r)
                .mapToObj(Integer::valueOf).collect(Collectors.toList());
        List<Integer> sList = Arrays.stream(s).
                mapToObj(Integer::valueOf).collect(Collectors.toList());
        List<Integer> combined = new ArrayList<>();
        combined.addAll(rList);
        combined.addAll(sList);
        Collections.sort(combined);
        return IntStream.range(0, combined.size() - 1)
                .allMatch(i -> combined.get(i + 1) - combined.get(i) == 1);

    }

    @Test
    public void test01() {
        assertEquals(true, consecutiveCombo(new int[]{12, 13, 17, 19}, new int[]{14, 16, 15, 18}));
    }

    @Test
    public void test02() {
        assertEquals(true, consecutiveCombo(new int[]{1, 4, 5, 7}, new int[]{2, 3, 6}));
    }

    @Test
    public void test03() {
        assertEquals(false, consecutiveCombo(new int[]{1, 4, 5, 6}, new int[]{2, 7, 8, 9}));
    }

    @Test
    public void test04() {
        assertEquals(false, consecutiveCombo(new int[]{1, 4, 5, 6}, new int[]{2, 3, 7, 8, 10}));
    }

    @Test
    public void test05() {
        assertEquals(true, consecutiveCombo(new int[]{7, 5, 4, 1}, new int[]{2, 3, 6, 8}));
    }

    @Test
    public void test06() {
        assertEquals(true, consecutiveCombo(new int[]{33, 34, 40}, new int[]{39, 38, 37, 36, 35, 32, 31, 30}));
    }

    @Test
    public void test07() {
        assertEquals(false, consecutiveCombo(new int[]{1, 4, 5, 6}, new int[]{2, 3, 7, 8, 10}));
    }

    @Test
    public void test08() {
        assertEquals(true, consecutiveCombo(new int[]{44, 46}, new int[]{45}));
    }

    @Test
    public void test09() {
        assertEquals(true, consecutiveCombo(new int[]{4, 3, 1}, new int[]{2, 5}));
    }

    @Test
    public void test10() {
        assertEquals(true, consecutiveCombo(new int[]{4, 3, 1}, new int[]{2, 5, 7, 6}));
    }

    @Test
    public void test11() {
        assertEquals(false, consecutiveCombo(new int[]{4, 3, 1}, new int[]{7, 6, 5}));
    }

    @Test
    public void test12() {
        assertEquals(false, consecutiveCombo(new int[]{4, 3, 1}, new int[]{0, 7, 6, 5}));
    }

    @Test
    public void test13() {
        assertEquals(true, consecutiveCombo(new int[]{44, 46}, new int[]{45}));
    }

}
