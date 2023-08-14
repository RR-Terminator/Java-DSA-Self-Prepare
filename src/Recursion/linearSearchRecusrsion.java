package Recursion;

public class linearSearchRecusrsion {
    public static void main(String[] args) {
        int [] arr = {1,3,5};
        System.out.println(check(arr,4,0));
    }
    static boolean check(int[] arr ,int x, int index){
        if(index >= arr.length-1 && arr[index] !=x) return false;
        return arr[index] == x || check(arr,x,index+1);
    }
}
