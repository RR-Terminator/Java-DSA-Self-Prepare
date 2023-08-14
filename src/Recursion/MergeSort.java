package Recursion;
import java.util.*;

// this method will create new array after each division
// hence not prefer....

public class MergeSort {
    public static void main(String[] args) {
        int [ ] arr = {5,4,3,2,1,6,7};
        System.out.println(Arrays.toString(mergeSort(arr)));

    }

    static int [] mergeSort(int [] arr){
        // Base Case Check for the arr size if arr size = 1 then arr is sorted return
        if (arr.length == 1) {
            return arr;
        }

        // find the middle element
        int mid = arr.length/2;

        // Divide  array into two parts such that left part have all index from 0 to mid and right part has all the
        // index from mid+1 to arr.length-1
        // and make recursive call on both part to divide the array further
        int [] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int [] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        // At last combine them and sort the array and return the array
        return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right) {
        // Creating a new array of the length of both the half

        int [] res = new int[left.length+right.length];


        int i = 0;
        int j = 0;
        int k = 0;

        // these loop will run till the one part of the element become empty
        while (i < left.length && j < right.length){

            //check if the left[i] is smaller than the right[j] if then push that element in the result
            // and increment value of i and k ...
            if (left[i] < right[j]) {
                res[k] = left[i];
                i++;
                k++;
            }
            // if not then push right[j] into res[k] amd increment j and k

            else {
                res[k] = right[j];
                j++;
                k++;
            }
        }

        //  these loop run if the element in the left are remaining
        // then push all the element in resultant array directly as they are already sorted

        while(i < left.length){
            res[k] = left[i];
            i++;
            k++;

        }

        //  these loop run if the element in the right are remaining
        // then push all the element in resultant array directly as they are already sorted
        while(j < right.length){
            res[k] = right[j];
            j++;
            k++;

        }
        // return resultant array...
        return res;
    }
}
