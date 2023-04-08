package medium;

import java.util.Arrays;

public class TotalVolumeBoxes {

    public static int totalVolume(int[][] part) {
        return Arrays.stream(part)
                .map(cub-> Arrays.stream(cub).reduce(1,(a,b)->a*b))
                .reduce(0,Integer::sum);

    }
}
