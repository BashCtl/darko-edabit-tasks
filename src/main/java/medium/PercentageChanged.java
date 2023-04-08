package medium;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PercentageChanged {

    public static String percentageChanged(String oldPrice, String newPrice) {
        double old = Double.parseDouble(oldPrice.replace("$", ""));
        double current = Double.parseDouble(newPrice.replace("$", ""));
        int percent = (int) (Math.abs((current / old) - 1) * 100);
        return String.format("%d%% %s", percent, old > current ? "decrease" : "increase");
    }

    @Test
    public void test1() {
        assertEquals(percentageChanged("$800", "$600"), "25% decrease");
    }

    @Test
    public void test2() {
        assertEquals(percentageChanged("$1000", "$840"), "16% decrease");
    }

    @Test
    public void test3() {
        assertEquals(percentageChanged("$100", "$950"), "850% increase");
    }

}
