package hard;

import org.testng.annotations.Test;

import java.util.stream.IntStream;

import static org.testng.Assert.assertEquals;

public class BuildingUpAWorld {

    public static boolean canBuild(String[] arr) {
        return IntStream.range(0, arr.length - 1)
                .allMatch(i -> arr[i + 1].length() == arr[i].length() + 1 && (arr[i + 1].startsWith(arr[i]) || arr[i + 1].endsWith(arr[i])));
    }

    @Test
    public void test1() {
        assertEquals(canBuild(new String[]{"a", "at", "ate", "late", "plate", "plates"}), true);
    }

    @Test
    public void test2() {
        assertEquals(canBuild(new String[]{"u", "ut", "but", "butt", "butte", "butter", "buttery"}), true);
    }

    @Test
    public void test3() {
        assertEquals(canBuild(new String[]{"a", "ka", "ika", "pika", "pikac", "pikach", "pikachu"}), true);
    }

    @Test
    public void test4() {
        assertEquals(canBuild(new String[]{"a", "at", "tat", "stat", "state", "estate", "estates"}), true);
    }

    @Test
    public void test5() {
        assertEquals(canBuild(new String[]{"o", "ol", "old", "bold", "bolde", "mbolde", "embolde", "embolden"}), true);
    }

    @Test
    public void test6() {
        assertEquals(canBuild(new String[]{"mean", "meany"}), true);
    }

    @Test
    public void test7() {
        assertEquals(canBuild(new String[]{"at", "cat", "cate", "cater", "caters"}), true);
    }

    @Test
    public void test8() {
        assertEquals(canBuild(new String[]{"a", "at", "ate", "late", "plate", "plater", "platter"}), false);
    }

    @Test
    public void test9() {
        assertEquals(canBuild(new String[]{"i", "it", "bit", "bite", "biters"}), false);
    }

    @Test
    public void test10() {
        assertEquals(canBuild(new String[]{"e", "tea", "teac", "teach", "teache", "teacher", "teachers"}), false);
    }

    @Test
    public void test11() {
        assertEquals(canBuild(new String[]{"m", "ma", "man", "many", "meany"}), false);
    }

    @Test
    public void test12() {
        assertEquals(canBuild(new String[]{"o", "op", "top", "stop", "stops", "stoops"}), false);
    }

    @Test
    public void test13() {
        assertEquals(canBuild(new String[]{"air", "air", "airy", "fairy"}), false);
    }

    @Test
    public void test14() {
        assertEquals(canBuild(new String[]{"men", "mean", "meany"}), false);
    }


}
