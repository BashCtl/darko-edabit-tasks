package hard;

import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ElasticWords {

    public static String elasticize(String word) {
        StringBuilder result = new StringBuilder();
        if (word.length() % 2 == 0) {
            for (int i = 0; i < word.length(); i++) {
                if (i < word.length() / 2) {
                    result.append(new String(new char[i + 1]).replace('\u0000', word.charAt(i)));
                } else {
                    result.append(new String(new char[word.length() - i]).replace('\u0000', word.charAt(i)));
                }
            }
        } else {

            for (int i = 0; i < word.length(); i++) {
                if (i < word.length() / 2) {
                    result.append(new String(new char[i + 1]).replace('\u0000', word.charAt(i)));
                } else if (i == word.length() / 2) {
                    result.append(new String(new char[i + 1]).replace('\u0000', word.charAt(i)));
                } else {
                    result.append(new String(new char[word.length() - i]).replace('\u0000', word.charAt(i)));
                }
            }

        }
        return result.toString();
    }

//    public static void main(String[] args) {
//        System.out.println(elasticize("ANNA"));
//        System.out.println(elasticize("KAYAK"));
//    }

    @Test
    public void test1() {
        assertEquals("ANNNNA", elasticize("ANNA"));
    }

    @Test
    public void test2() {
        assertEquals("KAAYYYAAK", elasticize("KAYAK"));
    }

    @Test
    public void test3() {
        assertEquals("X", elasticize("X"));
    }

    @Test
    public void test4() {
        assertEquals("AA", elasticize("AA"));
    }

    @Test
    public void test5() {
        assertEquals("ABBC", elasticize("ABC"));
    }

    @Test
    public void test6() {
        assertEquals("BOOB", elasticize("BOB"));
    }

    @Test
    public void test7() {
        assertEquals("OTTTTO", elasticize("OTTO"));
    }

    @Test
    public void test8() {
        assertEquals("LEEVVVEEL", elasticize("LEVEL"));
    }

    @Test
    public void test9() {
        assertEquals("IJJKKKCCCBBA", elasticize("IJKCBA"));
    }

    @Test
    public void test10() {
        assertEquals("REEDDDDDDEER", elasticize("REDDER"));
    }

    @Test
    public void test11() {
        assertEquals("ROOTTTAAAATTTOOR", elasticize("ROTATOR"));
    }

}
