package hard;

import org.testng.annotations.Test;

import java.util.stream.IntStream;

import static org.testng.Assert.assertEquals;

public class DisariumNumber {

    public static boolean isDisarium(int n) {
        String[] strN = String.valueOf(n).split("");
        return (int) IntStream.range(0, strN.length)
                .mapToDouble(s -> Math.pow(Integer.parseInt(strN[s]), s + 1))
                .sum() == n;
    }


    @Test
    public void test01() {
        assertEquals(true, isDisarium(6));
    }

    @Test
    public void test02() {
        assertEquals(false, isDisarium(75));
    }

    @Test
    public void test03() {
        assertEquals(true, isDisarium(135));
    }

    @Test
    public void test04() {
        assertEquals(false, isDisarium(466));
    }

    @Test
    public void test05() {
        assertEquals(false, isDisarium(372));
    }

    @Test
    public void test06() {
        assertEquals(true, isDisarium(175));
    }

    @Test
    public void test07() {
        assertEquals(true, isDisarium(1));
    }

    @Test
    public void test08() {
        assertEquals(false, isDisarium(696));
    }

    @Test
    public void test09() {
        assertEquals(false, isDisarium(876));
    }

    @Test
    public void test10() {
        assertEquals(true, isDisarium(89));
    }

    @Test
    public void test11() {
        assertEquals(true, isDisarium(518));
    }

    @Test
    public void test12() {
        assertEquals(true, isDisarium(598));
    }

    @Test
    public void test13() {
        assertEquals(false, isDisarium(544));
    }

    @Test
    public void test14() {
        assertEquals(false, isDisarium(466));
    }
    
}
