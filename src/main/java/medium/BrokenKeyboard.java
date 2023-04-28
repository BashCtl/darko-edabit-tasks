package medium;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.stream.IntStream;


public class BrokenKeyboard {

    public static String[] findBrokenKeys(String str1, String str2){
      return   IntStream.range(0,str1.length())
                .mapToObj(i-> str1.charAt(i)!=str2.charAt(i)? String.valueOf(str1.charAt(i)):"")
                .distinct()
                .filter(n->!n.isEmpty())
                .toArray(String[]::new);
    }

    @Test
    public void test1() {
        Arrays.equals (findBrokenKeys("happy birthday", "hawwy birthday"), new String[]{"p"});
    }

    @Test
    public void test2() {
        Arrays.equals (findBrokenKeys("starry night", "starrq light"), new String[]{"y", "n"});
    }

    @Test
    public void test3() {
        Arrays.equals (findBrokenKeys("beethoven", "affthoif5"), new String[]{"b", "e", "v", "n"});
    }

    @Test
    public void test4() {
        Arrays.equals (findBrokenKeys("mozart", "aiwgvx"), new String[]{"m", "o", "z", "a", "r", "t"});
    }

    @Test
    public void test5() {
        System.out.println("It should work for numbers.");
        Arrays.equals (findBrokenKeys("5678", "4678"), new String[]{"5"});
    }

    @Test
    public void test6() {
        System.out.println("It should work for punctuation.");
         Arrays.equals (findBrokenKeys("!!??$$", "$$!!??"), new String[]{"!", "?", "$"});
    }

}
