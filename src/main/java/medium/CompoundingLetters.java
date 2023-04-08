package medium;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CompoundingLetters {

    public static String accum(String str){
      return   IntStream.range(0,str.length())
                .mapToObj(i->str.substring(i,++i).toUpperCase()
                        +String.join("", Collections.nCopies(--i,str.substring(i,++i).toLowerCase())))
                .collect(Collectors.joining("-"));
    }

    public static void main(String[] args) {
        System.out.println(accum("abcd"));
        System.out.println(accum("RqaEzty"));
        System.out.println(accum("cwAt"));
    }

}
