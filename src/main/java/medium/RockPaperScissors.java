package medium;

public class RockPaperScissors {

    public static String rps(String s1, String s2) {
        String win1 = "Player 1 wins";
        String win2 = "Player 2 wins";


        if (s1.equals("rock")) {

            if (s2.equals("scissors")) {
                return win1;
            } else if (s2.equals("paper")) {
                return win2;
            }
        } else if (s1.equals("scissors")) {
            if (s2.equals("paper")) {
                return win1;
            } else if (s2.equals("rock")) {
                return win2;
            }
        } else if (s1.equals("paper")) {
            if (s2.equals("rock")) {
                return win1;
            } else if (s2.equals("scissors")) {
                return win2;
            }

        }
        return "TIE";

    }

    public static void main(String[] args) {
        System.out.println(rps("rock", "paper"));
        System.out.println(rps("paper", "rock"));
        System.out.println(rps("paper", "scissors"));
        System.out.println(rps("scissors", "scissors"));
        System.out.println(rps("scissors", "paper"));
    }
}
