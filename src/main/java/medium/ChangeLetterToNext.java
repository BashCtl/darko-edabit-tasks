package medium;

import java.util.stream.Collectors;

public class ChangeLetterToNext {

    public static String move(String word) {
        return word.chars()
                .mapToObj(c -> String.valueOf((char) (++c)))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(move("hello"));
    }
}
