package medium;

public class HallMonitor {

    public static boolean possiblePath(Object[] t){
        for(int i=0;i<t.length-1;i++){
            if(t[i] instanceof String && t[i+1] instanceof String
            || t[i] instanceof Integer && t[i+1] instanceof Integer){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(possiblePath(new Object[] {1, "H", 2, "H", 3, "H", 4}));
        System.out.println(possiblePath(new Object[] {"H", 3, "H"}));
        System.out.println(possiblePath(new Object[] {1, 2, "H", 3}));
    }

}
