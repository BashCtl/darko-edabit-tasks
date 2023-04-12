package hard;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;

public class AlphabeticallySorted {

    public static boolean isAlphabeticallySorted(String sentence){
      return   Arrays.stream(sentence.replaceAll("[^a-zA-Z ]","").split("\\s+"))
                .anyMatch(word -> word.equals(Arrays.stream(word.split("")).sorted().collect(Collectors.joining()))
                && word.length()>=3);
    }

    @Test
    public void test1() {
        assertEquals(true, isAlphabeticallySorted("Paula has a French accent."));
    }

    @Test
    public void test2() {
        assertEquals(true, isAlphabeticallySorted("The biopsy returned negative results."));
    }

    @Test
    public void test3() {
        assertEquals(false, isAlphabeticallySorted("She sells sea shells by the sea shore."));
    }

    @Test
    public void test4() {
        assertEquals(true, isAlphabeticallySorted("She almost reached the top of Mt. Everest."));
    }

    @Test
    public void test5() {
        assertEquals(true, isAlphabeticallySorted("She was happy with how her earring hoops looked."));
    }

    @Test
    public void test6() {
        assertEquals(false, isAlphabeticallySorted("Beth dislikes eating starfruit but enjoys cherries."));
    }

    @Test
    public void test7() {
        assertEquals(true, isAlphabeticallySorted("Elinor is inside on a rainy day sipping hot chocolate."));
    }

    @Test
    public void test8() {
        assertEquals(false, isAlphabeticallySorted("Mara took a photograph."));
    }

}
