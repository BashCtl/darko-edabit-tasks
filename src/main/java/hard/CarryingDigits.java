package hard;

import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CarryingDigits {

    public static int carryDigits(int n1, int n2) {
        int count = 0;
        int remainder = 0;
        while (n1!=0) {
            int n1Last = n1 % 10;
            int n2Last = n2 % 10;
            n1 /= 10;
            n2 /= 10;
            int tempSum = n1Last + n2Last + remainder;
            if (tempSum >= 10) {
                count++;
                remainder = tempSum - 9;
            }
        }
        return count;
    }

//    public static void main(String[] args) {
//        System.out.println(carryDigits(36, 135));
//        System.out.println(carryDigits(671,329));
//        System.out.println(carryDigits(1111,3333));
//        System.out.println(carryDigits(53214, 56905));
//    }

    @Test
    public void test1() {
        assertEquals(1, carryDigits(36, 135));
    }

    @Test
    public void test2() {
        assertEquals(3, carryDigits(671, 329));
    }

    @Test
    public void test3() {
        assertEquals(0, carryDigits(1111, 3333));
    }

    @Test
    public void test4() {
        assertEquals(1, carryDigits(4, 5268));
    }

    @Test
    public void test5() {
        assertEquals(2, carryDigits(53214, 16905));
    }

    @Test
    public void test6() {
        assertEquals(3, carryDigits(53214, 56905));
    }

    @Test
    public void test7() {
        assertEquals(0, carryDigits(515, 4));
    }

    @Test
    public void test8() {
        assertEquals(1, carryDigits(515, 90));
    }

    @Test
    public void test9() {
        assertEquals(1, carryDigits(63223, 70000));
    }

}
