package medium;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseOrderWordsFiveLettersMore {

    public static String reverse(String s) {
     return     Arrays.stream(s.split(" ")).map(word ->{
             if(word.length()>=5){
                 return new StringBuilder(word).reverse();
             }
             return word;
         }).collect(Collectors.joining(" "));

    }

    public static void main(String[] args) {
        System.out.println(reverse("Reverse"));
        System.out.println(reverse("This is a typical sentence."));
        System.out.println(reverse("The dog is big."));
    }
}
