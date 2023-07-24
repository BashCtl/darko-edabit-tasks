package hard;

import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class GrowingAndShrinkingPotions {

    public static String afterPotion(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length() - 1; i++) {
            boolean isDigit = Character.isDigit(str.charAt(i));
            if (str.charAt(i + 1) == 'A' && isDigit) {
                int number = Integer.parseInt(String.valueOf(str.charAt(i)));
                result.append(number + 1);
                continue;
            } else if (str.charAt(i + 1) == 'B' && isDigit) {
                int number = Integer.parseInt(String.valueOf(str.charAt(i)));
                result.append(number - 1);
                continue;
            }
            if (isDigit) {
                result.append(str.charAt(i));
            }
        }
        if (Character.isDigit(str.charAt(str.length() - 1))) {
            result.append(str.charAt(str.length() - 1));
        }
        return result.toString();
    }

    @Test
    public void test1() {
        System.out.println("Should work without any potions.");
        assertEquals("567", afterPotion("567"));
    }

    @Test
    public void test2() {
        System.out.println("Should work with both potions.");
        assertEquals("47751", afterPotion("3A78B51"));
    }

    @Test
    public void test3() {
        assertEquals("9998", afterPotion("9999B"));
    }

    @Test
    public void test4() {
        assertEquals("10123", afterPotion("9A123"));
    }

    @Test
    public void test5() {
        assertEquals("2345", afterPotion("1A2A3A4A"));
    }

    @Test
    public void test6() {
        assertEquals("8767", afterPotion("9B8B7B6A"));
    }

}
