package medium;

import java.util.regex.Pattern;

public class CheckIfStringIsMathematicalExpression {
    public static boolean mathExpr(String expr){
       return Pattern.compile("(\\d+)(\\s?)([\\+\\*\\-\\/\\%])(\\s?)(\\d+)")
                .matcher(expr)
                .matches();
    }

    public static void main(String[] args) {
        System.out.println(mathExpr("4 + 5"));
        System.out.println(mathExpr("4+5"));
    }
}
