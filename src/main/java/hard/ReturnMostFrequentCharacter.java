package hard;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class ReturnMostFrequentCharacter {

    public static String[] mostFrequentChar(String[] arr){
        Map<String, Long> frequencies = Arrays.stream(arr).flatMap(word -> Arrays.stream(word.split("")))
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));
        long max = Collections.max(frequencies.values());
        return frequencies.entrySet().stream()
                .filter(entry->entry.getValue()==max)
                .map(Map.Entry::getKey)
                .sorted()
                .toArray(String[]::new);

    }


    @Test
    public void test1() {
        assertThat(mostFrequentChar(new String[]{"apple", "bandage", "yodel", "make"}), is(new String[]{"a", "e"}));
    }

    @Test
    public void test2() {
        assertThat(mostFrequentChar(new String[]{"music", "madness", "maniac", "motion"}), is(new String[]{"m"}));
    }

    @Test
    public void test3() {
        assertThat(mostFrequentChar(new String[]{"the", "hills", "are", "alive", "with", "the", "sound", "of", "music"}), is(new String[]{"e", "h", "i"}));
    }

    @Test
    public void test4() {
        assertThat(mostFrequentChar(new String[]{"let", "them", "eat", "cake"}), is(new String[]{"e"}));
    }

    @Test
    public void test5() {
        assertThat(mostFrequentChar(new String[]{"potion", "master", "professor", "snape"}), is(new String[]{"o", "s"}));
    }

}
