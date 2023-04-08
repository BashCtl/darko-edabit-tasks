package medium;

public class ReversingBinaryString {

    public static int reversedBinaryInteger(int n){
        StringBuilder reverseBinary = new StringBuilder(Integer.toBinaryString(n)).reverse();
        return Integer.parseInt(reverseBinary.toString(),2);
    }

    public static void main(String[] args) {
        System.out.println(reversedBinaryInteger(10));
    }
}
