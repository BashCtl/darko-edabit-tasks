package hard;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class PersistentLittleBugger {

    public static int bugger(int num) {
        if (num / 10 == 0) {
            return 0;
        }
        int n = Arrays.stream(String.valueOf(num).split(""))
                .mapToInt(Integer::valueOf)
                .reduce(1, (a, b) -> a * b);
        return 1 + bugger(n);
    }

    @Test
    public void test1() {
        assertEquals(3, bugger(39));
    }

    @Test
    public void test2() {
        assertEquals(0, bugger(4));
    }

    @Test
    public void test3() {
        assertEquals(2, bugger(25));
    }

    @Test
    public void test4() {
        assertEquals(4, bugger(999));
    }


}
