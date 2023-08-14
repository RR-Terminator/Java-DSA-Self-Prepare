package Recursion;

public class IsArraySorted {
    public static void main(String[] args) {

        int [] arr ={12,3,4,5};
        System.out.println(isSorted(arr,0));

    }
    public static boolean isSorted(int [] arr, int startIndex){
        if (startIndex >= arr.length-1) {
            return true;
        }
        if (arr[startIndex] < arr[startIndex+1]) {
            return isSorted(arr,startIndex+1);
        }
        return false;
    }
}
