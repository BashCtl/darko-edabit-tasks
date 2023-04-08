package medium;

public class NumberOfBoomerangs {

    public static int countBoomerangs(int[] arr){
        int count =0;
        for(int i=0;i<arr.length-2;i++){
            if(arr[i]==arr[i+2]&& arr[i+1]!=arr[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countBoomerangs(new int[] {9, 5, 9, 5, 1, 1, 1}));
        System.out.println(countBoomerangs(new int[] { 4, 4, 4, 9, 9, 9, 9 }));
        System.out.println(countBoomerangs(new int [] {1, 7, 1, 7, 1, 7, 1}));
    }
}
