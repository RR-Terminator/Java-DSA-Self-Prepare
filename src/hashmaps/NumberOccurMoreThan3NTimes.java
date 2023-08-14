package hashmaps;

import java.util.HashMap;
import java.util.Set;

public class NumberOccurMoreThan3NTimes {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4,1};
        System.out.println(moreFreq(arr));


    }


    // Time Complexity is (n):-
    public static int moreFreq(int [] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
//            if(map.containsKey(arr[i])){
//                map.put(arr[i], map.get(arr[i])+1 );
//            }
//            else{
//                map.put(arr[i],1);
//            }

            map.put(arr[i], map.getOrDefault(arr[i],0)+1);

        }

       // Set<Integer> set = map.keySet();
        for (Integer key: map.keySet()){
            if (map.get(key) > arr.length/3) {
                return key;
            }
        }

        return -1;
    }
}
