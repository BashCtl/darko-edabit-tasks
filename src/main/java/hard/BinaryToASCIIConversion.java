package hard;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;

public class BinaryToASCIIConversion {

    public static String binaryConversion(String bin) {
        return !bin.isEmpty() ? Arrays.stream(bin.split("(?<=\\G.{8})"))
                .mapToInt(n -> Integer.parseInt(n, 2))
                .mapToObj(n -> String.valueOf((char) n))
                .collect(Collectors.joining()) : bin;

    }

//    public static void main(String[] args) {
//        System.out.println(binaryConversion("010010010010000001101100011011110111011001100101001000000101010001100101011100110110100000100001"));
//        System.out.println(binaryConversion("001100010011001000110001001100110011000100110111") );
//    }

    @Test
    public void test01() {
        assertEquals("I love Tesh!", binaryConversion("010010010010000001101100011011110111011001100101001000000101010001100101011100110110100000100001"));
    }

    @Test
    public void test02() {
        assertEquals("121317", binaryConversion("001100010011001000110001001100110011000100110111"));
    }

    @Test
    public void test03() {
        assertEquals("Amazing Edabit!", binaryConversion("010000010110110101100001011110100110100101101110011001110010000001000101011001000110000101100010011010010111010000100001"));
    }

    @Test
    public void test04() {
        assertEquals("edabit", binaryConversion("011001010110010001100001011000100110100101110100"));
    }

    @Test
    public void test05() {
        assertEquals("123", binaryConversion("001100010011001000110011"));
    }

    @Test
    public void test06() {
        assertEquals("Hello?", binaryConversion("010010000110010101101100011011000110111100111111"));
    }

    @Test
    public void test07() {
        assertEquals("", binaryConversion(""));
    }

    @Test
    public void test08() {
        assertEquals("To each his own.", binaryConversion("01010100011011110010000001100101011000010110001101101000001000000110100001101001011100110010000001101111011101110110111000101110"));
    }

    @Test
    public void test09() {
        assertEquals("Different folks, different strokes.", binaryConversion("0100010001101001011001100110011001100101011100100110010101101110011101000010000001100110011011110110110001101011011100110010110000100000011001000110100101100110011001100110010101110010011001010110111001110100001000000111001101110100011100100110111101101011011001010111001100101110"));
    }

    @Test
    public void test10() {
        assertEquals("!@#$%^&*()QWErtyUIOLdfgbbhnmIKBJKHIUO(?>?<~~~~~)(*&%^98713/-/*-*/", binaryConversion("0010000101000000001000110010010000100101010111100010011000101010001010000010100101010001010101110100010101110010011101000111100101010101010010010100111101001100011001000110011001100111011000100110001001101000011011100110110101001001010010110100001001001010010010110100100001001001010101010100111100101000001111110011111000111111001111000111111001111110011111100111111001111110001010010010100000101010001001100010010101011110001110010011100000110111001100010011001100101111001011010010111100101010001011010010101000101111"));
    }


}