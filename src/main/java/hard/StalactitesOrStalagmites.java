package hard;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class StalactitesOrStalagmites {

    public static String mineralFormation(int[][] form) {
        boolean isStalactites = Arrays.stream(form[0]).anyMatch(n -> n == 1);
        boolean isStalagmites = Arrays.stream(form[form.length - 1]).anyMatch(n -> n == 1);
        if (isStalactites && isStalagmites) {
            return "both";
        } else if (isStalactites) {
            return "stalactites";
        }
        return "stalagmites";
    }

    @Test
    public void test01() {
        assertEquals("stalactites", mineralFormation(new int[][] {
                {0, 1, 0, 1},
                {0, 1, 0, 1},
                {0, 0, 0, 1},
                {0, 0, 0, 0}
        }));
    }

    @Test
    public void test02() {
        assertEquals("stalagmites", mineralFormation(new int[][] {
                {0, 0, 0, 0},
                {0, 1, 0, 1},
                {0, 1, 1, 1},
                {0, 1, 1, 1}
        }));
    }

    @Test
    public void test03() {
        assertEquals("both", mineralFormation(new int[][] {
                {1, 0, 1, 0},
                {1, 1, 0, 1},
                {0, 1, 1, 1},
                {0, 1, 1, 1}
        }));
    }

    @Test
    public void test04() {
        assertEquals("stalactites", mineralFormation(new int[][] {
                {1}, {1}, {0}, {0}
        }));
    }

    @Test
    public void test05() {
        assertEquals("both", mineralFormation(new int[][] {
                {1}, {1}, {0}, {1}
        }));
    }

    @Test
    public void test06() {
        assertEquals("both", mineralFormation(new int[][] {
                {0, 1},
                {1, 1},
                {1, 1},
                {1, 0}
        }));
    }

    @Test
    public void test07() {
        assertEquals("stalagmites", mineralFormation(new int[][] {
                {0, 0},
                {1, 1}
        }));
    }

    @Test
    public void test08() {
        assertEquals("stalactites", mineralFormation(new int[][] {
                {1, 1},
                {0, 0}
        }));
    }

}
