package hard;

import static org.hamcrest.core.Is.is;

import org.junit.Test;

import static org.junit.Assert.assertThat;

public class SingleLetterSwaps {

    public static boolean[] validateSwaps(String[] arr, String str) {
        boolean[] result = new boolean[arr.length];
        for (int j = 0; j < arr.length; j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (arr[j].length() != str.length()) {
                    continue;
                }
                if (arr[j].charAt(i) != str.charAt(i)) {
                    count++;
                }
            }
            result[j] = str.length() == arr[j].length() && count == 2;
        }
        return result;
    }

    @Test
    public void test1() {
        assertThat(validateSwaps(new String[]{"BACDE", "EBCDA", "BCDEA", "ACBED"}, "ABCDE"), is(new boolean[]{true, true, false, false}));
    }

    @Test
    public void test2() {
        assertThat(validateSwaps(new String[]{"32145", "12354", "15342", "12543"}, "12345"), is(new boolean[]{true, true, true, true}));
    }

    @Test
    public void test3() {
        assertThat(validateSwaps(new String[]{"9786", "9788", "97865", "7689"}, "9768"), is(new boolean[]{true, false, false, false}));
    }

    @Test
    public void test4() {
        assertThat(validateSwaps(new String[]{"123", "321", "132", "13", "12"}, "213"), is(new boolean[]{true, false, false, false, false}));
    }

    @Test
    public void test5() {
        assertThat(validateSwaps(new String[]{"123", "1234", "1235"}, "12"), is(new boolean[]{false, false, false}));
    }

    @Test
    public void test6() {
        assertThat(validateSwaps(new String[]{"123", "123", "123"}, "133"), is(new boolean[]{false, false, false}));
    }

    @Test
    public void test7() {
        assertThat(validateSwaps(new String[]{"132", "321", "213"}, "123"), is(new boolean[]{true, true, true}));
    }

}
