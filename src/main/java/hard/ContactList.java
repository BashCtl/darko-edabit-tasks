package hard;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ContactList {

    public static String[] sortContacts(String[] arr, String sortBy) {
        if (arr==null || arr.length == 0  ) {
            return new String[]{};
        } else if (sortBy.equals("ASC")) {
            Arrays.sort(arr, Comparator.comparing(s -> s.split(" ")[1]));
            return arr;
        }
        Arrays.sort(arr, Comparator.comparing((String s) -> s.split(" ")[1]).reversed());
        return arr;
    }

    @Test
    public void test1() {
        assertThat(sortContacts(new String[]{"John Locke", "Thomas Aquinas", "David Hume", "Rene Descartes"}, "ASC"), is(new String[]{"Thomas Aquinas", "Rene Descartes", "David Hume", "John Locke"}));
    }

    @Test
    public void test2() {
        assertThat(sortContacts(new String[]{"Paul Erdos", "Leonhard Euler", "Carl Gauss"}, "DESC"), is(new String[]{"Carl Gauss", "Leonhard Euler", "Paul Erdos"}));
    }

    @Test
    public void test3() {
        assertThat(sortContacts(new String[]{"Michael Phelps", "Jesse Owens", "Michael Jordan", "Usain Bolt"}, "DESC"), is(new String[]{"Michael Phelps", "Jesse Owens", "Michael Jordan", "Usain Bolt"}));
    }

    @Test
    public void test4() {
        assertThat(sortContacts(new String[]{"Al Gore", "Barack Obama"}, "ASC"), is(new String[]{"Al Gore", "Barack Obama"}));
    }

    @Test
    public void test5() {
        assertThat(sortContacts(new String[]{"Albert Einstein"}, "ASC"), is(new String[]{"Albert Einstein"}));
    }

    @Test
    public void test6() {
        assertThat(sortContacts(new String[]{}, "DESC"), is(new String[]{}));
    }

    @Test
    public void test7() {
        assertThat(sortContacts(null, "DESC"), is(new String[]{}));
    }

}
