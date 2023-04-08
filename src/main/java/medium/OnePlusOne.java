package medium;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static org.testng.Assert.assertEquals;

public class OnePlusOne {

    public static String wordedMath(String expr) {
        expr = expr.toLowerCase();
        String[] strExpr = expr.split(" ");
        int result = 0;
        Map<String, Integer> numbers = new HashMap<>() {
            {
                put("one", 1);
                put("two", 2);
                put("zero", 0);
            }
        };

        if (strExpr[1].equals("plus")) {
            result = numbers.get(strExpr[0]) + numbers.get(strExpr[2]);
        } else {
            result = numbers.get(strExpr[0]) - numbers.get(strExpr[2]);
        }
        Map<Integer, String> numResult = new HashMap<>() {{
            put(0, "Zero");
            put(1, "One");
            put(2, "Two");
            put(3, "Three");
            put(4, "Four");
        }};
        return numResult.get(result);
    }


    @Test
    public void test1() {
        assertEquals("Two", wordedMath("One plus one"));
    }

    @Test
    public void test2() {
        assertEquals("One", wordedMath("zero Plus one"));
    }

    @Test
    public void test3() {
        assertEquals("Zero", wordedMath("one minus one"));
    }


}
