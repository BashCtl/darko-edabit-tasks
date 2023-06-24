package hard;

import org.junit.Test;

import java.util.regex.Pattern;

import static org.testng.AssertJUnit.assertEquals;

public class KnowYourNeighbor {


    public static boolean plusSign(String str) {
        char[] arr = str.toCharArray();
        if(arr[0]=='+'){
            for(char ch: arr){
                if (Character.isAlphabetic(ch)){
                    if(str.charAt(str.indexOf(ch)-1)=='+'){
                        if(str.charAt(str.indexOf(ch)+1)=='+'){
                            continue;
                        }
                    }
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }

    }



    @Test
    public void test1() {
        assertEquals(true, plusSign("+f+d+c+#+f+"));
    }

    @Test
    public void test2() {
        assertEquals(true, plusSign("+d+=3=+s+"));
    }

    @Test
    public void test3() {
        assertEquals(false, plusSign("+d+k+##f+"));
    }

    @Test
    public void test4() {
        assertEquals(false, plusSign("hf+d++#+f+"));
    }

    @Test
    public void test5() {
        assertEquals(true, plusSign("+d+i+#+c+"));
    }

    @Test
    public void test6() {
        assertEquals(false, plusSign("a+"));
    }
}
