package Arrays;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int [] arr = {-5,-3,-2,-1};

        System.out.println(Arrays.toString(sortedSquares(arr)));
    }

//    public static void moveZeroes(int[] nums) {
//        for(int i =0 ; i< nums.length ; i++){
//
//            if(nums[i] == 0){
//                int j =  i+1;
//                while(j<nums.length){
//                    if(nums[j] !=0) break;
//                    j++;
//                }
//
//                if(j< nums.length) Swap(nums,i,j);
//            }
//
//
//        }
//    }
//
//
//   static void Swap(int [] arr, int a ,int b){
//        int temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }

//    public static void moveZeroes(int[] arr) {
//        int n = arr.length;
//        if(n<=1) return;
//        int s=0;
//        int e=1;
//        while(e<n){
//            if(arr[s]==0 && arr[e]!=0){
//                int temp = arr[s];
//                arr[s] = arr[e];
//                arr[e] = temp;
//                s++;
//                e++;
//            }else if(arr[s]==0 && arr[e]==0){
//                e++;
//            }else{
//                s++;
//                e++;
//            }
//        }
//    }
public static int[] sortedSquares(int[] nums) {

    int s = 0 ;
    int e = nums.length -1;
    int [] ans = new int [e+1];
    int curr_index = nums.length -1;
    while(s<=e){
        int sqr1 = nums[s] * nums[s];
        int sqr2 = nums[e] * nums[e];

        if(sqr1 <= sqr2){
            ans[curr_index] = sqr2;
            e--;
            curr_index--;
        }
        else{
            ans[curr_index] = sqr1;
            s++;
            curr_index--;
        }
    }
    return ans;
}
}
