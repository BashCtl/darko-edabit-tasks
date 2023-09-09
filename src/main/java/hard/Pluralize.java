package hard;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
public class Pluralize {

    public static String[] pluralize(String[] s) {
        List<String> sList = Arrays.asList(s);
        return sList.stream().distinct().map(word -> Collections.frequency(sList, word) > 1 ? word + "s" : word)
                .toArray(String[]::new);
    }

//    public static void main(String[] args) {
//        System.out.println( pluralize(new String[]{"cow", "pig", "cow", "cow"}));
//    }


    @Test
    public void test01() {
        assertArrayEquals(new String[] {"cows","pig"}, pluralize(new String[] {"cow","pig","cow","cow"}));
    }

    @Test
    public void test02() {
        assertArrayEquals(new String[] {"tables"}, pluralize(new String[] {"table","table","table"}));
    }

    @Test
    public void test03() {
        assertArrayEquals(new String[] {"chair","pencil","arm"}, pluralize(new String[] {"chair","pencil","arm"}));
    }

    @Test
    public void test04() {
        assertArrayEquals(new String[] {"list"}, pluralize(new String[] {"list"}));
    }

    @Test
    public void test05() {
        assertArrayEquals(new String[] {"sets","tuples","strings","integer"}, pluralize(new String[] {"set","set","tuple","tuple","string","string","string","string","integer"}));
    }


}
