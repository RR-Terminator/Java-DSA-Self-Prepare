package Recursion;

public class SumOfArray {
    public static void main(String[] args) {
        int [] arr  = {2,4,9,9,9};
        System.out.println(Sum(arr,0));
    }
    public static int Sum(int [] arr, int StartIndex){
        if (StartIndex >= arr.length-1) {
            return arr[StartIndex];
        }
        return     arr[StartIndex]+Sum(arr,StartIndex+1);

    }
}
