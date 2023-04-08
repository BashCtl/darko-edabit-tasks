package medium;

public class HarshadNumber {

    public static boolean isHarshad(int n){
        int sum = 0;
        int temp = n;
        while (temp>0){
            sum+=temp%10;
            temp=temp/10;
        }
        return n%sum==0;
    }

    public static void main(String[] args) {
        System.out.println(isHarshad(75));
        System.out.println(isHarshad(171));
        System.out.println(isHarshad(481));
        System.out.println(isHarshad(89));
        System.out.println(isHarshad(516));
        System.out.println(isHarshad(200));
    }
}
