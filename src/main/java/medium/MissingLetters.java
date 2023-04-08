package medium;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MissingLetters {

    public static String getMissing(String strLetters) {
        char a = 'a';
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            String s = String.valueOf((char) (a + i));
            if (!strLetters.contains(s)) {
                result.append(s);
            }
        }
        return result.toString();
    }

    @Test
    public void test01() {
        assertEquals("hijklmno", MissingLetters.getMissing("abcdefgpqrstuvwxyz"));
    }

    @Test
    public void test02() {
        assertEquals("abcdefghijklmnop", MissingLetters.getMissing("zyxwvutsrq"));
    }

    @Test
    public void test03() {
        assertEquals("abcdefghijklmnopqrstuvwxyz", MissingLetters.getMissing(""));
    }

    @Test
    public void test04() {
        assertEquals("", MissingLetters.getMissing("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void test05() {
        assertEquals("abcdefghkloprstuvxyz", MissingLetters.getMissing("qinjwm"));
    }

    @Test
    public void test06() {
        assertEquals("bcdfjmnosvxy", MissingLetters.getMissing("luiqtkgwzheapr"));
    }

    @Test
    public void test07() {
        assertEquals("bcdefghilmoprstuvwxyz", MissingLetters.getMissing("qankj"));
    }

    @Test
    public void test08() {
        assertEquals("hjlq", MissingLetters.getMissing("bawgeuskmfcrpodnxztviy"));
    }

    @Test
    public void test09() {
        assertEquals("bcefhijklmoqrstuvwxyz", MissingLetters.getMissing("gdpna"));
    }

    @Test
    public void test10() {
        assertEquals("acdefgjklmnopqrstuvwxyz", MissingLetters.getMissing("hbi"));
    }

    @Test
    public void test11() {
        assertEquals("egr", MissingLetters.getMissing("djxifockvwhaqbnmstzpylu"));
    }

    @Test
    public void test12() {
        assertEquals("behiklquy", MissingLetters.getMissing("gastzwjcnvoprfmxd"));
    }

    @Test
    public void test13() {
        assertEquals("abcdefghjklmnopqrsvwyz", MissingLetters.getMissing("xuti"));
    }

    @Test
    public void test14() {
        assertEquals("defghijklmnopqrstuvwxyz", MissingLetters.getMissing("abc"));
    }

    @Test
    public void test15() {
        assertEquals("efglnxz", MissingLetters.getMissing("kchiatvmbqrdsyopwju"));
    }

    @Test
    public void test16() {
        assertEquals("acdefghilmnopqrstuvwyz", MissingLetters.getMissing("xbkj"));
    }

    @Test
    public void test17() {
        assertEquals("adfghijlmnpqtuwxz", MissingLetters.getMissing("cbvkyroes"));
    }

    @Test
    public void test18() {
        assertEquals("abcdefghijklmnopqrtuvwxyz", MissingLetters.getMissing("s"));
    }

    @Test
    public void test19() {
        assertEquals("aknpqrxy", MissingLetters.getMissing("idvgzujmswloefcthb"));
    }

    @Test
    public void test20() {
        assertEquals("bilnpqsw", MissingLetters.getMissing("fmoraygevhkxzutcjd"));
    }

    @Test
    public void test21() {
        assertEquals("bcdeghijklmorstwxz", MissingLetters.getMissing("vuynqpaf"));
    }

    @Test
    public void test22() {
        assertEquals("abcdefghiklmnopqrstuvwxyz", MissingLetters.getMissing("j"));
    }

}
