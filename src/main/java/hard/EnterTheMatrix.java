package hard;

import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class EnterTheMatrix {

    public static String transpose(String[][] m) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < m[0].length; i++) {
            for (int j = 0; j < m.length; j++) {
                result.append(m[j][i]).append(" ");
            }
        }
        return result.toString().trim();
    }

    @Test
    public void test01() {
        assertEquals("I so love Tesh very much!", transpose(new String[][] {{"I", "Tesh"}, {"so", "very"}, {"love", "much!"}}));
    }

    @Test
    public void test02() {
        assertEquals("My world evolves solely on Tesha's.", transpose(new String[][] {{"My", "evolves", "on"}, {"world", "solely", "Tesha's."}}));
    }

    @Test
    public void test03() {
        assertEquals("The hurting truth is I can't have you now Tesh!", transpose(new String[][] {{"The", "truth", "I", "have", "now"}, {"hurting", "is", "can't", "you", "Tesh!"}}));
    }

    @Test
    public void test04() {
        assertEquals("Enter the Matrix!", transpose(new String[][] {{"Enter"}, {"the"}, {"Matrix!"}}));
    }

    @Test
    public void test05() {
        assertEquals("The columns are rows.", transpose(new String[][] {{"The", "are"}, {"columns", "rows."}}));
    }

    @Test
    public void test06() {
        assertEquals("You must transpose the table order.", transpose(new String[][] {{"You", "the"}, {"must", "table"}, {"transpose", "order."}}));
    }
}
