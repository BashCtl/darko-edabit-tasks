package medium;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class CMSSelectorBasedOnGivenString {

    public static String[] cmsSelector(String[] cms, String re) {
        return re.isEmpty() ? Arrays.stream(cms).sorted().toArray(String[]::new)
                : Arrays.stream(cms).filter(word -> word.toLowerCase()
                .contains(re)).toArray(String[]::new);
    }

    @Test
    public void test01() {
        assertArrayEquals(cmsSelector(new String[]{"WordPress", "Joomla", "Drupal"}, "w"), new String[]{"WordPress"});
    }

    @Test
    public void test02() {
        assertArrayEquals(cmsSelector(new String[]{"WordPress", "Joomla", "Drupal", "Magento"}, "ru"), new String[]{"Drupal"});
    }

    @Test
    public void test03() {
        assertArrayEquals(cmsSelector(new String[]{"WordPress", "Joomla", "Drupal", "Magento"}, ""), new String[]{"Drupal", "Joomla", "Magento", "WordPress"});
    }

}
