package very_hard;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
/*
The Actual Memory Size of Your USB Flash Drive

Create a function that takes the memory size (ms is a string type) as an argument and returns the actual memory size.

Examples
actualMemorySize("32GB") ➞ "29.76GB"

actualMemorySize("2GB") ➞ "1.86GB"

actualMemorySize("512MB") ➞ "476MB"
Notes
The actual storage loss on a USB device is 7% of the overall memory size!
If the actual memory size was greater than 1 GB, round your result to two decimal places.
If the memory size after adjustment is smaller then 1 GB, return the result in MB.
For the purposes of this challenge, there are 1000 MB in a Gigabyte.

 */
public class ActualMemorySizeOfYourUSBFlashDrive {

    public static String actualMemorySize(String ms){
        String[] strings = ms.split("(?=\\p{Lu})");
        String size = Arrays.stream(strings).skip(1).collect(Collectors.joining());
        double amount = Double.parseDouble(strings[0]) * 0.93;
        if(size.equals("GB") && amount<1){
            return String.format("%d%s",(int) (amount*1000), "MB");
        }else if(size.equals("GB")){
            return String.format("%.2f%s", amount, size);
        }

        return String.format("%d%s",(int)amount, size);
    }



    @Test
    public void test1() {
        assertEquals("238MB", actualMemorySize("256MB"));
    }

    @Test
    public void test2() {
        assertEquals("476MB", actualMemorySize("512MB"));
    }

    @Test
    public void test3() {
        assertEquals("1.86GB", actualMemorySize("2GB"));
    }

    @Test
    public void test4() {
        assertEquals("7.44GB", actualMemorySize("8GB"));
    }

    @Test
    public void test5() {
        assertEquals("14.88GB", actualMemorySize("16GB"));
    }

    @Test
    public void test6() {
        assertEquals("29.76GB", actualMemorySize("32GB"));
    }

    @Test
    public void test7() {
        assertEquals("930MB", actualMemorySize("1GB"));
    }
}
