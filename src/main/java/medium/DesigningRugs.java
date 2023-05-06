package medium;

import org.testng.annotations.Test;

import java.util.Collections;
import java.util.Optional;
import java.util.stream.IntStream;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class DesigningRugs {

    public static String[] makeRug(int m, int n, Optional<String> s){
        String sign = s.orElse("#");
       return IntStream.range(0,m)
                .mapToObj(x->String.join("", Collections.nCopies(n,sign)))
                .toArray(String[]::new);
    }

    @Test
    public void test01() {
        assertArrayEquals(new String[] {"tct", "tct"}, makeRug(2, 1, Optional.ofNullable("tct")));
    }

    @Test
    public void test02() {
        assertArrayEquals(new String[] {"#####", "#####", "#####"}, makeRug(3, 5, Optional.ofNullable(null)));
    }

    @Test
    public void test03() {
        assertArrayEquals(new String[] {"$$$$$", "$$$$$", "$$$$$"}, makeRug(3, 5, Optional.ofNullable("$")));
    }

    @Test
    public void test04() {
        assertArrayEquals(new String[] {"TTT"}, makeRug(1, 3, Optional.ofNullable("T")));
    }

    @Test
    public void test05() {
        assertArrayEquals(new String[] {"XXXXXXX", "XXXXXXX", "XXXXXXX"}, makeRug(3, 7, Optional.ofNullable("X")));
    }

    @Test
    public void test06() {
        assertArrayEquals(new String[] {"AAAAAA", "AAAAAA"}, makeRug(2, 6, Optional.ofNullable("A")));
    }

}
