package very_hard;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
/*
Recursion: Case and Index Inverter

Write a recursive function that takes a string input and returns the string in a reversed case and order.

Examples
invert("dLROW YM sI HsEt") ➞ "TeSh iS my worlD"

invert("ytInIUgAsnOc") ➞ "CoNSaGuiNiTY"

invert("step on NO PETS") ➞ "step on NO PETS"

invert("XeLPMoC YTiReTXeD") ➞ "dExtErIty cOmplEx"

Notes
No empty strings and will neither contain special characters nor punctuation.
You are expected to solve this challenge using a recursive approach.

 */

public class RecursionCaseIndexInverter {


    public static String invert(String s) {
        if (s.isEmpty()) {
            return "";
        }
        String last = s.substring(s.length() - 1);
        last = Character.isUpperCase(last.charAt(0)) ? last.toLowerCase() : last.toUpperCase();
        return last + invert(s.substring(0, s.length() - 1));
    }

    @Test
    public void test01() {
        assertEquals("TeSh iS my worlD", invert("dLROW YM sI HsEt"));
    }

    @Test
    public void test02() {
        assertEquals("DESREVER xedni DNA esac SI GNIRTS SIHt", invert("This string is CASE and INDEX reversed"));
    }

    @Test
    public void test03() {
        assertEquals("ElBiSrEvEr", invert("ReVeRsIbLe"));
    }

    @Test
    public void test04() {
        assertEquals("nOiTaCiFiMaR", invert("rAmIfIcAtIoN"));
    }

    @Test
    public void test05() {
        assertEquals("sLAUTCELLETNi", invert("IntellectualS"));
    }

    @Test
    public void test06() {
        assertEquals("This string is CASE and INDEX reversed", invert("DESREVER xedni DNA esac SI GNIRTS SIHt"));
    }

    @Test
    public void test07() {
        assertEquals("ReVeRsIbLe", invert("ElBiSrEvEr"));
    }

    @Test
    public void test08() {
        assertEquals("rAmIfIcAtIoN", invert("nOiTaCiFiMaR"));
    }

    @Test
    public void test09() {
        assertEquals("IntellectualS", invert("sLAUTCELLETNi"));
    }

    @Test
    public void test10() {
        assertEquals("ytInIUgAsnOc", invert("CoNSaGuiNiTY"));
    }

    @Test
    public void test11() {
        assertEquals("step on NO PETS", invert("step on NO PETS"));
    }

    @Test
    public void test12() {
        assertEquals("XeLPMoC YTiReTXeD", invert("dExtErIty cOmplEx"));
    }


}
