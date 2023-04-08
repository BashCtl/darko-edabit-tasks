package medium;

public class WarNumbers {

    public static int warOfNumbers(int[] numbers){
        int even =0;
        int odd =0;
        for(int n: numbers){
            if(n%2==0){
                even+=n;
            }else {
                odd+=n;
            }
        }
        return Math.abs(even -odd);
    }
}
