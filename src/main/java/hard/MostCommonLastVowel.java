package hard;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;

public class MostCommonLastVowel {

    public static String commonLastVowel(String str) {
        str = str.toLowerCase().replaceAll("[!,\\?]", "");
        String[] words = str.split(" ");
        return Arrays.stream(words)
                .map(word -> {
                    if (word.matches("^.+[aeiou]$")) {
                        return word.substring(word.length() - 1);
                    } else if (word.matches("^[aeiou].+$")) {
                        return word.substring(0, 1);
                    } else if (word.matches("^.+[aeiou].+$")) {
                        return word.replaceAll("(.+)([aeiou]).+", "$2");
                    }
                    return "";
                })
                .filter(word -> !word.isEmpty())
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .get().getKey();

    }

//    public static void main(String[] args) {
//        System.out.println("munch".replaceAll("(.+)([aeiou]).+","$2"));
//        System.out.println(commonLastVowel("Watch the characters dance!"));
//        System.out.println(commonLastVowel("OOI UUI EEI AAI"));
//        System.out.println(commonLastVowel("amy and acts"));
//        System.out.println(commonLastVowel("munch munch munch tasty tasty brunch"));
//    }

    @Test
    public void test1() {
        assertEquals("o", commonLastVowel("Hello World!"));
    }

    @Test
    public void test2() {
        assertEquals("e", commonLastVowel("Watch the characters dance!"));
    }

    @Test
    public void test3() {
        assertEquals("i", commonLastVowel("OOI UUI EEI AAI"));
    }

    @Test
    public void test4() {
        assertEquals("a", commonLastVowel("amy and acts"));
    }

    @Test
    public void test5() {
        assertEquals("u", commonLastVowel("munch munch munch tasty tasty brunch"));
    }


}
