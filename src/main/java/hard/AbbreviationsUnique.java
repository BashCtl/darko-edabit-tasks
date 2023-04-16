package hard;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AbbreviationsUnique {

    public static boolean uniquely(String[] a, String[] w) {
        int count = 0;
        for (String start : a) {
            for (String word : w) {
                if (word.startsWith(start)) {
                    count++;
                }
            }
        }
        return count == a.length;
    }

    @Test
    public void test01() {
        assertEquals(true, uniquely(new String[] {"x", "l", "t"}, new String[] {"xavier", "loves", "tesha"}));
    }

    @Test
    public void test02() {
        assertEquals(true, uniquely(new String[] {"mo", "ma", "me"}, new String[] {"moment", "many", "mean"}));
    }

    @Test
    public void test03() {
        assertEquals(true, uniquely(new String[] {"at", "o", "abe"}, new String[] {"atom", "original", "abet"}));
    }

    @Test
    public void test04() {
        assertEquals(true, uniquely(new String[] {"rh", "par", "re"}, new String[] {"rhino", "parry", "residue"}));
    }

    @Test
    public void test05() {
        assertEquals(true, uniquely(new String[] {"s", "t", "v"}, new String[] {"stamina", "television", "vindaloo"}));
    }

    @Test
    public void test06() {
        assertEquals(false, uniquely(new String[] {"bi", "ba", "bat"}, new String[] {"big", "bard", "battery"}));
    }

    @Test
    public void test07() {
        assertEquals(false, uniquely(new String[] {"b", "c", "ch"}, new String[] {"broth", "chap", "cardigan"}));
    }

    @Test
    public void test08() {
        assertEquals(false, uniquely(new String[] {"to", "too", "t"}, new String[] {"topology", "took", "torrent"}));
    }

    @Test
    public void test09() {
        assertEquals(false, uniquely(new String[] {"ho", "h", "ha"}, new String[] {"house", "hope", "happy"}));
    }

}
