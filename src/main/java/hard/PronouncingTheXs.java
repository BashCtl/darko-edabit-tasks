package hard;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PronouncingTheXs {

    public static String xPronounce(String sentence) {
        sentence = sentence.replaceAll(" x ", " ecks ");
        sentence = sentence.replaceAll("(\\w)(x)", "$1cks");
        sentence = sentence.replaceAll(" (?i)(x)", " z");
        return sentence;
    }

    @Test
    public void test1() {
        assertEquals("Inside the bocks was a zylophone", xPronounce("Inside the box was a xylophone"));
    }

    @Test
    public void test2() {
        assertEquals("The ecks ray is eckscellent", xPronounce("The x ray is excellent"));
    }

    @Test
    public void test3() {
        assertEquals("OMG ecks bocks unbocksing video ecks D", xPronounce("OMG x box unboxing video x D"));
    }

    @Test
    public void test4() {
        assertEquals("I gotta make bucks but the clocks are ticking!", xPronounce("I gotta make bux but the clox are ticking!"));
    }

    @Test
    public void test5() {
        assertEquals("this test does not have an ecks in it", xPronounce("this test does not have an x in it"));
    }

    @Test
    public void test6() {
        assertEquals("Macks backs packs", xPronounce("Max bax pax"));
    }

    @Test
    public void test7() {
        assertEquals("Anti vacks", xPronounce("Anti vax"));
    }

    @Test
    public void test8() {
        assertEquals("Who is zavier and why does he have my car", xPronounce("Who is xavier and why does he have my car"));
    }

    @Test
    public void test9() {
        assertEquals("OMG zylem unbocksing video ecks D", xPronounce("OMG xylem unboxing video x D"));
    }

}
