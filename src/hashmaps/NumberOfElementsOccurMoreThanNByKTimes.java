package hashmaps;

import java.util.HashMap;

public class NumberOfElementsOccurMoreThanNByKTimes {
    public static void main(String[] args) {

        int[] arr = {2, 3 ,3 ,2};

        System.out.println(countOccurence(arr, arr.length, 3));

    }


    public static int countOccurence(int[] arr, int n, int k)
    {
        int req_count = n/k;
        int count = 0 ;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for (Integer value : map.values()) {
            if (value >= req_count) count++;
        }

        return count;


    }
}


