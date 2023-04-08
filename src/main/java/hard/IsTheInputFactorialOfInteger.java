package hard;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class IsTheInputFactorialOfInteger {

    public static boolean isFactorial(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                n /= i;
            } else break;
        }
        return n == 1;
    }

    @Test
    public void test1(){
        assertEquals(true,isFactorial(2));
    }
    @Test
    public void test2(){
        assertEquals(false,isFactorial(16));
    }
    @Test
    public void test3(){
        assertEquals(true,isFactorial(24));
    }
    @Test
    public void test4(){
        assertEquals(false,isFactorial(36));
    }
    @Test
    public void test5(){
        assertEquals(true,isFactorial(120));
    }
    @Test
    public void test6(){
        assertEquals(false,isFactorial(721));
    }

}
