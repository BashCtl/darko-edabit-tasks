package very_hard;

import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
/*
Bring Down The Class Average

What is the percentage you can score on a test, which single-handedly
brings down the class average by 5%? Given an array of your classmates scores,
create a function that returns the answer. Round to the nearest percent.

Examples
takeDownAverage(["95%", "83%", "90%", "87%", "88%", "93%"]) ➞ "54%"

takeDownAverage(["10%"]) ➞ "0%"

takeDownAverage(["53%", "79%"]) ➞ "51%"

Notes
No tests will include empty arrays or require negative percentages.
Note that you need to return a string.


 */
public class BringDownTheClassAverage {

    public static String takeDownAverage(String[] scores) {
        int total = Arrays.stream(scores).mapToInt(score -> Integer.parseInt(score.replace("%", ""))).sum();
        double average = ((double) total / scores.length) - 5;
        double myScore = average * (scores.length + 1) - total;
        return String.format("%.0f%%", myScore);
    }

    @Test
    public void test01() {
        assertEquals("54%", takeDownAverage(new String[] {"95%", "83%", "90%", "87%", "88%", "93%"}));
    }

    @Test
    public void test02() {
        assertEquals("0%", takeDownAverage(new String[] {"10%"}));
    }

    @Test
    public void test03() {
        assertEquals("36%", takeDownAverage(new String[] {"74%", "76%", "58%", "50%", "99%", "70%"}));
    }

    @Test
    public void test04() {
        assertEquals("36%", takeDownAverage(new String[] {"64%", "95%", "89%", "69%", "96%", "59%", "84%", "93%"}));
    }

    @Test
    public void test05() {
        assertEquals("62%", takeDownAverage(new String[] {"77%", "77%"}));
    }

    @Test
    public void test06() {
        assertEquals("71%", takeDownAverage(new String[] {"73%", "98%"}));
    }

    @Test
    public void test07() {
        assertEquals("63%", takeDownAverage(new String[] {"96%", "87%", "66%"}));
    }

    @Test
    public void test08() {
        assertEquals("47%", takeDownAverage(new String[] {"94%", "79%", "54%", "62%"}));
    }

    @Test
    public void test09() {
        assertEquals("38%", takeDownAverage(new String[] {"56%", "50%"}));
    }

    @Test
    public void test10() {
        assertEquals("63%", takeDownAverage(new String[] {"100%", "51%", "98%"}));
    }

    @Test
    public void test11() {
        assertEquals("20%", takeDownAverage(new String[] {"85%", "74%", "61%", "70%", "56%", "67%", "53%", "53%"}));
    }

    @Test
    public void test12() {
        assertEquals("27%", takeDownAverage(new String[] {"67%", "91%", "93%", "87%", "81%", "79%", "88%", "69%", "92%", "69%"}));
    }

    @Test
    public void test13() {
        assertEquals("73%", takeDownAverage(new String[] {"75%", "100%"}));
    }

}
