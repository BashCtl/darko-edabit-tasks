package medium;

import java.util.regex.Pattern;

public class BasicEMailValidation {

    public static boolean validateEmail(String s) {
        return Pattern.compile("^(.+)@(\\S+)\\.(\\S+)$")
                .matcher(s)
                .matches();
    }

    public static void main(String[] args) {
        System.out.println(validateEmail("@gmail.com"));
        System.out.println(validateEmail("hello.gmail@com"));
        System.out.println(validateEmail("gmail"));
        System.out.println(validateEmail("hello@gmail"));
        System.out.println(validateEmail("hello@edabit.com"));
    }
}
