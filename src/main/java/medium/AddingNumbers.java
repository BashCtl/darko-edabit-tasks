package medium;

public class AddingNumbers {
    public static String add(String a, String b){
        try {
            return String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
        }catch (Exception e){
            return "Invalid Operation";
        }
    }
}
