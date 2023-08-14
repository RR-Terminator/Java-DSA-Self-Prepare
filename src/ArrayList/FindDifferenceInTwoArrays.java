package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDifferenceInTwoArrays {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,3};
        int [] arr2 = {1,1,2,2};

        System.out.println(findDifference(arr1,arr2));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> res_1 = Find(nums1,nums2);
        ArrayList<Integer> res_2 = Find(nums2,nums1);
        ans.add(res_1);
        ans.add(res_2);
        return ans;
    }

    private static ArrayList<Integer> Find(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean isFound = false;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j]){
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                isFound =false;
                continue;
            }
            else {
                if (!ans.contains(nums1[i])) {
                    ans.add(nums1[i]);
                }
            }
        }
        return ans;
    }

}
