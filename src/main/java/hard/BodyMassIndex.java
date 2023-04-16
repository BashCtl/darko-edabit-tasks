package hard;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BodyMassIndex {

    public static String BMI(String weight, String height) {
        double bmi =getBMI(weight,height);
        if(bmi<18.5){
            return String.format("%.1f Underweight", bmi);
        }else if(bmi>=18.5 && bmi<=24.9){
            return String.format("%.1f Normal weight", bmi);
        }else if(bmi>=25&&bmi<=29.9){
            return String.format("%.1f Overweight", bmi);
        }else {
            return String.format("%.1f Obesity",bmi);
        }
    }

    public static double getBMI(String weight, String height) {
        double w = Double.parseDouble(weight.split(" ")[0]);
        double h = Double.parseDouble(height.split(" ")[0]);
        if (weight.contains("pounds")) {
            w = w * 0.453592;
        }
        if (height.contains("inches")) {
            h = h * 0.0254;
        }
        return w / (h * h);
    }

    @Test
    public void test1() {
        assertEquals("18.4 Underweight", BMI("53.3 kilos","1.7 meters"));
    }

    @Test
    public void test2() {
        assertEquals("30.0 Obesity", BMI("76.8 kilos","1.6 meters"));
    }

    @Test
    public void test3() {
        assertEquals("18.5 Normal weight", BMI("53.5 kilos","1.7 meters"));
    }

    @Test
    public void test4() {
        assertEquals("20.4 Normal weight", BMI("155 pounds","73 inches"));
    }

    @Test
    public void test5() {
        assertEquals("25.1 Overweight", BMI("175 pounds","70 inches"));
    }

}
