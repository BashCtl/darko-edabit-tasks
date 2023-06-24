package hard;

import org.junit.Test;

import java.util.Collections;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MemeSum {

    public static int memeSum(int a, int b) {
        StringBuilder result = new StringBuilder();
        int min = Math.min(a, b);
        int max = Math.max(a, b);
//        Collections.nCopies()
        String sMin = String.valueOf(min);
        String sMax = String.valueOf(max);
        sMin = "0".repeat(sMax.length() - sMin.length()) + sMin;
        for (int i = 0; i < sMax.length(); i++) {
          result.append(Integer.parseInt(sMin.substring(i,i+1)) + Integer.parseInt(sMax.substring(i,i+1)) );

        }
        return Integer.parseInt(result.toString());
    }

//    public static void main(String[] args) {
//        System.out.println(memeSum(26,39));
//        System.out.println(memeSum(122,81));
//    }

    @Test
    public void test1()
    {assertThat(memeSum(2, 11), is(13));}
    @Test
    public void test2()
    {assertThat(memeSum(0, 1), is(1));}
    @Test
    public void test3()
    {assertThat(memeSum(0, 0), is(0));}
    @Test
    public void test4()
    {assertThat(memeSum(16, 18), is(214));}
    @Test
    public void test5()
    {assertThat(memeSum(26, 39), is(515));}
    @Test
    public void test6()
    {assertThat(memeSum(122, 81), is(1103));}
    @Test
    public void test7()
    {assertThat(memeSum(1222, 30277), is(31499));}
    @Test
    public void test8()
    {assertThat(memeSum(38810, 1383), is(391193));}
    @Test
    public void test9()
    {assertThat(memeSum(1236, 30977), is(31111013));}
    @Test
    public void test10()
    {assertThat(memeSum(49999, 49999), is(818181818));}
}


