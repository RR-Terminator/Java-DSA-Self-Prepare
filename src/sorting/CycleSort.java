package sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int [] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(cycleSort(arr));

    }

    public static int cycleSort(int [] arr){
        int i =0;
        while(i<= arr.length-1){
            int correctPos = arr[i];
            if (arr[i]< arr.length && arr[i] != arr[correctPos]) {
                Swap(arr,i,correctPos);
            }
            else i++;
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        return arr.length;
        

    }
    static void Swap(int []arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
