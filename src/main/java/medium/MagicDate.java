package medium;

public class MagicDate {

    public static boolean magic(String str) {
        String[] nums = str.split(" ");
        String strMd = String.valueOf(Integer.parseInt(nums[0]) * Integer.parseInt(nums[1]));
        String year = nums[2];
        if(strMd.length()==1){
            return strMd.equals(year.substring(year.length()-1));
        }else if ( strMd.length()==2){
            return strMd.equals(year.substring(year.length()-2));
        }else if(strMd.length()==3){
            return strMd.equals(year.substring(year.length()-3));
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(magic("1 1 2011"));
        System.out.println(magic("4 1 2001"));
        System.out.println(magic("5 2 2010"));
        System.out.println(magic("9 2 2011"));
    }
}
