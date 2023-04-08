package medium;

public class FindASCIICharcodeInverseCaseCharacter {

    public static int counterpartCharCode(char ch) {
        return Character.isUpperCase(ch) ? Character.toLowerCase(ch)
                : Character.toUpperCase(ch);
    }

    public static void main(String[] args) {
        System.out.println(counterpartCharCode('A'));
        System.out.println(counterpartCharCode('a'));
    }
}
