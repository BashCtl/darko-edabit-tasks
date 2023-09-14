package hard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class AbacabaPattern {

    public static String abacabaPattern(int n) {
        StringBuilder sb = new StringBuilder();
        String pattern = "ABACABA";
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        if (n == 1) {
            sb.append(Character.toString(pattern.charAt(0)));
        } else if (n == 2) {
            sb.append(pattern.substring(0, 3));
        } else if (n == 3) {
            sb.append(pattern);
        } else {
            String p = abacabaPattern(n - 1);
            sb.append(p)
                    .append(alphabet.charAt(n - 1))
                    .append(p);
        }
        return sb.toString();
    }

    @Test
    public void test1() {
        assertEquals("A", abacabaPattern(1));
    }

    @Test
    public void test2() {
        assertEquals("ABA", abacabaPattern(2));
    }

    @Test
    public void test3() {
        assertEquals("ABACABA", abacabaPattern(3));
    }

    @Test
    public void test4() {
        assertEquals("ABACABADABACABA", abacabaPattern(4));
    }

    @Test
    public void test5() {
        assertEquals("ABACABADABACABAEABACABADABACABA", abacabaPattern(5));
    }

    @Test
    public void test6() {
        assertEquals("ABACABADABACABAEABACABADABACABAFABACABADABACABAEABACABADABACABA", abacabaPattern(6));
    }

    @Test
    public void test7() {
        assertEquals("ABACABADABACABAEABACABADABACABAFABACABADABACABAEABACABADABACABAGABACABADABACABAEABACABADABACABAFABACABADABACABAEABACABADABACABA", abacabaPattern(7));
    }

    @Test
    public void test8() {
        assertEquals("ABACABADABACABAEABACABADABACABAFABACABADABACABAEABACABADABACABAGABACABADABACABAEABACABADABACABAFABACABADABACABAEABACABADABACABAHABACABADABACABAEABACABADABACABAFABACABADABACABAEABACABADABACABAGABACABADABACABAEABACABADABACABAFABACABADABACABAEABACABADABACABA", abacabaPattern(8));
    }

    @Test
    public void test9() {
        assertEquals("ABACABADABACABAEABACABADABACABAFABACABADABACABAEABACABADABACABAGABACABADABACABAEABACABADABACABAFABACABADABACABAEABACABADABACABAHABACABADABACABAEABACABADABACABAFABACABADABACABAEABACABADABACABAGABACABADABACABAEABACABADABACABAFABACABADABACABAEABACABADABACABAIABACABADABACABAEABACABADABACABAFABACABADABACABAEABACABADABACABAGABACABADABACABAEABACABADABACABAFABACABADABACABAEABACABADABACABAHABACABADABACABAEABACABADABACABAFABACABADABACABAEABACABADABACABAGABACABADABACABAEABACABADABACABAFABACABADABACABAEABACABADABACABA", abacabaPattern(9));
    }

}
