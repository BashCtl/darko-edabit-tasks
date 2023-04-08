package medium;

import java.util.Collections;

public class BirthdayCake {

    public static String[] getBirthdayCake(String name, int age) {
        String border = age % 2 == 0 ? "#" : "*";
        String message = String.format("%1$s %2$d Happy Birthday %3$s! %2$d %1$s", border, age, name);
        String[] result = new String[3];
        String line = String.join("", Collections.nCopies(message.length(),border));
        for (int i = 0; i < result.length; i++) {
            if (i == 1) {
                result[i] = message;
            } else {
                result[i] = line;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] cake = getBirthdayCake("Jack", 10);
        for (String line : cake) {
            System.out.println(line);
        }
        String[] cake2 = getBirthdayCake("Russel", 19);
        for (String line : cake2) {
            System.out.println(line);
        }
    }

}
