package medium;

public class QuadraticEquation {
    public static int quadraticEquation(int a, int b, int c) {
        int d = b * b - 4 * a * c;
        return (int) ((-b + Math.sqrt(d)) / (2 * a));
    }

    public static void main(String[] args) {
        System.out.println(quadraticEquation(2, -7, 3));
    }
}
