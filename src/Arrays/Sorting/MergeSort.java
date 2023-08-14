package Arrays.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int [] arr = {5,4,2,1,3};
        mergeSortInPlace(arr,0,arr.length);
       // System.out.println(Arrays.toString(mergeSort(arr)));
        System.out.println(Arrays.toString(arr));

    }


    static int [] mergeSort(int[] arr){
        if (arr.length==1) return arr;

        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);

    }

    static int [] merge(int [] left, int [] right){
        int i = 0 ;
        int j =0 ;
        int k = 0;
        int [] ans = new int[left.length+ right.length];
        while (i< left.length && j< right.length){
            if (left[i] < right[j]) {
                ans[k++] = left[i++];
            }
            else{
                ans[k++] = right[j++];
            }
        }

        while (i< left.length){
            ans[k++] = left[i++];
        }
        while (j< right.length){
            ans[k++] = right[j++];
        }
        return ans;
    }



    // Merge InPlace Space efficient Approach
    // Instead  Of Passing the  Copy of The Array Each Time pass The point that point s the
    // Subrange From where the Array has to be split


    static void   mergeSortInPlace(int[] arr, int s, int e ){
        if (e-s ==1) return;

        int mid = s + (e-s)/2;
        mergeSortInPlace(arr,s,mid);
        mergeSortInPlace(arr,mid,e);
        mergeInPlace(arr,s,mid,e);

    }

    static void mergeInPlace(int [] arr, int s , int mid , int e){
        int i = s ;
        int j = mid;
        int k = 0;
        int [] ans = new int[e-s];
        while (i< mid && j< e){
            if (arr[i] < arr[j]) {
                ans[k++] = arr[i++];
            }
            else{
                ans[k++] = arr[j++];
            }
        }

        while (i< mid){
            ans[k++] = arr[i++];
        }
        while (j< e){
            ans[k++] = arr[j++];
        }
        for (int l = 0; l < ans.length; l++) {
            arr[s+l] = ans[l];
        }
    }


}
