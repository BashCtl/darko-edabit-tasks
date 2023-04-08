package medium;

public class CountTrue {

    public static int countTrue(boolean[] arr) {
       int count =0;
       for(int i= 0; i< arr.length;i++){
           count+= arr[i]==true?1:0;
       }
       return count;
    }

    public static void main(String[] args) {
        boolean[] arr = {true, false, true, false};
        System.out.println(countTrue(arr));
    }
}
