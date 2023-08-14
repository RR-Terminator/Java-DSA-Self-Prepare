package Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        Bubble(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void  Bubble(int [] arr , int si , int ei){
        if(ei==0) return;
        if(si<ei){
            if (arr[si] > arr[si+1]){
                int temp = arr[si];
                arr[si] = arr[si+1];
                arr[si+1] = temp;
            }
            Bubble(arr,si+1,ei);
        }
        else Bubble(arr,0,ei-1);

    }
}
