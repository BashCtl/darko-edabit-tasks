package medium;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;

public class FruitSalad {

    public static String fruitSalad(String[] fruits) {
        return Arrays.stream(fruits)
                .map(f -> fruitSlice(f))
                .flatMap(Arrays::stream)
                .sorted()
                .collect(Collectors.joining());
    }

    public static String[] fruitSlice(String fruit) {
        int middle = fruit.length() / 2;
        return new String[]{fruit.substring(0, middle), fruit.substring(middle)};
    }

    @Test
    public void test01() {
        assertEquals("apargrapepesple", fruitSalad(new String[] {"apple", "pear", "grapes"}));
    }

    @Test
    public void test02() {
        assertEquals("anabanberryblueberrieskistrawwi", fruitSalad(new String[] {"banana", "kiwi", "strawberry", "blueberries"}));
    }

    @Test
    public void test03() {
        assertEquals("erriesmangoraspb", fruitSalad(new String[] {"raspberries", "mango"}));
    }

    @Test
    public void test04() {
        assertEquals("anaban", fruitSalad(new String[] {"banana"}));
    }

    @Test
    public void test05() {
        assertEquals("anaavobancadomango", fruitSalad(new String[] {"mango", "banana", "avocado"}));
    }

    @Test
    public void test06() {
        assertEquals("apapplegrangeorapespineple", fruitSalad(new String[] {"pineapple", "grapes", "apple", "orange"}));
    }

}
