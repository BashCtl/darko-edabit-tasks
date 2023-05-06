package hard;

import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.testng.AssertJUnit.assertEquals;

public class TripleDoubleSoMuchTrouble {

    public static boolean trouble(long num1, long num2) {
        String s1 = String.valueOf(num1);
        String s2 = String.valueOf(num2);
        String number = findNumber(s1, 3);
        return !number.isEmpty() && s2.matches(String.format(".*%s{2}.*", number));
    }

    public static String findNumber(String s, int times) {
        String[] numbers = s.split("");
        for (String number : numbers) {
            Pattern pattern = Pattern.compile(String.format("%s{%s}", number, times));
            Matcher matcher = pattern.matcher(s);
            if (matcher.find()) {
                return matcher.group().substring(0, 1);
            }
        }
        return "";
    }

//    public static void main(String[] args) {
//        System.out.println(trouble(451999277L, 41177722899L));
//    }

    @Test
    public void test1() {
        assertEquals(true, trouble(451999277L, 41177722899L));
    }

    @Test
    public void test2() {
        assertEquals(true, trouble(444, 44));
    }

    @Test
    public void test3() {
        assertEquals(false, trouble(1222345, 12345));
    }

    @Test
    public void test4() {
        assertEquals(false, trouble(12345, 12345));
    }

    @Test
    public void test5() {
        assertEquals(true, trouble(888, 888));
    }

    @Test
    public void test6() {
        assertEquals(true, trouble(666789, 12345667));
    }

    @Test
    public void test7() {
        assertEquals(true, trouble(10560002, 100));
    }

    @Test
    public void test8() {
        assertEquals(false, trouble(1, 1));
    }

    @Test
    public void test9() {
        assertEquals(false, trouble(9111922229333339L, 9559669779L));
    }

}
