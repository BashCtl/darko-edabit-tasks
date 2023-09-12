package hard;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class FibonacciString {

    public static String generate(int n, String[] s){
        List<String> result = Arrays.stream(s).collect(Collectors.toList());
        for(int i =s.length;i<n;i++){
            String str = result.get(i-1) + result.get(i-2);
            result.add(str);
        }

      return   String.join(", ", result);
    }

//    public static void main(String[] args) {
//        System.out.println(generate(3, new String[] {"j", "h"}));
//    }


    @Test
    public void test01() {
        assertEquals("j, h, hj", generate(3, new String[] {"j", "h"}));
    }

    @Test
    public void test02() {
        assertEquals("e, a, ae, aea, aeaae", generate(5, new String[] {"e", "a"}));
    }

    @Test
    public void test03() {
        assertEquals("n, k, kn, knk, knkkn, knkknknk", generate(6, new String[] {"n", "k"}));
    }

    @Test
    public void test04() {
        assertEquals("f, c, cf, cfc, cfccf, cfccfcfc, cfccfcfccfccf", generate(7, new String[] {"f", "c"}));
    }

    @Test
    public void test05() {
        assertEquals("b, a, ab, aba, abaab, abaababa, abaababaabaab, abaababaabaababaababa, abaababaabaababaababaabaababaabaab", generate(9, new String[] {"b", "a"}));
    }

    @Test
    public void test06() {
        assertEquals("z, x, xz, xzx, xzxxz, xzxxzxzx, xzxxzxzxxzxxz, xzxxzxzxxzxxzxzxxzxzx, xzxxzxzxxzxxzxzxxzxzxxzxxzxzxxzxxz, xzxxzxzxxzxxzxzxxzxzxxzxxzxzxxzxxzxzxxzxzxxzxxzxzxxzxzx, xzxxzxzxxzxxzxzxxzxzxxzxxzxzxxzxxzxzxxzxzxxzxxzxzxxzxzxxzxxzxzxxzxxzxzxxzxzxxzxxzxzxxzxxz", generate(11, new String[] {"z", "x"}));
    }

    @Test
    public void test07() {
        assertEquals("t, d, dt, dtd, dtddt, dtddtdtd, dtddtdtddtddt, dtddtdtddtddtdtddtdtd, dtddtdtddtddtdtddtdtddtddtdtddtddt, dtddtdtddtddtdtddtdtddtddtdtddtddtdtddtdtddtddtdtddtdtd, dtddtdtddtddtdtddtdtddtddtdtddtddtdtddtdtddtddtdtddtdtddtddtdtddtddtdtddtdtddtddtdtddtddt, dtddtdtddtddtdtddtdtddtddtdtddtddtdtddtdtddtddtdtddtdtddtddtdtddtddtdtddtdtddtddtdtddtddtdtddtdtddtddtdtddtdtddtddtdtddtddtdtddtdtddtddtdtddtdtd", generate(12, new String[] {"t", "d"}));
    }

    @Test
    public void test08() {
        assertEquals("x, t, tx, txt", generate(4, new String[] {"x", "t"}));
    }
    

}
