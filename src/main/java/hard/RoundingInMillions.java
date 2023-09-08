package hard;


import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import java.util.Arrays;

public class RoundingInMillions {

    public static Object[] millionsRounding(Object[] cities) {
        for (int i = 0; i < cities.length; i++) {
            int population = (int) ((Object[]) cities[i])[1];
            if (population < 500_000) {
                population = 0;
            } else {
                population = (int) Math.round(population / 1000000.0) * 1000000;
            }
            ((Object[]) cities[i])[1] = population;
        }

        return cities;

    }


    @Test
    public void test01() {
        assertArrayEquals(new Object[]{new Object[]{"Tokyo", 37000000}, new Object[]{"Delhi", 29000000}, new Object[]{"Shanghai", 26000000}}, millionsRounding(new Object[]{new Object[]{"Tokyo", 37435191}, new Object[]{"Delhi", 29399141}, new Object[]{"Shanghai", 26317104}}));
    }

    @Test
    public void test02() {
        assertArrayEquals(new Object[]{new Object[]{"Sao Paulo", 22000000}}, millionsRounding(new Object[]{new Object[]{"Sao Paulo", 21846507}}));
    }

    @Test
    public void test03() {
        assertArrayEquals(new Object[]{new Object[]{"London", 9000000}, new Object[]{"Naples", 2000000}, new Object[]{"Nice", 1000000}, new Object[]{"Abu Dhabi", 1000000}, new Object[]{"Riga", 1000000}, new Object[]{"Vatican City", 0}}, millionsRounding(new Object[]{new Object[]{"London", 9304016}, new Object[]{"Naples", 2186853}, new Object[]{"Nice", 942208}, new Object[]{"Abu Dhabi", 1482816}, new Object[]{"Riga", 630692}, new Object[]{"Vatican City", 572}}));
    }

    @Test
    public void test04() {
        assertArrayEquals(new Object[]{}, millionsRounding(new Object[]{}));
    }

    @Test
    public void test05() {
        assertArrayEquals(new Object[]{new Object[]{"Manila", 14000000}, new Object[]{"Kuala Lumpur", 8000000}, new Object[]{"Jakarta", 11000000}}, millionsRounding(new Object[]{new Object[]{"Manila", 13923452}, new Object[]{"Kuala Lumpur", 7996830}, new Object[]{"Jakarta", 10770487}}));
    }

    @Test
    public void test06() {
        assertArrayEquals(new Object[]{new Object[]{"Macau", 1000000}, new Object[]{"Hong Kong", 8000000}, new Object[]{"Beijing", 20000000}}, millionsRounding(new Object[]{new Object[]{"Macau", 654743}, new Object[]{"Hong Kong", 7530053}, new Object[]{"Beijing", 20462610}}));
    }

}
