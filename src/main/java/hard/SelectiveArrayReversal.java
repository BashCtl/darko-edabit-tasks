package hard;

import java.util.*;
import java.util.stream.Collectors;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;


public class SelectiveArrayReversal {

    public static int[] selReverse(int[] lst, int length) {
        List<Integer> numbers = Arrays.stream(lst).boxed().collect(Collectors.toList());
        if (length == 0) {
            return lst;
        } else if (length > numbers.size()) {
            Collections.reverse(numbers);
            return numbers.stream().mapToInt(Integer::intValue).toArray();
        }
        List<List<Integer>> subLists = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i += length) {
            List<Integer> sub = new ArrayList<>();
            if (i + length < numbers.size()) {
                sub = numbers.subList(i, i + length);

            } else {
                sub = numbers.subList(i, numbers.size());
            }
            Collections.reverse(sub);
            subLists.add(sub);
        }
        return subLists.stream().flatMap(Collection::stream).mapToInt(Integer::intValue).toArray();

    }

//    public static void main(String[] args) {
//        System.out.println(selReverse(new int[]{1, 2, 3, 4, 5, 6}, 2));
//        System.out.println(selReverse(new int[]{2, 4, 6, 8, 10, 12, 14, 16}, 3));
//    }


    @Test
    public void test1() {
        assertThat(selReverse(new int[]{1, 2, 3, 4, 5, 6}, 2), is(new int[]{2, 1, 4, 3, 6, 5}));
    }

    @Test
    public void test2() {
        assertThat(selReverse(new int[]{2, 4, 6, 8, 10, 12, 14, 16}, 3), is(new int[]{6, 4, 2, 12, 10, 8, 16, 14}));
    }

    @Test
    public void test3() {
        assertThat(selReverse(new int[]{5, 7, 2, 6, 0, 4, 6}, 100), is(new int[]{6, 4, 0, 6, 2, 7, 5}));
    }

    @Test
    public void test4() {
        assertThat(selReverse(new int[]{6, 0, 0, 0, 3, 8, 9, 7, 1}, 9), is(new int[]{1, 7, 9, 8, 3, 0, 0, 0, 6}));
    }

    @Test
    public void test5() {
        assertThat(selReverse(new int[]{12, 54, 67, 34, 65, 34, 33}, 0), is(new int[]{12, 54, 67, 34, 65, 34, 33}));
    }

    @Test
    public void test6() {
        assertThat(selReverse(new int[]{12, 54, 67, 34, 65, 34, 33}, 1), is(new int[]{12, 54, 67, 34, 65, 34, 33}));
    }

    @Test
    public void test7() {
        assertThat(selReverse(new int[]{22, 13, 22, 13, 13, 22, 22, 13}, 5), is(new int[]{13, 13, 22, 13, 22, 13, 22, 22}));
    }

    @Test
    public void test8() {
        assertThat(selReverse(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 2), is(new int[]{2, 1, 4, 3, 6, 5, 8, 7, 10, 9}));
    }

    @Test
    public void test9() {
        assertThat(selReverse(new int[]{1}, 2), is(new int[]{1}));
    }

    @Test
    public void test10() {
        assertThat(selReverse(new int[]{1, 2}, 2), is(new int[]{2, 1}));
    }

}
