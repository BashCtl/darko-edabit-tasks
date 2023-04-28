package medium;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KaracasEncryptionAlgorithm {

    public static String encrypt(String word){
       word = word.replaceAll("a","0");
       word = word.replaceAll("e","1");
       word = word.replaceAll("i","2");
       word = word.replaceAll("o","2");
       word = word.replaceAll("u","3");
     return   new StringBuilder(word).reverse().append("aca").toString();
    }

    @Test
    public void test1() {
        assertEquals("0c0r0kaca", encrypt("karaca"));
    }

    @Test
    public void test2() {
        assertEquals("k0r3baca", encrypt("burak"));
    }

    @Test
    public void test3() {
        assertEquals("0n0n0baca", encrypt("banana"));
    }

    @Test
    public void test4() {
        assertEquals("0c0pl0aca", encrypt("alpaca"));
    }

    @Test
    public void test5() {
        assertEquals("2ll1haca", encrypt("hello"));
    }

}
