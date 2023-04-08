package medium;

import java.util.Arrays;
import java.util.stream.Collectors;

public class IndexFiltering {

    public static String indexFilter(int[] idx, String str){
         return Arrays.stream(idx).mapToObj(i-> i>=0? str.charAt(i):str.charAt(str.length()+i))
                .map(x -> String.valueOf(x).toLowerCase())
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(indexFilter(new int[]{7,-1,5,1}, "She is the love of my love"));
    }

}
