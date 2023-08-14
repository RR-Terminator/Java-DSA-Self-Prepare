package Arrays.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int [] arr ={1,2,3,4,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        int [] arr2 = {1,2,3,4,5};
        bubbleSortBetter(arr2);
        System.out.println(Arrays.toString(arr2));

    }

//    static void bubble(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 1; j < arr.length - i; j++) {
//                if (arr[j] < arr[j-1]) {
//                    Swap(arr, j-1, j);
//                }
//            }
//        }
//
//    }
//
//    static void bubblediffrent(int[] arr) {
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = 0; j < arr.length -i-1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    Swap(arr, j + 1, j);
//                }
//            }
//        }
//    }


    static  void bubbleSort(int [] arr ){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]  >arr[j+1]) {
                    Swap(arr,j,j+1);

                }
            }
            count++;
        }
        System.out.println(count);
    }

    static void bubbleSortBetter(int [] arr){
        int count = 0;
        boolean isSwapped = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]  >arr[j+1]) {
                    Swap(arr,j,j+1);
                    isSwapped = true;

                }
            }
            count++;
            if (isSwapped == false) {
                break;
            }
        }
        System.out.println(count);
    }




    public static void Swap(int [] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
