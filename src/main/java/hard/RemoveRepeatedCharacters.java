package hard;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;

public class RemoveRepeatedCharacters {

    public static String unrepeated(String str) {
        return Arrays.stream(str.split("")).distinct()
                .collect(Collectors.joining());
    }


    @Test
    public void test01() {
        assertEquals("helo", unrepeated("hello"));
    }

    @Test
    public void test02() {
        assertEquals("WE!", unrepeated("WWEE!!!"));
    }

    @Test
    public void test03() {
        assertEquals("cal 91", unrepeated("call 911"));
    }

    @Test
    public void test04() {
        assertEquals("a", unrepeated("aaaaaa"));
    }

    @Test
    public void test05() {
        assertEquals("alwf tes", unrepeated("alwaff test"));
    }

    @Test
    public void test06() {
        assertEquals("tesha", unrepeated("teshahset"));
    }

    @Test
    public void test07() {
        assertEquals("porcuine", unrepeated("porcupine"));
    }

    @Test
    public void test08() {
        assertEquals("alter go", unrepeated("alter ego"));
    }

    @Test
    public void test09() {
        assertEquals("rejuvnat", unrepeated("rejuvenate"));
    }

    @Test
    public void test10() {
        assertEquals("strau nimb", unrepeated("stratus nimbus"));
    }

    @Test
    public void test11() {
        assertEquals("strageiz", unrepeated("stragegize"));
    }


}
