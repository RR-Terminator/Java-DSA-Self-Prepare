package hashmaps;



public class largestConsecutiveSubsequence {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        System.out.println(findLongestConseqSubseq(arr));
    }

    static int findLongestConseqSubseq(int arr[])
    {
       int [] arr2 = new int[10000001];
       int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            arr2[arr[i]]++;
            max = Math.max(max,arr[i]);
        }



        int count=0;
        int temp_count = 0;
        for (int i = 0; i <= max; i++) {
            if (arr2[i] >= 1) {
                temp_count++;
            }
            else {
                count = Math.max(count, count);
                temp_count=0;
            }
        }

        return count;




    }
}
