package hard;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class PositiveDominant {

    public static boolean isPositiveDominant(int[] n) {
        long positive = Arrays.stream(n).filter(x -> x > 0)
                .distinct()
                .count();
        long negative = Arrays.stream(n).filter(x -> x < 0)
                .distinct()
                .count();
        return positive > negative;
    }

    @Test
    public void test01() {
        assertEquals(false, isPositiveDominant(new int[] {1, 1, 1, 1,-3,-4}));
    }

    @Test
    public void test02() {
        assertEquals(true, isPositiveDominant(new int[] {5, 99, 832,-3,-4}));
    }

    @Test
    public void test03() {
        assertEquals(true, isPositiveDominant(new int[] {5, 0}));
    }

    @Test
    public void test04() {
        assertEquals(false, isPositiveDominant(new int[] {0,-4,-1}));
    }

    @Test
    public void test05() {
        assertEquals(true, isPositiveDominant(new int[] {1, 2, 3,-1}));
    }

    @Test
    public void test06() {
        assertEquals(false, isPositiveDominant(new int[] {1, 0, 0,-1}));
    }

    @Test
    public void test07() {
        assertEquals(true, isPositiveDominant(new int[] {5, 4, 3, 0, 0,-1,-1,-2,-2}));
    }

    @Test
    public void test08() {
        assertEquals(false, isPositiveDominant(new int[] {52, 52, 52,-3, 2, 2, 2,-4}));
    }

    @Test
    public void test09() {
        assertEquals(false, isPositiveDominant(new int[] {3, 3, 3, 3,-1,-1,-1}));
    }

    @Test
    public void test10() {
        assertEquals(false, isPositiveDominant(new int[] {-112, 40, 17, -61, -74, 19, -126, 76, 113, -177, 61, 94, -84, 17, -65, 33, -131, -85, -132, -134, 71, 92, -195, -28, 184, -154, 179, -30, -6, 69, -101, -187, -195, -49, -59, -155, 110, 82, 126, 30, 173, -167, 11, -139, 47, -45, -174, 90, -170, -38}));
    }

    @Test
    public void test11() {
        assertEquals(true, isPositiveDominant(new int[] {-178, 43, 4,-124, 143, 53,-105,-156, 92, 90, 101, 63, 147,-61, 167,-61,-73,-17, 2, 33, 154, 14, 60, 167, 19, 150, 17, 199, 127, 9, 197,-25, 74,-122, 166, 164, 10,-178, 198,-184,-36,-36,-195,-132, 90,-68,-81,-6, 172, 66}));
    }

    @Test
    public void test12() {
        assertEquals(true, isPositiveDominant(new int[] {124, 159, 32,-155,-110, 138,-18, 163,-128,-96, 83,-176,-16,-135, 12,-22, 63, 68, 86, 19,-128, 90, 135,-17, 199, 36, 10, 41, 114, 123,-29, 24,-51, 15,-180, 109, 14,-159, 23, 192,-142,-192,-182,-196, 106,-129, 16, 193,-17,-32}));
    }

    @Test
    public void test13() {
        assertEquals(false, isPositiveDominant(new int[] {-147, 159,-5, 45,-80, 18,-142,-154,-54, 115, 19, 93, 23,-19, 85,-56, 127, 96, 55,-179, 120,-79,-76, 61,-177,-90, 141, 149, 0,-162,-181, 68, 10,-81, 28, 32,-112,-34,-193,-200,-164, 118, 140, 75, 21,-68, 147,-125,-33,-155}));
    }

    @Test
    public void test14() {
        assertEquals(true, isPositiveDominant(new int[] {60, 44,-175, 28, 131, 156, 142, 163, 1, 73, 64, 33, 7,-147, 180,-166, 10, 198,-168, 8, 169, 196, 150,-54, 138, 195,-41,-80,-57,-161,-74,-119, 134, 164, 92,-117,-48, 166, 52,-94, 99, 28, 42, 113, 149, 51,-77, 80, 51, 200}));
    }

    @Test
    public void test15() {
        assertEquals(false, isPositiveDominant(new int[] {46, 159, 119,-186,-178, 136, 44, 172,-78,-89,-45, 173,-181,-145, 190,-102,-5, 157, 83, 79,-141,-24, 16, 109,-50, 169, 147,-117,-148, 166,-76,-168,-106,-84,-54,-95,-102,-116,-19,-128,-5, 175,-85,-173, 56, 82, 186,-102,-39,-85}));
    }

    @Test
    public void test16() {
        assertEquals(false, isPositiveDominant(new int[] {-58, 24,-22, 161, 68, 112, 137, 67,-166, 33, 37,-77,-41, 146, 91, 17, 4,-136, 62,-41,-24,-51,-147, 157,-114,-22,-103,-19, 69,-84,-118,-172, 80,-188, 121,-38, 176, 33,-71, 180,-98, 96, 121, 196, 34,-135,-132,-112, 166,-178}));
    }

    @Test
    public void test17() {
        assertEquals(false, isPositiveDominant(new int[] {73, 119,-116, 189, 64,-140,-153, 132,-181,-183,-180,-118, 152,-133,-120, 166, 182,-132, 30,-138,-12,-192, 132, 141,-71, 28,-134,-88,-145,-4, 177, 126, 109,-181, 200,-41,-112, 122, 165,-65,-25, 139,-5,-134,-23,-93, 170, 48, 28,-88}));
    }

    @Test
    public void test18() {
        assertEquals(true, isPositiveDominant(new int[] {161,-119,-54, 117, 124,-31, 183,-46,-192, 27,-151,-98, 117, 120,-5,-164, 178,-45,-25, 183, 179,-118,-45, 114,-35, 157,-188, 32,-83, 106, 179,-63,-97,-142, 169,-51, 129, 72, 107, 192, 139,-112,-111, 11, 151,-170, 144,-25, 52, 42}));
    }

}