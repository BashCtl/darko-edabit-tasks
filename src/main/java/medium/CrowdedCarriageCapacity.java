package medium;

public class CrowdedCarriageCapacity {

    public static int findSeat(int n, int[] arr) {
        double capacity = n / arr.length;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] / capacity) * 100 <= 50) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findSeat(200, new int[]{35, 23, 18, 10, 40}));
        System.out.println(findSeat(200, new int[]{35, 23, 40, 21, 38}));
    }
}
