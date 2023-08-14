package Arrays;

import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {

        int [] arr = {9, 4, -2, -1, 5, 0, -5, -3, 2};

        rearrange(arr,9);
    }

   static void rearrange(int [] arr, int n) {
        int [] ans = new int[n];
        int i = 0;
        int j = 1;
        int k = 0;

        while(i<n || j < n){
            if(arr[i]>= 0){
                ans[k]= arr[i];
                i++;
                k++;
            }
            if(arr[j]<=0){
                ans[k] = arr[i];
                j++;
                k++;
            }
            i++;
            j++;
        }

       System.out.println(Arrays.toString(ans));
    }
}
