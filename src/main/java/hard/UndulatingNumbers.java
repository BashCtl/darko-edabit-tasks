package hard;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UndulatingNumbers {

    public static boolean isUndulating(int n){
        String strNum = String.valueOf(n);
        if(strNum.length()<=2){
            return false;
        }
        for(int i=2;i<strNum.length();i++){
            if(strNum.charAt(i-2)!=strNum.charAt(i))
                return false;
        }
        return true;
    }

    @Test
    public void test01() {
        assertEquals(true, isUndulating(121));
    }

    @Test
    public void test02() {
        assertEquals(true, isUndulating(101));
    }

    @Test
    public void test03() {
        assertEquals(false, isUndulating(12));
    }

    @Test
    public void test04() {
        assertEquals(true, isUndulating(373737));
    }

    @Test
    public void test05() {
        assertEquals(false, isUndulating(12122));
    }

    @Test
    public void test06() {
        assertEquals(false, isUndulating(85856));
    }

    @Test
    public void test07() {
        assertEquals(true, isUndulating(949494));
    }

    @Test
    public void test08() {
        assertEquals(true, isUndulating(494));
    }

    @Test
    public void test09() {
        assertEquals(false, isUndulating(363738));
    }

    @Test
    public void test10() {
        assertEquals(false, isUndulating(3663));
    }

    @Test
    public void test11() {
        assertEquals(true, isUndulating(81818181));
    }
}
