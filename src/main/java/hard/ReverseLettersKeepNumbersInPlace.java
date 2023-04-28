package hard;

import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;

public class ReverseLettersKeepNumbersInPlace {

    public static String reverse(String str) {
        List<String> lettersSorted = Arrays.stream(str.replaceAll("\\d", "").split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        for (int i = 0; i < str.length(); i++) {
            String symbol = String.valueOf(str.charAt(i));
            if (symbol.matches("\\d")) {
                int index = str.indexOf(symbol,i);
                lettersSorted.add(index, symbol);
            }
        }
       return String.join("", lettersSorted);
    }

//    public static void main(String[] args) {
//        System.out.println(reverse("ab89c"));
//    }

    @Test
    public void test1() {
        assertEquals("cb89a",reverse("ab89c"));
    }

    @Test
    public void test2() {
        assertEquals("onm5lk923j",reverse("jkl5mn923o"));
    }

    @Test
    public void test3() {
        assertEquals("123a45",reverse("123a45"));
    }

    @Test
    public void test4() {
        assertEquals("c1b1a",reverse("a1b1c"));
    }

}
