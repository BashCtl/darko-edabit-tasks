package hard;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TruncateStringAtGivenLength {

    public static String truncate(String str, int length) {
        String[] strings = str.split(" ");
        StringBuilder result = new StringBuilder();
        int l = 0;
        for (String s : strings) {
            l += s.length();
            if (l <= length) {
                result.append(s)
                        .append(" ");
                l++;
            }
            if (l > length) {
                break;
            }
        }
        return result.toString().trim();
    }

//    public static void main(String[] args) {
//        System.out.println(truncate("Lorem ipsum dolor sit amet.", 11));
//        System.out.println(truncate("Lorem ipsum dolor sit amet.", 16));
//        System.out.println(truncate("Lorem ipsum dolor sit amet.", 17));
//
//    }

    @Test
    public void test1() {
        System.out.println("Clean cut.");
        assertEquals("Lorem ipsum", truncate("Lorem ipsum dolor sit amet.", 11));
    }

    @Test
    public void test2() {
        System.out.println("Dirty cut; you have to discard the last word.");
        assertEquals("Lorem ipsum", truncate("Lorem ipsum dolor sit amet.", 16));
    }

    @Test
    public void test3() {
        System.out.println("If length is greater than the strings length.");
        assertEquals("Lorem ipsum", truncate("Lorem ipsum", 20));
    }

    @Test
    public void test4() {
        assertEquals("", truncate("Lorem ipsum", 4));
    }

    @Test
    public void test5() {
        assertEquals("", truncate("Lorem ipsum", 0));
    }

    @Test
    public void test6() {
        assertEquals("", truncate("", 30));
    }

}
