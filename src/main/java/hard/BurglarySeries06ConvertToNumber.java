package hard;

import org.testng.annotations.Test;

import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;

public class BurglarySeries06ConvertToNumber {

    public static Map<String,Integer> convertToNumber(Map<String,String> list) {
      return   list.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, v-> Integer.parseInt(v.getValue())));
    }

    private Map.Entry<String, String> p = new AbstractMap.SimpleEntry<String, String>("piano", "200");
    private Map.Entry<String, String> t = new AbstractMap.SimpleEntry<String, String>("tv", "300");
    private Map.Entry<String, String> s = new AbstractMap.SimpleEntry<String, String>("stereo", "400");
    private Map.Entry<String, Integer> x = new AbstractMap.SimpleEntry<String, Integer>("piano", 200);
    private Map.Entry<String, Integer> z = new AbstractMap.SimpleEntry<String, Integer>("tv", 300);
    private Map.Entry<String, Integer> y = new AbstractMap.SimpleEntry<String, Integer>("stereo", 400);

    @Test
    public void test01() {
        LinkedHashMap<String, Integer> a = new LinkedHashMap<>();
        LinkedHashMap<String, String> b = new LinkedHashMap<>();
        a.put(x.getKey(), x.getValue());
        b.put(p.getKey(), p.getValue());
        assertEquals(a, convertToNumber(b));
    }

    @Test
    public void test02() {
        LinkedHashMap<String, Integer> a = new LinkedHashMap<>();
        LinkedHashMap<String, String> b = new LinkedHashMap<>();
        a.put(x.getKey(), x.getValue());
        a.put(z.getKey(), z.getValue());
        b.put(p.getKey(), p.getValue());
        b.put(t.getKey(), t.getValue());
        assertEquals(a, convertToNumber(b));
    }

    @Test
    public void test03() {
        LinkedHashMap<String, Integer> a = new LinkedHashMap<>();
        LinkedHashMap<String, String> b = new LinkedHashMap<>();
        a.put(x.getKey(), x.getValue());
        a.put(z.getKey(), z.getValue());
        a.put(y.getKey(), y.getValue());
        b.put(p.getKey(), p.getValue());
        b.put(t.getKey(), t.getValue());
        b.put(s.getKey(), s.getValue());
        assertEquals(a, convertToNumber(b));
    }

}
