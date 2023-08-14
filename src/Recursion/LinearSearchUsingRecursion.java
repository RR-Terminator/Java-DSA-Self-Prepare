package Recursion;

public class LinearSearchUsingRecursion {
    public static void main(String[] args) {
        int [] arr  = {1,2,3,4};
        System.out.println(isThere(arr,0,3));
    }
    public static Boolean isThere(int [] arr, int StartIndex, int Key){
        if (StartIndex >= arr.length-1) {
            return arr[StartIndex] == Key;
        }
        if ( arr[StartIndex] == Key) {
            return true;
        }
        return isThere(arr,StartIndex+1,  Key);
    }
}
