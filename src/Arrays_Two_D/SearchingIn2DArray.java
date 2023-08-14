package Arrays_Two_D;

import java.util.Arrays;

public class SearchingIn2DArray {
    public static void main(String[] args) {

        int [] [] arr = {{1,2,3},{4,5},{7,8,9}};

        System.out.println(Arrays.toString(search(arr,6)));

    }
    static int[] search(int [][] arr , int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }

        return new int[]{-1,-1};
    }
}
