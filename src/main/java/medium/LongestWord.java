package medium;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWord {

    public static String longestWord(String phrase){
        Comparator<String> comparator = (s1,s2)-> s2.length()-s1.length();
      return   Arrays.stream(phrase.split(" ")).sorted(comparator).findFirst().get();
    }

    public static void main(String[] args) {
        System.out.println(longestWord("Margaret's toy is a pretty doll."));
    }
}
