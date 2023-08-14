package Recursion;

public class CountTheCost {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(MinCost(arr,0));
    }
    static int MinCost(int [] arr, int i){
        if (i >= arr.length) {
            return 0;
        }
        int x = arr[i]+MinCost(arr,i+1);
        int y = arr[i]+MinCost(arr,i+2);
        return Math.min(x,y);
    }
}
