package medium;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FirstBeforeSecondLetter {

    public static boolean firstBeforeSecond(String t, String f, String s){
       return t.lastIndexOf(f)<t.indexOf(s);
    }

//    public static void main(String[] args) {
//        System.out.println(firstBeforeSecond("a rabbit jumps joyfully", "a", "j"));
//        System.out.println(firstBeforeSecond("happy birthday", "a", "y"));
//    }

    @Test
    public void test01() {
        assertEquals(true, firstBeforeSecond("a rabbit jumps joyfully", "a", "j"));
    }

    @Test
    public void test02() {
        assertEquals(true, firstBeforeSecond("tesha is my world", "y", "d"));
    }

    @Test
    public void test03() {
        assertEquals(true, firstBeforeSecond("knaves knew about waterfalls", "k", "w"));
    }

    @Test
    public void test04() {
        assertEquals(true, firstBeforeSecond("maria makes money", "m", "o"));
    }

    @Test
    public void test05() {
        assertEquals(true, firstBeforeSecond("the hostess made pecan pie", "h", "p"));
    }

    @Test
    public void test06() {
        assertEquals(true, firstBeforeSecond("barry the butterfly flew away", "b", "f"));
    }

    @Test
    public void test07() {
        assertEquals(true, firstBeforeSecond("moody muggles", "m", "g"));
    }

    @Test
    public void test08() {
        assertEquals(false, firstBeforeSecond("happy birthday", "a", "y"));
    }

    @Test
    public void test09() {
        assertEquals(false, firstBeforeSecond("precarious kangaroos", "k", "a"));
    }

    @Test
    public void test10() {
        assertEquals(false, firstBeforeSecond("maria makes money", "m", "i"));
    }

    @Test
    public void test11() {
        assertEquals(false, firstBeforeSecond("taken by the beautiful sunrise", "u", "s"));
    }

    @Test
    public void test12() {
        assertEquals(false, firstBeforeSecond("sharp cheddar biscuit", "t", "s"));
    }

    @Test
    public void test13() {
        assertEquals(false, firstBeforeSecond("moody muggles", "m", "o"));
    }
}
