package very_hard;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
Spartans Cipher

In Spartans Cipher, encoding is done by writing the text horizontally, across the strap
in the plaintext word of a message. In ancient times, Spartans and Greeks invented
an interesting way of encryption called Scytale.

The ancient Greeks, and the Spartans in particular, are said to have
used this cipher to communicate during military campaigns.

Create a function that takes two arguments, a number of
slides nSlide and a string message, and returns the encoded message.

There are some variations on the rules of encipherment.
One version of the cipher rules are outlined below:

message = "Mubashir Scytale Code"
nSlide = 6

cipher(message, nSlide) ➞ "Ms t euhSaC biclo aryed"
Step 1: Imagine this Scytale:

Step 2: You can write the given message on a 6 slide Scytale like this:

M	u	b	a
s	h	i	r
S	c	y
t	a	l	e
C	o	d
e
Step 3: Encode the message column-wise:

"Ms t euhSaC biclo aryed "
Step 4: Trim all spaces at the end and return the final encoded message:

"Ms t euhSaC biclo aryed"
See below examples for a better understanding:

Examples
cipher("IAMSOINLOVEWITHTESHA", 5) ➞ "IOOIEAIVTSMNEHHSLWTA"

cipher("Tesh is the love of my life.", 4) ➞ "T vyete sh lheoi  ffil esom."

cipher("My heart beats for no one but Tesh.", 6) ➞ "Mrt eTytsn e   obshbf uheeoot.aarn"

cipher("Mubashir Scytale Code", 6) ➞ "Ms t euhSaC biclo aryed"

cipher(("Matt and Edabit are amazing", 8) ➞ "M  baai aaEirmn tndteag tda  z"

cipher("", 54) ➞ ""
 */

public class SpartansCipher {

    public static String cipher(String message, int nSlide){
      int columns = (int)Math.ceil((double) message.length() /nSlide);
      StringBuilder result = new StringBuilder();
      while (message.length()%nSlide!=0){
          message+=" ";
      }
      for(int i = 0; i< columns;i++){
          for(int j=i; j< message.length();j+=columns){
              result.append(message.charAt(j));
          }
      }
        return result.toString().trim();
    }


    @Test
    public void test01() {
        assertEquals("T vyete sh lheoi  ffil esom.",cipher("Tesh is the love of my life.", 4));
    }

    @Test
    public void test02() {
        assertEquals("Mrt eTytsn e   obshbf uheeoot.aarn",cipher("My heart beats for no one but Tesh.", 6));
    }

    @Test
    public void test03() {
        assertEquals("IOOIEAIVTSMNEHHSLWTA",cipher("IAMSOINLOVEWITHTESHA", 5));
    }

    @Test
    public void test04() {
        assertEquals("M  baai aaEirmn tndteag tda  z",cipher("Matt and Edabit are amazing", 8));
    }

    @Test
    public void test05() {
        assertEquals("HENTEIDTLAEAPMRCMUAK",cipher("HELPMEIAMUNDERATTACK", 4));
    }

    @Test
    public void test06() {
        assertEquals("",cipher("", 99));
    }

    @Test
    public void test07() {
        assertEquals("TcnmrzhkFpTyeBoshDQrxOeouoJvLgiwuea.",cipher("TheQuickBrownFoxJumpsOverTheLazyDog.", 6));
    }

    @Test
    public void test08() {
        assertEquals("Ms t euhSaC biclo aryed",cipher("Mubashir Scytale Code", 6));
    }

    @Test
    public void test09() {
        assertEquals("IOHOIEAMIVTSMUNEHHSCLWTA",cipher("IAMSOMUCHINLOVEWITHTESHA", 6));
    }
}
