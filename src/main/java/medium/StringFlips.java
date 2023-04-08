package medium;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.testng.Assert.assertEquals;

public class StringFlips {

    public static String flip(String str, String spec) {
        String[] words = str.split(" ");
        if (spec.equals("sentence")) {
            return IntStream.range(0, words.length)
                    .boxed().sorted(Comparator.reverseOrder()).map(i -> words[i])
                    .collect(Collectors.joining(" "));


        } else {
            return Arrays.stream(words).map(w -> new StringBuilder(w).reverse().toString())
                    .collect(Collectors.joining(" "));
        }
    }

//    public static void main(String[] args) {
//        System.out.println(flip("There's never enough time to do all the nothing you want", "sentence"));
//    }

    @Test
    public void test1() {
        assertEquals("olleH", flip("Hello", "word"));
    }

    @Test
    public void test2() {
        assertEquals("Hello", flip("Hello", "sentence"));
    }

    @Test
    public void test3() {
        assertEquals("s'erehT reven hguone emit ot od lla eht gnihton uoy tnaw", flip("There's never enough time to do all the nothing you want", "word"));
    }

    @Test
    public void test4() {
        assertEquals("want you nothing the all do to time enough never There's", flip("There's never enough time to do all the nothing you want", "sentence"));
    }

    @Test
    public void test5() {
        assertEquals("I evah lla eseht taerg seneg tub er'yeht evissecer", flip("I have all these great genes but they're recessive", "word"));
    }

    @Test
    public void test6() {
        assertEquals("recessive they're but genes great these all have I", flip("I have all these great genes but they're recessive", "sentence"));
    }

    @Test
    public void test7() {
        assertEquals("I ekil smixam taht t'nod egaruocne roivaheb noitacifidom", flip("I like maxims that don't encourage behavior modification", "word"));
    }

    @Test
    public void test8() {
        assertEquals("modification behavior encourage don't that maxims like I", flip("I like maxims that don't encourage behavior modification", "sentence"));
    }

}
