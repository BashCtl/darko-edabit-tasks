package hard;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class DigitsBattle {
    //  ? sNum[i] : sNum[i + 1]
    public static int battleOutcome(int num) {
        String[] sNum = String.valueOf(num).split("");
        int length = sNum.length % 2 == 0 ? sNum.length : sNum.length - 1;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i += 2) {
            if (Integer.parseInt(sNum[i]) > Integer.parseInt(sNum[i + 1])) {
                result.append(sNum[i]);

            } else if(Integer.parseInt(sNum[i]) < Integer.parseInt(sNum[i + 1])){
                result.append(sNum[i + 1]);
            }
        }
        return length == sNum.length ? Integer.parseInt(result.toString())
                : Integer.parseInt(result.append(sNum[sNum.length - 1]).toString());
    }

//    public static void main(String[] args) {
//        System.out.println(battleOutcome(578921445));
//    }

    @Test
    public void test1() {
        assertEquals(351, battleOutcome(32531));
    }

    @Test
    public void test2() {
        assertEquals(1, battleOutcome(111));
    }

    @Test
    public void test3() {
        assertEquals(59, battleOutcome(5289));
    }

    @Test
    public void test4() {
        assertEquals(781, battleOutcome(76811));
    }

    @Test
    public void test5() {
        assertEquals(3596, battleOutcome(3245196));
    }

    @Test
    public void test6() {
        assertEquals(929, battleOutcome(93552129));
    }

}
