package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RopeCutting {
    public static void main(String[] args) {
        int [] arr = {5, 1, 1, 2, 3, 5};
        System.out.println(RopeCuttingWays(arr, arr.length));
    }

    public static ArrayList<Integer> RopeCuttingWays(int [] arr, int n) {
        Arrays.sort(arr);

        int cut_len = arr[0];
        ArrayList<Integer> ans = new ArrayList<>();


        for(int i = 1 ; i < n ; i++){
            if(arr[i] - cut_len > 0){
                ans.add(n-i);
            }
            else cut_len = arr[i];
        }


        return ans;
    }
}
