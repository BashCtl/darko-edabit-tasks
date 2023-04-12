package hard;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CamelCaseSnakeCase {

    public static String toCamelCase(String str) {
        String[] words = str.split("_");
        StringBuilder result = new StringBuilder();
        result.append(words[0]);
        for (int i = 1; i < words.length; i++) {
            result.append(words[i].substring(0, 1).toUpperCase())
                    .append(words[i].substring(1));
        }
        return result.toString();

    }

    public static String toSnakeCase(String str){
       return Arrays.stream(str.split("(?=[A-Z])"))
               .map(String::toLowerCase)
               .collect(Collectors.joining("_"));
    }

    public static void main(String[] args) {
        System.out.println(toCamelCase("hello_edabit"));

        System.out.println(toSnakeCase("helloEdabit"));
    }

}
