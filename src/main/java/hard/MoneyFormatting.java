package hard;



import org.testng.annotations.Test;

import java.text.NumberFormat;
import java.util.Locale;

import static org.testng.AssertJUnit.assertEquals;


public class MoneyFormatting {

    public static String dolladollaBills(double money){
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
        return numberFormat.format(money);
    }

    private double[] numVector = new double[] {10, 31.4159, -56.99, -0.008, 0.05, 1000000, -314159.2653};
    private String[] resVector = new String[] {"$10.00", "$31.42", "-$56.99", "-$0.01", "$0.05", "$1,000,000.00", "-$314,159.27"};

    @Test
    public void test01() {
        assertEquals(dolladollaBills(numVector[0]), resVector[0]);
    }

    @Test
    public void test02() {
        assertEquals(dolladollaBills(numVector[1]), resVector[1]);
    }

    @Test
    public void test03() {
        assertEquals(dolladollaBills(numVector[2]), resVector[2]);
    }

    @Test
    public void test04() {
        assertEquals(dolladollaBills(numVector[3]), resVector[3]);
    }

    @Test
    public void test05() {
        assertEquals(dolladollaBills(numVector[4]), resVector[4]);
    }

    @Test
    public void test06() {
        assertEquals(dolladollaBills(numVector[5]), resVector[5]);
    }

    @Test
    public void test07() {
        assertEquals(dolladollaBills(numVector[6]), resVector[6]);
    }

}
