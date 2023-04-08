package medium;

import java.util.Arrays;

public class RetrieveLastNElements {

    public static int[] last(int[] r, int n) {

        return n > r.length ? null : Arrays.stream(r).skip(r.length - n).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(last(new int[]{1, 2, 3, 4, 5}, 1)));
        System.out.println(Arrays.toString(last(new int[]{1, 2, 3, 4, 5}, 7)));
        System.out.println(Arrays.toString(last(new int[]{1, 2, 3, 4, 5}, 0)));
    }
}
