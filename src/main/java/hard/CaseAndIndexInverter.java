package hard;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.testng.AssertJUnit.assertEquals;

public class CaseAndIndexInverter {

    public static String invert(String s) {
        String str = Arrays.stream(s.split(" "))
                .map(word -> Arrays.stream(word.split(""))
                        .map(l -> Character.isUpperCase(l.charAt(0)) ? l.toLowerCase() : l.toUpperCase())
                        .collect(Collectors.joining()))
                .collect(Collectors.joining(" "));
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(invert("dLROW YM sI HsEt"));
        System.out.println(System.getProperty("java.version"));
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
