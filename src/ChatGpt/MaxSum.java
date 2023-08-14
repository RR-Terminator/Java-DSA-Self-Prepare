package ChatGpt;

public class MaxSum {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, -1, -3,}));

    }

    public static int maxSubArray(int [] arr){

        int sum = 0;
        int max_sum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            max_sum = Math.max(max_sum,sum);
            if(sum <= 0){
                sum=0;
            }


        }
        return max_sum;

    }
}
