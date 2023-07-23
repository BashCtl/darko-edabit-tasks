package hard;

import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class RemoveTheLastVowel {

    public static String removeLastVowel(String str){
      return   str.replaceAll("\\b(|[\\w]+)([aeiouAEIOU]){1}(|[^aeiouAEIOU]+)\\b","$1$3");
    }

    public static void main(String[] args) {
        System.out.println(removeLastVowel("Love is a serious mental disease."));
    }

    @Test
    public void test1() {
        assertEquals("Thos wh dar t fal miserbly cn achiev gretly.",removeLastVowel("Those who dare to fail miserably can achieve greatly."));
    }

    @Test
    public void test2() {
        assertEquals("Lov s  serios mentl diseas.",removeLastVowel("Love is a serious mental disease."));
    }

    @Test
    public void test3() {
        assertEquals("Gt bsy livng r gt bsy dyng.",removeLastVowel("Get busy living or get busy dying."));
    }

    @Test
    public void test4() {
        assertEquals("f yo wnt t liv  hppy lif, ti t t  gol, nt t peopl.",removeLastVowel("If you want to live a happy life, tie it to a goal, not to people."));
    }

}
