package hard;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;

public class ReverseCodingChallengeFive {

    public static int mysteryFunc(int num){
        String strNum = Arrays.stream(new StringBuilder(String.valueOf(num)).reverse().toString().split(""))
                .mapToInt(Integer::valueOf)
                .sorted()
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());
        return num - Integer.parseInt(strNum);
    }

    @Test
    public void test1() {
        assertEquals(594, mysteryFunc(832));
    }

    @Test
    public void test2() {
        assertEquals(36, mysteryFunc(51));
    }

    @Test
    public void test3() {
        assertEquals(198, mysteryFunc(7977));
    }

    @Test
    public void test4() {
        assertEquals(0, mysteryFunc(1));
    }

    @Test
    public void test5() {
        assertEquals(99, mysteryFunc(665));
    }

    @Test
    public void test6() {
        assertEquals(0, mysteryFunc(149));
    }

}
