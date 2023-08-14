package Arrays;

public class kadanesAlgo {
    public static void main(String[] args) {

        int [] arr = {-5,-4,-3,-2,-1};
        System.out.println(kadens(arr));

    }
    static int  kadens(int [] arr){
            int  maxSum =arr[0];
            int currentSum = 0;
        for (int j : arr) {
            currentSum += j ;
            maxSum = Math.max(maxSum, currentSum);

            if (currentSum < 0) {
                currentSum = 0;
            }

        }
            return maxSum;
        }
}
