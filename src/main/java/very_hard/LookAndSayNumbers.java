package very_hard;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
Look And Say Numbers

Given an integer value, return a new integer according to the rules below:

Split the number into groups of two digit numbers. If the number has an odd number of digits, return -1.
For each group of two digit numbers, concatenate the last digit to a new string the same number
of times as the value of the first digit.
Return the result as an integer.
lookAndSay(3132) ➞ 111222

// By reading the number digit by digit, you get three "1" and three "2".
// Therefore, you put three ones and three two's together.
// Remember to return an integer value (i.e BigIntger class).
Examples
lookAndSay(1213200012171979) ➞ 23002799999999

lookAndSay(54544666) ➞ 44444444446666666666

lookAndSay(95) ➞ 555555555

lookAndSay(1213141516171819) ➞ 23456789

lookAndSay(120520) ➞ 200

lookAndSay(231) ➞ -1
Notes
Note that the number 0 can be included (see example #5).

 */

public class LookAndSayNumbers {

    public static BigInteger lookAndSay(long n) {
        String[] chunks = String.valueOf(n).split("(?<=\\G.{2})");
        boolean isEqualChunks = Arrays.stream(chunks).allMatch(chunk-> chunk.length()==2);
        if ( !isEqualChunks) {
            return new BigInteger("-1");
        }
        String number = Arrays.stream(chunks).map(chunk ->
                        new String(new char[Integer.parseInt(chunk.substring(0, 1))]).replace("\0", chunk.substring(1)))
                .collect(Collectors.joining());
        return new BigInteger(number);
    }


    @Test
    public void test01() {
        assertEquals(new BigInteger("23002799999999"), lookAndSay(1213200012171979L));
    }

    @Test
    public void test02() {
        assertEquals(new BigInteger("23456789"), lookAndSay(1213141516171819L));
    }

    @Test
    public void test03() {
        assertEquals(new BigInteger("555555555"), lookAndSay(95));
    }

    @Test
    public void test04() {
        assertEquals(new BigInteger("-1"), lookAndSay(231));
    }

    @Test
    public void test05() {
        assertEquals(new BigInteger("111222"), lookAndSay(3132));
    }

    @Test
    public void test06() {
        assertEquals(new BigInteger("1113337"), lookAndSay(313317));
    }

    @Test
    public void test07() {
        assertEquals(new BigInteger("8888888444444777777777"), lookAndSay(786497));
    }

    @Test
    public void test08() {
        assertEquals(new BigInteger("9999913333333"), lookAndSay(591173));
    }

    @Test
    public void test09() {
        assertEquals(new BigInteger("444444444"), lookAndSay(404094));
    }

    @Test
    public void test10() {
        assertEquals(new BigInteger("7777555666"), lookAndSay(473536));
    }

    @Test
    public void test11() {
        assertEquals(new BigInteger("888888880000"), lookAndSay(880440));
    }

    @Test
    public void test12() {
        assertEquals(new BigInteger("22222227777777777"), lookAndSay(724767));
    }

    @Test
    public void test13() {
        assertEquals(new BigInteger("3333333366"), lookAndSay(830926));
    }

    @Test
    public void test14() {
        assertEquals(new BigInteger("6666669999966666"), lookAndSay(665956));
    }

    @Test
    public void test15() {
        assertEquals(new BigInteger("444476666"), lookAndSay(441746));
    }

    @Test
    public void test16() {
        assertEquals(new BigInteger("888888883333333322"), lookAndSay(888322));
    }

    @Test
    public void test17() {
        assertEquals(new BigInteger("1111111111333333333"), lookAndSay(614193));
    }

    @Test
    public void test18() {
        assertEquals(new BigInteger("333333322277777"), lookAndSay(733257));
    }

    @Test
    public void test19() {
        assertEquals(new BigInteger("888888333333333"), lookAndSay(689301));
    }

    @Test
    public void test20() {
        assertEquals(new BigInteger("11111133338"), lookAndSay(614318));
    }

    @Test
    public void test21() {
        assertEquals(new BigInteger("333333333666666777777"), lookAndSay(936667));
    }

    @Test
    public void test22() {
        assertEquals(new BigInteger("999999997"), lookAndSay(890917));
    }

    @Test
    public void test23() {
        assertEquals(new BigInteger("1111555555588"), lookAndSay(417528));
    }

    @Test
    public void test24() {
        assertEquals(new BigInteger("3333333366666"), lookAndSay(830756));
    }

    @Test
    public void test25() {
        assertEquals(new BigInteger("998888888"), lookAndSay(297807));
    }

    @Test
    public void test26() {
        assertEquals(new BigInteger("887777788"), lookAndSay(285728));
    }

    @Test
    public void test27() {
        assertEquals(new BigInteger("66666699990000"), lookAndSay(664940));
    }

    @Test
    public void test28() {
        assertEquals(new BigInteger("77772222220000"), lookAndSay(476240));
    }

    @Test
    public void test29() {
        assertEquals(new BigInteger("33333333355555"), lookAndSay(933525));
    }

    @Test
    public void test30() {
        assertEquals(new BigInteger("888888822222222"), lookAndSay(788200));
    }

    @Test
    public void test31() {
        assertEquals(new BigInteger("62220"), lookAndSay(163210));
    }

    @Test
    public void test32() {
        assertEquals(new BigInteger("555555553333"), lookAndSay(708543));
    }

    @Test
    public void test33() {
        assertEquals(new BigInteger("99555555222222"), lookAndSay(296562));
    }

    @Test
    public void test34() {
        assertEquals(new BigInteger("66666666999999444"), lookAndSay(866934));
    }

    @Test
    public void test35() {
        assertEquals(new BigInteger("11111166666444444"), lookAndSay(615664));
    }

    @Test
    public void test36() {
        assertEquals(new BigInteger("33333333339999"), lookAndSay(832349));
    }

    @Test
    public void test37() {
        assertEquals(new BigInteger("333333333777777773333333"), lookAndSay(938773));
    }

    @Test
    public void test38() {
        assertEquals(new BigInteger("444888888888888"), lookAndSay(345878));
    }

    @Test
    public void test39() {
        assertEquals(new BigInteger("33355333"), lookAndSay(332533));
    }

    @Test
    public void test40() {
        assertEquals(new BigInteger("-1"), lookAndSay(74457));
    }

    @Test
    public void test41() {
        assertEquals(new BigInteger("999999977777777444"), lookAndSay(798734));
    }

    @Test
    public void test42() {
        assertEquals(new BigInteger("-1"), lookAndSay(17363));
    }

    @Test
    public void test43() {
        assertEquals(new BigInteger("-1"), lookAndSay(72495));
    }

    @Test
    public void test44() {
        assertEquals(new BigInteger("1111111111115555"), lookAndSay(418145));
    }

    @Test
    public void test45() {
        assertEquals(new BigInteger("-1"), lookAndSay(76129));
    }

    @Test
    public void test46() {
        assertEquals(new BigInteger("33334444441111"), lookAndSay(436441));
    }

    @Test
    public void test47() {
        assertEquals(new BigInteger("888117777777"), lookAndSay(382177));
    }

    @Test
    public void test48() {
        assertEquals(new BigInteger("22222224444444442222222"), lookAndSay(729472));
    }

    @Test
    public void test49() {
        assertEquals(new BigInteger("55558"), lookAndSay(450718));
    }

    @Test
    public void test50() {
        assertEquals(new BigInteger("3333333366666661111"), lookAndSay(837641));
    }

    @Test
    public void test51() {
        assertEquals(new BigInteger("88000008888888"), lookAndSay(285078));
    }

    @Test
    public void test52() {
        assertEquals(new BigInteger("2222999999999"), lookAndSay(420899));
    }

    @Test
    public void test53() {
        assertEquals(new BigInteger("999999994444888888"), lookAndSay(894468));
    }

    @Test
    public void test54() {
        assertEquals(new BigInteger("8888877777777"), lookAndSay(580787));
    }

    @Test
    public void test55() {
        assertEquals(new BigInteger("255599999"), lookAndSay(123559));
    }

    @Test
    public void test56() {
        assertEquals(new BigInteger("888888888111111"), lookAndSay(909861));
    }

    @Test
    public void test57() {
        assertEquals(new BigInteger("44411111113333333"), lookAndSay(347173));
    }

    @Test
    public void test58() {
        assertEquals(new BigInteger("99222222"), lookAndSay(296201));
    }

    @Test
    public void test59() {
        assertEquals(new BigInteger("1122222221111"), lookAndSay(217241));
    }

    @Test
    public void test60() {
        assertEquals(new BigInteger("54444444"), lookAndSay(156414));
    }

    @Test
    public void test61() {
        assertEquals(new BigInteger("4444444433"), lookAndSay(842309));
    }

    @Test
    public void test62() {
        assertEquals(new BigInteger("55555555355555555"), lookAndSay(851385));
    }

    @Test
    public void test63() {
        assertEquals(new BigInteger("1111111111777"), lookAndSay(317137));
    }

    @Test
    public void test64() {
        assertEquals(new BigInteger("116666666333333333"), lookAndSay(217693));
    }

    @Test
    public void test65() {
        assertEquals(new BigInteger("-1"), lookAndSay(44255));
    }

    @Test
    public void test66() {
        assertEquals(new BigInteger("544444"), lookAndSay(155400));
    }

    @Test
    public void test67() {
        assertEquals(new BigInteger("555554444440000000"), lookAndSay(556470));
    }

    @Test
    public void test68() {
        assertEquals(new BigInteger("333322"), lookAndSay(430222));
    }

    @Test
    public void test69() {
        assertEquals(new BigInteger("-1"), lookAndSay(61912));
    }

    @Test
    public void test70() {
        assertEquals(new BigInteger("779"), lookAndSay(270019));
    }

    @Test
    public void test71() {
        assertEquals(new BigInteger("517"), lookAndSay(151117));
    }

    @Test
    public void test72() {
        assertEquals(new BigInteger("522222"), lookAndSay(701552));
    }

    @Test
    public void test73() {
        assertEquals(new BigInteger("777777777333333333333"), lookAndSay(976363));
    }

    @Test
    public void test74() {
        assertEquals(new BigInteger("-1"), lookAndSay(75282));
    }

    @Test
    public void test75() {
        assertEquals(new BigInteger("44444479"), lookAndSay(641719));
    }

    @Test
    public void test76() {
        assertEquals(new BigInteger("7777888888555555"), lookAndSay(476865));
    }

    @Test
    public void test77() {
        assertEquals(new BigInteger("2222222227777778888"), lookAndSay(926748));
    }

    @Test
    public void test78() {
        assertEquals(new BigInteger("33444444443333"), lookAndSay(238443));
    }

    @Test
    public void test79() {
        assertEquals(new BigInteger("8666"), lookAndSay(180236));
    }

    @Test
    public void test80() {
        assertEquals(new BigInteger("-1"), lookAndSay(72293));
    }

    @Test
    public void test81() {
        assertEquals(new BigInteger("-1"), lookAndSay(70404));
    }

    @Test
    public void test82() {
        assertEquals(new BigInteger("1111112227777"), lookAndSay(613247));
    }

    @Test
    public void test83() {
        assertEquals(new BigInteger("11111111444444442"), lookAndSay(818412));
    }

    @Test
    public void test84() {
        assertEquals(new BigInteger("5555555533333333311111111"), lookAndSay(859381));
    }

    @Test
    public void test85() {
        assertEquals(new BigInteger("2222222222222222"), lookAndSay(826222));
    }

    @Test
    public void test86() {
        assertEquals(new BigInteger("6999"), lookAndSay(163909));
    }

    @Test
    public void test87() {
        assertEquals(new BigInteger("99999666"), lookAndSay(392936));
    }

    @Test
    public void test88() {
        assertEquals(new BigInteger("-1"), lookAndSay(13167));
    }

    @Test
    public void test89() {
        assertEquals(new BigInteger("55555555588833"), lookAndSay(953823));
    }

    @Test
    public void test90() {
        assertEquals(new BigInteger("9999000"), lookAndSay(493000));
    }

    @Test
    public void test91() {
        assertEquals(new BigInteger("44444444433333"), lookAndSay(346453));
    }

    @Test
    public void test92() {
        assertEquals(new BigInteger("33333444444000000"), lookAndSay(536460));
    }

    @Test
    public void test93() {
        assertEquals(new BigInteger("600066"), lookAndSay(163026));
    }

    @Test
    public void test94() {
        assertEquals(new BigInteger("67777777775555555"), lookAndSay(169775));
    }

    @Test
    public void test95() {
        assertEquals(new BigInteger("111111"), lookAndSay(103131));
    }

    @Test
    public void test96() {
        assertEquals(new BigInteger("4444416666"), lookAndSay(541146));
    }

    @Test
    public void test97() {
        assertEquals(new BigInteger("600777777"), lookAndSay(162067));
    }

    @Test
    public void test98() {
        assertEquals(new BigInteger("2222277777777"), lookAndSay(522767));
    }

    @Test
    public void test99() {
        assertEquals(new BigInteger("88882222222200000000"), lookAndSay(488280));
    }

    @Test
    public void test100() {
        assertEquals(new BigInteger("777777722222"), lookAndSay(775203));
    }

    @Test
    public void test101() {
        assertEquals(new BigInteger("224444443"), lookAndSay(226413));
    }

    @Test
    public void test102() {
        assertEquals(new BigInteger("22222224444455555"), lookAndSay(725455));
    }

    @Test
    public void test103() {
        assertEquals(new BigInteger("44449999992222222"), lookAndSay(446972));
    }

    @Test
    public void test104() {
        assertEquals(new BigInteger("5222"), lookAndSay(101532));
    }

    @Test
    public void test105() {
        assertEquals(new BigInteger("33333333335"), lookAndSay(634315));
    }

    @Test
    public void test106() {
        assertEquals(new BigInteger("200"), lookAndSay(120520));
    }
}
