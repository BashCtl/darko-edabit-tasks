package medium;

import java.util.Arrays;

public class OtherSidesLengths {
    public static double [] otherSides(int a){
        double degrees = 30;
        double radians = Math.toRadians(degrees);
        double b = a/Math.tan(radians);
        double c = Math.sqrt(a*a + b*b);
        b = Math.round(b*100.0)/100.0;
        return new double[]{c,b};
    }

    public static void main(String[] args) {
        var result =otherSides(1);
        System.out.println(Arrays.toString(result));
    }
}
