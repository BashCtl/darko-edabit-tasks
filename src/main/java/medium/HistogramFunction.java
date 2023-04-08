package medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class HistogramFunction {

    public static String histogram(int[] arr, String chr){
      return   Arrays.stream(arr).mapToObj(x->String.join("", Collections.nCopies(x,chr)))
                .collect(Collectors.joining("\n"));
    }

    public static void main(String[] args) {
        System.out.println(histogram(new int[]{1,3,4},"#"));
    }

}
