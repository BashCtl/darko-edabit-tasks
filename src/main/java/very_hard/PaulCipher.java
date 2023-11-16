package very_hard;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Paul Cipher
In Paul Cipher, only alpha characters will be encoded with the following rules:

All alpha characters will be treated as uppercase letters.
The first alpha character will not change (except for switching to upper case).
All subsequent alpha characters will be shifted toward "Z" by the alphabetical position
of the previous alpha character (wrap back to "A" if "Z" is passed).
he1lo would be encoded as follows:

paulCipher("he1lo") ➞ "HM1QA"

h -> H (First character to be changed to uppercase)
e -> M (H is the previous alpha character and the 8th letter in the alphabet. E + 8 = M)
1 -> 1 (Keep all characters other than alphabets as it is)
l -> Q (E is the previous alpha character and 5th letter in the alphabets. L + 5 = Q)
o -> A (L is the previous alpha character and 12th letter in the alphabets. O + 12 = A)
Given a string txt, return the encoded message. See the below examples for a better understanding:

Examples
paulCipher("d33p x4v13r") ➞ "D33T N4T13N"

paulCipher("T3sh 1s my w0rlD.") ➞ "T3MA 1A FL V0ODP."

paulCipher("muBas41r") ➞ "MHWCT41K"

paulCipher("a1rForce") ➞ "A1SXUGUH"

paulCipher("MATT") ➞ "MNUN"





 */
public class PaulCipher {

    public static String paulCipher(String txt) {
        txt = txt.toUpperCase();
        Pattern p = Pattern.compile("\\p{L}");
        int indexFirstAlpha = 0;
        Matcher m = p.matcher(txt);
        if (m.find()) {
            indexFirstAlpha = m.start();
        }

        String firstLetter = txt.substring(0, indexFirstAlpha + 1);
        StringBuilder string = new StringBuilder();

        char previous = txt.charAt(indexFirstAlpha);

        for (int i = indexFirstAlpha + 1; i < txt.length(); i++) {

            if (Character.isAlphabetic(txt.charAt(i - 1))) {
                previous = txt.charAt(i - 1);
            }
            char current = txt.charAt(i);
            int offset = previous - 'A' + 1;
            if (Character.isAlphabetic(current)) {

                if (current + offset <= 'Z') {
                    string.append((char) (current + offset));
                } else {
                    string.append((char) ((current + offset - 'Z') + 'A' - 1));
                }
            } else {
                string.append(current);
            }

        }

        return firstLetter + string;
    }



    @Test
    public void test01() {
        assertEquals("T3MA 1A FL V0ODP.", paulCipher("T3sh 1s my w0rlD."));
    }

    @Test
    public void test02() {
        assertEquals("D33T N4T13N", paulCipher("d33p x4v13r"));
    }

    @Test
    public void test03() {
        assertEquals("MHWCT41K", paulCipher("muBas41r"));
    }

    @Test
    public void test04() {
        assertEquals("A1SXUGUH", paulCipher("A1rForce"));
    }

    @Test
    public void test05() {
        assertEquals("PX1TE", paulCipher("Ph1ls"));
    }

    @Test
    public void test06() {
        assertEquals("MNUN", paulCipher("MATT"));
    }

    @Test
    public void test07() {
        assertEquals("4EQQS10JA", paulCipher("4elen10ve"));
    }

    @Test
    public void test08() {
        assertEquals("HM1QA", paulCipher("He1lo"));
    }

    @Test
    public void test09() {
        assertEquals(" TBM VLDLN MTGLK TUM HEHCI HKAW LBM QMAY CSV. ", paulCipher(" The quick brown fox jumps over the lazy dog. "));
    }

    @Test
    public void test10() {
        assertEquals("5DHG4GHJ-7G47-44E3-8IIE-3171860EG938", paulCipher("5ddc4ddf-7a47-44d3-8eda-3171860dc938"));
    }
}
