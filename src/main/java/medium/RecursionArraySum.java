package medium;

import java.util.Arrays;

public class RecursionArraySum {

    public static int sum(int[] arr){
        if(arr.length==0){
            return 0;
        }
        return arr[0] + sum(Arrays.copyOfRange(arr,1, arr.length));
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2};
        int result = sum(arr);
        System.out.println(result);
    }
}
