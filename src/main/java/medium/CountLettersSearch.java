package medium;

public class CountLettersSearch {

    public static int letterCounter(char[][] arr, char c) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == c) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
