package hard;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;

public class FridgePoetry {

    public static boolean canBuild(String s1, String s2){
        Map<String, Long> sMap1 = Arrays.stream(s1.replaceAll("\\s", "").split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<String, Long> sMap2 = Arrays.stream(s2.replaceAll("\\s", "").split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for(String key: sMap2.keySet()){
            Long value1 = sMap1.getOrDefault(key, null);
            if(value1!=null&& value1>sMap2.get(key)){
                return false;
            }
        }
        return true;
    }

    @Test
    public void test1() {
        assertEquals(true, canBuild("got 2 go", "go go go 2 today"));
    }

    @Test
    public void test2() {
        assertEquals(true, canBuild("for an angel", "angel forest nymph awaken"));
    }

    @Test
    public void test3() {
        assertEquals(true, canBuild("sit on top", "its a moo point"));
    }

    @Test
    public void test4() {
        assertEquals(true, canBuild("solar to oven", "love desolate rose thorn"));
    }

    @Test
    public void test5() {
        assertEquals(true, canBuild("gate im in", "magnetizing"));
    }

    @Test
    public void test6() {
        assertEquals(true, canBuild("moreso", "mount rushmore"));
    }

    @Test
    public void test7() {
        assertEquals(false, canBuild("dool", "ken doll"));
    }

    @Test
    public void test8() {
        assertEquals(false, canBuild("world of make believe", "make believe world"));
    }

    @Test
    public void test9() {
        assertEquals(false, canBuild("long high add or", "highway road go long"));
    }

    @Test
    public void test10() {
        assertEquals(false, canBuild("fill tuck mid", "truck falls dim"));
    }

    @Test
    public void test11() {
        assertEquals(false, canBuild("skin man i", "man in mask"));
    }

    @Test
    public void test12() {
        assertEquals(false, canBuild("foolish prides", "foolish pride"));
    }

}
