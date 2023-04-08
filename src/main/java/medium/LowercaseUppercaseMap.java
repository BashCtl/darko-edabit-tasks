package medium;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;

public class LowercaseUppercaseMap {

    public static Map<String, String> mapping(String[] letters) {
        return Arrays.stream(letters).collect(Collectors.toMap(e -> e, String::toUpperCase));
    }

    @Test
    public void test01() {
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("x", "X");
        map.put("a", "A");
        map.put("v", "V");
        map.put("i", "I");
        map.put("e", "E");
        map.put("r", "R");
        assertEquals(map, mapping(new String[]{"x", "a", "v", "i", "e", "r"}));
    }

    @Test
    public void test02() {
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("t", "T");
        map.put("e", "E");
        map.put("s", "S");
        map.put("h", "H");
        map.put("a", "A");
        assertEquals(map, mapping(new String[]{"t", "e", "s", "h", "a"}));
    }

    @Test
    public void test03() {
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("d", "D");
        map.put("x", "X");
        map.put("t", "T");
        map.put("s", "S");
        assertEquals(map, mapping(new String[]{"d", "x", "t", "s"}));
    }

    @Test
    public void test04() {
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("d", "D");
        map.put("t", "T");
        assertEquals(map, mapping(new String[]{"d", "t"}));
    }

    @Test
    public void test05() {
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("t", "T");
        map.put("x", "X");
        assertEquals(map, mapping(new String[]{"t", "x"}));
    }

    @Test
    public void test06() {
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("a", "A");
        map.put("b", "B");
        assertEquals(map, mapping(new String[]{"a", "b"}));
    }

    @Test
    public void test07() {
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("p", "P");
        map.put("s", "S");
        assertEquals(map, mapping(new String[]{"p", "s"}));
    }

    @Test
    public void test08() {
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("u", "U");
        map.put("v", "V");
        assertEquals(map, mapping(new String[]{"u", "v"}));
    }

    @Test
    public void test09() {
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("s", "S");
        map.put("t", "T");
        assertEquals(map, mapping(new String[]{"s", "t"}));
    }

    @Test
    public void test10() {
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("d", "D");
        map.put("x", "X");
        assertEquals(map, mapping(new String[]{"d", "x"}));
    }

    @Test
    public void test11() {
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("c", "C");
        map.put("d", "D");
        assertEquals(map, mapping(new String[]{"c", "d"}));
    }

    @Test
    public void test12() {
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("f", "F");
        map.put("g", "G");
        assertEquals(map, mapping(new String[]{"f", "g"}));
    }

}
