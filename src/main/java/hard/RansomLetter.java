package hard;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class RansomLetter {

    public static boolean canBuild(String str1, String str2) {
        long count = Arrays.stream(str1.split(""))
                .filter(l -> str2.contains(l)).count();
        return count >= str2.length() && !str1.isEmpty();
    }

    @Test
    public void test1() {
        assertEquals(true, canBuild("aPPleAL", "PAL"));
    }

    @Test
    public void test2() {
        assertEquals(true, canBuild("OAT", "OAT"));
    }

    @Test
    public void test3() {
        assertEquals(true, canBuild("maybelLINE", "maybe"));
    }

    @Test
    public void test4() {
        assertEquals(true, canBuild("topsh", "shop"));
    }

    @Test
    public void test5() {
        assertEquals(true, canBuild("topshSHP", "SHoP"));
    }

    @Test
    public void test6() {
        assertEquals(true, canBuild("DAISIES", "SAID"));
    }

    @Test
    public void test7() {
        assertEquals(true, canBuild("ToporP", "porT"));
    }

    @Test
    public void test8() {
        assertEquals(true, canBuild("PoTluCK", "PuCK"));
    }

    @Test
    public void test9() {
        assertEquals(true, canBuild("pATS", "p"));
    }

    @Test
    public void test10() {
        assertEquals(true, canBuild("blah", ""));
    }

    @Test
    public void test11() {
        assertEquals(false, canBuild("aPPleAL", "apple"));
    }

    @Test
    public void test12() {
        assertEquals(false, canBuild("shortCAKE", "cakey"));
    }

    @Test
    public void test13() {
        assertEquals(false, canBuild("maybeLINE", "lINE"));
    }

    @Test
    public void test14() {
        assertEquals(false, canBuild("teaPOT", "lINE"));
    }

    @Test
    public void test15() {
        assertEquals(false, canBuild("", "a"));
    }

    @Test
    public void test16() {
        assertEquals(false, canBuild("a", "aA"));
    }

    @Test
    public void test17() {
        assertEquals(false, canBuild("a", "A"));
    }

    @Test
    public void test18() {
        assertEquals(false, canBuild("AAAAAA", "AAAAAAa"));
    }

    @Test
    public void test19() {
        assertEquals(false, canBuild("apple", "appleY"));
    }

    @Test
    public void test20() {
        assertEquals(false, canBuild("xxYYzZ", "zzZxYxY"));
    }

    @Test
    public void test21() {
        assertEquals(false, canBuild("abCD", "aBCD"));
    }

}
