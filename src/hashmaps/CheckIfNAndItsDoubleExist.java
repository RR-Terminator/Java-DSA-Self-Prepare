package hashmaps;

import java.util.Arrays;
import java.util.HashMap;

public class CheckIfNAndItsDoubleExist {
    public static void main(String[] args) {

        int [] arr = {-2,0,10,-19,4,6,-8};
        System.out.println(checkIfExistBinarySearch(arr));

    }

    public static boolean checkIfExist(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : arr){
            if(!map.isEmpty() && (map.containsKey(i*2) || (map.containsKey(i/2) && i%2 == 0))){
                return true;
            }
            else map.put(i, map.getOrDefault(map.get(i),0)+1);
        }

        return false;
    }


    public static boolean checkIfExistBinarySearch(int[] arr) {

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int req = num *2;
            if(arr[i] != 0){
                if (search(arr,req,0, arr.length-1) ) {
                    return true;
                }
            }
        }
        return false;

    }

    private static boolean search(int[] arr, int i , int s , int e) {

        while (s<=e){
            int mid = s+(e-s)/2;

            if(arr[mid] == i){
                return true;
            } else if (arr[mid]>i) {
                e = mid -1;
            }
            else s = mid+1;
        }

        return false;

    }

}
