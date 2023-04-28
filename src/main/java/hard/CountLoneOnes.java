package hard;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CountLoneOnes {

    public static int countLoneOnes(long n) {
        String num = String.valueOf(n);
        int count = 0;
        for (int i = 0; i < num.length() -1; i++) {
            if (num.charAt(i) == '1') {
                if(i==0&& num.charAt(i+1)!='1'){
                    count++;
                }else
                if(num.charAt(i-1)!='1' && num.charAt(i+1)!='1'){
                    count++;
                }
            }
        }
        return count;
    }

    @Test
    public void test1() {
        assertEquals(countLoneOnes(101), 2);
    }

    @Test
    public void test2() {
        assertEquals(countLoneOnes(1191), 1);
    }

    @Test
    public void test3() {
        assertEquals(countLoneOnes(12131415161718191L), 9);
    }

    @Test
    public void test4() {
        assertEquals(countLoneOnes(11231212111L), 2);
    }

    @Test
    public void test5() {
        assertEquals(countLoneOnes(1), 1);
    }

    @Test
    public void test6() {
        assertEquals(countLoneOnes(0), 0);
    }

    @Test
    public void test7() {
        assertEquals(countLoneOnes(1111), 0);
    }

    @Test
    public void test8() {
        assertEquals(countLoneOnes(11101), 1);
    }

    @Test
    public void test9() {
        assertEquals(countLoneOnes(462), 0);
    }

    @Test
    public void test10() {
        assertEquals(countLoneOnes(101010101), 5);
    }
}
