package medium;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class PotentialFriend {

    public static boolean isPotentialFriend(String[] y, String[] o) {
        return y.length > 1 ? Arrays.stream(y)
                .filter(n -> Arrays.asList(o).contains(n))
                .count() >= 2 : y[0].equals(o[0]);
    }

    @Test
    public void test01() {
        assertEquals(true, isPotentialFriend(new String[]{"sports", "music", "chess"}, new String[]{"coding", "sports", "music"}));
    }

    @Test
    public void test02() {
        assertEquals(false, isPotentialFriend(new String[]{"cycling", "technology", "reading"}, new String[]{"dancing", "planes", "politics"}));
    }

    @Test
    public void test03() {
        assertEquals(false, isPotentialFriend(new String[]{"history"}, new String[]{"gaming", "drawing", "coding", "history"}));
    }

    @Test
    public void test04() {
        assertEquals(true, isPotentialFriend(new String[]{"films"}, new String[]{"films"}));
    }

    @Test
    public void test05() {
        assertEquals(true, isPotentialFriend(new String[]{"sports", "music", "chess"}, new String[]{"coding", "music", "netflix", "chess"}));
    }

    @Test
    public void test06() {
        assertEquals(false, isPotentialFriend(new String[]{"cycling", "technology", "drawing"}, new String[]{"dancing", "drawing"}));
    }

    @Test
    public void test07() {
        assertEquals(true, isPotentialFriend(new String[]{"history", "acting", "cards"}, new String[]{"history", "acting", "cards"}));
    }

    @Test
    public void test08() {
        assertEquals(true, isPotentialFriend(new String[]{"coding", "music", "netflix", "chess"}, new String[]{"sports", "music", "chess"}));
    }

}
