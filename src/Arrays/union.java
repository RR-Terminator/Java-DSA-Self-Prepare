package Arrays;

import java.util.ArrayList;

public class union {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3};

        System.out.println(findUnion(arr1, arr2, arr1.length, arr2.length));

    }

    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2, int n, int m) {

        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                if (ans.size() == 0 || ans.get(ans.size() - 1) != arr1[i]) {
                    ans.add(arr1[i]);

                }
                i++;
            } else {
                if (ans.size() == 0 || ans.get(ans.size() - 1) != arr2[j]) {
                    ans.add(arr1[j]);

                }
                j++;
            }

        }
        while (i < n) {
            if (ans.get(ans.size() - 1) != arr1[i]) {
                ans.add(arr1[i]);
            }
            i++;
        }

        while (j < m) {
            if (ans.get(ans.size() - 1) != arr2[j]) {
                ans.add(arr2[j]);
            }
            j++;
        }

        return ans;


    }
}


//    int i = 0, j = 0; // pointers
//    ArrayList<Integer > Union=new ArrayList<>(); // Uninon vector
//  while (i < n && j < m) {
//        if (arr1[i] <= arr2[j]) // Case 1 and 2
//        {
//        if (Union.size() == 0 || Union.get(Union.size()-1) != arr1[i])
//        Union.add(arr1[i]);
//        i++;
//        } else // case 3
//        {
//        if (Union.size() == 0 || Union.get(Union.size()-1) != arr2[j])
//        Union.add(arr2[j]);
//        j++;
//        }
//        }
//        while (i < n) // IF any element left in arr1
//        {
//        if (Union.get(Union.size()-1) != arr1[i])
//        Union.add(arr1[i]);
//        i++;
//        }
//        while (j < m) // If any elements left in arr2
//        {
//        if (Union.get(Union.size()-1) != arr2[j])
//        Union.add(arr2[j]);
//        j++;
//        }
//        return Union;