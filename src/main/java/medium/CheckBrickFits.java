package medium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckBrickFits {

    // (a,b,c) -- dimensions of the brick
    // (w,h) -- dimensions of the hole
    public static boolean doesBrickFit(int a, int b, int c, int w, int h) {
        List<Integer> brickDimensions = Arrays.asList(a, b, c).stream()
                .sorted().collect(Collectors.toList());

        return brickDimensions.get(0) * brickDimensions.get(1) <= w * h;
    }

    public static void main(String[] args) {
        System.out.println(doesBrickFit(1,1,1,1,1));
        System.out.println(doesBrickFit(1,2,2,1,1));
    }
}
