package medium;

import org.testng.annotations.Test;

import java.util.stream.IntStream;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;


public class ZipItIfYouCan {

    public static String[][] zipIt(String[] women, String[] men) {
        if (women.length != men.length) {
            return null;
        } else {
            return IntStream.range(0, women.length)
                    .mapToObj(i -> new String[]{women[i], men[i]})
                    .toArray(String[][]::new);
        }
    }

    @Test
    public void test01() {
        assertArrayEquals(new String[][]{{"Tesha", "Deep"}, {"Tesh", "Xavier"}, {"Shang", "Dex"}}, zipIt(new String[]{"Tesha", "Tesh", "Shang"}, new String[]{"Deep", "Xavier", "Dex"}));
    }

    @Test
    public void test02() {
        assertArrayEquals(new String[][]{{"Elise", "John"}, {"Mary", "Rick"}}, zipIt(new String[]{"Elise", "Mary"}, new String[]{"John", "Rick"}));
    }

    @Test
    public void test03() {
        assertArrayEquals(null, zipIt(new String[]{"Ana", "Amy", "Lisa"}, new String[]{"Bob", "Josh"}));
    }

    @Test
    public void test04() {
        assertArrayEquals(new String[][]{{"Ana", "Bob"}, {"Amy", "Josh"}, {"Lisa", "Tim"}}, zipIt(new String[]{"Ana", "Amy", "Lisa"}, new String[]{"Bob", "Josh", "Tim"}));
    }

}
