package hard;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class TreePhotography {

    public static String photograph(int[] trees) {
        int left = 0;
        int right = 0;
        int maxH = Arrays.stream(trees).max().getAsInt();
        for (int i = 0; i < trees.length - 1; i++) {

            if (trees[0] < trees[i + 1]) {
                left++;
            }
            if(trees[i]==maxH){
                break;
            }
        }
        for (int i = trees.length - 1; i > 0; i--) {
            if (trees[trees.length - 1] < trees[i - 1]) {
                right++;
            }
            if(trees[i-1]==maxH){
                break;
            }
        }
        return left > right ? "left" : "right";
    }

    @Test
    public void test01() {
        assertEquals("left", photograph(new int[]{1, 2, 3, 6, 5}));
    }

    @Test
    public void test02() {
        assertEquals("right", photograph(new int[]{5, 6, 5, 4}));
    }

    @Test
    public void test03() {
        assertEquals("left", photograph(new int[]{1, 1, 2, 2, 2, 2, 3}));
    }

    @Test
    public void test04() {
        assertEquals("left", photograph(new int[]{1, 2, 3, 2, 2, 2, 2, 2, 2, 2, 2}));
    }

    @Test
    public void test05() {
        assertEquals("right", photograph(new int[]{3, 3, 3, 3, 2}));
    }

    @Test
    public void test06() {
        assertEquals("right", photograph(new int[]{4, 3, 2, 3, 3, 3, 1}));
    }

    @Test
    public void test07() {
        assertEquals("left", photograph(new int[]{3, 1, 4, 5, 2, 5, 1}));
    }

    @Test
    public void test08() {
        assertEquals("right", photograph(new int[]{4, 3, 3, 4, 3, 1, 3}));
    }

    @Test
    public void test09() {
        assertEquals("right", photograph(new int[]{5, 1, 2}));
    }

    @Test
    public void test10() {
        assertEquals("left", photograph(new int[]{1, 2, 4, 1, 5, 3, 1}));
    }

    @Test
    public void test11() {
        assertEquals("left", photograph(new int[]{1, 1, 1, 4, 1, 3, 5}));
    }

    @Test
    public void test12() {
        assertEquals("left", photograph(new int[]{3, 1, 4, 1, 5, 9, 2, 6}));
    }

}
