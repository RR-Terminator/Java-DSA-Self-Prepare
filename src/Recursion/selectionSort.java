package Recursion;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        Selection(arr,0, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void Selection(int [] arr, int si, int ei, int max){
        if(ei<=1) return;
        if (si<ei){
            if(arr[si]>arr[max]){
            Selection(arr,si+1,ei,si);
            }
            else Selection(arr,si+1,ei,max);
        }
        else {
            int temp = arr[max];
            arr[max] = arr[ei];
            arr[ei] = temp;
            Selection(arr,0,ei-1,0);
        }
    }
}
