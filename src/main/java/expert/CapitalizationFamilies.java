package expert;

import java.util.*;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
Capitalization Families

Write a function that groups words by the number of capital letters and returns
an array of object entries whose keys are the number of capital letters and the values are the groups.

Examples
grouping(["HaPPy", "mOOdy", "yummy", "mayBE"]) ➞ {
  0=["yummy"], 2=["mayBE", "mOOdy"], 3=["HaPPy"]
}

grouping(["eeny", "meeny", "miny", "moe"]) ➞ {
  0=["eeny", "meeny", "miny", "moe"]
}

grouping(["FORe", "MoR", "bOR", "tOR", "sOr", "lor"]) ➞ {
  0=["lor"], 1=["sOr"], 2=["bOR", "MoR", "tOR"], 3=["FORe"]
}

Notes
The object entries have to be sorted by the number of capital letters.
The groups will be arrays of all words sharing the same number of capital letters.
Words will be unique.

 */

public class CapitalizationFamilies {

    public static Map<Integer, List<String>> grouping(String[] w) {
        Map<Integer, List<String>> result = new HashMap<>();
        for (String word : w) {
            int countCapital = word.replaceAll("[^A-Z]", "").length();
            result.computeIfAbsent(countCapital, k -> new ArrayList<>()).add(word);
        }
        return result;
    }


    @Test
    public void test1() {
        Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();
        map.put(1, Arrays.asList("Tesh", "Deep"));
        map.put(2, Arrays.asList("TeshA", "XavieR"));
        map.put(4, Arrays.asList("TRIO", "DUTY", "COKE"));
        map.put(6, Arrays.asList("DUTIES"));
        assertEquals(map, grouping(new String[]{"Tesh", "Deep", "TeshA", "XavieR", "TRIO", "DUTY", "COKE", "DUTIES"}));
    }

    @Test
    public void test2() {
        Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();
        map.put(0, Arrays.asList("yummy"));
        map.put(2, Arrays.asList("mOOdy", "mayBE"));
        map.put(3, Arrays.asList("HaPPy"));
        assertEquals(map, grouping(new String[]{"HaPPy", "mOOdy", "yummy", "mayBE"}));
    }

    @Test
    public void test3() {
        Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();
        map.put(0, Arrays.asList("eeny", "meeny", "miny", "moe"));
        assertEquals(map, grouping(new String[]{"eeny", "meeny", "miny", "moe"}));
    }

    @Test
    public void test4() {
        Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();
        map.put(0, Arrays.asList("lor"));
        map.put(1, Arrays.asList("sOr"));
        map.put(2, Arrays.asList("MoR", "bOR", "tOR"));
        map.put(3, Arrays.asList("FORe"));
        assertEquals(map, grouping(new String[]{"FORe", "MoR", "bOR", "tOR", "sOr", "lor"}));
    }

    @Test
    public void test5() {
        Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();
        map.put(4, Arrays.asList("TAKE"));
        map.put(5, Arrays.asList("MOVIE"));
        map.put(6, Arrays.asList("PERSON"));
        assertEquals(map, grouping(new String[]{"MOVIE", "TAKE", "PERSON"}));
    }

    @Test
    public void test6() {
        Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();
        map.put(0, Arrays.asList("the", "them", "theme"));
        map.put(5, Arrays.asList("EVERY"));
        assertEquals(map, grouping(new String[]{"the", "them", "theme", "EVERY"}));
    }

}
