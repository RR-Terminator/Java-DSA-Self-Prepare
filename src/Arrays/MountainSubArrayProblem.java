package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MountainSubArrayProblem {
    public static void main(String[] args) {






    }

    public static ArrayList<Boolean> processQueries(int[] arr, int n, ArrayList<Pair> queries, int q) {



        int [] left = new int[arr.length];
        int [] right = new int[arr.length];

        ArrayList<Boolean> ans = new ArrayList<>();

        left[0] = arr[0];
        right[arr.length-1] = arr[arr.length-1];
        for (int i = 1; i < arr.length; i++) {
            left[i] = Math.max(arr[i], left[i - 1]);
        }

        for (int i = arr.length-2; i >=0; i--) {
            right[i] = Math.min(arr[i], right[i + 1]);
        }

        for(int i =0 ; i < q; i++){
            int l = queries.get(i).l;
            int r = queries.get(i).r;

            if (right[l] >= left[r]) {
               ans.add(true);
            }
        }

        return ans;

        
    }

    static class Pair{
        int l,r;

        public Pair(int l, int r) {
            this.l = l;
            this.r = r;
        }
    }



}
