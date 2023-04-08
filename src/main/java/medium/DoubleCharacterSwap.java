package medium;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DoubleCharacterSwap {

    public static String doubleSwap(String str, char c1, char c2) {
        str = str.replace(c2, '|');
        str = str.replace(c1, c2);
        return str.replace('|', c1);
    }

    @Test
    public void test1() {
        assertEquals("bbaaccc", doubleSwap("aabbccc", 'a', 'b'));
    }

    @Test
    public void test2() {
        assertEquals("random w&rds writt#n h#r#", doubleSwap("random w#rds writt&n h&r&", '#', '&'));
    }

    @Test
    public void test3() {
        assertEquals("129 985 556 799 888", doubleSwap("128 895 556 788 999", '8', '9'));
    }

    @Test
    public void test4() {
        assertEquals("amaam aim", doubleSwap("mamma mia", 'm', 'a'));
    }

    @Test
    public void test5() {
        assertEquals("##**##", doubleSwap("**##**", '*', '#'));
    }

    @Test
    public void test6() {
        assertEquals("123546789", doubleSwap("123456789", '4', '5'));
    }

    @Test
    public void test7() {
        assertEquals("&&556644", doubleSwap("445566&&", '4', '&'));
    }

    @Test
    public void test8() {

        assertEquals("!?@.,", doubleSwap("!?@,.", ',', '.'));
    }

    @Test
    public void test9() {
        assertEquals("T_T Q_Q =.= >.<", doubleSwap("Q_Q T_T =.= >.<", 'Q', 'T'));
    }

    @Test
    public void test10() {
        assertEquals("><", doubleSwap("<>", '>', '<'));
    }

    @Test
    public void test11() {
        assertEquals("110010", doubleSwap("001101", '1', '0'));
    }

}
