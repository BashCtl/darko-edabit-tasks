package hard;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class FilterOutStringsFromArray {

    public static String[] filterArray(String[] str){
       return Arrays.stream(str).filter(s-> s.matches("\\d+"))
                .distinct()
                .toArray(String[]::new);
    }

    @Test
    public void test1() {
       assertEquals(filterArray(new String[]{"1", "2", "a", "b"}), new String[]{"1", "2"});
    }

    @Test
    public void test2() {
       assertEquals(filterArray(new String[]{"1", "a", "b", "0", "15"}), new String[]{"1", "0", "15"});
    }

    @Test
    public void test3() {
       assertEquals(filterArray(new String[]{"1", "2", "aasf", "1", "123", "123"}), new String[]{"1", "2", "123"});
    }

    @Test
    public void test4() {
       assertEquals(filterArray(new String[]{"jsyt", "4", "yt", "6"}), new String[]{"4","6"});
    }

    @Test
    public void test5() {
       assertEquals(filterArray(new String[]{"r", "5", "y", "e", "8", "9"}), new String[]{"5", "8", "9"});
    }

    @Test
    public void test6() {
       assertEquals(filterArray(new String[]{"a", "e", "i", "o", "u"}), new String[]{});
    }

    @Test
    public void test7() {
       assertEquals(filterArray(new String[]{"4", "z", "f", "5"}), new String[]{"4", "5"});
    }

    @Test
    public void test8() {
       assertEquals(filterArray(new String[]{"abc", "123"}), new String[]{"123"});
    }

    @Test
    public void test9() {
       assertEquals(filterArray(new String[]{"$%^", "567", "&&&"}), new String[]{"567"});
    }

    @Test
    public void test10() {
       assertEquals(filterArray(new String[]{"w", "r", "u", "43", "s", "a", "76", "d", "88"}), new String[]{"43", "76", "88"});
    }

}
