package hard;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

public class KixCodesInTheNetherlands {

    public static String kixCode(String addr) {
        Pattern pattern = Pattern.compile("(\\b\\d[\\d- /a-zA-Z]+?), ([\\d-]+) ([A-Z]{2})");
        Matcher matcher = pattern.matcher(addr);
        String groupOne = "";
        String groupTwo = "";
        String groupThree = "";
        if (matcher.find()) {
            groupOne = String.join("X", matcher.group(1).trim().split("[-/ ]")).toUpperCase();
            groupTwo = matcher.group(2);
            groupThree = matcher.group(3);

        }
        return groupTwo + groupThree + groupOne;
    }

    @Test
    public void test1() {
        assertEquals("2500GG30250", kixCode("PostNL, Postbus 30250, 2500 GG 's Gravenhage"));
    }

    @Test
    public void test2() {
        assertEquals("1231FZ13XHS", kixCode("De Jong, Havendijk 13 hs, 1231 FZ POSTDAM"));
    }

    @Test
    public void test3() {
        assertEquals("9421MC46", kixCode("B. Bartelds, Boerheem 46, 9421 MC Bovensmilde"));
    }

    @Test
    public void test4() {
        assertEquals("3331CH182XB", kixCode("Huisman, Koninginneweg 182 B, 3331 CH Zwijndrecht"));
    }

    @Test
    public void test5() {
        assertEquals("1657KA11X1", kixCode("Liesanne B Wilkens, Kogge 11-1, 1657 KA Abbekerk"));
    }

    @Test
    public void test6() {
        assertEquals("2130VA80430", kixCode("Dijk, Antwoordnummer 80430, 2130 VA Hoofddorp"));
    }

    @Test
    public void test7() {
        assertEquals("5575BM200XA", kixCode("Van Eert, Dirk van Heinsbergstraat 200-A, 5575 BM Luyksgestel"));
    }

    @Test
    public void test8() {
        assertEquals("3847LN130B", kixCode("B.C. Dieker, Korhoenlaan 130b, 3847 LN Harderwijk"));
    }

    @Test
    public void test9() {
        assertEquals("8304DE31", kixCode("Mahir F Schipperen, IJsselmeerlaan 31, 8304 DE Emmeloord"));
    }

    @Test
    public void test10() {
        assertEquals("3522PG129X7", kixCode("Jet de Wit, Wielingenstraat 129/7, 3522 PG Utrecht"));
    }
}
