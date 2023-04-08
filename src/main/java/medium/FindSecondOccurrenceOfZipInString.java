package medium;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FindSecondOccurrenceOfZipInString {

    public static int findZip(String str){
       return str.indexOf("zip",str.indexOf("zip")+1);
    }

    @Test
    public void test1() {
        assertEquals(18, findZip("all zip files are zipped"));
    }

    @Test
    public void test2() {
        assertEquals(-1, findZip("all zip files are compressed"));
    }

    @Test
    public void test3() {
        assertEquals(-1, findZip("We believe university-level zip education can be both high quality and low cost. Using the economics of the Internet, we've connected some of the greatest teachers to hundreds of thousands of students all over the world."));
    }

    @Test
    public void test4() {
        assertEquals(169, findZip("Zip is a file format used for data compression and archiving. A zip file contains one or more files that have been compressed, to reduce file size, or stored as is. The zip file format permits a number of compression algorithms."));
    }

}
