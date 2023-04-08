package medium;

public class RectangleInCircle {

    public static boolean rectangleInCircle(int w, int h, int radius) {
        int s = (int) (w * Math.sqrt(4 * radius * radius - (w * w)));

        return  s >= w*h;
    }

    public static void main(String[] args) {
        System.out.println(rectangleInCircle(8, 6, 5));
        System.out.println(rectangleInCircle(5, 9, 5));
        System.out.println(rectangleInCircle(4,7,4));
        System.out.println(rectangleInCircle(5,12,7));
    }
}
