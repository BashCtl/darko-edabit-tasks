package medium;

import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SubstitutingThe {

    public static String replaceThe(String str) {

        String[] words = str.split(" ");
        return IntStream.range(0, words.length)
                .mapToObj(i -> {
                    if (words[i].equals("the") &&
                            Pattern.compile("^[aeiou].+$")
                                    .matcher(words[i + 1]).matches()) {
                        return words[i] = "an";
                    } else if (words[i].equals("the")) {
                        return words[i] = "a";
                    }
                    return words[i];
                }).collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        System.out.println(replaceThe("the dog and the envelope"));
    }

}
