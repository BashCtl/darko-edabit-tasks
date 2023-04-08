package medium;

import java.util.Arrays;

public class PerfectSquarePatch {

    public static int [][] squarePatch(int n){
        int[][] result = new int[n][n];
        Arrays.stream(result).forEach(x -> Arrays.fill(x,n));
        return result;
    }

    public static void main(String[] args) {
        int[][] res = squarePatch(5);
        System.out.println(Arrays.toString(res[3]));
    }

}
