package expert;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/*
Spartans Decipher

In Spartans Cipher, encoding is done by writing the text horizontally,
across the strap in the plaintext word of a message. In ancient times,
Spartans and Greeks invented interesting way of encryption called Scytale.


In this challenge, the function is given the encoded message and the number of slides.
Create a reversed solution to retrieve the original message.

Examples
spartansDecipher("IOHOIEAMIVTSMUNEHHSCLWTA", 6) ➞ "IAMSOMUCHINLOVEWITHTESHA"

spartansDecipher("T vyete sh lheoi  ffil esom.", 4) ➞ "Tesh is the love of my life."

spartansDecipher("Ms t euhSaC biclo aryed", 6) ➞ "Mubashir Scytale Code"

spartansDecipher("M  baai aaEirmn tndteag tda  z", 8) ➞ "Matt and Edabit are amazing"

Notes
Strip white spaces on the right of the resulting string, because they were added during the encoding.

 */
public class SpartansDecipher {

    public static String decipher(String message, int nSlide) {
        int columns = (int) Math.ceil((double) message.length() / nSlide);
        int spaceCount = columns * nSlide - message.length();
        String spaces = spaceCount != 0 ? new String(new char[spaceCount]).replace("\0", " ") : "";
        message += spaces;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < nSlide; i++) {
            for (int j = i; j < message.length(); j += nSlide) {
                result.append(message.charAt(j));
            }
        }
        return result.toString().trim();
    }

    @Test
    public void test01() {
        assertEquals("IAMSOINLOVEWITHTESHA", decipher("IOOIEAIVTSMNEHHSLWTA", 5));
    }

    @Test
    public void test02() {
        assertEquals("Tesh is the love of my life.", decipher("T vyete sh lheoi  ffil esom.", 4));
    }

    @Test
    public void test03() {
        assertEquals("My heart beats for no one but Tesh.", decipher("Mrt eTytsn e   obshbf uheeoot.aarn", 6));
    }

    @Test
    public void test04() {
        assertEquals("Mubashir Scytale Code", decipher("Ms t euhSaC biclo aryed", 6));
    }

    @Test
    public void test05() {
        assertEquals("Matt and Edabit are amazing", decipher("M  baai aaEirmn tndteag tda  z", 8));
    }

    @Test
    public void test06() {
        assertEquals("HELPMEIAMUNDERATTACK", decipher("HENTEIDTLAEAPMRCMUAK", 4));
    }

    @Test
    public void test07() {
        assertEquals("", decipher("", 54));
    }

    @Test
    public void test08() {
        assertEquals("TheQuickBrownFoxJumpsOverTheLazyDog.", decipher("TcnmrzhkFpTyeBoshDQrxOeouoJvLgiwuea.", 6));
    }

    @Test
    public void test09() {
        assertEquals("IAMSOMUCHINLOVEWITHTESHA", decipher("IOHOIEAMIVTSMUNEHHSCLWTA", 6));
    }
}
