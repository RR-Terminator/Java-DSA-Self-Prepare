package Arrays;


import java.util.Arrays;

public class SpellsAndPotions {
    public static void main(String[] args) {

        int []  spells = {5,1,3};
        int []potions = {1,2,3,4,5};
        long success = 7;
        System.out.println(Arrays.toString(successfulPair(spells,potions,success)));
    }

//    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
//        int [] ans = new int[spells.length];
//        Arrays.sort(potions);
//
//        for (int i = 0; i < spells.length; i++) {
//
//
//          int required_pair = (int) Math.ceil(1.0*success/spells[i]);
//
//            if (required_pair > potions[potions.length-1]) {
//                ans[i] = 0 ;
//                continue;
//            }
//          int pairs = find(required_pair,potions);
//          ans[i] = potions.length- pairs;
//        }
//        return ans;
//
//
//    }

    private static int find(int spell, int[] potions ) {
        
         int s = 0 ;
        int e = potions.length-1;
        while (s<e){
            int mid = s+e/2;
            if(potions[mid]<spell){
                s = mid+1;
            }
            else{
                e = mid;
            }
        }
        return s;
    }







//    private static int lowerBound(int[] arr, int key) {
//        int lo = 0;
//        int hi = arr.length;
//        while (lo < hi) {
//            int mid = lo + (hi - lo) / 2;
//            if (arr[mid] < key) {
//                lo = mid + 1;
//            } else {
//                hi = mid;
//            }
//        }
//        return lo;
//    }

    public static int[] successfulPair(int[] spells, int[] potions, long success) {

        int [] ans = new int[spells.length];
        Arrays.sort(potions);
        int max_potion = potions[potions.length-1];

        for (int i = 0; i < spells.length; i++) {
            // spells[i] * potions[j] >= success
            int req_potion = (int)  Math.ceil(1.0*success/spells[i]);

            if (req_potion > max_potion) {
                ans[i] = 0;
                continue;
            }
            int req_index = binarySeaerch(req_potion,potions);

            ans[i] = potions.length - req_index;

        }

        return ans;

            }

    private static int binarySeaerch(int reqPotion, int[] potions) {

        int s = 0;
        int e = potions.length-1;

        while(s<e){
            int mid = s+(e-s)/2;
            if (potions[mid] > reqPotion) {
                e = mid -1;
            }
            else {
                s = mid+1;
            }
        }

        return  s;
    }


}
