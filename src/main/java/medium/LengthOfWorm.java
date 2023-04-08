package medium;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class LengthOfWorm {

    public static String wormLength(String worm){
        long length = Arrays.stream(worm.split(""))
                .filter(n -> n.equals("-"))
                .count();
        return  length!=worm.length() || worm.isEmpty() ? "invalid":
                String.format("%s mm.", length*10);

    }

    @Test
    public void test01() {
        assertEquals(wormLength("----------"), "100 mm.");
    }

    @Test
    public void test02() {
        assertEquals(wormLength(""), "invalid");
    }

    @Test
    public void test03() {
        assertEquals(wormLength("---_-___---_"), "invalid");
    }

    @Test
    public void test04() {
        assertEquals(wormLength("------"), "60 mm.");
    }

    @Test
    public void test05() {
        assertEquals(wormLength("iwheguawhpvpaiehpiuwwega"), "invalid");
    }

    @Test
    public void test06() {
        assertEquals(wormLength("QWERTYUIOPASDFGHJKL"), "invalid");
    }

    @Test
    public void test07() {
        assertEquals(wormLength("------------"), "120 mm.");
    }

}
