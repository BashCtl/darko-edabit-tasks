package hard;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.testng.AssertJUnit.assertEquals;

public class IceCreamSandwich {

    public static boolean isIcecreamSandwich(String str) {
        Map<String, Long> counting = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<String> keys = counting.keySet().stream().collect(Collectors.toList());
        if (keys.size() == 2) {
            int countSide = counting.get(keys.get(0)).intValue() / 2;
            int countMid = counting.get(keys.get(1)).intValue();
            String side1 = new String(new char[countSide]).replace("\0", keys.get(0));
            String middle = new String(new char[countMid]).replace("\0", keys.get(1));
            return str.equals(side1 + middle + side1);
        }
        return false;


    }

    @Test
    public void test1() {
        assertEquals(true, isIcecreamSandwich("AABBBAA"));
    }

    @Test
    public void test2() {
        assertEquals(true, isIcecreamSandwich("3&&3"));
    }

    @Test
    public void test3() {
        assertEquals(true, isIcecreamSandwich("yyyyymmmmmmmmyyyyy"));
    }

    @Test
    public void test4() {
        assertEquals(true, isIcecreamSandwich("hhhhhhhhmhhhhhhhh"));
    }

    @Test
    public void test5() {
        assertEquals(true, isIcecreamSandwich("CDC"));
    }

    @Test
    public void test6() {
        System.out.println("only filling");
        assertEquals(false, isIcecreamSandwich("BBBBB"));
    }

    @Test
    public void test7() {
        System.out.println("ends are unbalanced");
        assertEquals(false, isIcecreamSandwich("AAACCCAA"));
    }

    @Test
    public void test8() {
        System.out.println("can only have one type of filling");
        assertEquals(false, isIcecreamSandwich("AACDCAA"));
    }

    @Test
    public void test9() {
        System.out.println("only one end");
        assertEquals(false, isIcecreamSandwich("AAABB"));
    }

    @Test
    public void test10() {
        System.out.println("too short");
        assertEquals(false, isIcecreamSandwich("AA"));
    }

    @Test
    public void test11() {
        System.out.println("too short");
        assertEquals(false, isIcecreamSandwich("A"));
    }

    @Test
    public void test12() {
        System.out.println("too short");
        assertEquals(false, isIcecreamSandwich(""));
    }

}
