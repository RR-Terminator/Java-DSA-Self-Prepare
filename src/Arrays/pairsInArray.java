package Arrays;

import java.util.Arrays;

public class pairsInArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        pair(arr);
    }
    static void pair(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print(Arrays.toString(new int[] {arr[i],arr[j]}));
            }
        }
    }
}
