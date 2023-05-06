package hard;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SimplifiedFractions {

    public static String simplify(String str) {
        String[] numbers = str.split("/");
        var firstNumber = Integer.valueOf(numbers[0]);
        var secondNumber = Integer.valueOf(numbers[1]);
        var max = Math.max(firstNumber, secondNumber);
        for (int i = max; max >= 1; max--) {
            if (firstNumber % max == 0 && secondNumber % max == 0) {
                firstNumber /= max;
                secondNumber /= max;
                break;
            }
        }
        return secondNumber != 1 ? firstNumber + "/" + secondNumber : String.valueOf(firstNumber);
    }

//    public static void main(String[] args) {
//        System.out.println(simplify("4/6"));
//        System.out.println(simplify("10/11"));
//        System.out.println(simplify("100/400"));
//        System.out.println(simplify("8/4"));
//    }

    @Test
    public void test1() {
        assertEquals("5/7", simplify("5/7"));
    }

    @Test
    public void test2() {
        assertEquals("2/3", simplify("4/6"));
    }

    @Test
    public void test3() {
        assertEquals("11/10", simplify("11/10"));
    }

    @Test
    public void test4() {
        assertEquals("2", simplify("8/4"));
    }

    @Test
    public void test5() {
        System.out.println("Should work for improper fractions.");
        assertEquals("7/4", simplify("7/4"));
    }

    @Test
    public void test6() {
        assertEquals("3/2", simplify("6/4"));
    }

    @Test
    public void test7() {
        assertEquals("3/2", simplify("300/200"));
    }

    @Test
    public void test8() {
        assertEquals("2", simplify("50/25"));
    }

    @Test
    public void test9() {
        assertEquals("1/9", simplify("5/45"));
    }

}
