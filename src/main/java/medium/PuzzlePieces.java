package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PuzzlePieces {

    public static boolean puzzlePieces(int[][] n) {
        if (n[0].length != n[1].length) {
            return false;
        } else {
            for (int i = 0; i < n[0].length - 1; i++) {

                if ((n[0][i] + n[1][i]) != (n[0][i + 1] + n[1][i + 1])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(puzzlePieces(new int[][]{{1, 2, 3, 4}, {4, 3, 2, 1}}));
        System.out.println(puzzlePieces(new int[][]{{1, 2}, {-1, -1}}));
    }
}
