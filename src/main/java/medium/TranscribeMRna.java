package medium;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TranscribeMRna {

    public static String dnaToRna(String strand){
      return   Arrays.stream(strand.split("")).map(x ->{
            if(x.equals("A")){
                return "U";
            }
            if(x.equals("T")){
                return "A";
            }
            if(x.equals("G")){
                return "C";
            }
            if(x.equals("C")){
                return "G";
            }
            return "";
        }).collect(Collectors.joining());
    }
}
