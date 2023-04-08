package medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReturnObjectsKeysValues {

    public static String[] getValues(Map<String, String> dic) {
        return dic.keySet().stream().sorted()
                .map(key -> dic.get(key))
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        Map<String, String> companies = new HashMap<>();
        companies.put("b", "Microsoft");
        companies.put("a", "Apple");
        companies.put("c", "Google");
        String[] result = getValues(companies);
        System.out.println(Arrays.toString(result));
    }
}
