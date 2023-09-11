package hard;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SecretFunction {

    public static int secret(int i) {
        int first = i / 10;
        int second = i % 10;
        return (int) (Math.pow(first, second) - first * second);
    }

//    public static void main(String[] args) {
//        System.out.println(secret(24));
//        System.out.println(secret(15));
//        System.out.println(secret(52));
//    }


    @Test
    public void test1() {
        assertEquals(secret(24), 8);
    }

    @Test
    public void test2() {
        assertEquals(secret(32), 3);
    }

    @Test
    public void test3() {
        assertEquals(secret(23), 2);
    }

    @Test
    public void test4() {
        assertEquals(secret(42), 8);
    }

    @Test
    public void test5() {
        assertEquals(secret(15), -4);
    }

    @Test
    public void test6() {
        assertEquals(secret(32), 3);
    }

    @Test
    public void test7() {
        assertEquals(secret(52), 15);
    }

    @Test
    public void test8() {
        assertEquals(secret(25), 22);
    }
}
