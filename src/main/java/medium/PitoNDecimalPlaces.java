package medium;

public class PitoNDecimalPlaces {

    public static double myPi(int num) {
        double pi = Math.PI;
        return Math.round(pi*Math.pow(10,num))/Math.pow(10,num);
    }

    public static void main(String[] args) {
        System.out.println(myPi(5));
        System.out.println(myPi(4));
    }
}
