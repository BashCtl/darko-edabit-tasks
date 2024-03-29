package medium;

public class RecursionReverseString {

    public static String reverse(String str){
        if(str.length()==0){
            return str;
        }
        return str.charAt(str.length()-1) + reverse(str.substring(0,str.length()-1));
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello"));
        System.out.println(reverse("world"));
        System.out.println(reverse("a"));
        System.out.println(reverse(""));
    }
}
