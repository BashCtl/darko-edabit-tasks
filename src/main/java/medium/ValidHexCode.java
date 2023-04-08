package medium;

import java.util.regex.Pattern;

public class ValidHexCode {

    public static boolean isValidHexCode(String str) {
        return str.length()==7 && Pattern.compile("^#[a-fA-F0-9]+")
                .matcher(str)
                .matches();
    }

    public static void main(String[] args) {
        System.out.println(isValidHexCode("#CD5C5C"));
        System.out.println(isValidHexCode("#eaecee"));
        System.out.println(isValidHexCode("#CD5C58C"));
        System.out.println(isValidHexCode("#Z88Z99"));
    }

}
