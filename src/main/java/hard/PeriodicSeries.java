package hard;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class PeriodicSeries {

    public static int periodic(String str) {
        List<String> numbers = new ArrayList<>();
        int l = str.length();
        if (l == 1) {
            return l;
        }
        while (true) {
            numbers.add(str);
            int sum = digitSum(str);
            str = str + sum;
            str = str.substring(str.length() - l);
            if (numbers.contains(str)) {
                return numbers.size();
            }
        }
    }


    private static int digitSum(String str) {
        return Arrays.stream(str.split("")).mapToInt(Integer::parseInt)
                .sum();
    }

//    public static void main(String[] args) {
//        System.out.println(periodic("02468"));
//        System.out.println(periodic("314159265"));
//    }

    @Test
    public void test1() {
        assertEquals(1, periodic("2"));
    }

    @Test
    public void test2() {
        assertEquals(13, periodic("22"));
    }

    @Test
    public void test3() {
        assertEquals(4, periodic("157"));
    }

    @Test
    public void test4() {
        assertEquals(943, periodic("1234567"));
    }

    @Test
    public void test5() {
        assertEquals(1, periodic("1818"));
    }

    @Test
    public void test6() {
        assertEquals(778, periodic("0000001"));
    }

}
