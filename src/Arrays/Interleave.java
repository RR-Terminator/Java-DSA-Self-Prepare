package Arrays;

import java.util.Arrays;

public class Interleave {
    public static void main(String[] args) {

        int []  arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(interChange(arr)));

    }

    public static int [] interChange(int [] arr){
        int si = 0;
        int mid = arr.length/2;
        int [] res = new int[arr.length];
        int i = 0 ;

        while( mid< arr.length){
            res[i] = arr[si];
            si++;
            i++;
            res[i] = arr[mid];
            mid++;
            i++;
        }

        return res;
    }
}
