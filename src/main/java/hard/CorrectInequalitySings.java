package hard;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class CorrectInequalitySings {

    public static boolean correctSigns(String str) {
        String[] strings = str.split(" ");
        List<Boolean> results = new ArrayList<>();
        for (int i = 0; i < strings.length - 2; i += 2) {
            if (strings[i + 1].equals("<")) {
                results.add(Integer.parseInt(strings[i]) < Integer.parseInt(strings[i + 2]));
            } else {
                results.add(Integer.parseInt(strings[i]) > Integer.parseInt(strings[i + 2]));
            }
        }
        return results.stream().allMatch(Boolean::valueOf);
    }


    @Test
    public void test1() {
        assertEquals(true, correctSigns("3 < 7 < 11"));
    }

    @Test
    public void test2() {
        assertEquals(false, correctSigns("13 > 44 > 33 > 1"));
    }

    @Test
    public void test3() {
        assertEquals(true, correctSigns("1 < 2 < 6 < 9 > 3"));
    }

    @Test
    public void test4() {
        assertEquals(true, correctSigns("4 > 3 > 2 > 1"));
    }

    @Test
    public void test5() {
        assertEquals(true, correctSigns("5 < 7 > 1"));
    }

    @Test
    public void test6() {
        assertEquals(false, correctSigns("5 > 7 > 1"));
    }

    @Test
    public void test7() {
        assertEquals(false, correctSigns("9 < 9"));
    }
    

}
