package hard;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class UniqueCharacterMapping {

    public static int[] characterMapping(String str) {
        String[] letters = str.split("");
        Map<String, Integer> counters = new HashMap<>();
        int count = 0;
        for (String l : letters) {
            if (!counters.keySet().contains(l)) {
                counters.put(l, count);
                count++;
            }
        }
        return str.isEmpty() ? new int[]{}
                : Arrays.stream(letters).mapToInt(n -> counters.get(n))
                .toArray();

    }

    @Test
    public void test1() {
        assertThat(characterMapping("abcd"), is(new int[]{0, 1, 2, 3}));
    }

    @Test
    public void test2() {
        assertThat(characterMapping("abb"), is(new int[]{0, 1, 1}));
    }

    @Test
    public void test3() {
        assertThat(characterMapping("babbcb"), is(new int[]{0, 1, 0, 0, 2, 0}));
    }

    @Test
    public void test4() {
        assertThat(characterMapping("aaabb"), is(new int[]{0, 0, 0, 1, 1}));
    }

    @Test
    public void test5() {
        assertThat(characterMapping("abccbc"), is(new int[]{0, 1, 2, 2, 1, 2}));
    }

    @Test
    public void test6() {
        assertThat(characterMapping("fluffy"), is(new int[]{0, 1, 2, 0, 0, 3}));
    }

    @Test
    public void test7() {
        assertThat(characterMapping("madness"), is(new int[]{0, 1, 2, 3, 4, 5, 5}));
    }

    @Test
    public void test8() {
        assertThat(characterMapping("buttery"), is(new int[]{0, 1, 2, 2, 3, 4, 5}));
    }

    @Test
    public void test9() {
        assertThat(characterMapping("canine"), is(new int[]{0, 1, 2, 3, 2, 4}));
    }

    @Test
    public void test10() {
        assertThat(characterMapping("hohoho"), is(new int[]{0, 1, 0, 1, 0, 1}));
    }

    @Test
    public void test11() {
        assertThat(characterMapping("hmmmmm"), is(new int[]{0, 1, 1, 1, 1, 1}));
    }

    @Test
    public void test12() {
        assertThat(characterMapping(""), is(new int[]{}));
    }

}
