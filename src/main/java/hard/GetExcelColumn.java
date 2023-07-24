package hard;

import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class GetExcelColumn {

    public static int row(String str) {
        int columnNumber = 0;
        for (int i = 0; i < str.length(); i++) {
            columnNumber *= 26;
            columnNumber += str.charAt(i) - 'A' + 1;
        }
        return columnNumber;
    }

    @Test
    public void test1() {
        assertEquals(1, row("A"));
    }

    @Test
    public void test2() {
        assertEquals(2, row("B"));
    }

    @Test
    public void test3() {
        assertEquals(26, row("Z"));
    }

    @Test
    public void test4() {
        assertEquals(27, row("AA"));
    }

    @Test
    public void test5() {
        assertEquals(53, row("BA"));
    }

    @Test
    public void test6() {
        assertEquals(54, row("BB"));
    }

    @Test
    public void test7() {
        assertEquals(101, row("CW"));
    }

    @Test
    public void test8() {
        assertEquals(108, row("DD"));
    }

    @Test
    public void test9() {
        assertEquals(433, row("PQ"));
    }

    @Test
    public void test10() {
        assertEquals(702, row("ZZ"));
    }

    @Test
    public void test11() {
        assertEquals(731, row("ABC"));
    }

    @Test
    public void test12() {
        assertEquals(18272, row("ZZT"));
    }

    @Test
    public void test13() {
        assertEquals(348059, row("STVW"));
    }

}
