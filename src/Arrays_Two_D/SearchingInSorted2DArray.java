package Arrays_Two_D;

import java.util.Arrays;

public class SearchingInSorted2DArray {
    public static void main(String[] args) {

        int [] [] arr = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        System.out.println(Arrays.toString(SortedSearching(arr,30)));
        System.out.println(Arrays.toString(SortedSearching2(arr,33)));

        System.out.println(searchMatrix(arr,33));

        int [] [] arr2 = {{10,20,30,40},{45,55,65,75},{87,99,1 ,148},{152,163,169,170}};
        System.out.println(Arrays.toString(BetterSearch(arr,55)));

    }

    // Time Complexity  O(row+Columns)

    // Bottom To Up Approach
    public static int [] SortedSearching(int [] [] matrix, int target) {
        int row = matrix.length-1;
        int col = 0;

        while(row>=0&&col<matrix[0].length){
            if (matrix[row][col] == target) {
                return new int[]{row,col};
            }
            if (matrix[row][col] > target) {
                row--;
            }
            else {
                col++;
            }
        }
        return new int [] {-1,-1};
    }

    // Top to Down Approach

 public static int [] SortedSearching2(int [] [] matrix, int target) {
        int row = 0;
        int col = matrix[0].length-1;

        while(row < matrix.length&&col>=0){
            if (matrix[row][col] == target) {
                return new int[]{row,col};
            }
            if (matrix[row][col] < target) {
                row++;
            }
            else {
                col--;
            }
        }
        return new int [] {-1,-1};
    }


    public static boolean  searchMatrix(int[][] matrix, int target) {

        int row = 0;
        int col = matrix[0].length-1;

        while(row < matrix.length&&col>=0){
            if (matrix[row][col] == target) {
                return true;
            }
            if (matrix[row][col] < target) {
                row++;
            }
            else {
                col--;
            }
        }
        return false;


    }
    public static int [] BetterSearch(int [] [] arr, int target){
        int m  = arr.length;
        int n = arr[0].length;

        int s = 0;
        int e = m *n-1;

        while (s<=e){
            int mid = s + (e-s)/2;
            int row = mid/n;
            int col = mid%n;
            if (arr[row] [col]== target ) {
                return new int[]{row,col};
            } else if (arr[row][col] < target) {
                s = mid+1;
            }
            else e = mid -1 ;
        }
        return new int[] {-1,-1};
    }

}


