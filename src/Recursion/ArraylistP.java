//package RecursionWithStriver;
//
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class ArraylistP {
//    public static void main(String[] args) {
//        int []arr = {1,1,3,45};
//        System.out.println(subsets(arr));
//    }
//    static void subsetSumsHelper(int ind, int sum, int [] arr, int N, ArrayList < Integer > sumSubset) {
//        if (ind == N) {
//            sumSubset.add(sum);
//            return;
//        }
//
//        // pick the element
//        subsetSumsHelper(ind + 1, sum + arr.get(ind), arr, N, sumSubset);
//
//        // Do-not pick the element
//        subsetSumsHelper(ind + 1, sum, arr, N, sumSubset);
//    }
//
//    static ArrayList < Integer > subsetSums(int [] arr, int N) {
//
//        ArrayList < Integer > sumSubset = new ArrayList < > ();
//        subsetSumsHelper(0, 0, arr, N, sumSubset);
//        Collections.sort(sumSubset);
//        return sumSubset;
//    }
//
//}
