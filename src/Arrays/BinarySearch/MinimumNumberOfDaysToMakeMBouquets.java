package Arrays.BinarySearch;

public class MinimumNumberOfDaysToMakeMBouquets {
    public static void main(String[] args) {
        int[] arr = {1,10,2,9,3,8,4,7,5,6};

        System.out.println(minDays(arr,4,2));

    }

    public static int minDays(int[] bloomDay, int m, int k) {
      if(m*k>bloomDay.length) return -1;

      int low = Integer.MAX_VALUE;
      int high = Integer.MIN_VALUE;

        for (int day: bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high,day);
        }


        while (low<high){
            int mid = low + (high-low)/2;

            if(isPossible(mid,bloomDay,m,k)){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }

    private static boolean isPossible(int mid, int[] bloomDay, int m, int k) {
       int adj = 0 ;
       int boq_count = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= mid) {
                adj++;
                if (adj == k) {
                    boq_count++;
                    if (boq_count == m) {
                        return true;
                    }
                    else adj =0;
                }
            }
            else{
                adj = 0;
            }

        }
        return false;

    }
}
