package Arrays.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int  [] arr ={5,3,4,2,1};
//        selection(arr);
//        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr);
 //       Arrays.sort(arr,0,2);
//        Arrays.sort(arr,0,4, Collections.reverseOrder());
//        System.out.println(Arrays.toString(arr));
        SelectionSortLogic(arr);
        System.out.println(Arrays.toString(arr));
        
    }


    // getting minimum element and placing at its ri ght Position
    static void Selection(int [] arr){
        for(int i = 0 ; i < arr.length-1;i++){
            int max= i;
            for (int j = i+1 ; j < arr.length; j++) {
                if (arr[max] < arr[j]) {
                    max = j;
                }
            }
            Swap(arr,i,max);

        }
    }

    // Getting Maximum element and placing at its Right Position

//    static void selection(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            // find the max item in the remaining array and swap with correct index
//            int last = arr.length - i - 1;
//            int maxIndex = getMaxIndex(arr, 0, last);
//            swap(arr, maxIndex, last);
//        }
//    }
//
//
//
//    static int getMaxIndex(int[] arr, int start, int end) {
//        int max = start;
//        for (int i = start; i <= end; i++) {
//            if (arr[max] < arr[i]) {
//                max = i;
//            }
//        }
//        return max;
//    }


    static  void SelectionSortLogic(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int maxValueIndex =  0;
            for (int j = 1; j <= arr.length-i-1; j++) {
                if (arr[maxValueIndex] < arr[j]) {
                    maxValueIndex = j;
                }
            }
            int temp =arr[maxValueIndex];
            arr[maxValueIndex] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
    }





    public static void Swap(int [] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
