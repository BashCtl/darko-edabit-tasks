package hard;

import org.testng.annotations.Test;

import java.util.stream.IntStream;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;


public class TripleLetterGroupings {
    public static String[] threeLetterCollection(String s){
       return IntStream.range(0, s.length()-2)
                .mapToObj(i->s.substring(i,i+3))
                .sorted()
                .toArray(String[]::new);
    }

    @Test
    public void test01() {
        assertArrayEquals(new String[] {"esh", "sha", "tes"}, threeLetterCollection("tesha"));
    }

    @Test
    public void test02() {
        assertArrayEquals(new String[] {"lap", "sla"}, threeLetterCollection("slap"));
    }

    @Test
    public void test03() {
        assertArrayEquals(new String[] {"cli", "ick", "lic"}, threeLetterCollection("click"));
    }

    @Test
    public void test04() {
        assertArrayEquals(new String[] {"cat"}, threeLetterCollection("cat"));
    }

    @Test
    public void test05() {
        assertArrayEquals(new String[] {}, threeLetterCollection("hi"));
    }

    @Test
    public void test06() {
        assertArrayEquals(new String[] {}, threeLetterCollection("e"));
    }

    @Test
    public void test07() {
        assertArrayEquals(new String[] {}, threeLetterCollection(""));
    }

    @Test
    public void test08() {
        assertArrayEquals(new String[] {"amm", "gra", "ing", "min", "mmi", "ogr", "pro", "ram", "rog"}, threeLetterCollection("programming"));
    }

    @Test
    public void test09() {
        assertArrayEquals(new String[] {"abl", "ani", "ant", "ari", "bli", "dis", "ent", "est", "hme", "ian", "idi", "ise", "ish", "ism", "lis", "men", "nis", "nta", "nti", "ria", "ses", "shm", "sta", "tab", "tar", "tid"}, threeLetterCollection("antidisestablishmentarianism"));
    }

    @Test
    public void test10() {
        assertArrayEquals(new String[] {"log", "ogy", "olo", "ool", "zoo"}, threeLetterCollection("zoology"));
    }

    @Test
    public void test11() {
        assertArrayEquals(new String[] {"ass", "ass", "ati", "ina", "ion", "nat", "sas", "sin", "ssa", "ssi", "tio"}, threeLetterCollection("assassination"));
    }

    @Test
    public void test12() {
        assertArrayEquals(new String[] {"boo", "eep", "epe", "kee", "kke", "okk", "ook", "per"}, threeLetterCollection("bookkeeper"));
    }
}
