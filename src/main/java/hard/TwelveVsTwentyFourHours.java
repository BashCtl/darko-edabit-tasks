package hard;

import org.testng.annotations.Test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static org.testng.Assert.assertEquals;

public class TwelveVsTwentyFourHours {

    public static String convertTime(String time){
        DateTimeFormatter timeFormatter12 = DateTimeFormatter.ofPattern("h:mm a");
        DateTimeFormatter formatter24 = DateTimeFormatter.ofPattern("H:mm");
        if(!time.contains("m")){
            LocalTime localTime = LocalTime.parse(time,formatter24);
            return timeFormatter12.format(localTime).toLowerCase();
        }
        LocalTime localTime = LocalTime.parse(time.toUpperCase(),timeFormatter12);
       return formatter24.format(localTime);

    }

//    public static void main(String[] args) {
//        System.out.println(convertTime("5:05"));
//        System.out.println(convertTime("23:00"));
//        System.out.println(convertTime("6:20 pm"));
//        System.out.println(convertTime("12:00 am"));
//    }

    @Test
    public void test1() {
        assertEquals("0:00", convertTime("12:00 am"));
    }

    @Test
    public void test2() {
        assertEquals("18:20", convertTime("6:20 pm"));
    }

    @Test
    public void test3() {
        assertEquals("9:00 pm", convertTime("21:00"));
    }

    @Test
    public void test4() {
        assertEquals("5:05 am", convertTime("5:05"));
    }
    

}
