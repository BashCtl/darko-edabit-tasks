package hard;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ShapesOnePyramidFigure {

    public static String pyramid(int height) {
        StringBuilder result = new StringBuilder();
        int width = (height - 2) * 8 + 8;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == height - 1) {
                    result.append("*");
                } else if (i == 0 && j < width / 2) {
                    result.append("/");
                } else if (i == 0 && j >= width / 2) {
                    result.append("\\");
                } else if (j < (width - 8 * i) / 2) {
                    result.append("/");
                } else if (j < ((width - 8 * i) / 2) + 8 * i) {
                    result.append("*");
                } else {
                    result.append("\\");
                }
            }
                result.append("\n");
        }
        return result.toString();
    }

//    public static void main(String[] args) {
//        System.out.println(pyramid(2));
//        System.out.println(pyramid(3));
//        System.out.println(pyramid(4));
//    }

    @Test
    public void size2() {
        String res =
                "////\\\\\\\\\n" +
                        "********\n";
        assertEquals(res, pyramid(2));
    }

    @Test
    public void size3() {
        String res =
                "////////\\\\\\\\\\\\\\\\\n" +
                        "////********\\\\\\\\\n" +
                        "****************\n";
        assertEquals(res, pyramid(3));
    }

    @Test
    public void size4() {
        String res =
                "////////////\\\\\\\\\\\\\\\\\\\\\\\\\n" +
                        "////////********\\\\\\\\\\\\\\\\\n" +
                        "////****************\\\\\\\\\n" +
                        "************************\n";
        assertEquals(res, pyramid(4));
    }

    @Test
    public void size5() {
        String res =
                "////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n" +
                        "////////////********\\\\\\\\\\\\\\\\\\\\\\\\\n" +
                        "////////****************\\\\\\\\\\\\\\\\\n" +
                        "////************************\\\\\\\\\n" +
                        "********************************\n";
        assertEquals(res, pyramid(5));
    }

    @Test
    public void size6() {
        String res =
                "////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n" +
                        "////////////////********\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n" +
                        "////////////****************\\\\\\\\\\\\\\\\\\\\\\\\\n" +
                        "////////************************\\\\\\\\\\\\\\\\\n" +
                        "////********************************\\\\\\\\\n" +
                        "****************************************\n";
        assertEquals(res, pyramid(6));
    }

}
