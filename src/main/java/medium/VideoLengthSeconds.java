package medium;

public class VideoLengthSeconds {

    public static int minutesToSeconds(String tm){
        String[] time = tm.split(":");

        return Integer.parseInt(time[1])<60?Integer.parseInt(time[0])*60+Integer.parseInt(time[1]):-1;
    }

    public static void main(String[] args) {
        System.out.println(minutesToSeconds("01:00"));
        System.out.println(minutesToSeconds("13:56"));
        System.out.println(minutesToSeconds("10:60"));
    }
}
