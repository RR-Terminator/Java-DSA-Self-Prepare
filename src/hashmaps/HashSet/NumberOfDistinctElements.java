package hashmaps.HashSet;

import java.util.HashSet;

public class NumberOfDistinctElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,7,6,5,4,3,2,1};
        System.out.println(numberOfElements(arr));
    }

    public static int numberOfElements(int [] arr){
        HashSet<Integer> set = new HashSet<>();

        for (int j : arr) {
            set.add(j);
        }

        return set.size();
    }
}
