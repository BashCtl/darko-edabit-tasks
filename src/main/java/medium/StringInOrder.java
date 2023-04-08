package medium;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringInOrder {

    public static boolean isInOrder(String str){
       return str.equals(Arrays.stream(str.split(""))
               .sorted().collect(Collectors.joining()));
    }

    public static void main(String[] args) {
        System.out.println(isInOrder("abc"));
        System.out.println(isInOrder("edabit"));
    }
}
