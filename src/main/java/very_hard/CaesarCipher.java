package very_hard;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
Caesar's Cipher

Julius Caesar protected his confidential information by encrypting it using a cipher.
Caesar's cipher (check Resources tab for more info) shifts each letter by a number of letters.
If the shift takes you past the end of the alphabet, just rotate back to the front of the alphabet.
In the case of a rotation by 3, w, x, y and z would map to z, a, b and c.

Create a function that takes a string s (text to be encrypted) and an integer k (the rotation factor).
It should return an encrypted string.

Examples
caesarCipher("middle-Outz", 2) ➞ "okffng-Qwvb"

// m -> o
// i -> k
// d -> f
// d -> f
// l -> n
// e -> g
// -    -
// O -> Q
// u -> w
// t -> v
// z -> b

caesarCipher("Always-Look-on-the-Bright-Side-of-Life", 5)
➞ "Fqbfdx-Qttp-ts-ymj-Gwnlmy-Xnij-tk-Qnkj"

caesarCipher("A friend in need is a friend indeed", 20)
➞ "U zlcyhx ch hyyx cm u zlcyhx chxyyx"
Notes
All test input will be a valid ASCII string.

 */

public class CaesarCipher {

    public static String processingChar(int index, String s, int step) {
        char current = s.charAt(index);
        if (Character.isAlphabetic(current)) {
            char shifted = (char) (current + step);
            if (Character.isLowerCase(current) && shifted > 'z') {
                while (shifted > 'z')
                    shifted = (char) (shifted - 'z' + 'a' - 1);
            } else if (Character.isUpperCase(current) && shifted > 'Z') {
                while (shifted > 'Z')
                    shifted = (char) (shifted - 'Z' + 'A' - 1);
            }
            return String.valueOf(shifted);
        }
        return String.valueOf(current);
    }

    public static String caesarCipher(String s, int k) {
        return IntStream.range(0, s.length())
                .mapToObj(i -> processingChar(i, s, k))
                .collect(Collectors.joining());
    }


    @Test
    public void test1() {
        assertEquals("okffng-Qwvb", caesarCipher("middle-Outz", 2));
    }

    @Test
    public void test2() {
        assertEquals("Fqbfdx-Qttp-ts-ymj-Gwnlmy-Xnij-tk-Qnkj", caesarCipher("Always-Look-on-the-Bright-Side-of-Life", 5));
    }

    @Test
    public void test3() {
        assertEquals("U zlcyhx ch hyyx cm u zlcyhx chxyyx", caesarCipher("A friend in need is a friend indeed", 20));
    }

    @Test
    public void test4() {
        assertEquals("B Gppm boe Ijt Npofz Bsf Tppo Qbsufe.", caesarCipher("A Fool and His Money Are Soon Parted.", 27));
    }

    @Test
    public void test5() {
        assertEquals("Lkb pelria klq tloov lsbo qefkdp qexq exsb xiobxav exmmbkba xka qexq zxkklq yb zexkdba.", caesarCipher("One should not worry over things that have already happened and that cannot be changed.", 49));
    }

    @Test
    public void test6() {
        assertEquals("Xwyg pk Omqwna Kja eo w lklqhwn owuejc pdwp iawjo w lanokj dwo pk opwnp kran, oeiehwn pk: xwyg pk pda znwsejc xkwnz.", caesarCipher("Back to Square One is a popular saying that means a person has to start over, similar to: back to the drawing board.", 126));
    }
}
