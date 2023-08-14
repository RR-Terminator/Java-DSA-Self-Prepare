package Recursion;

import java.util.Arrays;

public class smaple {
    public static void main(String[] args) {
        int[] nums1 = {4,0,0,0,0,0};
        int[] nums2 = {1,2,3,5,6};
        combine(nums1,1,nums2,5);
        System.out.println(Arrays.toString(nums1));


    }

    public static void combine(int[] nums1, int m, int[] nums2, int n){

        int p1 = m-1;
        int p2 = n-1;
        int i = m+n-1;
        while (p2>=0){
             if(p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[i--] = nums1[p1--];

            }
            else {
                nums1[i--] = nums2[p2--];

            }
        }



    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1, p2 = n-1, i = m+n-1;
        while(p2 >= 0){
            if(p1 >= 0 && nums1[p1] > nums2[p2]){
                nums1[i--] = nums1[p1--];
            }
            else {
                nums1[i--] = nums2[p2--];
            }
        }
    }

}
