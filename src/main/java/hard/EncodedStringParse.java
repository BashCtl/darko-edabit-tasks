package hard;

import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

import static org.testng.AssertJUnit.assertEquals;

public class EncodedStringParse {

    public static Map<String, String> parseCode(String s) {
        String[] strings = s.split("0{1,}");
        Map<String, String> result = new LinkedHashMap<>();
        result.put("firstName", strings[0]);
        result.put("lastName", strings[1]);
        result.put("id", strings[2]);
        return result;
    }

    @Test
    public void test01() {
        String[][] e = new String[][] {{"firstName", "Tesha"}, {"lastName", "Xavier"}, {"id", "14344"}};
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        Stream.of(e).forEach(k -> map.put(k[0], k[1]));
        assertEquals(map, parseCode("Tesha000Xavier00014344"));
    }

    @Test
    public void test02() {
        String[][] e = new String[][] {{"firstName", "John"}, {"lastName", "Doe"}, {"id", "123"}};
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        Stream.of(e).forEach(k -> map.put(k[0], k[1]));
        assertEquals(map, parseCode("John000Doe000123"));
    }

    @Test
    public void test03() {
        String[][] e = new String[][] {{"firstName", "kevin"}, {"lastName", "smith"}, {"id", "4331"}};
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        Stream.of(e).forEach(k -> map.put(k[0], k[1]));
        assertEquals(map, parseCode("kevin0smith004331"));
    }

    @Test
    public void test04() {
        String[][] e = new String[][] {{"firstName", "Thomas"}, {"lastName", "LEE"}, {"id", "43"}};
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        Stream.of(e).forEach(k -> map.put(k[0], k[1]));
        assertEquals(map, parseCode("Thomas00LEE0000043"));
    }

    @Test
    public void test05() {
        String[][] e = new String[][] {{"firstName", "Madsy"}, {"lastName", "Jupiter"}, {"id", "321"}};
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        Stream.of(e).forEach(k -> map.put(k[0], k[1]));
        assertEquals(map, parseCode("Madsy0Jupiter0321"));
    }

    @Test
    public void test06() {
        String[][] e = new String[][] {{"firstName", "Tesh"}, {"lastName", "Deep"}, {"id", "143"}};
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        Stream.of(e).forEach(k -> map.put(k[0], k[1]));
        assertEquals(map, parseCode("Tesh000Deep000143"));
    }

}
