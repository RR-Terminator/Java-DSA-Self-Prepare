package Arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int [] arr = {-1};
        System.out.println(Arrays.toString(rotate(arr,2)));
    }
    public static int[] rotate(int[] arr, int d) {
       d = d%arr.length;
        reverse(arr, 0, arr.length-1);
        reverse(arr,0, d-1);
        reverse (arr,d,arr.length-1);
        return arr;

    }

    public static void reverse(int [] arr, int start , int end){
        if (start > end) {
            return;
        }
        if (start<=end){
            Swap(arr, start,end);
            reverse(arr,start+1,end-1);
        }
    }
    public static void Swap(int [] arr, int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


}
