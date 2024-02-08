package very_hard;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
Reverse LEGO Yoda

Create a function that takes a string with at least one sentence in it
and returns a string with the part(s) after the comma at the beginning of the sentence(s).

Examples
reverseLegoYoda("Hit you with my stick, I shall.")
➞ "I shall hit you with my stick."

reverseLegoYoda("Rejected me, my crush has. Ketamine, I need.")
➞ "My crush has rejected me. I need ketamine."

reverseLegoYoda("An alien, I am. Holding me captive in Area 51, the government is.")
➞ "I am an alien. The government is holding me captive in Area 51."

Notes
Pay close attention to letter cases.
Sentences will always end with a period.
There will always be exactly one comma in each of the sentences.

 */
public class ReverseLegoYoda {

    public static String reverseLegoYoda(String text) {
        return Arrays.stream(text.split("\\.")).map(sentance -> {
            List<String> splited = Arrays.stream(sentance.trim().split(","))
                    .map(part -> part.substring(0, 1).toLowerCase() + part.substring(1))
                    .collect(Collectors.toList());
            Collections.reverse(splited);
            String result = String.join(" ", splited).trim();
            return result.substring(0, 1).toUpperCase() + result.substring(1) + ".";
        }).collect(Collectors.joining(" ")).trim();
    }

    @Test
    public void test1() {
        assertEquals("I shall hit you with my stick.", reverseLegoYoda("Hit you with my stick, I shall."));
    }

    @Test
    public void test2() {
        assertEquals("My crush has rejected me. I need ketamine.", reverseLegoYoda("Rejected me, my crush has. Ketamine, I need."));
    }

    @Test
    public void test3() {
        assertEquals("I am an alien. The government is holding me captive in Area 51.", reverseLegoYoda("An alien, I am. Holding me captive in Area 51, the government is."));
    }
}
