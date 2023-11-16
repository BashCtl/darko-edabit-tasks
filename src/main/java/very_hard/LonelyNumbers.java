package very_hard;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

/*
Lonely Numbers

Given a number, insert duplicate digits on both sides of all digits which appear in a group of one.

Examples
numbersNeedFriendsToo(22733) ➞ 2277733
// The number can be split into groups 22, 7, and 33.
// 7 appears on its own.
// Put 7s on both sides to create 777.
// Put the numbers together and return the result.

numbersNeedFriendsToo(4666) ➞ 444666

numbersNeedFriendsToo(544) ➞ 55544

numbersNeedFriendsToo(123) ➞ 111222333

numbersNeedFriendsToo(56657) ➞ 55566555777

numbersNeedFriendsToo(33) ➞ 33
Notes
All tests will include positive integers.

 */
public class LonelyNumbers {

    public static long numbersNeedFriendsToo(int n){
        String sNumber = String.valueOf(n);
        String s = sNumber.replaceAll("(.)\\1{1,}", "");
        long result = Long.parseLong(Arrays.stream(sNumber.split("")).map(num->{
            if(s.contains(num)){
                return new String(new char[3]).replace("\0", num);
            }
            return num;
        }).collect(Collectors.joining()));
        return result;
    }



    @Test
    public void test01() {
        assertEquals(111222333, numbersNeedFriendsToo(123));
    }

    @Test
    public void test02() {
        assertEquals(55566555777L, numbersNeedFriendsToo(56657));
    }

    @Test
    public void test03() {
        assertEquals(33, numbersNeedFriendsToo(33));
    }

    @Test
    public void test04() {
        assertEquals(2277733, numbersNeedFriendsToo(22733));
    }

    @Test
    public void test05() {
        assertEquals(11223333, numbersNeedFriendsToo(11223333));
    }

    @Test
    public void test06() {
        assertEquals(55544, numbersNeedFriendsToo(544));
    }

    @Test
    public void test07() {
        assertEquals(444666, numbersNeedFriendsToo(4666));
    }

    @Test
    public void test08() {
        assertEquals(111222333444555L, numbersNeedFriendsToo(12345));
    }

    @Test
    public void test09() {
        assertEquals(666111666, numbersNeedFriendsToo(616));
    }
}
