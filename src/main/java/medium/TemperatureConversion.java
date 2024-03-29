package medium;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.AssertJUnit.assertTrue;

public class TemperatureConversion {

    public static double[] convertToTemps(double celcius) {
        double f = Math.round(((celcius * 9) / 5 + 32) * 100.0) / 100.0;
        double k = Math.round((celcius + 273.15) * 100.0) / 100.0;
        return k >= 0 ? new double[]{f, k} : new double[]{};
    }

    private double[] numVector = new double[] {0.0, 100.0, 42.8, 300.4, -10.7, -273.13, -273.16};
    private double[][] resVector = new double[][] {
            {32.0, 273.15}, {212.0, 373.15}, {109.04, 315.95},
            {572.72, 573.55}, {12.74, 262.45}, {-459.63, 0.02}, {}
    };

    @Test
    public void test01() {
        assertTrue(Arrays.equals(convertToTemps(numVector[0]), resVector[0]));
    }

    @Test
    public void test02() {
        assertTrue(Arrays.equals(convertToTemps(numVector[1]), resVector[1]));
    }

    @Test
    public void test03() {
        assertTrue(Arrays.equals(convertToTemps(numVector[2]), resVector[2]));
    }

    @Test
    public void test04() {
        assertTrue(Arrays.equals(convertToTemps(numVector[3]), resVector[3]));
    }

    @Test
    public void test05() {
        assertTrue(Arrays.equals(convertToTemps(numVector[4]), resVector[4]));
    }

    @Test
    public void test06() {
        assertTrue(Arrays.equals(convertToTemps(numVector[5]), resVector[5]));
    }

    @Test
    public void test07() {
        assertTrue(Arrays.equals(convertToTemps(numVector[6]), resVector[6]));
    }
}
