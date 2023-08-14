package Arrays;

import java.util.Arrays;

public class moveAllZerosToEnd {
    public static void main(String[] args) {
        int [] arr = {3,5,0,0,4};
        pushZerosToEnd(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

  static   void pushZerosToEnd(int[] arr, int n) {

        int j = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                swap(arr, i, j);
                j++;
            }
        }


    }

   static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
