package medium;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SumOfArrayOfTime {

    public static int[] timeSum(String[] s) {
       int[] result = new int[3];
        for (String str : s) {
            String[] times = str.split(":");
            result[0] += Integer.parseInt(times[0]);
            result[1] += Integer.parseInt(times[1]);
            result[2] += Integer.parseInt(times[2]);
            if (result[2] > 60) {
                result[1]++;
                result[2] -= 60;
            }
            if (result[1] > 60) {
                result[0]++;
                result[1] -= 60;
            }
        }
        return result;
        }

        @Test
    public void test1() {
        assertEquals(timeSum(new String[]{}), new int[]{0, 0, 0});
    }

    @Test
    public void test2() {
        assertEquals(timeSum(new String[]{"1:23:45"}), new int[]{1, 23, 45});
    }

    @Test
    public void test3() {
        assertEquals(timeSum(new String[]{"1:03:45", "1:23:05"}), new int[]{2, 26, 50});
    }

    @Test
    public void test4() {
        assertEquals(timeSum(new String[]{"18:54:02", "0:26:28", "11:48:22", "22:26:16", "7:17:05", "8:01:44", "0:35:24", "16:25:11", "9:11:24", "18:30:46", "3:31:51", "16:55:32", "17:59:00", "11:29:30", "3:19:58", "9:12:27", "22:03:34", "1:06:12", "0:44:07", "4:47:46", "10:38:00", "14:26:51", "10:09:07", "5:08:29", "5:29:57", "22:15:03", "20:52:28", "8:42:20", "17:36:32", "9:36:17"}), new int[]{329, 41, 43});
    }

    @Test
    public void test5() {
        assertEquals(timeSum(new String[]{"5:39:42", "10:02:08", "8:26:33"}), new int[]{24, 8, 23});
    }

    @Test
    public void test6() {
        assertEquals(timeSum(new String[]{"10:11:02", "8:57:30", "10:58:56", "4:04:17", "3:01:13"}), new int[]{37, 12, 58});
    }

    @Test
    public void test7() {
        assertEquals(timeSum(new String[]{"1:23:45", "0:00:00"}), new int[]{1, 23, 45});
    }
}
