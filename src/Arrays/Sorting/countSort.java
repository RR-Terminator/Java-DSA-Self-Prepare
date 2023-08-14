package Arrays.Sorting;

import java.util.Arrays;

public class countSort {
    public static void main(String[] args) {

        int [] arr ={1,2,1,3,2,1,1,4,5,4,7};
        countsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void countsort(int [] arr){
        int max = Integer.MIN_VALUE;
        for (int j : arr) {

            max = Math.max(max, j);

        }
        int [] count = new int[max+1];
        for (int i:arr) {
            count[i]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }

        }
    }
}
