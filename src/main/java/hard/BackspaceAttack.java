package hard;

import org.junit.Test;

import java.util.EmptyStackException;
import java.util.Stack;


import static org.testng.AssertJUnit.assertEquals;

public class BackspaceAttack {

    public static String erase(String str) {
        Stack<String> result = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '#') {
                result.push(String.valueOf(str.charAt(i)));
            } else {
                try {
                    result.pop();
                } catch (EmptyStackException e) {

                }
            }
        }
        return String.join("", result);
    }

//    public static void main(String[] args) {
//        System.out.println(erase("he##l#hel#llo"));
//        System.out.println(erase("major# spar##ks"));
//        System.out.println(erase("si###t boy"));
//    }

    @Test
    public void test1() {
        assertEquals("hello", erase("he##l#hel#llo"));
    }

    @Test
    public void test2() {
        assertEquals("majo spks", erase("major# spar##ks"));
    }

    @Test
    public void test3() {
        assertEquals("t boy", erase("si###t boy"));
    }

    @Test
    public void test4() {
        assertEquals("motionsick", erase("motion #sick"));
    }

    @Test
    public void test5() {
        assertEquals("otn sin", erase("m#oti#o#n sick##ne#ss##"));
    }

    @Test
    public void test6() {
        assertEquals("courage", erase("courz#i#age"));
    }

    @Test
    public void test7() {
        assertEquals(" tc", erase("aris##### c#r#ti#c"));
    }

    @Test
    public void test8() {
        assertEquals("beau", erase("beauty##"));
    }

    @Test
    public void test9() {
        assertEquals("beaut", erase("beauty#"));
    }

    @Test
    public void test10() {
        assertEquals("", erase("b#"));
    }

    @Test
    public void test11() {
        assertEquals("", erase("####"));
    }

}
