package hard;

import org.junit.Test;

import java.util.*;

import static org.testng.AssertJUnit.assertEquals;

public class HappyFunction {

    public static String happyAlgorithm(int num) {
        if(num==1){
            return "HAPPY 1";
        }
        List<Integer> results = new ArrayList<>();
        results.add(num);
        int steps = 0;
        while (num != 1) {
            num = Arrays.stream(String.valueOf(num).split("")).mapToInt(Integer::parseInt)
                    .map(n -> n * n).sum();
            results.add(num);
            steps++;
            if(Collections.frequency(results,num)>1){
                return String.format("SAD %S", steps);
            }

        }
        return String.format("HAPPY %S", steps);
    }

    @Test
    public void test1() {
        assertEquals("HAPPY 5", happyAlgorithm(139));
    }

    @Test
    public void test2() {
        assertEquals("SAD 10", happyAlgorithm(67));
    }

    @Test
    public void test3() {
        assertEquals("HAPPY 1", happyAlgorithm(1));
    }

    @Test
    public void test4() {
        assertEquals("HAPPY 4", happyAlgorithm(44));
    }

    @Test
    public void test5() {
        assertEquals("SAD 8", happyAlgorithm(89));
    }

    @Test
    public void test6() {
        assertEquals("HAPPY 1", happyAlgorithm(10));
    }

    @Test
    public void test7() {
        assertEquals("SAD 17", happyAlgorithm(1327));
    }

    @Test
    public void test8() {
        assertEquals("SAD 17", happyAlgorithm(2871));
    }

    @Test
    public void test9() {
        assertEquals("HAPPY 6", happyAlgorithm(3970));
    }

    @Test
    public void test10() {
        assertEquals("SAD 11", happyAlgorithm(5209));
    }

    @Test
    public void test11() {
        assertEquals("HAPPY 3", happyAlgorithm(6329));
    }

    @Test
    public void test12() {
        assertEquals("SAD 12", happyAlgorithm(8888));
    }

    @Test
    public void test13() {
        assertEquals("HAPPY 2", happyAlgorithm(9331));
    }

    @Test
    public void test14() {
        assertEquals("HAPPY 1", happyAlgorithm(10000));
    }

}
