package Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {1,4,52,34,53,23};
        System.out.println(Arrays.toString(reverse(arr)));
        System.out.println(Arrays.toString(reverseBetter(arr)));
    }
    public static int[] reverse(int [] arr){
        int [] res = new int[arr.length];
        int startIndex = 0;
        int endIndex = arr.length-1;
        while (startIndex<res.length){
            res[startIndex] = arr[endIndex];
            startIndex++;
            endIndex--;
        }
        return res;
    }
    public static int[] reverseBetter(int [] arr){

        int startIndex = 0;
        int endIndex = arr.length-1;
        while (startIndex<endIndex){
            Swap(arr,startIndex,endIndex);
            startIndex++;
            endIndex--;
        }
        return arr;
    }
    static void Swap(int [] arr , int a, int b){
        int temp =arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
