package very_hard;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

/*
YouTube Video ID Extractor

Given a YouTube URL, extract the video ID and return it as a string.

Examples
youtubeId("https://www.youtube.com/watch?v=XPEr1cArWRg") ➞ "XPEr1cArWRg"

youtubeId("https://youtu.be/BCDEDi5gDPo") ➞ "BCDEDi5gDPo"

youtubeId("https://youtube.com/watch?t=4m40s&v=vxP3bY-XxY4") ➞ "vxP3bY-XxY4"


 */


public class YouTubeVideoIdExtractor {

    public static String youtubeId(String link){
        Pattern pattern = Pattern.compile(".*([\\w-]{11})(.+|)$");
        Matcher matcher = pattern.matcher(link);
        String result = "";
        if(matcher.find()){
            result = matcher.group(1);
        }
        return result;
    }


    @Test
    public void test1() {
        assertEquals("XPEr1cArWRg",youtubeId("https://www.youtube.com/watch?v=XPEr1cArWRg"));
    }

    @Test
    public void test2() {
        assertEquals("-SNQGyVW_YI",youtubeId("http://www.youtube.com/watch?v=-SNQGyVW_YI&t=8871"));
    }

    @Test
    public void test3() {
        assertEquals("vxP3bY-XxY4",youtubeId("https://youtube.com/watch?t=4m40s&v=vxP3bY-XxY4"));
    }

    @Test
    public void test4() {
        assertEquals("yv56ncTdTmU",youtubeId("www.youtube.com/watch?list=PL3QZUm48uWnsdFakp3A2fI-NzmfH1jyQe&v=yv56ncTdTmU&index=8"));
    }

    @Test
    public void test5() {
        assertEquals("BCDEDi5gDPo",youtubeId("https://youtu.be/BCDEDi5gDPo"));
    }

    @Test
    public void test6() {
        assertEquals("jOxnoDi9IYg",youtubeId("https://www.youtube.com/watch?feature=youtu.be&v=jOxnoDi9IYg&t=3311s"));
    }

    @Test
    public void test7() {
        assertEquals("2w9SQjdn9U4",youtubeId("https://www.youtube-nocookie.com/embed/2w9SQjdn9U4"));
    }
}
