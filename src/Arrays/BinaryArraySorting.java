package Arrays;

import java.util.Arrays;

public class BinaryArraySorting {
    public static void main(String[] args) {

        int [] arr = {1, 0 ,1 ,1 ,1 ,1 ,1 ,0 ,0 ,0};

        System.out.println(Arrays.toString(SortBinaryArray(arr,10)));

    }

    static int[] SortBinaryArray(int arr[], int n) {
        int hi = n - 1;
        int lo = 0;
        int i = 0;

        while (lo <= hi) {
            if (arr[lo] == 0) {
                swap(arr, i, lo);
                lo++;

                i++;
            }

            if (arr[hi] == 0) {
                swap(arr, hi, i);
                i++;
                hi--;
            }

        }

        return arr;
    }


    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
