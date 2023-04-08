package medium;

public class HowManySolutions {

    public static int solutions(int a, int b, int c) {
        int discriminant = b * b - (4 * a * c);
        if (discriminant > 0) {
            return 2;
        }
        if (discriminant == 0) {
            return 1;
        }
        return 0;
    }
}
