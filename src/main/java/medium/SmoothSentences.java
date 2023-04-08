package medium;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SmoothSentences {

    public static    boolean isSmooth(String sentence) {
        String[] words = sentence.split(" ");
        String collect = Arrays.stream(words).map(word -> {
            if (word.equals(words[0])) {
                return String.valueOf(word.charAt(word.length() - 1));
            } else if (word.equals(words[words.length - 1])) {
                return String.valueOf(word.charAt(0));
            }
            return String.valueOf(word.charAt(0))
                    + String.valueOf(word.charAt(word.length() - 1));
        }).map(w->w.toLowerCase()).collect(Collectors.joining());
        for (int i=0;i<collect.length()-1;i+=2){
            if(collect.charAt(i)!=collect.charAt(i+1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isSmooth("Marta appreciated deep perpendicular right trapezoids"));
    }

}
