package medium;

public class FailedPassedExam {
    public static String gradePercentage(String userScore, String passScore){
        String s;
        int usrScore = Integer.parseInt(userScore.replace("%",""));
        int pssScore = Integer.parseInt(passScore.replace("%",""));
        if (usrScore>=pssScore){
            s = "PASSED";
        }else {
            s = "FAILED";
        }
        return "You " + s + " the Exam";
    }

    public static void main(String[] args) {
        System.out.println(gradePercentage("85%", "85%"));
        System.out.println(gradePercentage("65%", "90%"));
    }
}
