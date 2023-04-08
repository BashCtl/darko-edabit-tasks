package medium;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class DashedVowels {

    public static String dashed(String s){
        return Arrays.stream(s.split("(?<=[aeiouAEIOU])|(?=[aeiouAEIOU])"))
                .map(w->{
                    if(Pattern.compile("[aeiouAEIOU]").matcher(w).matches()){
                        return String.format("-%s-",w);
                    }
                    return w;
                })
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(dashed("Edabit"));
        System.out.println(dashed("Carpe Diem"));
    }
}
