package very_hard;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
Recursion: License Plate

Traveling through Europe one needs to pay attention to how
the license plate in the given country is displayed.
When crossing the border you need to park on the shoulder,
unscrew the plate, re-group the characters according
to the local regulations, attach it back and proceed with the journey.

Create a solution that can format the dmv number into a plate
number with correct grouping. The function input consists
of string s and group length n. The output has to be upper case
characters and digits. The new groups are made from right to left and connected by -.
The original order of the dmv number is preserved.

Examples
licensePlate("5F3Z-2e-9-w", 4) ➞ "5F3Z-2E9W"

licensePlate("2-5g-3-J", 2) ➞ "2-5G-3J"

licensePlate("2-4A0r7-4k", 3) ➞ "24-A0R-74K"

licensePlate("nlj-206-fv", 3) ➞ "NL-J20-6FV"
Notes
You are expected to solve this challenge via a recursive approach.

 */
public class RecursionLicensePlate {

    public static String licensePlate(String code, int group) {
        code = code.replaceAll("[^a-zA-Z0-9]", "").toUpperCase();

        if (code.length() <= group) {
            return code;
        }

        return licensePlate(code.substring(0, code.length() - group), group)
                + "-" + code.substring(code.length() - group);
    }

    @Test
    public void test01() {
        assertEquals("5F3Z-2E9W", licensePlate("5F3Z-2e-9-w", 4));
    }

    @Test
    public void test02() {
        assertEquals("2-5G-3J", licensePlate("2-5g-3-J", 2));
    }

    @Test
    public void test03() {
        assertEquals("24-A0R-74K", licensePlate("2-4A0r7-4k", 3));
    }

    @Test
    public void test04() {
        assertEquals("GB-BD-51-9K-FC", licensePlate("GB-bd519-KFC", 2));
    }

    @Test
    public void test05() {
        assertEquals("BF-11G-F9I-781-9IT", licensePlate("BF-11gf9i-7819iT", 3));
    }

    @Test
    public void test06() {
        assertEquals("FIN-MMG-418", licensePlate("Fin-Mmg-418", 3));
    }

    @Test
    public void test07() {
        assertEquals("S-PXO-755", licensePlate("sPx-o755", 3));
    }

    @Test
    public void test08() {
        assertEquals("DE-57-UK", licensePlate("de57-uk", 2));
    }

    @Test
    public void test09() {
        assertEquals("D-KAPA-7778", licensePlate("d-kapa-7778", 4));
    }

    @Test
    public void test10() {
        assertEquals("NL-J20-6FV", licensePlate("nlj-206-fv", 3));
    }
}
