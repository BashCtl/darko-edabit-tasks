package medium;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;

public class EmphasizeTheWords {

    public static String emphasize(String str) {
        String lowerCase = str.toLowerCase();
        return lowerCase.length() > 0 ? Arrays.stream(lowerCase.split(" "))
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
                .collect(Collectors.joining(" ")) : lowerCase;
    }

    @Test
    public void test01() {
        assertEquals("I Am, But All Yours, Tesh!", emphasize("I AM, BUT aLL yOuRs, TESH!"));
    }

    @Test
    public void test02() {
        assertEquals("Truly A Masterpiece!", emphasize("truly a masterpiece!"));
    }

    @Test
    public void test03() {
        assertEquals("Hello World!", emphasize("hello world!"));
    }

    @Test
    public void test04() {
        assertEquals("Good Morning.", emphasize("GOOD MORNING."));
    }

    @Test
    public void test05() {
        assertEquals("99 Red Balloons.", emphasize("99 Red Balloons."));
    }

    @Test
    public void test06() {
        assertEquals("1 2 3 4 5 6 7 8 9", emphasize("1 2 3 4 5 6 7 8 9"));
    }

    @Test
    public void test07() {
        assertEquals("", emphasize(""));
    }

    @Test
    public void test08() {
        assertEquals("Joshua Senoron", emphasize("joshua senoron"));
    }

    @Test
    public void test09() {
        assertEquals("You Just Did It!", emphasize("yOU jUst dId It!"));
    }

    @Test
    public void test10() {
        assertEquals("Where To Diane?", emphasize("whErE tO DIANE?"));
    }

}
