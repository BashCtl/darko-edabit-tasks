package hard;

import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

public class IsEdabitInTheString {

    public static String edabitInString(String s) {
        Pattern pattern = Pattern.compile("(.+)?e(.+)?d(.+)?a(.+)?b(.+)?i(.+)?t(.+)?");
        return pattern.matcher(s).find()? "YES":"NO";
    }

    @Test
    public void test1() {
        assertEquals("NO", edabitInString("eddaaabt"));
    }

    @Test
    public void test2() {
        assertEquals("YES", edabitInString("edwardisabletodoittoo"));
    }

    @Test
    public void test3() {
        assertEquals("NO", edabitInString("abecdfghijklmnopqrstuvwxyz"));
    }

    @Test
    public void test4() {
        assertEquals("NO", edabitInString("edisthebestatthis"));
    }

    @Test
    public void test5() {
        assertEquals("YES", edabitInString("teachandlearnbitbybit"));
    }

    @Test
    public void test6() {
        assertEquals("YES", edabitInString("fjkdlkskkkkkdkkdkdedaaakkjkkdkkdklqiieuirooeizooziiciibiiiiifooiioiiuuyeyttgguoosooodiifiufiiodikkjkls"));
    }


}
