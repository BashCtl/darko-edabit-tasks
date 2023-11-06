package very_hard;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
Atbash Cipher

The Atbash cipher is an encryption method in which each letter of a
word is replaced with its "mirror" letter in the alphabet: A <=> Z; B <=> Y; C <=> X; etc.

Create a function that takes a string and applies the Atbash cipher to it.

Examples
atbash("apple") ➞ "zkkov"

atbash("Hello world!") ➞ "Svool dliow!"

atbash("Christmas is the 25th of December") ➞ "Xsirhgnzh rh gsv 25gs lu Wvxvnyvi"

Notes
Capitalisation should be retained.
Non-alphabetic characters should not be altered.
 */
public class AtbashCipher {

    public static String atbash(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                char a = Character.isUpperCase(str.charAt(i)) ? 'A' : 'a';
                char z = Character.isUpperCase(str.charAt(i)) ? 'Z' : 'z';
                int index = z - str.charAt(i);
                char newCharacter = (char) (a + index);
                result.append(newCharacter);
            } else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    @Test
    public void test1() {
        assertEquals("zyxwvutsrqponmlkjihgfedcba", atbash("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void test2() {
        assertEquals("ZYXWVUTSRQPONMLKJIHGFEDCBA", atbash("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }

    @Test
    public void test3() {
        assertEquals("Gsv dliw 'zgyzhs' wvirevh uiln gsv gsv urihg zmw ozhg 2 ovggvih lu gsv Svyivd zokszyvg.", atbash("The word 'atbash' derives from the the first and last 2 letters of the Hebrew alphabet."));
    }

    @Test
    public void test4() {
        assertEquals("Encryption and decryption are identical for the Atbash cipher.", atbash("Vmxibkgrlm zmw wvxibkgrlm ziv rwvmgrxzo uli gsv Zgyzhs xrksvi."));
    }
}
