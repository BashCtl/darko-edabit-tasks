package hard;

import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ClosingInSum {

    public static int closingInSum(long num) {
        String numbers = String.valueOf(num);
        return sum(numbers);
    }

    public static int sum(String numbers) {

        if (numbers.length() == 0) {
            return 0;
        }
        int number = numbers.length() > 1 ? Integer.parseInt(numbers.charAt(0) + numbers.substring(numbers.length() - 1))
                : Integer.parseInt(String.valueOf(numbers.charAt(0)));
        int index = numbers.length()>1 ? 1: 0;
        return number + sum(numbers.substring(index, numbers.length() - 1));

    }

//    public static void main(String[] args) {
//        System.out.println(sum("2520"));
//        System.out.println(sum("121"));
//    }

    @Test
    public void test01() {
        assertEquals(13, closingInSum(121));
    }

    @Test
    public void test02() {
        assertEquals(22, closingInSum(1039));
    }

    @Test
    public void test03() {
        assertEquals(100, closingInSum(22225555));
    }

    @Test
    public void test04() {
        assertEquals(72, closingInSum(2520));
    }

    @Test
    public void test05() {
        assertEquals(331, closingInSum(5332824166496569L));
    }

    @Test
    public void test06() {
        assertEquals(485, closingInSum(1979672314137318116L));
    }

    @Test
    public void test07() {
        assertEquals(548, closingInSum(1795459644013947776L));
    }

    @Test
    public void test08() {
        assertEquals(426, closingInSum(2801980378842185820L));
    }

    @Test
    public void test09() {
        assertEquals(430, closingInSum(3440584288422776554L));
    }

    @Test
    public void test10() {
        assertEquals(342, closingInSum(1985124000275401986L));
    }

    @Test
    public void test11() {
        assertEquals(355, closingInSum(1807452600132227071L));
    }

    @Test
    public void test12() {
        assertEquals(389, closingInSum(4319109703929506546L));
    }

    @Test
    public void test13() {
        assertEquals(453, closingInSum(7617065707454878893L));
    }

    @Test
    public void test14() {
        assertEquals(316, closingInSum(6332019057820232020L));
    }

    @Test
    public void test15() {
        assertEquals(452, closingInSum(901916905437689753L));
    }

    @Test
    public void test16() {
        assertEquals(627, closingInSum(8574963792985202586L));
    }

    @Test
    public void test17() {
        assertEquals(406, closingInSum(1827923410871280811L));
    }

    @Test
    public void test18() {
        assertEquals(454, closingInSum(1192239769354257577L));
    }

    @Test
    public void test19() {
        assertEquals(479, closingInSum(7565666227181120333L));
    }

    @Test
    public void test20() {
        assertEquals(418, closingInSum(4456731446833112446L));
    }

    @Test
    public void test21() {
        assertEquals(353, closingInSum(6649112211153605642L));
    }

    @Test
    public void test22() {
        assertEquals(302, closingInSum(6043414146315434510L));
    }

    @Test
    public void test23() {
        assertEquals(403, closingInSum(2154880710356439481L));
    }

    @Test
    public void test24() {
        assertEquals(560, closingInSum(987940367202343565L));
    }
    
}
