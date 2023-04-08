package medium;

import java.util.stream.Stream;

public class SpinAround {

    public static int spinAround(String[] turns) {
        return Math.round(Math.abs(Stream.of(turns)
                .mapToInt(s -> s.equals("right") ? 1 : -1).sum()/4));
    }

    public static void main(String[] args) {
        System.out.println(spinAround(new String[] {"right","left","left","right","left","left","right","left","right","right","left","left","right","right","right","left","left","right"}));
        System.out.println(spinAround(new String[] {"left","left","right","left","left","left","left","left","left","right","left","left","right","right","right","right","left","left","right","right"}));
    }
}
