package hard;

import org.junit.Test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static org.testng.AssertJUnit.assertEquals;

public class TwentyFourHourTime {

    public static String convertTime(String s) {
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ssa");
        LocalTime time = LocalTime.from(timeFormatter.parse(s));

        return time.toString();
    }


    @Test
    public void test1() {
        assertEquals("19:05:45", convertTime("07:05:45PM"));
    }

    @Test
    public void test2() {
        assertEquals("00:40:22", convertTime("12:40:22AM"));
    }

    @Test
    public void test3() {
        assertEquals("12:45:54", convertTime("12:45:54PM"));
    }

    @Test
    public void test4() {
        assertEquals("17:32:33", convertTime("05:32:33PM"));
    }

    @Test
    public void test5() {
        assertEquals("23:59:59", convertTime("11:59:59PM"));
    }

    @Test
    public void test6() {
        assertEquals("11:59:59", convertTime("11:59:59AM"));
    }

    @Test
    public void test7() {
        assertEquals("06:00:19", convertTime("06:00:19AM"));
    }
}
