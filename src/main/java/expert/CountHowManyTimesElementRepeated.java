package expert;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.junit.Assert.assertTrue;

/*
Count How Many Times An Element Is Repeated


Given an array, create a function that returns an object detailing how many times each element was repeated. Sort the object by value in descending order.

Examples
countRepetitions(["cat", "dog", "cat", "cow", "cow", "cow"]) ➞ {"cow"=3, "cat"=2, "dog"=1}

countRepetitions([1, 5, 5, 5, 12, 12, 0, 0, 0, 0, 0, 0]) ➞ {0=6, 5=3, 12=2, 1=1}

countRepetitions(["Infinity", "null", "Infinity", "null", "null"]) ➞ {"null"=3, "Infinity"=2}
Notes
The array elements can be anything from string to numeric types.
The returned map object should be sorted in descending order by value

 */
public class CountHowManyTimesElementRepeated {


    public static Map<Object, Integer> countRepititions(Object[] e) {
        Map<Object, Long> collect = Arrays.stream(e)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        return collect.entrySet().stream()
                .sorted(Collections.reverseOrder(Entry.comparingByValue()))
                .collect(Collectors.toMap(Entry::getKey, t -> t.getValue().intValue(),
                        (e1, e2) -> e1, LinkedHashMap::new));
    }

    @Test
    public void test01() {
        Map<Object, Integer> hashMap = new LinkedHashMap<>();
        hashMap.put("cow", 3);
        hashMap.put("cat", 2);
        hashMap.put("dog", 1);
        assertTrue("Map should be sorted in descending order by value!", CompareMaps.equals(hashMap, countRepititions(new Object[]{"cat", "dog", "cat", "cow", "cow", "cow"})));
    }

    @Test
    public void test02() {
        Map<Object, Integer> hashMap = new LinkedHashMap<>();
        hashMap.put(0, 6);
        hashMap.put(5, 3);
        hashMap.put(12, 2);
        hashMap.put(1, 1);
        assertTrue("Map should be sorted in descending order by value!", CompareMaps.equals(hashMap, countRepititions(new Object[]{1, 5, 5, 5, 12, 12, 0, 0, 0, 0, 0, 0})));
    }

    @Test
    public void test03() {
        Map<Object, Integer> hashMap = new LinkedHashMap<>();
        hashMap.put("null", 3);
        hashMap.put("Infinity", 2);
        assertTrue("Map should be sorted in descending order by value!", CompareMaps.equals(hashMap, countRepititions(new Object[]{"Infinity", "null", "Infinity", "null", "null"})));
    }

    @Test
    public void test04() {
        Map<Object, Integer> hashMap = new LinkedHashMap<>();
        hashMap.put('E', 3);
        hashMap.put('D', 1);
        hashMap.put('P', 1);
        hashMap.put('X', 1);
        hashMap.put('A', 1);
        hashMap.put('V', 1);
        hashMap.put('I', 1);
        hashMap.put('R', 1);
        assertTrue("Map should be sorted in descending order by value!", CompareMaps.equals(hashMap, countRepititions(new Object[]{'D', 'E', 'E', 'P', 'X', 'A', 'V', 'I', 'E', 'R'})));
    }

}

class CompareMaps {
    public static boolean equals(Map<Object, Integer> a, Map<Object, Integer> b) {
        int[] x = a.values().stream().mapToInt(Integer::valueOf).toArray();
        int[] y = b.values().stream().mapToInt(Integer::valueOf).toArray();
        Object[] k = a.keySet().stream().toArray(),
                l = b.keySet().stream().toArray();
        for (int i = 0; i < x.length; i++) {
            if (x[i] != y[i] || !k[i].toString().equals(l[i].toString())) return false;
        }
        return true;
    }
}