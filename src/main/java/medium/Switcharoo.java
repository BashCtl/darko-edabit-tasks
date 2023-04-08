package medium;

public class Switcharoo {

    public static String flipEndChars(String s) {
        if (s.length() < 2) {
            return "Incompatible.";
        } else if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return "Two's a pair.";
        } else {
            char f = s.charAt(0);
            char l = s.charAt(s.length() - 1);
            StringBuilder stringBuilder = new StringBuilder(s);
            stringBuilder.setCharAt(0, l);
            stringBuilder.setCharAt(s.length() - 1, f);
            return stringBuilder.toString();
        }
    }

    public static void main(String[] args) {
        System.out.println(flipEndChars("Anna, Banana"));
    }
}
