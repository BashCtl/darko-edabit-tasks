package hard;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PrintGrid {

    public static String printGrid(int rows, int cols) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= rows; i++) {
            result.append(i);
            if (cols != 1)
                result.append(", ");
            int temp = 1;
            for (int j = i; temp < cols; j += rows) {
                result.append(j + rows);
                if (temp < cols - 1) {
                    result.append(", ");
                }
                temp++;
            }
            if (i != rows)
                result.append("\n");
        }
        return result.toString();
    }

//    public static void main(String[] args) {
//        System.out.println(printGrid(3, 6));
//        System.out.println(printGrid(4, 1));
//    }


    @Test
    public void printGrid36() {
        String res =
                "1, 4, 7, 10, 13, 16\n" +
                        "2, 5, 8, 11, 14, 17\n" +
                        "3, 6, 9, 12, 15, 18";
        assertEquals(res, printGrid(3, 6));
    }

    @Test
    public void printGrid53() {
        String res =
                "1, 6, 11\n" +
                        "2, 7, 12\n" +
                        "3, 8, 13\n" +
                        "4, 9, 14\n" +
                        "5, 10, 15";
        assertEquals(res, printGrid(5, 3));
    }

    @Test
    public void printGrid41() {
        String res = "1\n" +
                "2\n" +
                "3\n" +
                "4";
        assertEquals(res, printGrid(4, 1));
    }

    @Test
    public void printGrid13() {
        String res = "1, 2, 3";
        assertEquals(res, printGrid(1, 3));
    }

    @Test
    public void printGrid102() {
        String res =
                "1, 11\n" +
                        "2, 12\n" +
                        "3, 13\n" +
                        "4, 14\n" +
                        "5, 15\n" +
                        "6, 16\n" +
                        "7, 17\n" +
                        "8, 18\n" +
                        "9, 19\n" +
                        "10, 20";
        assertEquals(res, printGrid(10, 2));
    }

}
