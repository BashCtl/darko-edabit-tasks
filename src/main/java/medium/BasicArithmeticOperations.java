package medium;

public class BasicArithmeticOperations {

    public static int operation(String a, String b, String op) {
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        try {
            switch (op) {
                case "add":
                    return x + y;
                case "subtract":
                    return x - y;
                case "divide":
                    return x / y;
                case "multiply":
                    return x * y;
                default:
                    return Integer.MIN_VALUE;
            }
        }catch (ArithmeticException e){
            return Integer.MIN_VALUE;
        }
    }
}
